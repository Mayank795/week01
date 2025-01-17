import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find the most frequent character in a string
    public static char findMostFrequentCharacter(String input) {
        int[] frequency = new int[256];
        char mostFrequent = ' ';
        int maxFrequency = 0;

        // Count the frequency of each character using a normal loop
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            frequency[c]++;
            if (frequency[c] > maxFrequency) {
                maxFrequency = frequency[c];
                mostFrequent = c;
            }
        }

        return mostFrequent;
    }

    // Main method to test the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char mostFrequentChar = findMostFrequentCharacter(input);
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");

    }
}
