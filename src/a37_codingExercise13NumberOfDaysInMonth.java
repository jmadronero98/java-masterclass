public class a37_codingExercise13NumberOfDaysInMonth {
    public static void main (String[] args) {
        System.out.println(getDaysInMonth(1,-2020));
    }

    public static int getDaysInMonth(int month, int year) {
        if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
            return -1;
        }
        switch(month) {
            case 1:
                return 31;
            case 2:
                if(a28_codingExercise4LeapYearCalculator.isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 30;
        }
    }
}
