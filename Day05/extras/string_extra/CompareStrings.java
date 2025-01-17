import java.util.Scanner;

public class CompareStrings {

    // Method to compare two strings lexicographically
    public static String compareStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        int minLength = Math.min(length1, length2);

        for (int i = 0; i < minLength; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (c1 < c2) {
                return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.";
            } else if (c1 > c2) {
                return "\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order.";
            }
        }

        // If all characters are equal, compare lengths
        if (length1 < length2) {
            return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.";
        } else if (length1 > length2) {
            return "\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order.";
        } else {
            return "\"" + str1 + "\" is equal to \"" + str2 + "\" lexicographically.";
        }
    }

    // Main method to test the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        String result = compareStrings(str1, str2);
        System.out.println(result);

    }
}
