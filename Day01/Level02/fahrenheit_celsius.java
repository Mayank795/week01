import java.util.Scanner;

public class fahrenheit_celsius {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsius = (fahrenheit - 32) * 5/9;

        
        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius");

        // Close the scanner
        scanner.close();
    }
}
