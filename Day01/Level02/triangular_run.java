import java.util.Scanner;

public class triangular_run {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first side of the triangle (in meters): ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the second side of the triangle (in meters): ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter the third side of the triangle (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Distance to cover is 5 km, which is 5000 meters
        double totalDistance = 5000;

        // Calculate the number of rounds needed to complete 5 km
        double rounds = totalDistance / perimeter;

        
        System.out.println("The total number of rounds the athlete will run is " + rounds);

        // Close the scanner
        scanner.close();
    }
}
