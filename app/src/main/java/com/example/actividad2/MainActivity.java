package com.example.actividad2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextView solucionfac,solucionfib;
    private EditText ingreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        solucionfac = findViewById(R.id.solucionfac);
        solucionfib = findViewById(R.id.solucionfib);
        ingreso = findViewById(R.id.ingreso);
    }

    public void factorial (View view)
    {
        int valor = Integer.parseInt(ingreso.getText().toString());
        int factorial = 1;

        for (int i = 1; i <= valor; i++)
        {
            factorial= factorial * i;
        }
        solucionfac.setText(factorial+ " ");
    }

    public void fibonacci (View view)
    {
        int valor = Integer.parseInt(ingreso.getText().toString());
        int fibonacci = 1;
        int num1=0;
        int num2=1;

        for (int i = 0; i < valor; i++)
        {
            fibonacci= num1 + num2;
            num1 = num2;
            num2= fibonacci;
        }
        solucionfib.setText(fibonacci+ " ");
    }
}