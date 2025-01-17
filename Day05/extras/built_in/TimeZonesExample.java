import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZonesExample {

    // Method to display the current time in different time zones
    public static void displayCurrentTimes() {
        // Get current time in GMT
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current time in GMT: " + gmtTime);

        // Get current time in IST
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current time in IST: " + istTime);

        // Get current time in PST
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current time in PST: " + pstTime);
    }

    // Main method to test the program
    public static void main(String[] args) {
        displayCurrentTimes();
    }
}
