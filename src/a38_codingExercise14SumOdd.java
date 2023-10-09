public class a38_codingExercise14SumOdd {
    public static void main (String[] args) {
        System.out.println(sumOdd(1,100));
    }
    public static boolean isOdd(int number) {
        if(number < 0) {
            return false;
        }
            boolean identifyOddOrTrue = (number % 2 == 0)? true:false;
            if(identifyOddOrTrue) {
                return true;
                //System.out.println("nakasulod");
            }
        return false;
    }

    public static int sumOdd(int start, int end) {
        if((start < 0) || (end < 0) || (start > end)) {
            return -1;
        }
        int sum = 0;
        for(int value = start; value>end; value++) {
            boolean isOddOrEven = isOdd(value);
            if(isOddOrEven) {
                sum += value;
            }
        }
        return sum;
    }
}
