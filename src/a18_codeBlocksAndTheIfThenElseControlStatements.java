public class a18_codeBlocksAndTheIfThenElseControlStatements {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5_000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score == 5_000) {
//            System.out.println("You final score was 5000");
//            System.out.println("This was executed");
//        }

//        if ((score < 5_000) && (score > 1_000)) {
//            System.out.println("You're score was less than 5000 but greater than 1000");
//        } else if(score < 1_000) {
//            System.out.println("You're score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1_000;
            System.out.println("Your final score was " + finalScore);
        }

        //challenge
        //Print out a second score on the screen with the following
        //score set to 1000
        //levelCompleted set to 8
        //bonus set to 200
        //but make sure the first printout above still displays as well

        score = 1_000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
