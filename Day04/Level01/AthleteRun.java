import java.util.Scanner;

public class AthleteRun {

    // Method to calculate the perimeter of a triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate the number of rounds needed
    public static int calculateRounds(double perimeter, double totalDistance) {
        return (int) Math.ceil(totalDistance / perimeter); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first side (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangular park
        double perimeter = calculatePerimeter(side1, side2, side3);

        double totalDistance = 5000;

        // Calculate the number of rounds required
        int rounds = calculateRounds(perimeter, totalDistance);

        System.out.println("The athlete needs to complete " + rounds +
                           " rounds to complete a 5 km run.");

        
    }
}
