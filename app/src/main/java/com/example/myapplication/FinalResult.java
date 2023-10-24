package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalResult extends AppCompatActivity {
TextView name,score;
Button last;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_result);
        name=findViewById(R.id.selectName);
        score=findViewById(R.id.TotalNumbers);
        last=findViewById(R.id.FinishButton);
        name.setText("Congratulations   "+ questionData.name);
        score.setText(questionData.Finalscore+"/"+questionData.question.length);
        last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(FinalResult.this,firstpage.class);
                startActivity(i);
            }
        });
        questionData.Finalscore=0;
    }
}