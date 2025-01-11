import java.util.Scanner;

public class square_side {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Calculate the side length
        double sideLength = perimeter / 4;

        // Output: Display the result
        System.out.println("The length of the side is " + sideLength + " whose perimeter is " + perimeter);

       
        scanner.close();
    }
}
