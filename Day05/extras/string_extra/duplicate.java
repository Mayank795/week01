import java.util.Scanner;

public class duplicate {

    // Method to remove duplicates from a string
    public static String removeDuplicates(String input) {

        boolean[] seen = new boolean[256]; // Assumes extended ASCII character set
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }

        return result.toString();
    }

    // Main method to test the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Original String: " + input);

        String output = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + output);

    }
}

