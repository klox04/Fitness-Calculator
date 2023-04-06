package com.hcdc.caralos.fitnesscalculators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.view.View.*;

public class MainActivity4 extends AppCompatActivity {
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
        setContentView(R.layout.activity_main4);
        male = findViewById(R.id.ac_radiobutton1);
        female = findViewById(R.id.ac_radiobutton2);
        age = findViewById(R.id.ac_age);
        weight = findViewById(R.id.ac_weight);
        height = findViewById(R.id.ac_height);
        calculate = findViewById(R.id.ac_button);
        result = findViewById(R.id.ac_result);

        calculate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(male.isChecked()) {
                    String s1 = weight.getText().toString();
                    String s2 = height.getText().toString();
                    String s3 = age.getText().toString();


                    double weightValue = Double.parseDouble(s1) *13.397;
                    double heightValue = Double.parseDouble(s2)*4.799;
                    double ageValue = Double.parseDouble(s3)*5.677;
                    double c = 88.362 + weightValue + heightValue - ageValue;
                    result.setText("Your BMR IS" +" "+ Double.toString(c));
                }

                if(female.isChecked()) {
                    String s1 = weight.getText().toString();
                    String s2 = height.getText().toString();
                    String s3 = age.getText().toString();


                    double weightValue = Double.parseDouble(s1) *9.247;
                    double heightValue = Double.parseDouble(s2)*3.098;
                    double ageValue = Double.parseDouble(s3)*4.330;
                    double c = 447.593 + weightValue + heightValue - ageValue;
                    result.setText("Your BMR IS" +" "+ Double.toString(c));
                }
            }
        });
    }
}