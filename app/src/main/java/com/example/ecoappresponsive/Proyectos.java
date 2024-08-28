package com.example.ecoappresponsive;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Proyectos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_proyectos);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton btnAtras = findViewById(R.id.btnatras);
        btnAtras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent regresar = new Intent(com.example.ecoappresponsive.Proyectos.this, MenuEnergia.class);
                startActivity(regresar);
            }
        });

        Button btnSiguiente = findViewById(R.id.btnsiguiente);
        btnSiguiente.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(Proyectos.this, "Buscando Proyectos", Toast.LENGTH_SHORT).show();
            }
        });
    }
}