package com.londonappbrewery.quizzler;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    // TODO: Declare constants here


    // TODO: Declare member variables here:
    Button trueButton ;
    Button falsButton ;
    TextView question ;
    ProgressBar mProgressBar ;
    TextView score ;
    int mQuestion;
    int mIndex;




    // TODO: Uncomment to create question bank
    private TrueFalse[] mQuestionBank = new TrueFalse[] {
            new TrueFalse(R.string.question_1, true),
            new TrueFalse(R.string.question_2, true),
            new TrueFalse(R.string.question_3, true),
            new TrueFalse(R.string.question_4, true),
            new TrueFalse(R.string.question_5, true),
            new TrueFalse(R.string.question_6, false),
            new TrueFalse(R.string.question_7, true),
            new TrueFalse(R.string.question_8, false),
            new TrueFalse(R.string.question_9, true),
            new TrueFalse(R.string.question_10, true),
            new TrueFalse(R.string.question_11, false),
            new TrueFalse(R.string.question_12, false),
            new TrueFalse(R.string.question_13,true)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trueButton = (Button)findViewById(R.id.true_button);
        falsButton = (Button)findViewById(R.id.false_button);
        question = (TextView)findViewById(R.id.question_text_view);
        mProgressBar = (ProgressBar)findViewById(R.id.progress_bar);
        score = (TextView)findViewById(R.id.score);


        mQuestion = mQuestionBank[mIndex].getQuestionId();
        question.setText(mQuestion);




        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"true button have been clicked",Toast.LENGTH_LONG).show();
            }
        });
        falsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"the false button have been clicked",Toast.LENGTH_LONG).show();
            }
        });
    }

}
