import java.util.Scanner;

public class LongestWordFinder {

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        String longestWord = "";
        String word = "";

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c != ' ') {
                word += c;
            } else {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
                word = "";
            }
        }

        // Check the last word in the sentence
        if (word.length() > longestWord.length()) {
            longestWord = word;
        }

        return longestWord;
    }

    // Main method to test the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String longestWord = findLongestWord(sentence);
        System.out.println("The longest word is: " + longestWord);

    }
}
