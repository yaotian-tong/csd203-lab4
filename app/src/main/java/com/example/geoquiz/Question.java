package com.example.geoquiz;

public class Question {
    int textResId;
    boolean answer;

    Question(int textResId, boolean answer) {
        this.textResId = textResId;
        this.answer = answer;
    }

public int getTextResId(){
        return this.textResId ;
        }

public boolean isAnswer(){
        return this.answer;
    }
}



