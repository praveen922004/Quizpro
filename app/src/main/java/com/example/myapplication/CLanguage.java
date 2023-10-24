package com.example.myapplication;

import static com.example.myapplication.R.drawable.selected_option;
import static com.example.myapplication.R.drawable.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CLanguage extends AppCompatActivity  {
    TextView ques,progressText;
    TextView op1,op2,op3,op4;
    Button sub;
    private  int check=0;
    int score=0,selectOption=0;
    ProgressBar progressBar;
    int totalQuestion=questionData.question.length;

    int currentQuestionIndex=0;
    String selectAnswer="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clanguage);
        ques=findViewById(R.id.question_text);
        progressText=findViewById(R.id.progress_text);
        op1=findViewById(R.id.opt1);
        op2=findViewById(R.id.opt2);
        op3=findViewById(R.id.opt3);
        op4=findViewById(R.id.opt4);
        progressBar=findViewById(R.id.progress_bar);
        sub=findViewById(R.id.submit);
        setQuestion();
        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectAnswer=op1.getText().toString();
                selectOptionStyle(op1,1);
            }
        });
        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                selectAnswer=op2.getText().toString();
                selectOptionStyle(op2,2);
            }
        });
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                selectAnswer=op3.getText().toString();
                selectOptionStyle(op3,3);
            }
        });
        op4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectAnswer=op4.getText().toString();
                selectOptionStyle(op4,4);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button clickedButton=(Button) view;

                if(currentQuestionIndex<totalQuestion-1)
                {
                    if (selectAnswer.equals(questionData.correctAnswer[currentQuestionIndex])) {
                        score++;
                        Toast.makeText(CLanguage.this, "correct", Toast.LENGTH_SHORT).show();
                    }


                    currentQuestionIndex++;
                    setQuestion();
                }
                else{
                    sub.setText("FINISH");
                    if (selectAnswer.equals(questionData.correctAnswer[currentQuestionIndex])) {
                        score++;
                    }
                    questionData.Finalscore=score;
                    Intent i=new Intent(CLanguage.this,FinalResult.class);
                    startActivity(i);
                }
            }
        });
    }


    private void setQuestion() {
        setOptionStyle();
        int i=currentQuestionIndex+1;
        progressBar.setProgress(i);
        progressText.setText(i+"/"+totalQuestion);
        ques.setText(questionData.question[currentQuestionIndex]);
        op1.setText(questionData.choices[currentQuestionIndex][0]);
        op2.setText(questionData.choices[currentQuestionIndex][1]);
        op3.setText(questionData.choices[currentQuestionIndex][2]);
        op4.setText(questionData.choices[currentQuestionIndex][3]);

    }
    private void setOptionStyle() {
        ArrayList<TextView> optionList = new ArrayList<>();
        optionList.add(0,op1);
        optionList.add(1,op2);
        optionList.add(2,op3);
        optionList.add(3,op4);
        for(TextView op :optionList){
            op.setTextColor(Color.parseColor("#555151"));
            // op.setBackgroundColor(R.drawable.option);
            op.setTypeface(Typeface.DEFAULT);
        }
    }
    private void selectOptionStyle(TextView op, int i) {
        setOptionStyle();
        selectOption=i;
        op.setTypeface(Typeface.DEFAULT_BOLD);
        op.setTextColor(Color.parseColor("#000000"));
    }
}