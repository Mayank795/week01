import java.util.Random;

public class ZaraBonusCalculator {

    // Method to generate random salary and years of service
    public static double[][] generateEmployeeData(int numEmployees) {
        Random rand = new Random();
        double[][] employeeData = new double[numEmployees][2]; // Columns for Salary and Years of Service
        
        // Generating random salary and years of service
        for (int i = 0; i < numEmployees; i++) {
            double salary = rand.nextInt(90000) + 10000; // Random salary between 10,000 and 99,999
            int yearsOfService = rand.nextInt(30); // Random years of service between 0 and 29
            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }
        
        return employeeData;
    }

    // Method to calculate new salary and bonus based on years of service
    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] newEmployeeData = new double[employeeData.length][3]; // New data with salary, years of service, and bonus
        
        // Calculating new salary and bonus
        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonus;
            
            if (yearsOfService > 5) {
                bonus = salary * 0.05; // 5% bonus if years of service > 5
            } else {
                bonus = salary * 0.02; // 2% bonus if years of service <= 5
            }
            
            double newSalary = salary + bonus; // New salary including the bonus
            
            newEmployeeData[i][0] = salary; // Old salary
            newEmployeeData[i][1] = newSalary; // New salary
            newEmployeeData[i][2] = bonus; // Bonus
        }
        
        return newEmployeeData;
    }

    // Method to calculate the total old salary, new salary, and total bonus
    public static void calculateAndDisplayTotal(double[][] newEmployeeData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        // Calculating totals
        for (int i = 0; i < newEmployeeData.length; i++) {
            totalOldSalary += newEmployeeData[i][0];
            totalNewSalary += newEmployeeData[i][1];
            totalBonus += newEmployeeData[i][2];
        }
        
        // Displaying results in tabular format using + for string concatenation
        System.out.println("Employee  Old Salary  New Salary   Bonus");
        for (int i = 0; i < newEmployeeData.length; i++) {
            System.out.println("Employee " + (i + 1) + " " + 
                               String.format("%.2f", newEmployeeData[i][0]) + "   " + 
                               String.format("%.2f", newEmployeeData[i][1]) + "   " + 
                               String.format("%.2f", newEmployeeData[i][2]));
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus: " + totalBonus);
    }

    public static void main(String[] args) {
        int numEmployees = 10; // Number of employees in Zara
        
        // Generate employee data (salary and years of service)
        double[][] employeeData = generateEmployeeData(numEmployees);
        
        // Calculate new salary and bonus
        double[][] newEmployeeData = calculateNewSalaryAndBonus(employeeData);
        
        // Calculate and display the total salary and bonus
        calculateAndDisplayTotal(newEmployeeData);
    }
}
