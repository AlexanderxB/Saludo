package com.example.taller2saludo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button imprimir;
    TextView resultado;
    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imprimir = findViewById(R.id.imprimir);
        resultado = findViewById(R.id.tvResultado);
        nombre = findViewById(R.id.etName);

        imprimir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = nombre.getText().toString() + " Hola Mundo!!!!! " ;
                resultado.setText(mensaje);
            }
        });
    }
}