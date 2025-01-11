import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();

        // Perform the countdown using a while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; 
        }

       
}
