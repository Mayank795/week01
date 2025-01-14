import java.util.Scanner;
import java.util.Arrays;

public class CharacterArrayComparison {

    // Method to return characters in a string without using toCharArray()
    public static char[] getCharacters(String text) {
        char[] characters = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }
        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = scanner.next();

        // Getting characters using user-defined method
        char[] customCharArray = getCharacters(text);

        // Getting characters using built-in toCharArray() method
        char[] builtInCharArray = text.toCharArray();

        // Comparing the two arrays
        boolean areEqual = compareCharArrays(customCharArray, builtInCharArray);

        
        System.out.println("Characters using user-defined method: " + Arrays.toString(customCharArray));
        System.out.println("Characters using built-in toCharArray(): " + Arrays.toString(builtInCharArray));
        System.out.println("Are the character arrays equal? " + areEqual);

        
    }
}
