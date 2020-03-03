package cn.xpbootcamp.tennis;

public class NotEqualHighScoreMap {

    public static String getResult(int difference) {
        if (difference == 1) {
            return "Advantage player1";
        } else if (difference == -1) {
            return "Advantage player2";
        } else if (difference > 1) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }
}
