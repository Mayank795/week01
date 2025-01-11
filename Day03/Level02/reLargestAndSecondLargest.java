import java.util.Scanner;

public class reLargestAndSecondLargest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        // Extract the digits from the number and store them in the array
        while (number != 0) {
            if (index == maxDigits) {
                // If the array is full, increase the size of the array
                maxDigits += 10;
                // Create a new temporary array with the increased size
                int[] tempArray = new int[maxDigits];
                // Copy the existing digits into the new temporary array
                System.arraycopy(digits, 0, tempArray, 0, digits.length);
                // Assign the temporary array back to digits
                digits = tempArray;
            }

            
            digits[index] = number % 10;
            number = number / 10;  // Remove the last digit
            index++;  // Increment the index
        }

        
        int largest = -1;
        int secondLargest = -1;

        // Loop through the array to find the largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        
        if (largest != -1 && secondLargest != -1) {
            System.out.println("The largest digit is: " + largest);
            System.out.println("The second largest digit is: " + secondLargest);
        } else {
            System.out.println("There is no second largest digit.");
        }
    }
}
