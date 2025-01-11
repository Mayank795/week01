import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter marks in Physics: ");
        int physics = scanner.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = scanner.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = scanner.nextInt();

        
        int totalMarks = physics + chemistry + maths;
        double averageMarks = totalMarks / 3.0;
        double percentage = (totalMarks / 300.0) * 100;

        // Determine grade and remarks
        String grade, remarks;
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        
        System.out.println("\nResults:");
        System.out.printf("Average Marks: %.2f%n", averageMarks);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

      
    }
} 