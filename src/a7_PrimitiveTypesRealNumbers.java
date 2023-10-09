public class a7_PrimitiveTypesRealNumbers {
    public static void main(String[] args) {
        float maxFloatValue = Float.MAX_VALUE;
        float minFloatValue = Float.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        double minDoubleValue = Double.MIN_VALUE;

        System.out.println("Float Maximum Value = " + maxFloatValue);
        System.out.println("Float Minimum Value = " + minFloatValue);
        System.out.println("Double Maximum Value = " + maxDoubleValue);
        System.out.println("Double Minimum Value = " + minDoubleValue);


        int myIntValue = 5;
        float myFloatValue = 5.25F / 3F;
        float mySecondFloatValue = (float) 5.25; //challenge (casting to float)
        double myDoubleValue = 5.25 / 3; //default floating point operations.

        //precision test
        System.out.println("myIntValue= " +myIntValue);
        System.out.println("myFloatValue= " +myFloatValue);
        System.out.println("myDoubleValue= " +myDoubleValue);

        //challenge
        double poundsValue = 0.45359237;
        double kilogramValue = 200d * poundsValue;
        System.out.println("Kilogram= " +kilogramValue);
    }
}
