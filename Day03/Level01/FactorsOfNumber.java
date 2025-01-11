import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Error: The number must be a positive integer.");
            return; // Exit the program
        }

        
        int maxFactor = 10; // Initial size of the factors array
        int[] factors = new int[maxFactor];
        int index = 0; // To keep track of the current index

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Check if i is a factor
                // Check if the array is full
                if (index == maxFactor) {
                    // Double the size of the array
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp; 
                }
                factors[index++] = i; 
            }
        }

        
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        
    }
}
