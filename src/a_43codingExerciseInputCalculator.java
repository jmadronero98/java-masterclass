import java.util.Scanner;

public class a_43codingExerciseInputCalculator {
    public static void main (String[]args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true) {
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int numberValue = scanner.nextInt();
                sum += numberValue;
                count++;
            } else {
                double result = Math.round((double)sum/(double)count);
                System.out.println("SUM = " + sum + " AVG = " + (int) result);
                break;
            }
        }
    }
}
