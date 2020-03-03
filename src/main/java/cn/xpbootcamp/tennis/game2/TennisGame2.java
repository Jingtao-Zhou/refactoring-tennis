package cn.xpbootcamp.tennis.game2;

import cn.xpbootcamp.tennis.DeuceScoreMap;
import cn.xpbootcamp.tennis.NotEqualHighScoreMap;
import cn.xpbootcamp.tennis.NotEqualLowScoreMap;
import cn.xpbootcamp.tennis.TennisGame;

public class TennisGame2 implements TennisGame {
    private int player1Score = 0;
    private int player2Score = 0;

    public TennisGame2() {
    }

    public String getScore() {
        String score = "";
        if (player1Score == player2Score) {
            score = DeuceScoreMap.getResult(player1Score);
        }

        String player1Result;
        String player2Result;
        if (player1Score > 0 && player1Score < 4 && player2Score == 0) {
            player1Result = NotEqualLowScoreMap.getResult(player1Score);
            player2Result = "Love";
            score = player1Result + "-" + player2Result;
        }
        if (player2Score > 0 && player2Score < 4 && player1Score == 0) {
            player2Result = NotEqualLowScoreMap.getResult(player2Score);

            player1Result = "Love";
            score = player1Result + "-" + player2Result;
        }

        if (player1Score > player2Score && player1Score < 4) {
            player1Result = NotEqualLowScoreMap.getResult(player1Score);

            player2Result = NotEqualLowScoreMap.getResult(player2Score);

            score = player1Result + "-" + player2Result;
        }
        if (player2Score > player1Score && player2Score < 4) {
            player1Result = NotEqualLowScoreMap.getResult(player1Score);

            player2Result = NotEqualLowScoreMap.getResult(player2Score);

            score = player1Result + "-" + player2Result;
        }

        if ((player1Score > 3 || player2Score > 3) && player1Score != player2Score) {
            score = NotEqualHighScoreMap.getResult(player1Score - player2Score);
        }
        return score;
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName))
            player1Score++;
        else
            player2Score++;
    }
}