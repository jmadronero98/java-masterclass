import java.util.Arrays;

public class b_55ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed Array = " +Arrays.toString(array));
    }

//    private static void reverse(int[] array) {
//        int[] reversedArray = new int[array.length];
//
//        int maxIndex = array.length - 1;
//        for(int x=0; x<array.length;x++) {
//            reversedArray[maxIndex] = array[x];
//            maxIndex--;
//        }
//    }

    public static void reverse( int[] array) {

        int maxIndex = array.length-1;
        int halfLength = array.length/2;
        for(int i=0; i<halfLength;i++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }
}
