import java.util.Scanner;

public class GradeCalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Create a 2D array to store marks of students (rows for students, columns for subjects)
        int[][] marks = new int[numberOfStudents][3];  // 3 subjects: Physics, Chemistry, and Maths
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
        String[] remarks = new String[numberOfStudents];

        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Enter marks in Physics: ");
            marks[i][0] = scanner.nextInt();

            System.out.print("Enter marks in Chemistry: ");
            marks[i][1] = scanner.nextInt();

            System.out.print("Enter marks in Maths: ");
            marks[i][2] = scanner.nextInt();
        }

        
        for (int i = 0; i < numberOfStudents; i++) {
            // Calculate total marks
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];

            
            percentages[i] = (totalMarks / 300.0) * 100;

            
            if (percentages[i] >= 80) {
                grades[i] = "A";
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
                remarks[i] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
                remarks[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grades[i] = "R";
                remarks[i] = "Remedial standards";
            }
        }

        
        System.out.println("\nResults:");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("\nStudent %d:%n", i + 1);
            System.out.printf("Percentage: %.2f%%%n", percentages[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println("Remarks: " + remarks[i]);
        }

       
    }
}
