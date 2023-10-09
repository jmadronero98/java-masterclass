public class a19_methodsInJava {
    public static void main(String[] args) {
      calculateScore(true, 800, 5, 100);
      int newValue = calculateScoreReturn(true, 10_000,8, 200);
      System.out.println("You final score was " + newValue);
    }

    //using void keyword doesn't send another value;
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2_000;
            System.out.println("You final score was " + finalScore);
        }
    }
    //using this kind of method will return a value.
    public static int calculateScoreReturn(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2_000;
            return finalScore;
        } else {
            return -1;
        }
    }

}
