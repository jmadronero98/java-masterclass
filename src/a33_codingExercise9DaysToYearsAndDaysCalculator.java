public class a33_codingExercise9DaysToYearsAndDaysCalculator {
    public static void main (String[] args) {
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            long convertedToHour = minutes / 60;
            //System.out.println("Hour = " +convertedToHour);
            long convertedToDay = convertedToHour / 24;
            //System.out.println("Day = "+convertedToDay);
            long convertedToYear = convertedToDay / 365;
            //System.out.println("Year = "+convertedToYear);
            long remainingDays = convertedToDay % 365;

            System.out.println(minutes + " min = "+ convertedToYear + " y and " + remainingDays + " d");
        }
    }
}
