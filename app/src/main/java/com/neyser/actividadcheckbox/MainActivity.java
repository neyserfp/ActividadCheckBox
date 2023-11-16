package com.neyser.actividadcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText t1, t2;
    private CheckBox cb1, cb2, cb3, cb4;
    private Button b1;
    private TextView lResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view){
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        b1 = findViewById(R.id.b1);
        lResultado = findViewById(R.id.lResultado);

        int valor1 = Integer.valueOf(t1.getText().toString());
        int valor2 = Integer.valueOf(t2.getText().toString());
        int operacion = 0;
        String resultado = "";

        if (cb1.isChecked()){
            operacion = valor1+valor2;
            resultado+="Suma: "+operacion+"\n";
        }
        if (cb2.isChecked()){
            operacion = valor1*valor2;
            resultado+="Multiplicación: "+operacion+"\n";
        }
        if (cb3.isChecked()){
            try {
                operacion = valor1/valor2;
                resultado+="División: "+operacion+"\n";
            } catch (Exception e){
                resultado = "El valor: " + valor2 + " no es válido";
                t2.setText("");
            }

        }
        if (cb4.isChecked()){
            operacion = valor1-valor2;
            resultado+="Resta: "+operacion+"\n";
        }

        lResultado.setText(resultado);


    }
}