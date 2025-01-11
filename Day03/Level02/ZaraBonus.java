import java.util.Scanner;

public class ZaraBonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        // Variables to calculate total bonus, total old salary, and total new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        
        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    System.out.print("Enter salary for employee " + (i + 1) + ": ");
                    salaries[i] = scanner.nextDouble();
                    if (salaries[i] <= 0) {
                        System.out.println("Salary must be a positive number. Please enter again.");
                        continue;
                    }

                    System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                    yearsOfService[i] = scanner.nextDouble();
                    if (yearsOfService[i] < 0) {
                        System.out.println("Years of service cannot be negative. Please enter again.");
                        continue;
                    }

                    break; 
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter valid numbers.");
                    scanner.nextLine(); 
                }
            }
        }

        // Loop to calculate bonus, new salary, and total amounts
        for (int i = 0; i < 10; i++) {
            double bonus = 0;
            if (yearsOfService[i] > 5) {
                bonus = salaries[i] * 0.05; // 5% bonus for employees with more than 5 years of service
            } else {
                bonus = salaries[i] * 0.02; // 2% bonus for employees with 5 or fewer years of service
            }

            bonuses[i] = bonus;
            newSalaries[i] = salaries[i] + bonus;

            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
