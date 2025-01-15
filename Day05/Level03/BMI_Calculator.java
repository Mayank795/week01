import java.util.Scanner;

public class BMI_Calculator {

    // Method to calculate BMI and status based on weight (kg) and height (cm)
    public static String[][] calculateBMI(double[][] personData) {
        String[][] result = new String[personData.length][4];
        
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightInCm = personData[i][1];
            double heightInM = heightInCm / 100; 

            // BMI Calculation
            double bmi = weight / (heightInM * heightInM);
            String status = determineStatus(bmi);
            
            result[i][0] = String.format("%.2f", heightInCm); 
            result[i][1] = String.format("%.2f", weight);     
            result[i][2] = String.format("%.2f", bmi);        
            result[i][3] = status;                            
        }
        
        return result;
    }

    // Method to determine the BMI status based on BMI value
    public static String determineStatus(double bmi) {
        if (bmi < 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to display the 2D array of height, weight, BMI, and status in tabular format
    public static void displayBMI(String[][] result) {
        System.out.println("Height (cm) | Weight (kg) | BMI    | Status");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "     | " + result[i][1] + "      | " + result[i][2] + " | " + result[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array to store height and weight of 10 persons
        double[][] personData = new double[10][2];

        // Taking user input for weight (kg) and height (cm) of 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            personData[i][1] = scanner.nextDouble();
            System.out.println();
        }

        // Calculate BMI and status for each person
        String[][] bmiResults = calculateBMI(personData);

        displayBMI(bmiResults);

    }
}
