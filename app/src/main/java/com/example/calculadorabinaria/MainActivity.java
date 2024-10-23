package com.example.calculadorabinaria;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText txtNumber1, txtNumber2;
    Button btnMas, btnMultiplicacion, btndivision, btnResta;
    TextView txtResultado;
    int number1,number2,Respuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        txtNumber1= findViewById(R.id.txtNumber1);
        txtNumber2 = findViewById(R.id.txtNumber2);
        btnMas = findViewById(R.id.btnMas);
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnResta = findViewById(R.id.btnMenos);
        btndivision = findViewById(R.id.btnDivision);

        txtResultado = findViewById(R.id.txtResultado);




    }
    public void ReferenciarNumeros() {
        try {
            number1 = Integer.parseInt(txtNumber1.getText().toString(), 2);
            number2 = Integer.parseInt(txtNumber2.getText().toString(), 2);
        } catch (NumberFormatException e) {
            txtResultado.setText("Por favor ingresa solo números binarios (0 y 1).");

        }
    }

    public void btnMas_onclick(View v){
        ReferenciarNumeros();
        Respuesta = number1+number2;
        String resultadoBinario = Integer.toBinaryString(Respuesta);
        txtResultado.setText("Resultado: " + resultadoBinario);


    }
    public void btnResta_onclick(View v){
        ReferenciarNumeros();
        Respuesta = number1-number2;
        String resultadoBinario = Integer.toBinaryString(Respuesta);
        txtResultado.setText("Resultado: " + resultadoBinario);


    }
    public void btnMultiplicacion_onclick(View v){
        ReferenciarNumeros();
        Respuesta = number1*number2;
        String resultadoBinario = Integer.toBinaryString(Respuesta);
        txtResultado.setText("Resultado: " + resultadoBinario);


    }
    public void btnDivision_onclick(View v){
        ReferenciarNumeros();
        Respuesta = number1/number2;
        String resultadoBinario = Integer.toBinaryString(Respuesta);
        txtResultado.setText("Resultado: " + resultadoBinario);


    }
}