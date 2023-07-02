package com.example.uibasedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ThirdPage extends AppCompatActivity {
    Button back, Dot;
    ImageView multiplyClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);

        back = findViewById(R.id.backHome);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThirdPage.this, SecondPage.class));
            }
        });

        Dot = findViewById(R.id.threedot);
        Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThirdPage.this, MainActivity.class));
            }
        });
        multiplyClose = findViewById(R.id.multiplyclose);
        multiplyClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
