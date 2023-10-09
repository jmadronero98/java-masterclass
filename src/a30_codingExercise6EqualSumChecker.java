public class a30_codingExercise6EqualSumChecker {
    public static void main (String[] args) {
        System.out.println(hasEqualSum(1,-1,0));
    }

    public static boolean hasEqualSum(int firstVariable, int secondVariable, int thirdVariable) {
        if(firstVariable + secondVariable == thirdVariable) {
            return true;
        }
        return false;
    }
}
