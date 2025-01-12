import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI for each person
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];  // Weight in kg
            double heightInCm = data[i][1];  // Height in cm
            double heightInM = heightInCm / 100;  // Convert height to meters
            double bmi = weight / (heightInM * heightInM);  // BMI formula
            data[i][2] = bmi;  // Store BMI in the third column
        }
    }

    // Method to determine the BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[10];  // Array to store BMI status for each person
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array to store weight, height, and BMI for 10 people
        double[][] data = new double[10][3];

        // Input weight and height for 10 people
        System.out.println("Enter the weight (in kg) and height (in cm) for 10 people:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = scanner.nextDouble();  // Weight

            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = scanner.nextDouble();  // Height in cm
        }

        
        calculateBMI(data);

        
        String[] status = determineBMIStatus(data);

        
        System.out.println("\nBMI Report for the 10 people:");
        System.out.println("----------------------------------------------------");
        System.out.println("Person | Weight (kg) | Height (cm) | BMI    | Status");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d | %11.2f | %12.2f | %.2f | %s\n", 
                (i + 1), data[i][0], data[i][1], data[i][2], status[i]);
        }

    }
}
