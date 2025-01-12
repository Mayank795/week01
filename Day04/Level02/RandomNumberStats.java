import java.util.Arrays;

public class RandomNumberStats {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate random numbers between 1000 and 9999
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    // Method to find the average, min, and max values from an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        // Calculate sum, and find min and max values
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
   
        double average = sum / numbers.length;

        // Return average, min, and max as an array
        return new double[] {average, min, max};
    }

    public static void main(String[] args) {
        int size = 5; 

        // Generate 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(size);

        // Find the average, min, and max values
        double[] results = findAverageMinMax(randomNumbers);

        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum Value: " + results[1]);
        System.out.println("Maximum Value: " + results[2]);
    }
}
