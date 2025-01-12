import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        if (numberOfStudents < 2) {
            System.out.println("There must be at least 2 students for a handshake.");
        } else {
            // Calculate the number of handshakes
            int handshakes = calculateHandshakes(numberOfStudents);

            
            System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + handshakes);
        }

    }
}
