import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        // Creating a scanner object
        Scanner input = new Scanner(System.in);

        // asking for user's name
        System.out.print("Enter your name: ");
        String name  = input.nextLine();  // reading in user's input for name

        // asking user for age
        System.out.print("Enter your age: ");
        int age = input.nextInt();  // Reading in the user input for age

        // printing a greet message
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // Closing the scanner to avoid resource leaks
        input.close();
    }
}
