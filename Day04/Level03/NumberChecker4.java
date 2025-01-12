import java.util.ArrayList;

public class NumberChecker4 {

    // Method to find the factors of a number and return them as an array
    public static int[] findFactors(int number) {
        ArrayList<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factorsList.add(i); // Add factor to the list
            }
        }
        factorsList.add(number); // Add the number itself as its factor
        // Convert the list to an array
        return factorsList.stream().mapToInt(i -> i).toArray();
    }

    // Method to find the greatest factor of a number
    public static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        int greatest = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    // Method to find the sum of the factors of a number
    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors of a number
    public static int productOfFactors(int number) {
        int[] factors = findFactors(number);
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors
    public static double productOfCubesOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3); // Cube the factor
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = sumOfFactors(number) - number; // Proper divisors' sum (excluding the number itself)
        return sum == number; // Check if sum equals the number itself
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sum = sumOfFactors(number) - number; // Proper divisors' sum (excluding the number itself)
        return sum > number; // Check if sum is greater than the number
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sum = sumOfFactors(number) - number; // Proper divisors' sum (excluding the number itself)
        return sum < number; // Check if sum is less than the number
    }

    // Method to calculate the factorial of a number
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sumOfFactorials = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sumOfFactorials += factorial(digit);
            temp /= 10;
        }
        return sumOfFactorials == number; // Check if sum of factorials equals the number
    }

    public static void main(String[] args) {
        int number = 28; // Example number

        // Find and display factors
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find and display greatest factor
        System.out.println("Greatest Factor of " + number + ": " + greatestFactor(number));

        // Find and display sum of factors
        System.out.println("Sum of Factors of " + number + ": " + sumOfFactors(number));

        // Find and display product of factors
        System.out.println("Product of Factors of " + number + ": " + productOfFactors(number));

        // Find and display product of cubes of factors
        System.out.println("Product of Cubes of Factors of " + number + ": " + productOfCubesOfFactors(number));

        // Check if the number is a perfect number
        System.out.println(number + " is Perfect Number: " + isPerfectNumber(number));

        // Check if the number is an abundant number
        System.out.println(number + " is Abundant Number: " + isAbundantNumber(number));

        // Check if the number is a deficient number
        System.out.println(number + " is Deficient Number: " + isDeficientNumber(number));

        // Check if the number is a strong number
        System.out.println(number + " is Strong Number: " + isStrongNumber(number));
    }
}
