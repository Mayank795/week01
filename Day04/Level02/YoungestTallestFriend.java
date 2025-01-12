import java.util.Scanner;

public class YoungestTallestFriend {

    // Method to find the youngest friend
    public static String findYoungest(int[] ages, String[] names) {
        int youngestAge = ages[0];
        String youngestFriend = names[0];
        
        // Loop through the array to find the youngest friend
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = names[i];
            }
        }
        return youngestFriend;
    }

    // Method to find the tallest friend
    public static String findTallest(int[] heights, String[] names) {
        int tallestHeight = heights[0];
        String tallestFriend = names[0];

        // Loop through the array to find the tallest friend
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = names[i];
            }
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = scanner.nextInt();
        }

        // Find and display the youngest and tallest friends
        String youngest = findYoungest(ages, names);
        String tallest = findTallest(heights, names);

        System.out.println("The youngest friend is " + youngest + ".");
        System.out.println("The tallest friend is " + tallest + ".");

    }
}
