import java.util.Scanner;

public class weight_conversion {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Convert pounds to kilograms (1 pound = 2.2 kg)
        double weightInKilograms = weightInPounds * 2.2;

       
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kilograms is " + weightInKilograms);

        // Close the scanner
        scanner.close();
    }
}
