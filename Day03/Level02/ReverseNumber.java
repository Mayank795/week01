import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the count of digits in the number
        int count = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        
        int[] digits = new int[count];
        temp = number;

        // Extract digits and store them in the array
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        
        int[] reversedDigits = new int[count];

        // Reverse the digits by copying them into the new array
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        
        System.out.print("The digits of the number in reverse order are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i] + " ");
        }
    }
}
