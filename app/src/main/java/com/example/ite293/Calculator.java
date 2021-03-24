package com.example.ite293;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    TextView tv_2,result, tv_header;
    EditText et_kg, et_2;
    double num1, num2,num3;
    Button calculate;
    String textval;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        result = findViewById(R.id.result);
        calculate = findViewById(R.id.calculate);
        tv_2 = findViewById(R.id.tv_two);
        et_kg = findViewById(R.id.edit_kg);
        et_2 = findViewById(R.id.edit_two);
        et_2.setKeyListener(null);
        tv_header = findViewById(R.id.tv_header);

        Intent intent = getIntent();
        String choice = intent.getStringExtra("num");
        Log.d("Choiceddd",choice);

        

        if (choice.equalsIgnoreCase("1")){
            tv_2.setText("Gram value:");
            et_2.setText("1000");
            textval = "Grams: ";
            num2 = 1000;
            tv_header.setText("KILOGRAM-GRAM");
            }
        if (choice.equalsIgnoreCase("2")){
            tv_2.setText("Pound value:");
            et_2.setText("0.45359237");
            textval = "Pounds: ";
            num2 = 0.45359237;
            tv_header.setText("KILOGRAM-POUND");
        }
        if (choice.equalsIgnoreCase("3")){
            tv_2.setText("Ounce value:");
            et_2.setText("0.02834952");
            textval = "Ounce: ";
            num2 = 0.02834952;
            tv_header.setText("KILOGRAM-OUNCE");
        }
        if (choice.equalsIgnoreCase("4")){
            tv_2.setText("Miligram value:");
            et_2.setText("1000000");
            textval = "Milligram: ";
            num2 = 1000000;
            tv_header.setText("KILOGRAM-MILIGRAM");
        }
        if (choice.equalsIgnoreCase("5")){
            tv_2.setText("Tonne value:");
            et_2.setText("0.001");
            textval = "Tonne: ";
            num2 = 1000;
            tv_header.setText("KILOGRAM-TONNE");
        }

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (TextUtils.isEmpty(et_kg.getText().toString())){
                    et_kg.setError("Enter Value");
                }
                else{
                    num1 = Integer.parseInt(et_kg.getText().toString());
                    if (choice.equalsIgnoreCase("1")){
                        num3 = num1 * num2;
                        gram();
                    }
                    else if (choice.equalsIgnoreCase("2")){
                        num3 = num1 / num2;
                        gram();
                    }
                    else if (choice.equalsIgnoreCase("3")){
                        num3 = num1 / num2;
                        gram();
                    }
                    else if (choice.equalsIgnoreCase("4")){
                        num3 = num1 * num2;
                        gram();
                    }
                    else{
                        num3 = num1 / num2;
                        gram();
                    }
                }


            }
        });


    }

    public void gram(){

        result.setText(textval + num3);
    }
}