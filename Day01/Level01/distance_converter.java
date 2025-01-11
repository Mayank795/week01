import java.util.Scanner;

public class distance_converter {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Convert feet to yards and miles
        double distanceInYards = distanceInFeet / 3;         // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760;     // 1 mile = 1760 yards

       
        System.out.println("Distance in yards: " + distanceInYards);
        System.out.println("Distance in miles: " + distanceInMiles);

        // Close the scanner
        scanner.close();
    }
}
