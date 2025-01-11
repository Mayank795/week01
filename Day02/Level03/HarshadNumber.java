import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        
        int sum = 0;
        int originalNumber = number;

        
        while (number != 0) {
            int digit = number % 10; 
            sum += digit;           
            number /= 10;           
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad number.");
        }

       
    }
}
