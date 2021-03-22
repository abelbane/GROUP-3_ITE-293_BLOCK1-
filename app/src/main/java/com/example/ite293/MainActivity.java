package com.example.ite293;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt_ounce, bt_pound, bt_gram, bt_tonne, bt_milligram;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt_ounce = findViewById(R.id.bt_ounce);
        bt_gram = findViewById(R.id.bt_gram);
        bt_pound = findViewById(R.id.bt_pounds);
        bt_tonne = findViewById(R.id.bt_tonne);
        bt_milligram = findViewById(R.id.bt_milligram);


        bt_gram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Calculator.class);
                intent.putExtra("num","1");
                startActivity(intent);

            }
        });
        bt_pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Calculator.class);
                intent.putExtra("num","2");
                startActivity(intent);
            }
        });
        bt_ounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Calculator.class);
                intent.putExtra("num","3");
                startActivity(intent);

            }
        });
        bt_milligram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Calculator.class);
                intent.putExtra("num","4");
                startActivity(intent);
            }
        });
        bt_tonne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Calculator.class);
                intent.putExtra("num","5");
                startActivity(intent);
            }
        });



    }
}