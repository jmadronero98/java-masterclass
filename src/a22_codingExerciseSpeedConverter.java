public class a22_codingExerciseSpeedConverter {
    public static void main (String[] args) {
        //System.out.println(toMilesPerHour(75.114));
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        long convertedMPH = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + convertedMPH + " mi/h");
    }
}
