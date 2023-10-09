public class a6_PrimitiveTypeChallengeWholeNumbers {
    public static void main(String[] args){
        byte myFirstByteValue = 2;
        short myFirstShortValue = 25;
        int myFirstIntValue = 643;

        //casting is not needed because the three data types will always fit to the the Long data types.
        //long occupies 64 bits
        long myFirstLongValue = 50_000L + 10L * (myFirstByteValue + myFirstIntValue + myFirstShortValue);
        System.out.print(myFirstLongValue);

    }
}
