public class a27_codingExercise3barkingDog {
    public static void main (String[] args) {
        boolean isWakeUpOrNot = shouldWakeUp(true, 1);
        System.out.println(isWakeUpOrNot);

        isWakeUpOrNot = shouldWakeUp(false, 2);
        System.out.println(isWakeUpOrNot);

        isWakeUpOrNot = shouldWakeUp(true, 8);
        System.out.println(isWakeUpOrNot);

        isWakeUpOrNot = shouldWakeUp(true, -1);
        System.out.println(isWakeUpOrNot);


    }
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if ((barking == false) ||(hourOfDay < 0) || (hourOfDay > 23)) {
            return false;
        }
        if (hourOfDay < 8) {
            return true;
        } else if (hourOfDay > 22) {
            return true;
        } else {
            return false;
        }
    }
}
