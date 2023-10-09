public class a5_Casting {
    public static void main (String[] args){
        int myFirstValue = 15;
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        byte myNewByteValue = (byte)(myMinByteValue / 2);
        short myNewShortValue =(short)(myMinShortValue / 2);

        //System.out.println(myNewByteValue);
        //System.out.println(myNewShortValue);
    }
}
