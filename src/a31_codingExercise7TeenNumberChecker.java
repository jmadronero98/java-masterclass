public class a31_codingExercise7TeenNumberChecker {
    public static void main (String[] args) {
        //System.out.println(hasTeen(22,23,34));
        System.out.println(isTeen(13));

    }
    public static boolean hasTeen(int firstAgeValue, int secondAgeValue, int thirdAgeValue) {
        if ((firstAgeValue > 12 && firstAgeValue < 20) || (secondAgeValue > 12 && secondAgeValue < 20) || (thirdAgeValue > 12 && thirdAgeValue < 20)) {
            return true;
        }
        return false;
    }
    public static boolean isTeen(int ageValue) {
        if (ageValue > 12 && ageValue < 20) {
            return true;
        }
        return false;
    }
}
