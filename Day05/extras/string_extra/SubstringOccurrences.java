import java.util.Scanner;

public class SubstringOccurrences {

    // Method to count occurrences of a substring in a string
    public static int countSubstringOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }

        return count;
    }

    // Main method to test the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the main string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the substring to count: ");
        String sub = scanner.nextLine();

        int occurrences = countSubstringOccurrences(str, sub);
        System.out.println("The substring '" + sub + "' occurs " + occurrences + " times in the string.");

    }
}
