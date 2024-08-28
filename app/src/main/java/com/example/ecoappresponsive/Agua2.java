package com.example.ecoappresponsive;

import android.annotation.SuppressLint;
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

public class Agua2 extends AppCompatActivity {

    private EditText editCuidaragua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_agua2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton btnAtras = findViewById(R.id.btnatras);
        btnAtras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent regresar = new Intent(Agua2.this,Menu_agua.class);
                startActivity(regresar);
            }
        });

        editCuidaragua = findViewById(R.id.editCuidaragua);

        Button btnSiguiente = findViewById(R.id.btnsiguiente);
        btnSiguiente.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                String respuesta = editCuidaragua.getText().toString();

                if (respuesta.isEmpty()) {
                    Toast.makeText(Agua2.this, "Por favor ingrese una respuesta", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Agua2.this, "Respuesta enviada", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}