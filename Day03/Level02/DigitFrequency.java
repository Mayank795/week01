import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        int[] frequency = new int[10];

        // Convert the number into digits and update the frequency array
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;  
            frequency[digit]++;     
            temp /= 10;             
        }

        
        System.out.println("\nFrequency of each digit in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }

        
    }
}
