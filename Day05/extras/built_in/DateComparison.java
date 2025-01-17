import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {

    // Method to compare two dates
    public static void compareDates(LocalDate date1, LocalDate date2) {
        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("The two dates are the same.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateInput = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(firstDateInput);

        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateInput = scanner.nextLine();
        LocalDate date2 = LocalDate.parse(secondDateInput);

        // Compare the dates
        compareDates(date1, date2);

    }
}
