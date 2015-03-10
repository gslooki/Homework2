package com.example.s9942162b.homework2;

/**
 * Created by S9942162B on 3/10/2015.
 */
public class Assignment {
    private String mName;
    private int mScore;
    private int mPercentage;
    public Assignment(String name, int score, int percentage) {
        mName = name;
        mScore = score;
        mPercentage = percentage;
    }
    public int getPercentage() {
        return mPercentage;
    }
    public void setPercentage(int percentage) {
        mPercentage = percentage;
    }
    public int getScore() {
        return mScore;
    }
    public void setScore(int score) {
        mScore = score;
    }
    public String getName() {
        return mName;
    }
    public void setName(String name) {
        mName = name;
    }

}
