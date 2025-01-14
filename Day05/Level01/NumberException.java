import java.util.Scanner;

public class NumberException {

    // Method to generate the Exception
    public static void generateException(String input) {
        // Attempting to convert a non-numeric string to an integer
        System.out.println("Generating NumberFormatException...");
        int result = Integer.parseInt(input); 
    }

    // Method to demonstrate NumberFormatException handling 
    public static void handleNumberFormatException(String input) {
        try {
            // Calling the method that generates an exception
            generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to convert to number: ");
        String input = scanner.nextLine();

        // First, call the method to generate the Exception
        generateException(input);  

        // Now, call the method to handle the NumberFormatException
        handleNumberFormatException(input);  

        
    }
}
