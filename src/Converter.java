import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        System.out.println("Welcome to the Temperature converter!");
        System.out.println("Would you like to:\n[1] Celcius -> Fahrenheit\n[2] Fahrenheit -> Celcius");
        System.out.print("Please enter choice: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        System.out.print("Please enter temperature: ");
        int temp = input.nextInt();
        double result = switch (choice) {
            case 1 -> CelciusToFahrenheit(temp);
            case 2 -> FahrenheitToCelcius(temp);
            default -> -1.0;
        };
        System.out.println("Converted temperature is: " + result);
    }

    public static double CelciusToFahrenheit(double celcius) {
        return celcius * 1.8 + 32;
    }

    public static double FahrenheitToCelcius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}
