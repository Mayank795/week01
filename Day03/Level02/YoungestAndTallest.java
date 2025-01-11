import java.util.Scanner;

public class YoungestAndTallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] friends = {"Amar", "Akbar", "Anthony"};

        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter the height of " + friends[i] + " in meters: ");
            heights[i] = scanner.nextDouble();
        }

        // Variables to keep track of the youngest and tallest
        int youngestIndex = 0;
        double tallestIndex = 0;

        // Loop to find the youngest friend and the tallest friend
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i; 
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i; 
            }
        }

        
        System.out.println("\nThe youngest friend is " + friends[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is " + friends[tallestIndex] + " with height " + heights[tallestIndex] + " meters.");
    }
}
