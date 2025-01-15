import java.util.Scanner;

public class UniqueCharacters {
    
    // Method to find the length of the text without using the String method length()
    public static int findLength(String text) {
        int length = 0;
        while (true) {
            try {
                text.charAt(length); 
                length++;  
            } catch (StringIndexOutOfBoundsException e) {
                break; 
            }
        }
        return length;
    }

    // Method to find unique characters in a string using charAt() method
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text); 
        char[] uniqueChars = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if currentChar is unique by comparing with previous characters
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;  // Character is not unique
                    break;
                }
            }

            // If the character is unique, store it in the result array
            if (isUnique) {
                uniqueChars[index++] = currentChar;
            }
        }

        // Create a new array with the exact number of unique characters
        char[] result = new char[index];
        System.arraycopy(uniqueChars, 0, result, 0, index);

        return result;
    }

    // Method to display the unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        if (uniqueChars.length == 0) {
            System.out.println("No unique characters found.");
        } else {
            System.out.print("Unique Characters: ");
            for (char c : uniqueChars) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find and display the unique characters
        char[] uniqueChars = findUniqueCharacters(text);
        displayUniqueCharacters(uniqueChars);

    }
}
