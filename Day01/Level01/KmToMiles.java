import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble();

        // Convert kilometers to miles using the formula
        double miles = km / 1.6;

        // Display the result
        System.out.printf("The total miles is %.2f miles for the given %.2f km.%n", miles, km);

        // Close the Scanner object
        input.close();
    }
}
