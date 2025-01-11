import java.util.Scanner;

public class NaturalNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number
        if (number >= 0) {
            // Calculate the sum of n natural numbers
            int sum = number * (number + 1) / 2;

            // Output the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // Output for a non-natural number
            System.out.println("The number " + number + " is not a natural number.");
        }

        // Close the scanner
        scanner.close();
    }
}
