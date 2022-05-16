package com.example.demo.model;

public class ScoreCard {

    private String playerName;
    private int score;
    private int fours;
    private int sixes;
    private int numberOfBalls;

    public ScoreCard(String playerName, int score, int fours, int sixes, int numberOfBalls) {
        this.playerName = playerName;
        this.score = score;
        this.fours = fours;
        this.sixes = sixes;
        this.numberOfBalls = numberOfBalls;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getFours() {
        return fours;
    }

    public void setFours(int fours) {
        this.fours = fours;
    }

    public int getSixes() {
        return sixes;
    }

    public void setSixes(int sixes) {
        this.sixes = sixes;
    }

    public int getNumberOfBalls() {
        return numberOfBalls;
    }

    public void setNumberOfBalls(int numberOfBalls) {
        this.numberOfBalls = numberOfBalls;
    }

    @Override
    public String toString() {
        return "ScoreCard{" +
                "playerName='" + playerName + '\'' +
                ", score=" + score +
                ", fours=" + fours +
                ", sixes=" + sixes +
                ", numberOfBalls=" + numberOfBalls +
                '}';
    }
}
