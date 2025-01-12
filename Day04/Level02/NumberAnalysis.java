import java.util.Scanner;

public class NumberAnalysis {

    // Method to check if the number is positive or negative
    public static String isPositive(int number) {
        if (number >= 0) {
            return "positive";
        } else {
            return "negative";
        }
    }

    // Method to check if the number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    // Method to compare two numbers and return the result
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; 
        } else if (number1 == number2) {
            return 0; 
        } else {
            return -1; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            String posNeg = isPositive(numbers[i]);
            System.out.print("Number " + numbers[i] + " is " + posNeg);
            if (posNeg.equals("positive")) {
                String evenOdd = isEven(numbers[i]);
                System.out.println(" and " + evenOdd + ".");
            } else {
                System.out.println(".");
            }
        }

        // Compare the first and last elements
        int first = numbers[0];
        int last = numbers[4];
        int comparisonResult = compare(first, last);

        if (comparisonResult == 1) {
            System.out.println("The first number " + first + " is greater than the last number " + last + ".");
        } else if (comparisonResult == 0) {
            System.out.println("The first number " + first + " is equal to the last number " + last + ".");
        } else {
            System.out.println("The first number " + first + " is less than the last number " + last + ".");
        }

    }
}
