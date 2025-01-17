import java.util.Scanner;

public class ToggleCase {

    // Method to toggle the case of each character in a string
    public static String toggleCase(String input) {
        StringBuilder toggledString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Toggle case
            if (Character.isUpperCase(c)) {
                toggledString.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggledString.append(Character.toUpperCase(c));
            } else {
                toggledString.append(c);
            }
        }

        return toggledString.toString();
    }

    // Main method to test the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = toggleCase(input);
        System.out.println("Toggled case string: " + result);

    }
}
