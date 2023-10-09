public class a28_codingExercise4LeapYearCalculator {
    public static void main (String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2024));
    }
    public static boolean isLeapYear (int year) {
        if((year < 0) || (year > 9999)) {
            return false;
        }
        if (year % 4 == 0) {
            //System.out.println("Divisible by 4");
            int remainingValue = year % 100;
            if(remainingValue % 4 == 0 ) {
                //System.out.println("Divisible by 100");
                remainingValue = year % 400;
                if(remainingValue % 4 == 0) {
                    //System.out.println("Divisible by 400");
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
