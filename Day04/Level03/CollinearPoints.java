public class CollinearPoints {

    // Method to check collinearity using the slope formula
    public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Avoid division by zero by checking if the denominator is zero
        if ((x2 - x1) == 0 || (x3 - x2) == 0) {
            return (x2 - x1) == (x3 - x2);
        }
        
        // Calculate slopes
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        
        // Check if slopes are equal
        return slopeAB == slopeBC;
    }

    // Method to check collinearity using the area of a triangle formula
    public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate the area of the triangle
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        
        // If the area is 0, the points are collinear
        return area == 0;
    }

    public static void main(String[] args) {
        
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        // Check collinearity
        boolean collinearSlope = areCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean collinearArea = areCollinearArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Using slope formula: The points are collinear? " + collinearSlope);
        System.out.println("Using area formula: The points are collinear? " + collinearArea);
    }
}
