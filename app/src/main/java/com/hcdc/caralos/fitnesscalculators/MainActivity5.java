package com.hcdc.caralos.fitnesscalculators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.view.View.*;

public class MainActivity5 extends AppCompatActivity {
    private EditText weight;
    private EditText height;
    private Button button;
    private TextView result;
    private RadioButton male;
    private RadioButton female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        male = findViewById(R.id.rd_radiobutton1);
        female = findViewById(R.id.rd_radiobutton2);
        weight = findViewById(R.id.rd_weight);
        height = findViewById(R.id.rd_height);
        button = findViewById(R.id.rd_button);
        result = findViewById(R.id.rd_result);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(male.isChecked()) {
                    String s1 = weight.getText().toString();
                    String s2 = height.getText().toString();

                    double weightValue = Double.parseDouble(s1) *0.32810;
                    double heightValue = Double.parseDouble(s2)*0.33929;
                    double c = weightValue + heightValue - 29.5336 ;
                    result.setText("Your lBM IS" +" "+ Double.toString(c));
                }

                if(female.isChecked()) {
                    String s1 = weight.getText().toString();
                    String s2 = height.getText().toString();

                    double weightValue = Double.parseDouble(s1) *0.29569;
                    double heightValue = Double.parseDouble(s2)*0.41813;
                    double c = weightValue + heightValue - 43.2933 ;
                    result.setText("Your LBM IS" +" "+ Double.toString(c));
                }

            }
        });
    }
}