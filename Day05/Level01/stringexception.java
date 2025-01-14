import java.util.Scanner;

public class stringexception {

    // Method to generate the StringIndexOutOfBoundsException
    public static void generateException(String text) {
       
        // Access an index beyond the length of the string to generate the exception
        System.out.println( text.charAt(text.length()));
    }

    // Method to handle the StringIndexOutOfBoundsException
    public static void handleException(String text) {

        try {
            // Attempt to access an index beyond the length of the string
            System.out.println( text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught a String Index Out Of Bounds Exception " + e);
        }
    }

    public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("enter a string");
		String text = input.next();
        // Call the method to generate the exception (unhandled)
         System.out.println("Calling generateException()...");
		 generateException(text);

        // Call the method to handle the exception (handled)
        System.out.println("Calling handleException()...");
        handleException(text);
    }
}
