public class a35_codingExercise11PlayingCat {
    public static void main (String[] args) {
        System.out.println(isCatPlaying(true, 46));
    }
    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        if(isSummer && ((temperature > 24) && (temperature < 46))) {
            return true;
        } else if (!isSummer && ((temperature > 24) && (temperature < 36))) {
            return true;
        } else {
            return false;
        }
    }
}
