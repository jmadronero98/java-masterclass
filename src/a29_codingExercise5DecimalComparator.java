public class a29_codingExercise5DecimalComparator {
    public static void main (String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces( double firstVariable, double secondVariable) {
            double productFirstVariableValue = firstVariable * 1000;
            //System.out.println(productFirstVariableValue);
            double productSecondVariableValue = secondVariable * 1000;
            //System.out.println(productSecondVariableValue);

        if((int)productFirstVariableValue == (int)productSecondVariableValue) {
            return true;
        }
        return false;

    }
}
