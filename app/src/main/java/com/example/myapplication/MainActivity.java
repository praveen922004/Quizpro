package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button b;
   EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=findViewById(R.id.changeNamepp);
        b=findViewById(R.id.changebutton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=e.getText().toString();
                if(s.isEmpty())
                {
                    e.setError("Please Enter Name");
                }
                else{
                    questionData.name=s;
                    Intent i=new Intent(MainActivity.this, login.class);
                    startActivity(i);
                }
                /*Intent intent = new Intent(MainActivity.this, FinalResult.class);
                intent.putExtra("message_key", s);
                startActivity(intent);*/

            }
        });
    }
}