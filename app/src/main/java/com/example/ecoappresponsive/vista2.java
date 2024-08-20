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

public class vista2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_vista2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton btnEnergia = findViewById(R.id.btnenergia);
        btnEnergia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent vistaenergia = new Intent(com.example.ecoappresponsive.vista2.this,Energia_colombia.class);
                startActivity(vistaenergia);
            }
        });

        ImageButton btnAgua = findViewById(R.id.btnagua);
        btnAgua.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent vistaagua = new Intent(com.example.ecoappresponsive.vista2.this,Conservacion_agua.class);
                startActivity(vistaagua);
            }
        });

        ImageButton btnReciclaje = findViewById(R.id.btnreciclaje);
        btnReciclaje.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent vistareciclaje = new Intent(com.example.ecoappresponsive.vista2.this,Reciclaje.class);
                startActivity(vistareciclaje);
            }
        });

        ImageButton btnForms = findViewById(R.id.btnforms);
        btnForms.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent vistaforms = new Intent(com.example.ecoappresponsive.vista2.this,Formulario.class);
                startActivity(vistaforms);
            }
        });
    }
}