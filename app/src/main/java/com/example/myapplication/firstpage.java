package com.example.myapplication;
import androidx.appcompat.widget.Toolbar;
import static com.example.myapplication.R.id.myprofile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class firstpage extends AppCompatActivity {
    CardView c,cpp,java,os,cn,mq;
   ActionBarDrawerToggle actionBarDrawerToggle;
   DrawerLayout drawerLayout;
   MaterialToolbar toolbar;
   NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);
      c=findViewById(R.id.c);
      cpp=findViewById(R.id.cpp);
      java=findViewById(R.id.java);
      os=findViewById(R.id.os);
      cn=findViewById(R.id.cnn);
      mq=findViewById(R.id.mq);
      c.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent i=new Intent(firstpage.this,CLanguage.class);
              startActivity(i);
          }
      });
      cpp.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent i=new Intent(firstpage.this,cppLanguage.class);
              startActivity(i);
          }
      });
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(firstpage.this,java.class);
                startActivity(i);
            }
        });
        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(firstpage.this,operating.class);
                startActivity(i);
            }
        });
        cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(firstpage.this,Networking.class);
                startActivity(i);
            }
        });
        mq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(firstpage.this,MicroProccessor.class);
                startActivity(i);
            }
        });

        drawerLayout=findViewById(R.id.drawerLayout);
        navigationView=findViewById(R.id.navview);
        toolbar = findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        actionBarDrawerToggle=new ActionBarDrawerToggle(firstpage.this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
      navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
          @Override
          public boolean onNavigationItemSelected(@NonNull MenuItem item) {
              int id=item.getItemId();
              if(id==R.id.followus)
              {
                  Toast.makeText(firstpage.this,"unavailable",Toast.LENGTH_SHORT).show();
                  return  true;
              }
              if(id==R.id.myprofile)
              {  Intent i=new Intent(firstpage.this,UserProfile.class);
                  startActivity(i);

              }
              if (id==R.id.rateus) {
                  Toast.makeText(firstpage.this,"unavailable",Toast.LENGTH_SHORT).show();
                  return true;
              }
              if(id==R.id.logout){
                  Toast.makeText(firstpage.this,"Log Out",Toast.LENGTH_SHORT).show();
                  Intent i=new Intent(firstpage.this,MainActivity.class);
                  startActivity(i);
              }
               return false;
          }
      });



    }




}