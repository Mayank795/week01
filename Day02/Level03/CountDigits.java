import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Handle negative numbers by taking absolute value
        number = Math.abs(number);

       
        int count = 0;

        // Special case for 0
        if (number == 0) {
            count = 1; // Zero has one digit
        } else {
            
            while (number != 0) {
                number /= 10; 
                count++; 
            }
        }

        
        System.out.println("The number of digits is: " + count);

        
    }
}
