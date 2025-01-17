import java.util.Scanner;

public class RemoveSpecificCharacter {

    // Method to remove all occurrences of a specific character from a string
    public static String removeCharacter(String input, char toRemove) {
        StringBuilder modifiedString = new StringBuilder();

        // Iterate through the string and append characters that are not toRemove
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != toRemove) {
                modifiedString.append(c);
            }
        }

        return modifiedString.toString();
    }

    // Main method to test the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char toRemove = scanner.next().charAt(0);

        String result = removeCharacter(input, toRemove);
        System.out.println("Modified String: " + result);

    }
}
