public class a23_methodOverloading {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New Score is " + newScore);
//        calculateScore(400);
//        calculateScore();
//        double getResult = calcFeetAndInchesToCentimeters(157);
//        System.out.println(getResult);
//        calcFeetAndInchesToCentimeters(7,5);

        System.out.println(getDurationString(8430));

    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static void calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
    }

    public static void calculateScore() {
        System.out.println("No player name, no player score.");
    }

    //Create a method called calcFeeAndInchesToCentimeters
    //It needs to have two parameters.
    //feet is the first parameter, inches is the 2nd parameter
    //
    //You should validate that the parameter feet is >=0
    //You should validate that the 2nd parameter inches is >=0 and <=12
    //return -1 from the method if either of the above is not true
    //
    //If the parameters are valid, then calculate how many centimeters
    //comprise the feet and inches passed to this method and return that value.
    //
    //Create a 2nd method of the same name but with ony one parameter
    //inches is the parameter
    //validate that its >=0
    //return -1 if it is not true
    //But if its valid, then calculate how many feet are in the inches and then here is the tricky part
    //call the other overloaded method passing the correct feet and inches
    //and then here is the tricky part
    //call the other overloaded method passing the correct feet and inches
    //calculated so that it can calculate correctly.
    //hints: Use double for your number data types is probably a good idea
    // 1 inch = 2.54 cm and one foot = 12 inches
    //use the link I give you to confirm your code is calculating correctly.
    //calling another overloaded method just requires you to use the
    //right number of parameters.

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet < 0) || ((inches < 0) || (inches > 12))) {
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet +"Feet, " + inches + " Inches =  " + centimeters + " CM");
        return (centimeters);
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            return -1;
        }
            int feetValue = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches = " +feetValue + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feetValue, remainingInches);
    }

    //create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.
    //you should validate that the first parameter minutes is >=0;
    //you should validate that the 2nd parameter seconds is >=0 and <=59.
    //the method should return "invalid value" in the method if either of the above are not true.
    //if the parameters are valid then calculate how many hours minutes and seconds equal to minutes and seconds passed
    //to this method and return that value as string in format "XXh YYm ZZs" where XX represents a number of hours,
    //YY the minutes and ZZ the seconds.

    //create a 2nd method of the same name but with only one parameter seconds.
    //Validate that it is >=0, and return "Invalid value" if it is not true.
    //if it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method
    //passing the correct minutes and seconds calculated so that it can calculate correctly.
    //call both methods to print values to the console.

    //Tips
    //Use int or long for your number data types is probably a good idea.
    //1 minute = 60 seconds and 1 hour = 60 minutes or 3,600 seconds.
    //Methods should be static as we have used previously.

    private static String getDurationString(int minutes, int seconds) {
        if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        int hour = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.println(minutes + " minute/s and " + seconds + " second/s = "
                + hour + " hour/s " + remainingMinutes + " minute/s "
                + seconds + " second/s.");

        String newFormatHour = hour + "h";
        if(hour < 10) {
            newFormatHour = "0" + hour + "h";
        }
        String newFormatMinutes = remainingMinutes + "m";
        if(remainingMinutes < 10) {
            newFormatMinutes = "0" + remainingMinutes + "m";
        }

        String newFormatSeconds = seconds + "s";
        if(seconds < 10) {
            newFormatSeconds = "0" + seconds + "s";
        }

        return newFormatHour +" " + newFormatMinutes + " " + newFormatSeconds;
    }

    private static String getDurationString(int seconds) {
        if(seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + " second/s = " + minutes + "minute/s and " + remainingSeconds + "second/s");

        return getDurationString(minutes, remainingSeconds);
    }
}