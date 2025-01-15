import java.util.Scanner;

public class VotingEligibility {
    
    // Method to generate random 2-digit ages for the number of students
    public static int[] generateAges(int numberOfStudents) {
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = (int) (Math.random() * 90) + 10;  
        }
        return ages;
    }

    // Method to check voting eligibility and return 2D array of age and eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                result[i][0] = Integer.toString(ages[i]);
                result[i][1] = "Cannot Vote";
            } else if (ages[i] >= 18) {
                result[i][0] = Integer.toString(ages[i]);
                result[i][1] = "Can Vote";
            } else {
                result[i][0] = Integer.toString(ages[i]);
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayVotingEligibility(String[][] result) {
        System.out.println("Age | Voting Eligibility");
        System.out.println("-----------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " | " + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of students
        System.out.print("Enter the number of students in the class: ");
        int numberOfStudents = scanner.nextInt();
        
        // Generate random ages for the students
        int[] ages = generateAges(numberOfStudents);

        // Check voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);

        // Display the eligibility result
        displayVotingEligibility(eligibility);

    }
}
