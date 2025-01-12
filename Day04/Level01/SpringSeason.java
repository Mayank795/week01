import java.util.Scanner;

public class SpringSeason {

    // Method to check if the given date falls in the Spring Season
    public static boolean isSpringSeason(int month, int day) {
        // Check for months in the spring season
        if ((month == 3 && day >= 20 && day <= 31) || 
             (month == 4 && day >= 1 && day <= 30) ||  
            (month == 5 && day >= 1 && day <= 31) ||  
               (month == 6 && day >= 1 && day <= 20)) {  
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();

        
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid date. Please enter a valid month (1-12) and day (1-31).");
        } else {
            // Check if the date is in the Spring Season
            if (isSpringSeason(month, day)) {
                System.out.println("It's a Spring Season.");
            } else {
                System.out.println("Not a Spring Season.");
            }
        }

    }
}
