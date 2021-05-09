package com.example.safetyfirst;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import org.w3c.dom.Text;

public class PreTest extends AppCompatActivity {

    /** Try button */
    private Button btnTest;

    private PreQuiz mQuestionLibrary = new PreQuiz();


    private Button btnChoice0;
    private Button btnChoice1;
    private Button btnChoice2;
    private Button btnChoice3;

    private TextView txtScoreView;
    private TextView txtQuestion;

    private String Answer;
    private int Score = 0;
    private int QuestionNumber = 0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_test);

        final Button btnTest = (Button) findViewById(R.id.btnTest);
        final Button btnChoice0 = (Button) findViewById(R.id.btnChoice0);
        final Button btnChoice1 = (Button) findViewById(R.id.btnChoice1);
        final Button btnChoice2 = (Button) findViewById(R.id.btnChoice2);
        final Button btnChoice3 = (Button) findViewById(R.id.btnChoice3);
        final TextView txtQuestion = (TextView) findViewById(R.id.txtQuestion);
        final TextView ScoreView = (TextView) findViewById(R.id.txtScoreView);



        //For Button0
        btnChoice0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnChoice0.getText() == Answer) {
                    Score = Score + 1;
                    updateScore(Score);
                    updateQuestion();
                    Toast.makeText(PreTest.this, "correct", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(PreTest.this, "wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //For Button1
        btnChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnChoice1.getText() == Answer) {
                    Score = Score + 1;
                    updateScore(Score);
                    updateQuestion();
                    Toast.makeText(PreTest.this, "correct", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(PreTest.this, "wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //For Button2
        btnChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnChoice2.getText() == Answer) {
                    Score = Score + 1;
                    updateScore(Score);
                    updateQuestion();
                    Toast.makeText(PreTest.this, "correct", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(PreTest.this, "wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //For Button3
        btnChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnChoice3.getText() == Answer) {
                    Score = Score + 1;
                    updateScore(Score);
                    updateQuestion();
                    Toast.makeText(PreTest.this, "correct", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(PreTest.this, "wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });



        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreTest.this, DisasterPage.class);
                startActivity(intent);
            }
        });
    }

    private void updateQuestion(){
        txtQuestion.setText(mQuestionLibrary.getQuestion(QuestionNumber));
        btnChoice0.setText(mQuestionLibrary.getChoice0(QuestionNumber));
        btnChoice1.setText(mQuestionLibrary.getChoice1(QuestionNumber));
        btnChoice2.setText(mQuestionLibrary.getChoice2(QuestionNumber));
        btnChoice3.setText(mQuestionLibrary.getChoice3(QuestionNumber));

        Answer = mQuestionLibrary.getCorrectAnswer(QuestionNumber);
        QuestionNumber++;

    }

    private void updateScore(int point) {
        txtScoreView.setText("" + Score);
    }
}