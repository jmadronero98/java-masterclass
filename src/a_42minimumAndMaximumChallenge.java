import java.util.Scanner;

public class a_42minimumAndMaximumChallenge {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int minimum= Integer.MAX_VALUE;
//        int maximum= Integer.MAX_VALUE;

        int minimum=0;
        int maximum=0;
        boolean first = true;
        while(true) {
            System.out.println("Enter Number");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();

                if (first) {
                    first = false;
                    minimum = number;
                    maximum = number;
                }

                if(number > maximum) {
                    maximum = number;
                }

                if(number < minimum) {
                    minimum = number;
                }

            } else {
                System.out.println("Invalid Input");
                System.out.println("The minimum number is: " +minimum);
                System.out.println("The maximum number is: "+maximum);
                break;
            }
        }
    }

//    INSTRUCTION
//    Read the numbers from the console entered by the user and print the minimum
//    and maximum number the user has entered.
//
//    Before the user enters the number, print the message "Enter number."
//
//    If the user enters an invalid number, break out of the loop and print the minimum
//    and maximum number
//
//    Hint
//    Use an endless while loop
//
//    Bonus
//    Create a project with the name MinAndMaxInputChallenge
}
