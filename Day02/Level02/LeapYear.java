import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        
        if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
        } else {
            // Part 1: Using multiple if-else statements
            if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println(year + " is a Leap Year (Multiple if-else).");
            } else {
                System.out.println(year + " is not a Leap Year (Multiple if-else).");
            }

            // Part 2: Using a single if statement with logical conditions
            if ((year >= 1582) && ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0))) {
                System.out.println(year + " is a Leap Year (Single if statement with logical conditions).");
            } else {
                System.out.println(year + " is not a Leap Year (Single if statement with logical conditions).");
            }
        }

        
    }
}
