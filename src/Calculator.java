import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculator!");
        System.out.print("Please enter the first number: ");
        int firstNum = input.nextInt();
        System.out.print("\nPlease enter the second number: ");
        int SecondNum = input.nextInt();
        System.out.print("\nEnter the operator (+,-,*,/): ");
        String operator = input.next();
        double result = switch (operator) {
            case "+" -> add(firstNum, SecondNum);
            case "-" -> subtract(firstNum, SecondNum);
            case "*" -> multiply(firstNum, SecondNum);
            case "/" -> divide(firstNum, SecondNum);
            default -> -1;
        };
        System.out.println(result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }
}
