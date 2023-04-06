package com.hcdc.caralos.fitnesscalculators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.view.View.*;

public class MainActivity3 extends AppCompatActivity {
           private RadioButton male;
           private RadioButton female;
           private EditText age;
           private EditText weight;
           private EditText height;
           private Button calculate;
           private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        male = findViewById(R.id.tv_radiobutton1);
        female = findViewById(R.id.tv_radiobutton2);
        age = findViewById(R.id.tv_age);
        weight = findViewById(R.id.tv_weight);
        height = findViewById(R.id.tv_height);
        calculate = findViewById(R.id.tv_button);
        result = findViewById(R.id.tv_result);


        calculate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(male.isChecked()) {
                    String s1 = weight.getText().toString();
                    String s2 = height.getText().toString();
                    String s3 = age.getText().toString();


                    double weightValue = Double.parseDouble(s1) *6.23;
                    double heightValue = Double.parseDouble(s2)*12.7;
                    double ageValue = Double.parseDouble(s3)*6.8;
                   double c = weightValue + heightValue - ageValue + 66;
                    result.setText("YOUR CALORIES IS" +" "+ Double.toString(c));
                }

                if(female.isChecked()) {
                    String s1 = weight.getText().toString();
                    String s2 = height.getText().toString();
                    String s3 = age.getText().toString();


                    double weightValue = Double.parseDouble(s1) *4.35;
                    double heightValue = Double.parseDouble(s2)*4.7;
                    double ageValue = Double.parseDouble(s3)*4.7;
                    double c = weightValue + heightValue - ageValue + 655;
                    result.setText("YOUR CALORIES IS" +" "+ Double.toString(c));
                }
            }
        });
    }
}