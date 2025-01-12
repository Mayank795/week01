import java.util.HashSet;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999 (6 digits)
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check if all OTP numbers in the array are unique
    public static boolean areOTPsUnique(int[] otps) {
        // Use a HashSet to store OTPs, automatically handles uniqueness
        HashSet<Integer> otpSet = new HashSet<>();
        
        // Add each OTP to the set
        for (int otp : otps) {
            otpSet.add(otp);
        }
        
        // If the set size equals the array size, all OTPs are unique
        return otpSet.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10]; // Array to store 10 OTP numbers
        
        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check if all the OTP numbers are unique
        if (areOTPsUnique(otps)) {
            System.out.println("All OTP numbers are unique.");
        } else {
            System.out.println("Some OTP numbers are not unique.");
        }
    }
}
