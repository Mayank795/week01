import java.util.Scanner;

public class StringLengthCalculator {

    // Method to find the length of a string without using the built-in length() method
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;           
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception is thrown when index exceeds string length
        }
        return count;
    }

    public static void main(String[] args) {
        // Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        // Calculate length using custom method
        int customLength = getStringLength(inputString);

        // Calculate length using built-in method
        int builtInLength = inputString.length();

        System.out.println("Length of the string (custom method): " + customLength);
        System.out.println("Length of the string (built-in method): " + builtInLength);

    }
}
