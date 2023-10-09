import java.security.spec.RSAOtherPrimeInfo;

public class a4_PrimitiveTypesWholeNumbers {
    public static void main(String[] args) {
        int myValue = 1000;
        
        //int occupies 32 bits, and has a width of 32;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1)); //overflow
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));//underflow

        int myMaxIntText = 2_147_483_647;
        
        //byte occupies 8 bits and has a width of 8;
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value =" + myMinByteValue);
        System.out.println("Byte Maximum Value =" + myMaxByteValue);
        
        //short occupies 16 bits, and has a width of 16;
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value =" + myMinShortValue);
        System.out.println("Short Maximum Value =" + myMaxShortValue);

        //when declaring the data type long, the value should have uppercase "L"after.
        // Indicates it's a long value.
        long myLongValue = 100;
        System.out.println(myLongValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value =" + myMinLongValue);
        System.out.println("Long Maximum Value =" + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_232L;
        System.out.println(bigLongLiteralValue);
    }
}
