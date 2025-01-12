import java.util.Scanner;

public class NaturalNumberSum {

    // Recursive method to calculate the sum of n natural numbers
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1; 
        }
        return n + sumUsingRecursion(n - 1); // Recursive step
    }

    // Method to calculate the sum using the formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The input must be a positive integer. Exiting program.");
            return; // Exit if not a natural number
        }

        // Compute the sum using recursion
        int sumRecursion = sumUsingRecursion(n);

        int sumFormula = sumUsingFormula(n);

        // Compare and display results
        System.out.println("Sum of first " + n + " natural numbers using recursion: " + sumRecursion);
        System.out.println("Sum of first " + n + " natural numbers using formula: " + sumFormula);

        
        if (sumRecursion == sumFormula) {
            System.out.println("The results from both methods match. Computation is correct.");
        } else {
            System.out.println("The results from both methods do not match. There is an error in computation.");
        }

        
    }
}
