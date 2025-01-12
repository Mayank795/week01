import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if the student can vote
    public boolean canStudentVote(int age) {
        
        if (age < 0) {
            return false;  // Invalid age
        }
       
        if (age >= 18) {
            return true;   
        } else {
            return false;  
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] studentAges = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        // Check if each student can vote
        for (int i = 0; i < 10; i++) {
            boolean canVote = checker.canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " with age " + studentAges[i] + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + studentAges[i] + " cannot vote.");
            }
        }

        
    }
}
