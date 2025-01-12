import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;   
        int remainder = number % divisor; 

        return new int[] {quotient, remainder}; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check for division by zero
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            // Call the method to find the quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            System.out.println("The quotient is: " + result[0]);
            System.out.println("The remainder is: " + result[1]);
        }

    }
}
