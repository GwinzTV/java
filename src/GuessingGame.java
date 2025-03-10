import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        boolean playAgain = false;
        System.out.println("Welcome to GuessingGame!");
        do {
            game();
            // prompt player if they want to play again
            System.out.print("Do you want to play again? (y/n): ");
            Scanner input = new Scanner(System.in);
            String entry = input.nextLine().toLowerCase();
            playAgain = switch (entry) {
                case "y" -> true;
                case "n" -> false;
                default -> false;
            };
        } while (playAgain);
    }

    public static void game() {
        // keep track of guess limit
        int guessCounter = 0;

        // generate random number
        Random random = new Random();
        int answer = random.nextInt(101);

        // ask for guess
        System.out.println("Guess a number between 0 and 100");

        // monitor attempts limit e.g. 10 tries
        while (guessCounter < 10) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Guess: ");
            try {
                int guess = input.nextInt();
                // check if correct or not
                if (guess == answer) {
                    System.out.println("Congratulations! You guessed it!");
                    break;
                } else if (guess > answer) {
                    System.out.println("Too high\n");
                } else {
                    System.out.println("Too low\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Guess! Enter an integer between 0 and 100");
            } finally {
                guessCounter++;
            }
        }
        if (guessCounter >= 10) {
            System.out.println("Ooo No more guesses, Maybe next time!");
            System.out.println("The answer is: " + answer);
        }
    }
}
