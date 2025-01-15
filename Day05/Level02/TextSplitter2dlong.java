import java.util.Scanner;

public class TextSplitter2dlong {

    // Method to find the length of a string without using built-in length() method
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Do nothing, end of string reached
        }
        return count;
    }

    // Method to split a string into words without using split()
    public static String[] splitTextIntoWords(String text) {
        int length = getStringLength(text);
        int wordCount = 0;

        // Count the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                wordCount++;
            }
        }

        // Create an array to store the words
        String[] words = new String[wordCount];
        int wordStart = 0, wordIndex = 0;

        // Extract words using space indexes
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                int wordEnd = (i == length - 1) ? i + 1 : i;
                words[wordIndex] = text.substring(wordStart, wordEnd);
                wordStart = i + 1;
                wordIndex++;
            }
        }

        return words;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    // Method to find the shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordsAndLengths) {
        String shortestWord = wordsAndLengths[0][0];
        String longestWord = wordsAndLengths[0][0];
        int shortestLength = Integer.parseInt(wordsAndLengths[0][1]);
        int longestLength = Integer.parseInt(wordsAndLengths[0][1]);

        for (String[] wordAndLength : wordsAndLengths) {
            int currentLength = Integer.parseInt(wordAndLength[1]);
            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestWord = wordAndLength[0];
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestWord = wordAndLength[0];
            }
        }

        return new String[]{shortestWord, longestWord};
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputText = scanner.nextLine();

        // Split using custom method
        String[] customSplitWords = splitTextIntoWords(inputText);

        // Get words and their lengths
        String[][] wordsAndLengths = getWordsAndLengths(customSplitWords);

        // Find shortest and longest words
        String[] shortestAndLongest = findShortestAndLongest(wordsAndLengths);

        // Display results in tabular format
        System.out.println("Word\tLength");
        for (String[] wordAndLength : wordsAndLengths) {
            System.out.println(wordAndLength[0] + "\t" + Integer.parseInt(wordAndLength[1]));
        }

        // Display shortest and longest words
        System.out.println("\nShortest Word: " + shortestAndLongest[0]);
        System.out.println("Longest Word: " + shortestAndLongest[1]);

    }
}
