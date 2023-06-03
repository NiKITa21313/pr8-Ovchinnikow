package com.example.pr8ovchinnikov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Catalog extends AppCompatActivity implements View.OnClickListener {
    Button btn, btn2, btn3, btn4, btn5;
    TextView txt, txt1, txt2, txt3;
    protected int a = 1, b = 1, c = 1500, d = 950;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);
        btn = (Button) findViewById(R.id.button4);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button);
        btn4 = (Button) findViewById(R.id.button3);
        btn5 = (Button) findViewById(R.id.button5);
        txt = (TextView) findViewById(R.id.textView3);
        txt1 = (TextView) findViewById(R.id.textView6);
        txt2 = (TextView) findViewById(R.id.textView2);
        txt3 = (TextView) findViewById(R.id.textView5);
        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button4:
            a++;
            c += 1500;
            display(a);
            display3(c);
            break;
            case R.id.button2:
            a--;
            if(c>0) {c -= 1500;
            display(a);
            display3(c);}

            break;
            case R.id.button:
            b--;
            d -= 950;
            display2(b);
            display4(d);
            break;
            case R.id.button3:
            b++;
            d += 950;
            display2(b);
            display4(d);
            break;
            case R.id.button5:
                startActivity(new Intent(this, Basket.class));
                break;
        }
    }

    public void display(int n) {
        txt.setText("" + n);
    }

    public void display2(int n) {
        txt1.setText("" + n);
    }

    public void display3(int n) {
        txt2.setText("" + n);
    }

    public void display4(int n) {
        txt3.setText("" + n);
    }
}
