import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Error: The number must be a positive integer.");
            return; 
        }

        
        int originalNumber = number; 
        int sum = 0; 

        // Process each digit of the number
        while (originalNumber != 0) {
            int digit = originalNumber % 10; 
            sum += Math.pow(digit, 3); 
            originalNumber /= 10; 
        }

        // Check if the number is an Armstrong number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        
    }
}
