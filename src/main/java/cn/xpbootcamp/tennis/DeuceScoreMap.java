package cn.xpbootcamp.tennis;

import java.util.HashMap;

public class DeuceScoreMap {

    private static HashMap<Integer, String> map = new HashMap<Integer, String>() {
        {
            this.put(0, "Love-All");
            this.put(1, "Fifteen-All");
            this.put(2, "Thirty-All");
        }
    };

    public static String getResult(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("score not valid");
        }
        if (score > 2) {
            return "Deuce";
        }
        return map.get(score);
    }
}
