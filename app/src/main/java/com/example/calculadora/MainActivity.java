package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //PANTALLA PARA EL RESULTADO
    private TextView textResult;

    //BOTONES DE LOS NUMEROS
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

    //BOTONES QUE GENERAN EVENTOS
    private Button buttonClear;
    private Button buttonResult;
    private Button buttonMas;
    private Button buttonMenos;
    private Button buttonPor;
    private Button buttonEntre;
    private Button buttonBorrar;

    //BOOLEANOS
    private boolean clickSignoMas;
    private boolean clickSignoMenos;
    private boolean clickSignoPor;
    private boolean clickSignoEntre;

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
                clickSignoMas = false;
                clickSignoMenos = false;
                clickSignoPor = false;
                clickSignoEntre = false;
            }
        });

        buttonTwo = findViewById(R.id.btnNum2);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                textResult.setText(textAnterior + "2");
                clickSignoMas = false;
                clickSignoMenos = false;
                clickSignoPor = false;
                clickSignoEntre = false;
            }
        });

        buttonThree = findViewById(R.id.btnNum3);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                textResult.setText(textAnterior + "3");
                clickSignoMas = false;
                clickSignoMenos = false;
                clickSignoPor = false;
                clickSignoEntre = false;
            }
        });

        buttonFour = findViewById(R.id.btnNum4);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                textResult.setText(textAnterior + "4");
                clickSignoMas = false;
                clickSignoMenos = false;
                clickSignoPor = false;
                clickSignoEntre = false;
            }
        });

        buttonFive = findViewById(R.id.btnNum5);
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                textResult.setText(textAnterior + "5");
                clickSignoMas = false;
                clickSignoMenos = false;
                clickSignoPor = false;
                clickSignoEntre = false;
            }
        });

        buttonSix = findViewById(R.id.btnNum6);
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                textResult.setText(textAnterior + "6");
                clickSignoMas = false;
                clickSignoMenos = false;
                clickSignoPor = false;
                clickSignoEntre = false;
            }
        });

        buttonSeven = findViewById(R.id.btnNum7);
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                textResult.setText(textAnterior + "7");
                clickSignoMas = false;
                clickSignoMenos = false;
                clickSignoPor = false;
                clickSignoEntre = false;
            }
        });

        buttonEight = findViewById(R.id.btnNum8);
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                textResult.setText(textAnterior + "8");
                clickSignoMas = false;
                clickSignoMenos = false;
                clickSignoPor = false;
                clickSignoEntre = false;
            }
        });

        buttonNine = findViewById(R.id.btnNum9);
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                textResult.setText(textAnterior + "9");
                clickSignoMas = false;
                clickSignoMenos = false;
                clickSignoPor = false;
                clickSignoEntre = false;
            }
        });

        buttonClear = findViewById(R.id.btnClear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText("");
                clickSignoMas = false;
                clickSignoMenos = false;
                clickSignoPor = false;
                clickSignoEntre = false;
            }
        });

        buttonMas = findViewById(R.id.btnSumar);
        buttonMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                if (textAnterior.trim().length() > 0 && clickSignoMas == false) {
                    textResult.setText(textAnterior + "+");
                    clickSignoMas = true;
                    clickSignoMenos = true;
                    clickSignoPor = true;
                    clickSignoEntre = true;
                }
            }
        });

        buttonMenos = findViewById(R.id.btnRestar);
        buttonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                if (textAnterior.trim().length() == 0 || clickSignoMenos == false) {
                    textResult.setText(textAnterior + "-");
                    clickSignoMas = true;
                    clickSignoMenos = true;
                    clickSignoPor = true;
                    clickSignoEntre = true;
                }
            }
        });

        buttonPor = findViewById(R.id.btnMultiplicar);
        buttonPor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                if (textAnterior.trim().length() > 0 && clickSignoPor == false) {
                    textResult.setText(textAnterior + "x");
                    clickSignoMas = true;
                    clickSignoMenos = true;
                    clickSignoPor = true;
                    clickSignoEntre = true;
                }
            }
        });

        buttonEntre = findViewById(R.id.btnDividir);
        buttonEntre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textResult.getText().toString();
                if (textAnterior.trim().length() > 0 && clickSignoEntre == false) {
                    textResult.setText(textAnterior + "÷");
                    clickSignoMas = true;
                    clickSignoMenos = true;
                    clickSignoPor = true;
                    clickSignoEntre = true;
                }
            }
        });
    }
}