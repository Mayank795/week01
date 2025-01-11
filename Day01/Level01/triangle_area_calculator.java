import java.util.Scanner;

public class triangle_area_calculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter the base of the triangle in centimeters: ");
        double baseCm = input.nextDouble();

        
        System.out.print("Enter the height of the triangle in centimeters: ");
        double heightCm = input.nextDouble();

        // Conversion factor
        final double CM_TO_INCH = 2.54;
		final double INCH_TO_FEET = 12.0;

        // Calculate the area in square centimeters
        double areaCm2 = 0.5 * baseCm * heightCm;

        // Convert base and height to inches
        double baseInches = baseCm / CM_TO_INCH;
        double heightInches = heightCm / CM_TO_INCH;

        
        double areaInches2 = 0.5 * baseInches * heightInches;
		
		
        double baseFeet = baseInches / INCH_TO_FEET;
        double heightFeet = heightInches / INCH_TO_FEET;

       
        double areaFeet2 = 0.5 * baseFeet * heightFeet;
        //display the results
        System.out.printf("The area of the triangle is %.2f square centimeters, %.2f square inches, and %.2f square feet.%n",
                areaCm2, areaInches2, areaFeet2);

       
        input.close();
    }
}
