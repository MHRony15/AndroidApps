package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bclc,bdot,beql,bdelet,bneg,bper;
    public TextView result;
    double vel1,vel2;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.btn1);
        b2=(Button) findViewById(R.id.btn2);
        b3=(Button) findViewById(R.id.btn3);
        b4=(Button) findViewById(R.id.btn4);
        b5=(Button) findViewById(R.id.btn5);
        b6=(Button) findViewById(R.id.btn6);
        b7=(Button) findViewById(R.id.btn7);
        b8=(Button) findViewById(R.id.btn8);
        b9=(Button) findViewById(R.id.btn9);
        b0=(Button) findViewById(R.id.btnZero);
        badd=(Button) findViewById(R.id.btnpls);
        bsub=(Button) findViewById(R.id.btndif);
        bmul=(Button) findViewById(R.id.btnmult);
        bdiv=(Button) findViewById(R.id.btndiv);
        bclc=(Button) findViewById(R.id.btncler);
        bdot=(Button) findViewById(R.id.btndot);
        beql=(Button) findViewById(R.id.btneql);
        bdelet=(Button) findViewById(R.id.btnDelet);
        bneg=(Button) findViewById(R.id.btnneg);
        bper=(Button) findViewById(R.id.btnper);

        result = (TextView) findViewById(R.id.ans);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+".");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result==null){
                    result.setText("");
                }
                else {
                    vel1=Double.parseDouble(result.getText()+"");
                    add=true;
                    result.setText(null);
                }

            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result==null){
                    result.setText("");
                }
                else {
                    vel1=Double.parseDouble(result.getText()+"");
                    sub=true;
                    result.setText(null);
                }

            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result==null){
                    result.setText("");
                }
                else{
                    vel1=Double.parseDouble(result.getText()+"");
                    mul=true;
                    result.setText(null);
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result==null){
                    result.setText("");
                }
                else {
                    vel1=Double.parseDouble(result.getText()+"");
                    div=true;
                    result.setText(null);
                }

            }
        });
        beql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vel2=Double.parseDouble(result.getText()+"");
                if (add==true){
                    result.setText(vel1+vel2+"");
                    add=false;
                }
                if (sub==true){
                    result.setText(vel1-vel2+"");
                    sub=false;
                }
                if (mul==true){
                    result.setText(vel1*vel2+"");
                    mul=false;
                }
                if (div==true){
                    result.setText(vel1/vel2+"");
                    div=false;
                }
            }
        });
        bclc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
            }
        });
    }
}
