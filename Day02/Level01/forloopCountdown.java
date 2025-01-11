import java.util.Scanner;

public class forloopCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the countdown start value: ");
        int startValue = scanner.nextInt();

        // Perform the countdown using a for loop
        for (int counter = startValue; counter >= 1; counter--) {
            System.out.println(counter);
        }

       
    }
}
