package com.example.ecoappresponsive;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Conservacion_agua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_conservacion_agua);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton btnAtras = findViewById(R.id.btnatras);
        btnAtras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent regresar = new Intent(com.example.ecoappresponsive.Conservacion_agua.this,vista2.class);
                startActivity(regresar);
            }
        });

        Button btnSiguiente = findViewById(R.id.btnsiguiente);
        btnSiguiente.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent siguiente = new Intent(com.example.ecoappresponsive.Conservacion_agua.this,Agua2.class);
                startActivity(siguiente);
            }
        });
    }
}