public class EarthVolume {
    public static void main(String[] args) {
        // Radius of Earth in kilometers
        double earthRadiusKm = 6378;
        // Conversion factor from kilometers to miles
        double conversionFactorKmToMiles = 0.621371;

        // Calculate the volume of Earth in cubic kilometers
        double earthVolumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(earthRadiusKm, 3);

        // Convert radius to miles and calculate the volume in cubic miles
        double earthRadiusMiles = earthRadiusKm * conversionFactorKmToMiles;
        double earthVolumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(earthRadiusMiles, 3);

        // Print the results
        System.out.printf("The volume of Earth in cubic kilometers is %.2f ", earthVolumeKm3);
        System.out.printf("and cubic miles is %.2f ", earthVolumeMiles3);
    }
}
