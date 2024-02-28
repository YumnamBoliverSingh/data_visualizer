package com.boliver.datavisualiser_thewebscrappingtool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    androidx.constraintlayout.widget.ConstraintLayout CL_enter;
    ConstraintLayout cl_score_enter_enternow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        CL_enter=findViewById(R.id.CL_enter);
        cl_score_enter_enternow=findViewById(R.id.cl_score_enter_enternow);
        cl_score_enter_enternow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KRT_Activity.class);
                startActivity(intent);
            }
        });
        CL_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, KRT_Activity.class);
                startActivity(intent);
            }
        });

    }
}