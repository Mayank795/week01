import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        
        int sum = 0;

        // Find the sum of all proper divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { 
                sum += i;          
            }
        }

        // Check if the number is an Abundant Number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        
    }
}
