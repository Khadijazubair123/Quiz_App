package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button Button1;
    private Button Button2;
    private Button Button3;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button1 =findViewById(R.id.Button1);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        Button2 =findViewById(R.id.Button2);
        Button3 =findViewById(R.id.Button3);
        textview =findViewById(R.id.textView);
    }
}