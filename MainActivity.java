package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button num1,num2,num3,num4,num5,num6;
        TextView resi;
        EditText enter;
        enter = findViewById(R.id.text1);
        num1=findViewById(R.id.text2);
        num2=findViewById(R.id.text3);
        num3=findViewById(R.id.text4);
        num4=findViewById(R.id.text5);
        num5=findViewById(R.id.text6);
        num6=findViewById(R.id.text7);
        resi=findViewById(R.id.text8);
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tot=Integer.parseInt(enter.getText().toString());
                double har=tot/2.54;

                resi.setText("RESULT in inches: "+har);

            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tot=Integer.parseInt(enter.getText().toString());
                double har=tot*2.54;
                resi.setText("RESULT in cm: "+har);

            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tot=Integer.parseInt(enter.getText().toString());
                double har=(tot*1.8)+32;
                resi.setText("RESULT in fahrenheit: "+har);

            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tot=Integer.parseInt(enter.getText().toString());
                double har=(tot-32)/1.8000;
                resi.setText("RESULT in celsius: "+har);

            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tot=Integer.parseInt(enter.getText().toString());
                double har=tot/1000;
                resi.setText("RESULT in kg: "+har);

            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tot=Integer.parseInt(enter.getText().toString());
                double har=tot*1000;
                resi.setText("RESULT in g: "+har);

            }
        });




    }
}
