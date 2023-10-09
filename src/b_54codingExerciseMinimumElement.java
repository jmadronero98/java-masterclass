import java.util.Scanner;

public class b_54codingExerciseMinimumElement {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int readInt = readInteger();
        int[] readEle = readElements(readInt);
        System.out.println(findMin(readEle));
    }

        private static int readInteger() {
            int value = scanner.nextInt();
            scanner.nextLine();
            return value;
        }

        private static int[] readElements(int array) {
            int[] value = new int[array];
            for(int x=0; x<value.length;x++) {
                System.out.println("Input Number: ");
                int getValue = scanner.nextInt();
                scanner.nextLine();
                value[x] = getValue;
            }
            return value;
        }

        private static int findMin(int[] array) {
            int min = Integer.MAX_VALUE;
            for (int value : array) {
                if (value < min) {
                    min = value;
                }
            }
            return min;
        }
    }
