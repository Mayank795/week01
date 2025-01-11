public class Spring {
    public static void main(String[] args) {
        
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the date falls in the Spring season
        boolean isSpringSeason = (month == 3 && day >= 20 && day <= 31) ||
                                 (month == 4 && day >= 1 && day <= 30) ||
                                 (month == 5 && day >= 1 && day <= 31) ||
                                 (month == 6 && day >= 1 && day <= 20);

        
        if (isSpringSeason) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
