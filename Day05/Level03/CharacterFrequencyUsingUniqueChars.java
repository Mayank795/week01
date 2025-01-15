import java.util.Scanner;

public class CharacterFrequencyUsingUniqueChars {

    // Method to find the unique characters in a string using charAt() method
    public static char[] uniqueCharacters(String text) {
        int length = text.length();
        boolean[] visited = new boolean[length]; 
        char[] uniqueChars = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            if (!visited[i]) {
                // Check if this character is unique
                boolean isUnique = true;
                for (int j = 0; j < length; j++) {
                    if (i != j && currentChar == text.charAt(j)) {
                        isUnique = false;
                        visited[j] = true;  
                        break;
                    }
                }
                if (isUnique) {
                    uniqueChars[index++] = currentChar; 
                }
            }
        }

        // Create a new array to store only the unique characters
        char[] result = new char[index];
        System.arraycopy(uniqueChars, 0, result, 0, index);

        return result;
    }

    // Method to find the frequency of characters in the string
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];  

        // Loop to count the frequency of each character in the text
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;  
        }

        // Find unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);  
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]); 
        }

        return result;
    }

    // Method to display the characters and their frequencies
    public static void displayCharacterFrequency(String[][] result) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "         | " + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find the character frequencies
        String[][] frequencies = findCharacterFrequency(text);

        displayCharacterFrequency(frequencies);

    }
}
