package com.example.ecoappresponsive;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Formulario extends AppCompatActivity {
    private Button btnEnviar;
    private EditText txtRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_formulario);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnEnviar = findViewById(R.id.btnenviar);
        ImageButton btnAtras = findViewById(R.id.btnatras);
        EditText txtRegistro = findViewById(R.id.editRegistro);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String registro = txtRegistro.getText().toString();
                if (registro.isEmpty()){

                    Toast.makeText(Formulario.this, "Llene el campo Registro consumo de agua", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Formulario.this, "Respuestas enviadas", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnAtras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent regresar = new Intent(com.example.ecoappresponsive.Formulario.this,vista2.class);
                startActivity(regresar);
            }
        });

    }
}