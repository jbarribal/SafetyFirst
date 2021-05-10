package com.example.safetyfirst;

public class Questions {

    public String mQuestions [] = {
            "First Question",
            "Second Question",
            "Third Question",

    };

    private String mChoices [][] = {
            {"A", "B", "C", "D"},
            {"A", "B", "C", "D"},
            {"A", "B", "C", "D"},
    };


    private String mCorrectAnswers [] = {"A", "B", "C"};

    public String getQuestion(int a) {
        String questions = mQuestions[a];
        return questions;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }





}
