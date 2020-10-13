package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textResult;
    private Button buttonZero;
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonFour;
    private Button buttonFive;
    private Button buttonSix;
    private Button buttonSeven;
    private Button buttonEight;
    private Button buttonNine;
    private Button buttonClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResult = findViewById(R.id.txtPantalla);

        buttonZero = findViewById(R.id.btnNum0);
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                textResult.setText(textAnterior + "0");
            }
        });

        buttonOne = findViewById(R.id.btnNum1);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                textResult.setText(textAnterior + "1");
            }
        });

        buttonTwo = findViewById(R.id.btnNum2);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                textResult.setText(textAnterior + "2");
            }
        });

        buttonThree = findViewById(R.id.btnNum3);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                textResult.setText(textAnterior + "3");
            }
        });

        buttonFour = findViewById(R.id.btnNum4);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                textResult.setText(textAnterior + "4");
            }
        });

        buttonFive = findViewById(R.id.btnNum5);
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                textResult.setText(textAnterior + "5");            }
        });

        buttonSix = findViewById(R.id.btnNum6);
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                textResult.setText(textAnterior + "6");
            }
        });

        buttonSeven = findViewById(R.id.btnNum7);
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                textResult.setText(textAnterior + "7");
            }
        });

        buttonEight = findViewById(R.id.btnNum8);
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                textResult.setText(textAnterior + "8");
            }
        });

        buttonNine = findViewById(R.id.btnNum9);
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                textResult.setText(textAnterior + "9");
            }
        });

        buttonClear = findViewById(R.id.btnClear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText("");
            }
        });
    }
}