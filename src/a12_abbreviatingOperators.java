public class a12_abbreviatingOperators {
    public static void main(String[] args) {
        int result = 1;
        result++; //increment by 1;
        System.out.println(result);

        int secondSampleResult = 1;
        secondSampleResult--; //decrement by 1
        System.out.println(secondSampleResult);

        int thirdSampleResult = 1;
        //thirdSampleResult = thirdSampleResult + 2; is the same as below.
        thirdSampleResult += 2;
        System.out.println(thirdSampleResult);
    }
}
