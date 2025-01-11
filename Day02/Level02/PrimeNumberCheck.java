import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        
        boolean isPrime = true;
        
        
        if (number > 1) {
            
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;  
                    break;  
                }
            }
        } else {
            isPrime = false;  // Numbers less than or equal to 1 are not prime
        }
        
        
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        
    }
}

