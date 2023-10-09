public class a34_codingExercise10EqualityPrinter {
    public static void main (String[] args) {
        printEqual(1,2,3);
    }
    public static void printEqual(int firstValue, int secondValue, int thirdValue) {
        if((firstValue < 0) || (secondValue < 0) || (thirdValue < 0)) {
            System.out.println("Invalid Value");
        } else if ((firstValue == secondValue) && (secondValue == thirdValue) && (thirdValue == firstValue)) {
            System.out.println("All numbers are equal");
        } else if ((firstValue == secondValue) || (secondValue == thirdValue) ||(thirdValue == firstValue)) {
            System.out.println("Neither all are equal or different");
        } else
            System.out.println("All numbers are different");
    }
}
