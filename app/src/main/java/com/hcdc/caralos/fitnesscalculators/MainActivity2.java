package com.hcdc.caralos.fitnesscalculators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.view.View.*;

public class MainActivity2 extends AppCompatActivity {
     private EditText weight;
     private EditText height;
     private Button button;
     private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        weight = findViewById(R.id.dc_input1);
        height = findViewById(R.id.dc_input2);
        button = findViewById(R.id.dc_button);
        result = findViewById(R.id.dc_result);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = weight.getText().toString();
                String s2 = height.getText().toString();


                double weightValue = Double.parseDouble(s1);
                double heightValue = Double.parseDouble(s2)/100;

                double bmi = weightValue / (heightValue * heightValue);

                if (bmi <18.5){
                    result.setText("under weight:" +" "+ Double.toString(bmi));
                }
               else if (bmi >=18.5 && bmi <= 24.9) {
                    result.setText("Normal weight:" +" "+ Double.toString(bmi));
                }
                else if (bmi >=25 && bmi <= 29.9) {
                    result.setText("Under weight:" +" "+ Double.toString(bmi));
                }
                else if (bmi > 30){
                    result.setText("Obesity:" +" "+ Double.toString(bmi));
                }

            }
        });
    }
}