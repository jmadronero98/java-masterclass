public class a25_codingExercise1SpeedConverter {
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
        double milePerHourValue = Math.round(kilometersPerHour / 1.609);
        //System.out.println(milePerHourValue);
        return (long) milePerHourValue;
    }

    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            int conversionValue = (int) toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + conversionValue + " mi/h");
        }
    }
}
