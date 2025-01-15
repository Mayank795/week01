import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Method to check palindrome by comparing characters from start and end
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; 
            }
            start++;
            end--;
        }
        return true; 
    }

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false; 
        }

        // Recursively check the next pair of characters
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Method to check palindrome using character arrays
    public static boolean isPalindromeArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = new char[originalArray.length];

        // Reverse the array
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        // Compare the original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Check palindrome using Logic 1 (Iterative method)
        if (isPalindromeIterative(text)) {
            System.out.println("The text is a palindrome (Iterative check).");
        } else {
            System.out.println("The text is NOT a palindrome (Iterative check).");
        }

        // Check palindrome using Logic 2 (Recursive method)
        if (isPalindromeRecursive(text, 0, text.length() - 1)) {
            System.out.println("The text is a palindrome (Recursive check).");
        } else {
            System.out.println("The text is NOT a palindrome (Recursive check).");
        }

        // Check palindrome using Logic 3 (Array method)
        if (isPalindromeArray(text)) {
            System.out.println("The text is a palindrome (Array check).");
        } else {
            System.out.println("The text is NOT a palindrome (Array check).");
        }

    }
}
