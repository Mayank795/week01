public class NumberChecker3 {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible by any number, it's not prime
            }
        }
        return true; // If no divisors, it's prime
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10; // Sum the digits of the square
            square /= 10;
        }
        return sumOfDigits == number; // Check if the sum of digits equals the number
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product; // Check if sum equals product
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number)); // Check if square ends with the number
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || String.valueOf(number).endsWith("7"); // Check if divisible by 7 or ends with 7
    }

    public static void main(String[] args) {
        int number = 7; // Example number to test

        // Check if the number is prime
        boolean prime = isPrime(number);
        System.out.println(number + " is Prime: " + prime);

        // Check if the number is neon
        boolean neon = isNeon(number);
        System.out.println(number + " is Neon: " + neon);

        // Check if the number is a spy number
        boolean spy = isSpyNumber(number);
        System.out.println(number + " is Spy: " + spy);

        // Check if the number is automorphic
        boolean automorphic = isAutomorphic(number);
        System.out.println(number + " is Automorphic: " + automorphic);

        // Check if the number is a buzz number
        boolean buzz = isBuzzNumber(number);
        System.out.println(number + " is Buzz: " + buzz);
    }
}
