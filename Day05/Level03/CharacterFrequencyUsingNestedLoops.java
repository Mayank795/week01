import java.util.Scanner;

public class CharacterFrequencyUsingNestedLoops {

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequency(String text) {
        // Convert the string to a character array
        char[] characters = text.toCharArray();
        int length = characters.length;
        
        // Array to store the frequency of each character
        int[] frequency = new int[length];
        String[] result = new String[length];
        
        // Outer loop to iterate through each character in the text
        for (int i = 0; i < length; i++) {
            // If the character is already counted, skip it
            if (characters[i] == '0') {
                continue;
            }
            
            // Initialize the frequency of the character to 1
            frequency[i] = 1;
            
            // Inner loop to check for duplicate characters
            for (int j = i + 1; j < length; j++) {
                
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0';
                }
            }
            
            // Store the character and its frequency in the result array
            result[i] = characters[i] + " : " + frequency[i];
        }
        
        // Return the result array containing characters and their frequencies
        return result;
    }

    // Method to display the character frequencies
    public static void displayCharacterFrequency(String[] result) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String res : result) {
            if (res != null) {
                System.out.println(res);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find the character frequencies
        String[] frequencies = findCharacterFrequency(text);

        displayCharacterFrequency(frequencies);

    }
}
