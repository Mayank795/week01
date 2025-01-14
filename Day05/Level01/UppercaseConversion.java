import java.util.Scanner;

public class UppercaseConversion {

    // Method to convert each character to uppercase using charAt and ASCII value logic
    public static String convertToUpperCase(String input) {
        StringBuilder upperCaseText = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // Check if the character is lowercase
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Convert to uppercase by adjusting the ASCII value
                currentChar = (char) (currentChar - 32);
            }
            
            upperCaseText.append(currentChar);
        }
        
        return upperCaseText.toString();
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
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the complete text: ");
        String inputText = scanner.nextLine();
        
        // calling both methods
        String upperCaseTextUsingLogic = convertToUpperCase(inputText);
        String upperCaseTextUsingBuiltInMethod = inputText.toUpperCase();

        // Compare the results
        boolean areEqual = compareStrings(upperCaseTextUsingLogic, upperCaseTextUsingBuiltInMethod);
        
        System.out.println("Text using charAt() and ASCII logic: " + upperCaseTextUsingLogic);
        System.out.println("Text using built-in toUpperCase(): " + upperCaseTextUsingBuiltInMethod);
        System.out.println("Are both uppercase texts equal? " + areEqual);

    }
}
