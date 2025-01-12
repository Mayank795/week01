import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate sine, cosine, and tangent of a given angle
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate trigonometric values
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results as an array
        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // Call the method to calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        
        System.out.println("Sine of " + angle + "°: " + results[0]);
        System.out.println("Cosine of " + angle + "°: " + results[1]);

        // Handle undefined tangent
        if (Math.abs(results[1]) < 1e-10) { 
            System.out.println("Tangent of " + angle + " Undefined (cosine is zero)");
        } else {
            System.out.println("Tangent of " + angle  + results[2]);
        }

    }
}
