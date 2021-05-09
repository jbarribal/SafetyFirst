package com.example.safetyfirst;

public class PreQuiz {

    private String Questions [] = {
            "This is the first question",
            "Second Question",
            "Third Question",
            "Fourth Question",
    };

    private String choices [][] = {
        {"A. BILOG", "B. DAPH", "C. DEXIE", "D. KAP"},
        {"A", "B", "C", "D"},
        {"A", "B", "C", "D"},
        {"A", "B", "C", "D"},

    };

    private String CorrectAnswers [] = {"D. KAP", "A", "A", "A"};

    public String getQuestion(int a) {
        String question = Questions[a];
        return question;
    }

    public String getChoice0(int a) {
        String choice0 = choices[a][0];
        return choice0;
    }
    public String getChoice1(int a) {
        String choice1 = choices[a][1];
        return choice1;
    }
    public String getChoice2(int a) {
        String choice2 = choices[a][2];
        return choice2;
    }
    public String getChoice3(int a) {
        String choice3 = choices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a){
        String answer = CorrectAnswers[a];
        return answer;
    }



}
