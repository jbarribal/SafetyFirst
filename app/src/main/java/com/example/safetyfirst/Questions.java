package com.example.safetyfirst;

public class Questions {




    private String mQuestions [] = {"Test question #1", "Test question #2","Test question #3","Test question #4","Test question #5"


    };


    private String mChoices [][] = {
            {"A.q1", "B.q1", "C.q1","D.q1"},
            {"A.q2", "B.q2", "C.q2","D.q2"},
            {"A.q3", "B.q3", "C.q3","D.q3"},
            {"A.q4", "B.q4", "C.q4","D.q4"},
            {"A.q5", "B.q5", "C.q5","D.q5"},

    };



    private String mCorrectAnswers[] = {"B.q1","D.q2","A.q3","C.q4", "D.q5"};





    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
