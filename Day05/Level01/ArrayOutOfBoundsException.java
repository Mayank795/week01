import java.util.Scanner;

public class ArrayOutOfBoundsException {

    // Method to generate the Exception by accessing an invalid index in the array
    public static void generateException(String[] names,int n) {
        // Attempting to access an index that is out of bounds of the array
        System.out.println("Generating ArrayIndexOutOfBoundsException...");
        String name = names[n]; 
        System.out.println("Name: " + name);
    }

    // Method to demonstrate ArrayIndexOutOfBoundsException handling 
    public static void handleArrayIndexOutOfBoundsException(String[] names, int n) {
        try {
            // Calling the method that generates an exception
            generateException(names,n);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        // Taking user input for the array of names
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine();  

        
        String[] names = new String[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        //  call the method to generate the Exception
        generateException(names,n);  

        // Now, call the method to handle the ArrayIndexOutOfBoundsException
        handleArrayIndexOutOfBoundsException(names,n);  

       
    }
}
