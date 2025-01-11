import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        // Performing arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = 0;

        // Handleing division to avoid dividing by zero
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Display the results
        System.out.printf("The addition, subtraction, multiplication, and division of %.2f and %.2f are %.2f, %.2f, %.2f, and ",
                number1, number2, addition, subtraction, multiplication);
        if (number2 != 0) {
            System.out.printf("%.2f.%n", division);
        } else {
            System.out.println("undefined (division by zero).");
        }

        // Close the scanner
        input.close();
    }
}
