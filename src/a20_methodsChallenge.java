public class a20_methodsChallenge {
    public static void main (String[] args) {

        int newValue = calculateScoreReturn(true, 10_000,8, 200);
        System.out.println("You final score was " + newValue);

        //int getPlayerPosition = calculateHighScorePosition(1500);
        //displayHighScorePosition("John",getPlayerPosition);
        //or
        displayHighScorePosition("John",calculateHighScorePosition(1500));
        displayHighScorePosition("Rim",calculateHighScorePosition(900));
        displayHighScorePosition("Jay",calculateHighScorePosition(400));
        displayHighScorePosition("Kal",calculateHighScorePosition(50));

        displayHighScorePosition("Ricky",calculateHighScorePosition(1000));
        displayHighScorePosition("Shina",calculateHighScorePosition(500));
        displayHighScorePosition("Abby",calculateHighScorePosition(400));


    }
    public static int calculateScoreReturn(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2_000;
            return finalScore;
        } else {
            return -1;
        }
    }

    //create a method called displayHighScorePosition
    //it should have a player name as a parameter, and a 2nd parameter as a position in the high score table
    //You should display the players name along with a message like "managed to get into position" and the
    //position they got and a further message "on the high score table".
    //
    //create a 2nd method called calculateHighScorePosition
    //it should be sent out argument only, the player score
    //it should return an int
    //the return data should be
    // 1 if the score is >1000
    // 2 if the score is >500 and <1000
    // 3 if the score is >100 and <500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400, and 50

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position and "
                + playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if(score >= 1_000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;

        //or
        int position = 4;// assuming position 4 will be returned

        if(playerScore>=1_000) {
            position = 1;
        } else if (playerScore >=500) {
            position = 2;
        } else if (playerScore >=100) {
            position = 3;
        }
        return position;
    }
}
