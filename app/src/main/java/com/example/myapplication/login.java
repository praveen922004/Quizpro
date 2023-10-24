package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class login extends AppCompatActivity {
     Button b;
     EditText em,ps;
     TextView t1,t2;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        b=findViewById(R.id.btnlogin);
        em=findViewById(R.id.etemail);
        ps=findViewById(R.id.etPassword);
        t1=findViewById(R.id.forgotPassword);
        t2=findViewById(R.id.textView6);
        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(login.this,resetPassword.class);
                startActivity(i);
            }
        });
       t2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i=new Intent(login.this,signup.class);
               startActivity(i);
           }
       });
       t1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i=new Intent(login.this,resetPassword.class);
               startActivity(i);
           }
       });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=em.getText().toString();
                String password=ps.getText().toString();
                if(email.isEmpty() )
                {
                    em.setError("ENTER VALID EMAIL");
                } else if ( password.isEmpty()) {
                    ps.setError("ENTER VALID PASSWORD");
                }
                else {
                   performLogin(email,password);
                }
                questionData.email=email;
            }
        });
    }

    private void performLogin(String email,String password) {
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {

                            FirebaseUser user = mAuth.getCurrentUser();
                            Intent i=new Intent(login.this,firstpage.class);
                            startActivity(i);

                        } else {
                            // If sign in fails, display a message to the user.

                            Toast.makeText(login.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();

                        }
                    }
                });

    }
}