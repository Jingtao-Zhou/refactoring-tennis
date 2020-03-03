package cn.xpbootcamp.tennis;

import java.util.HashMap;

public class NotEqualLowScoreMap {
    private static final HashMap<Integer, String> map = new HashMap<Integer, String>() {
        {
            this.put(0, "Love");
            this.put(1, "Fifteen");
            this.put(2, "Thirty");
            this.put(3, "Forty");
        }
    };

    public static String getResult(int score) {
        if (score < 0 || score > 3) {
            throw new IllegalArgumentException("score not valid");
        }
        return map.get(score);
    }
}
