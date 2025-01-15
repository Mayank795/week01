import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string using charAt() method
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];  

        // Loop to count the frequency of each character in the text
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; 
        }

        // Count the number of unique characters
        int uniqueCharCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCharCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCharCount][2];
        int index = 0;

        // Loop to store characters and their frequencies in the result array
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);  
                result[index][1] = String.valueOf(frequency[i]); 
                index++;
            }
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
