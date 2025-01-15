import java.util.Scanner;

public class TextSplitter {

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

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputText = scanner.nextLine();

        // Split using custom method
        String[] customSplitWords = splitTextIntoWords(inputText);

        // Split using built-in split method
        String[] builtInSplitWords = inputText.split(" ");

        // Compare the two arrays
        boolean areEqual = compareStringArrays(customSplitWords, builtInSplitWords);

        System.out.println("Words using custom split method:");
        for (String word : customSplitWords) {
            System.out.println(word);
        }

        System.out.println("Words using built-in split method:");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }

        System.out.println("Are the results identical? " + areEqual);

    }
}
