import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {

    // Method to display the current date in different formats
    public static void displayFormattedDates() {
        LocalDate currentDate = LocalDate.now();

        // Format 1: dd/MM/yyyy
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Current date in format dd/MM/yyyy: " + currentDate.format(format1));

        // Format 2: yyyy-MM-dd
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Current date in format yyyy-MM-dd: " + currentDate.format(format2));

        // Format 3: EEE, MMM dd, yyyy
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Current date in format EEE, MMM dd, yyyy: " + currentDate.format(format3));
    }

    public static void main(String[] args) {
        displayFormattedDates();
    }
}
