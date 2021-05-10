package com.example.safetyfirst;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import org.w3c.dom.Text;

import java.util.Random;

public class PreTest extends AppCompatActivity {

    /** Try button */
    private Button btnTest;




    private Button btnChoice1;
    private Button btnChoice2;
    private Button btnChoice3;
    private Button btnChoice4;

    private TextView txtScoreView;
    private TextView txtQuestion;

    private Questions mQuestions = new Questions();

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionLength = mQuestions.mQuestions.length;

    Random r;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_test);

        r = new Random();

        final Button btnTest = (Button) findViewById(R.id.btnTest);
        final Button btnChoice1 = (Button) findViewById(R.id.btnChoice1);
        final Button btnChoice2 = (Button) findViewById(R.id.btnChoice2);
        final Button btnChoice3 = (Button) findViewById(R.id.btnChoice3);
        final Button btnChoice4 = (Button) findViewById(R.id.btnChoice4);
        final TextView txtQuestion = (TextView) findViewById(R.id.txtQuestion);
        final TextView txtScoreView = (TextView) findViewById(R.id.txtScoreView);

        txtScoreView.setText("Score" + mScore);

        updateQuestion(r.nextInt(mQuestionLength));


        btnChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnChoice1.getText() == mAnswer) {
                    mScore++;
                    txtScoreView.setText("Score" + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }
                else {
                    updateQuestion(r.nextInt(mQuestionLength));

                }
            }
        });

        btnChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnChoice2.getText() == mAnswer) {
                    mScore++;
                    txtScoreView.setText("Score" + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }
                else {
                    updateQuestion(r.nextInt(mQuestionLength));

                }
            }
        });

        btnChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnChoice3.getText() == mAnswer) {
                    mScore++;
                    txtScoreView.setText("Score" + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }
                else {
                    updateQuestion(r.nextInt(mQuestionLength));

                }
            }
        });

        btnChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnChoice4.getText() == mAnswer) {
                    mScore++;
                    txtScoreView.setText("Score" + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }
                else {
                    updateQuestion(r.nextInt(mQuestionLength));

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

    private void updateQuestion(int num) {
        txtQuestion.setText(mQuestions.getQuestion(num));
        btnChoice1.setText(mQuestions.getChoice1(num));
        btnChoice2.setText(mQuestions.getChoice2(num));
        btnChoice3.setText(mQuestions.getChoice3(num));
        btnChoice4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
    }




}