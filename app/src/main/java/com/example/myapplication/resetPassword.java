package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class resetPassword extends AppCompatActivity {
     EditText e;
     Button b;
    private FirebaseAuth mAuth;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        b=findViewById(R.id.resetbutton);
        e=findViewById(R.id.enterresetemail);
        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=e.getText().toString();
                if(email.isEmpty())
                {
                    e.setError("Please Enter Email");
                }
                else {
                    performReset(email);
                }
            }
        });
    }

    private void performReset(String email) {
       mAuth.sendPasswordResetEmail(email)
               .addOnCompleteListener(new OnCompleteListener<Void>() {
                   @Override
                   public void onComplete(@NonNull Task<Void> task) {
                    if (task.isSuccessful())
                    {
                        Toast.makeText(resetPassword.this,"Check Your Email",Toast.LENGTH_SHORT).show();
                        Intent i=new Intent(resetPassword.this, login.class);
                        startActivity(i);
                    }
                    else {
                        Toast.makeText(resetPassword.this,"Error",Toast.LENGTH_SHORT).show();
                    }
                   }
               });
    }
}