import java.util.Scanner;

public class BMI_Calculator2D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        
        double[][] personData = new double[numberOfPersons][3];  // 3 columns: [0] height, [1] weight, [2] BMI
        String[] weightStatus = new String[numberOfPersons];

        // Input height and weight for each person and calculate BMI
        for (int i = 0; i < numberOfPersons; i++) {
            // Input height
            do {
                System.out.println("\nPerson " + (i + 1) + ":");
                System.out.print("Enter height (in meters): ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be positive. Please enter again.");
                }
            } while (personData[i][0] <= 0);

            // Input weight
            do {
                System.out.print("Enter weight (in kilograms): ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI (BMI = weight / (height * height))
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status based on BMI value
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        
        System.out.println("\nBMI Calculation Results:");
        System.out.println("Person | Height (m) | Weight (kg) | BMI    | Weight Status");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-7d | %-12.2f | %-11.2f | %-6.2f | %-12s\n", 
                              (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
