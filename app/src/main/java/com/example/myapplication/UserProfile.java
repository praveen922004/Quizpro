package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserProfile extends AppCompatActivity {
   TextView username,email;
   Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        username=findViewById(R.id.usernameTextView);
        username.setText(questionData.name);
        email=findViewById(R.id.emailTextView);
        email.setText(questionData.email);
        b=findViewById(R.id.editProfileButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(UserProfile.this,firstpage.class);
                startActivity(i);
            }
        });
    }
}