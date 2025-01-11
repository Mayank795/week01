import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double total = 0.0;
        double userInput;

        System.out.println("Enter numbers to add to the total (enter 0 to stop):");

        // Use a while loop to accumulate the sum
        while (true) {
            System.out.print("Enter a number: ");
            userInput = scanner.nextDouble();

            // Break the loop if the user enters 0
            if (userInput == 0) {
                break;
            }

            // Add the user input to the total
            total += userInput;
        }

        
        System.out.println("The total sum is: " + total);

        
    }
}
