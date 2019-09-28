package com.example.gpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button sgpa,ygpa,cgpa;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sgpa = (Button) findViewById(R.id.sgpa);
        ygpa = (Button) findViewById(R.id.ygpa);
        cgpa = (Button) findViewById(R.id.cgpa);
        text = (TextView) findViewById(R.id.cgpa);

        sgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSGPA();
            }
        });
        ygpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYGPA();
            }
        });
        cgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCGPA();
            }
        });

    }
    public  void openSGPA(){
        Intent intent = new Intent(this,SGPA.class);
        startActivity(intent);
    }
    public  void openYGPA(){
        Intent intent2 =  new Intent(this,YGPA.class);
        startActivity(intent2);
    }
    public  void  openCGPA(){
        Intent intent3 =new Intent(this,CGPA.class);
        startActivity(intent3);
    }
}
