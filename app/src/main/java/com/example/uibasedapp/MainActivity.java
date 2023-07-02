package com.example.uibasedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView, menuIcon;
    private Button nextPage;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    imageView= findViewById(R.id.fab);
    menuIcon=findViewById(R.id.tab);
    nextPage=findViewById(R.id.mainPageRedirect);

    nextPage.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, SecondPage.class));
        }
    });
    }
}