public class a24_switchCase {
    public static void main (String[] args) {
//        int value = 1;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 6;

        switch(switchValue) {
            case 1:
                System.out.println("Values was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or 4, or a 5");
                System.out.println("Actually it was " +switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        //create a new switch statement using char instead of int
        //create a new char variable
        //create a switch statement testing for
        //A, B, C, D, or E
        //display a message if any of these are found and then break
        // add a default which displays a message saying not found

        //Bonus:
        //Write a second solution using if then else, instead of using switch.

        char charValue = 'D';

        switch(charValue) {
            case 'A':
                System.out.println("It's a letter A");
                break;
            case 'B':
                System.out.println("It's a letter B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("It's a letter " +charValue);
                break;
            default:
                System.out.println("Nothing found");
        }

        String month = "January";
        switch(month.toLowerCase()) {
            case "January":
                System.out.println("January");
                break;
            case "June":
                System.out.println("June");
                break;
            default:
                System.out.println("Nothing found");
                break;
        }
        printDayOfTheWeek(5);
        printDayOfTheWeekUsingIfThenElse(3);
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Nothing Found");
                break;
        }
    }

    public static void printDayOfTheWeekUsingIfThenElse(int day) {
        if(day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Nothing Found");
        }
    }
}
