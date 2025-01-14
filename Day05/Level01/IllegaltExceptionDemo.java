import java.util.Scanner;

public class IllegaltExceptionDemo {

    // Method to generate the Exception by using substring with wrong indices
    public static void generateException(String input) {
       
        System.out.println("Generating IllegalArgumentException...");
        String result = input.substring(5, 2); 
    }

    // Method to demonstrate IllegalArgumentException handling using try-catch
    public static void handleIllegalArgumentException(String input) {
        try {
            
            generateException(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException " + e);
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

       
        generateException(input);  // This will generate an exception
        handleIllegalArgumentException(input);  // This will handle the exception

        
    }
}
