import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int low = 1, high = 100, guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100. The computer will try to guess it.");

        do {
            guess = random.nextInt(high - low + 1) + low;
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
            feedback = scanner.nextLine();

            if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
        } while (!feedback.equalsIgnoreCase("correct"));

        System.out.println("The computer guessed your number!");
    }
}
