package com.example.manikarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button btnc,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    public Button btnadd,btnsub,btndiv,btnmul,btndec,btnequal;
    public EditText textarea;
    public String val1, val2, result;
    public boolean add, sub, mul, div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Calculator");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnc = (Button) findViewById(R.id.btnc);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnmul = (Button) findViewById(R.id.btnmul);
        btndiv = (Button) findViewById(R.id.btndiv);
        btndec = (Button) findViewById(R.id.btndec);
        btnequal = (Button) findViewById(R.id.btnequal);
        textarea = (EditText) findViewById(R.id.textarea);

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textarea.setText("");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textarea.setText(textarea.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textarea.setText(textarea.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textarea.setText(textarea.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textarea.setText(textarea.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textarea.setText(textarea.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textarea.setText(textarea.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textarea.setText(textarea.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textarea.setText(textarea.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textarea.setText(textarea.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textarea.setText(textarea.getText()+"0");
            }
        });
        btndec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textarea.setText(textarea.getText()+".");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=textarea.getText()+"";
                add = true;
                textarea.setText(null);
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=textarea.getText()+"";
                sub = true;
                textarea.setText(null);
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=textarea.getText()+"";
                mul = true;
                textarea.setText(null);
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=textarea.getText()+"";
                div = true;
                textarea.setText(null);
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=textarea.getText()+"";
                if(add==true){
                    textarea.setText(CalculatorFuntion.add(val1,val1));
                    add=false;

                }
                else if(sub==true){
                    textarea.setText(CalculatorFuntion.sub(val1,val2));
                    sub=false;
                }
                else if(mul==true){
                    textarea.setText(CalculatorFuntion.mul(val1,val2));
                    mul=false;
                }
                else if(div==true){
                    textarea.setText(CalculatorFuntion.div(val1,val2));
                    div=false;
                }
            }
        });
    }

}
