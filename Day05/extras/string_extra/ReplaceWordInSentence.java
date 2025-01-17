import java.util.Scanner;

public class ReplaceWordInSentence {

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        StringBuilder modifiedSentence = new StringBuilder();

        for (String word : words) {
            // Check if the current word matches the old word
            if (word.equals(oldWord)) {
                modifiedSentence.append(newWord).append(" ");
            } else {
                modifiedSentence.append(word).append(" ");
            }
        }

        // Trim the trailing space and return the modified sentence
        return modifiedSentence.toString().trim();
    }

    // Main method to test the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.nextLine();

        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();

        String modifiedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified Sentence: " + modifiedSentence);

    }
}
