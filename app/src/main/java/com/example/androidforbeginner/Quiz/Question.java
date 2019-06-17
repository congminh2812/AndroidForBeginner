package com.example.androidforbeginner.Quiz;

import java.util.List;

public class Question {
    private String question;
    private String answerRight;
    private List<String> answerList;

    public Question(String question, String answerRight, List<String> answerList) {
        this.question = question;
        this.answerRight = answerRight;
        this.answerList = answerList;
    }
    public String getQuestion() {
        return question;
    }

    public String getAnswerRight() {
        return answerRight;
    }

    public List<String> getAnswerList() {
        return answerList;
    }
}
