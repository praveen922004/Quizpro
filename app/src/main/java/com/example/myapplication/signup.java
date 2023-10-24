package com.example.myapplication;

import static android.content.ContentValues.TAG;

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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class signup extends AppCompatActivity {
   EditText e1,e2,e3;
   Button b;
   TextView t;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();
        setContentView(R.layout.activity_signup);
        e1=findViewById(R.id.etremail);
        e2=findViewById(R.id.etrpassword);
        e3=findViewById(R.id.etrconfirmpassword);
        t=findViewById(R.id.textView3);
        b=findViewById(R.id.btnsignup);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(signup.this, login.class);
                startActivity(i);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
                String email=e1.getText().toString();
                String password=e2.getText().toString();
                String confirmPassword=e3.getText().toString();
                Pattern pattern = Pattern.compile(emailRegex);
                Matcher matcher = pattern.matcher(email);
                if(email.isEmpty()){
                    e1.setError("Enter Email");
                }
                else {

                      if (!matcher.matches()) {
                        e1.setError("Enter Valid Email");

                    }
                }
                if (password.length()<6) {
                    e2.setError("Enter Strong Password");

                }
                if (!password.equals(confirmPassword)){

                    e3.setError("Please Enter Correct Password");

                }

               if(!email.isEmpty() && matcher.matches() && password.length()>=6 && password.equals(confirmPassword))
               {
                   performLogin(email,password);
               }
               else {
                   Toast.makeText(signup.this,"Please enter correct details",Toast.LENGTH_SHORT).show();
               }

          questionData.email=email;

            }


        });
    }

    private void performLogin(String email, String password) {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Toast.makeText(signup.this, "Authentication Success.",
                                    Toast.LENGTH_SHORT).show();
                            Intent i=new Intent(signup.this, firstpage.class);
                            startActivity(i);

                        } else {
                            // If sign in fails, display a message to the user.

                            Toast.makeText(signup.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();

                        }
                    }
                });
    }

}