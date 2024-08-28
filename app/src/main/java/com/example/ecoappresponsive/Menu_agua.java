package com.example.ecoappresponsive;

import android.annotation.SuppressLint;
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

public class Menu_agua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu_agua);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton btnAtras = findViewById(R.id.btnatras);
        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresar = new Intent(Menu_agua.this, vista2.class);
                startActivity(regresar);
            }
        });


        Button btnimportanciagua= findViewById(R.id.btnimportanciaagua);
        btnimportanciagua.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent siguiente = new Intent(Menu_agua.this,Conservacion_agua.class);
                startActivity(siguiente);
            }
        });

        Button btnconservaragua= findViewById(R.id.btnconservaragua);
        btnconservaragua.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent siguiente = new Intent(Menu_agua.this, Agua2.class);
                startActivity(siguiente);
            }
        });
    }
}