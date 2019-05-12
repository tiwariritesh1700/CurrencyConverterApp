package com.example.ritesh.currencyconverterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
        Button euro, pond, dollar, yen, dinar, bitcoin,rubel, ausdollar, candollar;
        EditText editText;
        TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro=findViewById(R.id.button_euro);
        pond=findViewById(R.id.button_pound);
        dollar=findViewById(R.id.button_dollar);
        yen=findViewById(R.id.button_yen);
        dinar=findViewById(R.id.button_dinar);
        bitcoin=findViewById(R.id.button_bitcoin);
        rubel=findViewById(R.id.button_rube1);
        ausdollar=findViewById(R.id.button_ausdollar);
        candollar=findViewById(R.id.button_candollar);

        editText=findViewById(R.id.edittext);
        textView=findViewById(R.id.textview);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String EURO=editText.getText().toString();

                if (TextUtils.isEmpty(EURO)){

                    editText.setError("Empty User Input");
                }

                else
                    {
                        double n,k;

                        n=Double.parseDouble(EURO);
                        textView.setText(null);
                      //  Formatter formatter=new Formatter(); we can use this

                        k=n*77.61;

                        DecimalFormat decimalFormat=new DecimalFormat("#.00");//proffesional way to do
                        textView.setText(""+decimalFormat.format(k));

                        //textView.setText(""+k);//it is also way but not proffesional that much
                    }
            }
        });

        pond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String POND=editText.getText().toString();

                if (TextUtils.isEmpty(POND)){

                    textView.setError("Empty User Input");
                }
                else{
                    double n,k;
                    n=Double.parseDouble(POND);
                    textView.setText(null);

                    k=n*90.15;

                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });

        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String DOLLAR=editText.getText().toString();

                if (TextUtils.isEmpty(DOLLAR)){

                    editText.setError("Empty User Input");
                }

                else {

                    double n,k;

                    n=Double.parseDouble(DOLLAR);
                    textView.setText(null);
                    k=n*69.17;

                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }

            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String YEN=editText.getText().toString();

                if ((TextUtils.isEmpty(YEN))){

                    editText.setError("Empty User Input");
                }

                else{
                    double n,k;

                    n=Double.parseDouble(YEN);
                    textView.setText(null);
                    k=n*0.62;

                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));

                }
            }
        });

        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String DINAR=editText.getText().toString();

                if ((TextUtils.isEmpty(DINAR))){

                    editText.setError("Empty User Input");
                }

                else{
                    double n,k;

                    n=Double.parseDouble(DINAR);
                    textView.setText(null);
                    k=n*227.08;

                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));

                }
            }
        });
        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String BITCOIN=editText.getText().toString();

                if ((TextUtils.isEmpty(BITCOIN))){

                    editText.setError("Empty User Input");
                }

                else{
                    double n,k;

                    n=Double.parseDouble(BITCOIN);
                    textView.setText(null);
                    k=n*357040.32;

                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));

                }
            }
        });

        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String RUBEL=editText.getText().toString();

                if ((TextUtils.isEmpty(RUBEL))){

                    editText.setError("Empty User Input");
                }

                else{
                    double n,k;

                    n=Double.parseDouble(RUBEL);
                    textView.setText(null);
                    k=n*1.06;

                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));

                }
            }
        });

        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String AUSDOLLAR=editText.getText().toString();

                if ((TextUtils.isEmpty(AUSDOLLAR))){

                    editText.setError("Empty User Input");
                }

                else{
                    double n,k;

                    n=Double.parseDouble(AUSDOLLAR);
                    textView.setText(null);
                    k=n*49.17;

                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));

                }
            }
        });

        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String CANDOLLAR=editText.getText().toString();

                if(TextUtils.isEmpty(CANDOLLAR)){
                    editText.setError("Empty User Input");
                }
                else{
                    double n,k;

                    n=Double.parseDouble(CANDOLLAR);
                    textView.setText(null);

                    k=n*51.69;

                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });


    }
}
