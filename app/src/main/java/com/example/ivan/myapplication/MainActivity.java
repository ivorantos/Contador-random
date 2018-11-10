package com.example.ivan.myapplication;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        num=0;




    }


    public void inc (View v){
        num++;
        refresh();
    }

    public void dec (View v){
        num--;
        refresh();
    }

    public void reset (View v){
        num=0;
        refresh();
    }

    public void refresh () {



        TextView t= (TextView)  findViewById(R.id.contador);

        t.setText("Pulsaciones "+ num);
    }
}
