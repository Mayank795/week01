import java.util.Scanner;

public class TrimStringWithCharAt {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Find the start index of non-space character
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find the end index of non-space character
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with leading and trailing spaces: ");
        String inputText = scanner.nextLine();

        // Trim spaces using custom method
        int[] trimIndexes = findTrimIndexes(inputText);
        String customTrimmed = createSubstring(inputText, trimIndexes[0], trimIndexes[1]);

        // Trim spaces using built-in method
        String builtInTrimmed = inputText.trim();

        // Compare the two trimmed strings
        boolean areEqual = compareStrings(customTrimmed, builtInTrimmed);

        System.out.println("Custom Trimmed String: \"" + customTrimmed + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtInTrimmed + "\"");
        System.out.println("Are the two strings equal? " + areEqual);

    }
}
