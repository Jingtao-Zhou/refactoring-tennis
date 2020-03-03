package cn.xpbootcamp.tennis.game1;

import cn.xpbootcamp.tennis.DeuceScoreMap;
import cn.xpbootcamp.tennis.NotEqualHighScoreMap;
import cn.xpbootcamp.tennis.NotEqualLowScoreMap;
import cn.xpbootcamp.tennis.TennisGame;

public class TennisGame1 implements TennisGame {

    private int player1Score = 0;
    private int player2Score = 0;

    public TennisGame1() {
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName))
            player1Score += 1;
        else
            player2Score += 1;
    }

    public String getScore() {
        if (player1Score == player2Score) {
            return DeuceScoreMap.getResult(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            return NotEqualHighScoreMap.getResult(minusResult);
        } else {
            return NotEqualLowScoreMap.getResult(player1Score) + "-" + NotEqualLowScoreMap.getResult(player2Score);
        }
    }
}