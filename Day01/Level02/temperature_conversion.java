import java.util.Scanner;

public class temperature_conversion {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = (celsius * 9/5) + 32;

        
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

        // Close the scanner
        scanner.close();
    }
}
