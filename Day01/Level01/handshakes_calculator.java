import java.util.Scanner;

public class handshakes_calculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes using the formula
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output: Display the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes);

        scanner.close();
    }
}

