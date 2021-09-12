package com.example.app_calculadora_simples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText primeironumero;
    private EditText segundonumero;
    private EditText resultado;
    private Button btsoma, btsubtracao, btdivisao, btmultiplicacao, btlimpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        primeironumero = (EditText)
                findViewById(R.id.editText_prinum);
        segundonumero = (EditText) findViewById(R.id.editText_segnum);
        resultado = (EditText) findViewById(R.id.editText_res);

        btsoma = findViewById(R.id.button_soma);
        btsoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1;
                Double num2;
                Double res;
                num1 =
                        Double.parseDouble(primeironumero.getText().toString());
                num2 =
                        Double.parseDouble(segundonumero.getText().toString());
                res = num1+num2;
                resultado.setText(res.toString());
            }
        });

        btsubtracao = findViewById(R.id.button_subtracao);
        btsubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1;
                Double num2;
                Double res;
                num1 =
                        Double.parseDouble(primeironumero.getText().toString());
                num2 =
                        Double.parseDouble(segundonumero.getText().toString());
                res = num1-num2;
                resultado.setText(res.toString());
            }
        });

        btdivisao = findViewById(R.id.button_divisao);
        btdivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1;
                Double num2;
                Double res;
                num1 =
                        Double.parseDouble(primeironumero.getText().toString());
                num2 =
                        Double.parseDouble(segundonumero.getText().toString());
                res = num1/num2;
                resultado.setText(res.toString());
            }
        });

        btmultiplicacao = findViewById(R.id.button_multiplicacao);
        btmultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1;
                Double num2;
                Double res;
                num1 =
                        Double.parseDouble(primeironumero.getText().toString());
                num2 =
                        Double.parseDouble(segundonumero.getText().toString());
                res = num1*num2;
                resultado.setText(res.toString());
            }
        });

        btlimpa = findViewById(R.id.button_limpar);
        btlimpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primeironumero.setText("");
                segundonumero.setText("");
                resultado.setText("");
            }
        });
    }
}