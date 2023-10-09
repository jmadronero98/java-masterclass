import java.util.Scanner;

public class b_53MinimumElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //System.out.println("Minimum element in the array is: " + findMin(readIntegers(5)));
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] returnedArray = readIntegers(count);
        int min = findMin(returnedArray);
        System.out.println("Minimum value is: "+min);
    }

    public static int[] readIntegers(int count) {

        int[] storeValue = new int[count];

        for(int x=0; x<storeValue.length; x++) {
            System.out.println("Input Number");
            int number = scanner.nextInt();
            scanner.nextLine();
            storeValue[x] = number;
        }
        return storeValue;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int x = 0; x < array.length; x++) {
            int value = array[x];

            if(value < min) {
                min = value;
            }
        }
        return min;
    }
}


