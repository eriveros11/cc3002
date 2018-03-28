package com.example.BowlingGame;

public class BowlingGame {

    private int score=0;

    public void roll(int i) {
        score +=i;
    }

    public int score() {
        return score;
    }
}
