import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the number is a natural number (positive integer)
        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Calculate the sum using the formula
            int formulaSum = n * (n + 1) / 2;

            // Calculate the sum using a while loop
            int whileLoopSum = 0;
            int i = 1;
            while (i <= n) {
                whileLoopSum += i;
                i++;
            }

            // Compare the two results and display
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + whileLoopSum);

            if (formulaSum == whileLoopSum) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("The results do not match.");
            }
        }

        
    }
}
