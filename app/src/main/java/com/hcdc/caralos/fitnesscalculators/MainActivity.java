package com.hcdc.caralos.fitnesscalculators;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.view.View.*;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      button1 = findViewById(R.id.dc_button1);
      button2 = findViewById(R.id.dc_button2);
      button3 = findViewById(R.id.dc_button3);
      button4 = findViewById(R.id.dc_button4);

      button1.setOnClickListener(new OnClickListener() {
          @Override
          public void onClick(View view) {
             Intent a = new Intent(MainActivity.this, MainActivity2.class);
             startActivity(a);
          }
      });

        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(b);
            }
        });
        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(c);
            }
        });
        button4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(MainActivity.this, MainActivity5.class);
                startActivity(d);
            }
        });

    }
}