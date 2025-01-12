import java.util.Scanner;

public class ChocolateDistribution {

    // Method to find the chocolates each child gets (quotient) and remaining chocolates (remainder)
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int quotient = numberOfChocolates / numberOfChildren;   
        int remainder = numberOfChocolates % numberOfChildren; 

        return new int[] {quotient, remainder}; // Return as an array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Check if the number of children is zero
        if (numberOfChildren == 0) {
            System.out.println("Cannot divide chocolates among zero children.");
        } else {
            // Call the method
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

           
            System.out.println("Each child will get " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }

    }
}
