import java.util.Scanner;

public class NullPointerException {

    // Method to generate the NullPointerException
    public static void generateException() {
        String text = null; 
        // Call a String method to generate the exception
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle the NullPointerException
    public static void handleException() {
        String text = null;
        try {
            
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call the method to generate the exception (unhandled)
        try {
            System.out.println("Calling generateException()...");
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method to handle the exception (handled)
        System.out.println("Calling handleException()...");
        handleException();
    }
}
1