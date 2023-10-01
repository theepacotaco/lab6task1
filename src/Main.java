import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Celsius to Fahrenheit converter!");
        System.out.print("Enter a temperature in Celsius: ");

        if (scanner.hasNextDouble()) {
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else {
            System.out.println("Invalid input. Please enter a valid numeric temperature.");
        }

        scanner.close();
    }
}
