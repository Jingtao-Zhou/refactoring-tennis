package cn.xpbootcamp.tennis.game3;

import cn.xpbootcamp.tennis.TennisGame;

public class TennisGame3 implements TennisGame {

    private int player2Score;
    private int player1Score;
    private String player1Name;
    private String player2Name;
    private static final String[] resultsMap = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String result;
        if (bothScoreIsTooLowToGetWinner()) {
            result = resultsMap[player1Score];
            return (player1Score == player2Score) ? result + "-All" : result + "-" + resultsMap[player2Score];
        } else {
            if (player1Score == player2Score)
                return "Deuce";
            result = player1Score > player2Score ? player1Name : player2Name;
            return ((player1Score - player2Score) * (player1Score - player2Score) == 1) ? "Advantage " + result : "Win for " + result;
        }
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName))
            this.player1Score += 1;
        else
            this.player2Score += 1;

    }

    private boolean bothScoreIsTooLowToGetWinner() {
        return player1Score < 4 && player2Score < 4 && !(player1Score + player2Score == 6);
    }

}