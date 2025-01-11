import java.util.Scanner;

public class height_converter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Convert height from centimeters to inches
        double heightInches = heightCm / 2.54;

        // Convert inches to feet and remaining inches
        int heightFeet = (int) (heightInches / 12);
        double remainingInches = heightInches % 12;

        // Display the results
        System.out.printf("Your height in cm is %.2f while in feet is %d and inches is %.2f.%n", heightCm, heightFeet, remainingInches);

        // Close the Scanner object
        input.close();
    }
}
