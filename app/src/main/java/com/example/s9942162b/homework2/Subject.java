package com.example.s9942162b.homework2;

/**
 * Created by S9942162B on 3/10/2015.
 */
public class Subject {
    private String mName;
    private int mScore;
    private int mGPA;
    private Assignment[] mAssignmentList = new Assignment[]{
    };
    public Subject(String name) {
        mName = name;
    }
    public String getName() {
        return mName;
    }
    public void setName(String name) {
        mName = name;
    }

}
