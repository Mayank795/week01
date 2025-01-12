import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate the sum of n natural numbers using a loop
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; 
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // calling the method
            int sum = calculateSum(n);

            
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

    }
}
