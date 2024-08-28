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

public class MenuEnergia extends AppCompatActivity {

    private Button btnenergiasolar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu_energia);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton btnAtras = findViewById(R.id.btnatras);
        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresar = new Intent(MenuEnergia.this, vista2.class);
                startActivity(regresar);
            }
        });


        Button btnenergiasolar= findViewById(R.id.btnenergiasolar);
        btnenergiasolar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent siguiente = new Intent(MenuEnergia.this,Energia_solar.class);
                startActivity(siguiente);
            }
        });

        Button btnquizsolar= findViewById(R.id.btnquizsolar);
        btnquizsolar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent siguiente = new Intent(MenuEnergia.this,Solar2.class);
                startActivity(siguiente);
            }
        });

        Button btnenergiacolombia= findViewById(R.id.btnenergiacolombia);
        btnenergiacolombia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent siguiente = new Intent(MenuEnergia.this,Energia_colombia.class);
                startActivity(siguiente);
            }
        });

        Button btnproyectos= findViewById(R.id.btnproyectos);
        btnproyectos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent siguiente = new Intent(MenuEnergia.this,Proyectos.class);
                startActivity(siguiente);
            }
        });



    }

}