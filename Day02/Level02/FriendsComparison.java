import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the age of Amar: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter the height (in cm) of Amar: ");
        double heightAmar = scanner.nextDouble();

        
        System.out.print("Enter the age of Akbar: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter the height (in cm) of Akbar: ");
        double heightAkbar = scanner.nextDouble();

        
        System.out.print("Enter the age of Anthony: ");
        int ageAnthony = scanner.nextInt();
        System.out.print("Enter the height (in cm) of Anthony: ");
        double heightAnthony = scanner.nextDouble();

        // Determine the youngest friend
        String youngestFriend;
        int youngestAge;
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            youngestFriend = "Amar";
            youngestAge = ageAmar;
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            youngestFriend = "Akbar";
            youngestAge = ageAkbar;
        } else {
            youngestFriend = "Anthony";
            youngestAge = ageAnthony;
        }

        // Determine the tallest friend
        String tallestFriend;
        double tallestHeight;
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            tallestFriend = "Amar";
            tallestHeight = heightAmar;
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            tallestFriend = "Akbar";
            tallestHeight = heightAkbar;
        } else {
            tallestFriend = "Anthony";
            tallestHeight = heightAnthony;
        }

        
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm.");

       
    }
}
