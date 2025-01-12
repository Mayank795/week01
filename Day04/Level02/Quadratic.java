import java.util.Scanner;

public class Quadratic {

    // Method to calculate the roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;  // Discriminant

        // If delta is positive, there are two real roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);  // First root
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);  // Second root
            return new double[]{root1, root2};  // Return both roots
        }
        // If delta is zero, there is exactly one real root
        else if (delta == 0) {
            double root = -b / (2 * a);  // Only one root
            return new double[]{root};  // Return the single root
        }
        // If delta is negative, there are no real roots
        else {
            return new double[]{};  
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value for b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value for c: ");
        double c = scanner.nextDouble();

        // Calling method to find the roots
        double[] roots = findRoots(a, b, c);

        if (roots.length == 2) {
            System.out.println("The roots of the equation are: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The root of the equation is: " + roots[0]);
        } else {
            System.out.println("The equation has no real roots.");
        }
lose();
    }
}
