import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scanner.nextInt();

        // Check if the employee is eligible for bonus
        if (yearsOfService > 5) {
            // Calculate bonus as 5% of salary
            double bonus = salary * 0.05;
            System.out.println("The employee's bonus is: " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }

        
    }
}
