import java.util.Scanner;

public class LowercaseConversionDemo {

    // Method to convert each character to lowercase using charAt and ASCII value logic
    public static String convertToLowerCase(String input) {
        StringBuilder lowerCaseText = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // Check if the character is uppercase
            if (currentChar >= 'A' && currentChar <= 'Z') {
                // Convert to lowercase by adjusting the ASCII value
                currentChar = (char) (currentChar + 32);
            }
           
            lowerCaseText.append(currentChar);
        }
        
        return lowerCaseText.toString();
    }

    // Method to compare two strings using charAt() method
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

    // Method to split the text into words and return the words along with their lengths in a 2D array
    public static String[][] splitTextIntoWords(String inputText) {
        String[] words = inputText.split(" ");  
        String[][] wordLengths = new String[words.length][2];
        
        // Populate the 2D array with words and their lengths
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];  
            wordLengths[i][1] = String.valueOf(words[i].length());  
        }
        
        return wordLengths;
    }

    public static void main(String[] args) {
        // Taking user input for the complete text
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the complete text: ");
        String inputText = scanner.nextLine();
        
        // Convert the text to lowercase using both methods
        String lowerCaseTextUsingLogic = convertToLowerCase(inputText);
        String lowerCaseTextUsingBuiltInMethod = inputText.toLowerCase();

        // Compare the results
        boolean areEqual = compareStrings(lowerCaseTextUsingLogic, lowerCaseTextUsingBuiltInMethod);
        
       
        System.out.println("Text using charAt() and ASCII logic: " + lowerCaseTextUsingLogic);
        System.out.println("Text using built-in toLowerCase(): " + lowerCaseTextUsingBuiltInMethod);
        System.out.println("Are both lowercase texts equal? " + areEqual);

        // Split the text into words and display the word lengths in a 2D array
        String[][] wordLengths = splitTextIntoWords(inputText);
        System.out.println("\nWords and their lengths:");
        for (String[] wordLength : wordLengths) {
            System.out.println("Word: " + wordLength[0] + ", Length: " + wordLength[1]);
        }

        
    }
}
