import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class DateArithmetic {

    // Method to perform date arithmetic operations
    public static void performDateArithmetic(LocalDate date) {
        // Add 7 days, 1 month, and 2 years
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("Date after adding 7 days, 1 month, and 2 years: " + modifiedDate);

        // Subtract 3 weeks
        modifiedDate = modifiedDate.minusWeeks(3);
        System.out.println("Date after subtracting 3 weeks: " + modifiedDate);
    }

    public static void main(String[] args) {

        LocalDate inputDate = LocalDate.of(2023, 1, 1); // Replace with dynamic input if needed
        System.out.println("Input Date: " + inputDate);

        performDateArithmetic(inputDate);
    }
}
