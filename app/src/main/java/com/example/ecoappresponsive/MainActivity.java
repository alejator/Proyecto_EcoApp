package com.example.ecoappresponsive;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editContrasena,editUsuario;
    private Button btnIngresar;

    private TextView txtcrearcuenta;

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
        editUsuario = findViewById(R.id.editUsuario);
        editContrasena = findViewById(R.id.editContrasena);
        btnIngresar = findViewById(R.id.ingresar);

        btnIngresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                String usuario = editUsuario.getText().toString();
                String contrasena = editContrasena.getText().toString();


                Intent ingresar = new Intent(MainActivity.this, vista2.class);

                if (usuario.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor ingresa tu usuario", Toast.LENGTH_SHORT).show();
                } else if (contrasena.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor ingresa tu contraseña", Toast.LENGTH_SHORT).show();
                } else {
                    startActivity(ingresar);}
            }
        });

        txtcrearcuenta = findViewById(R.id.crearcuenta);

        txtcrearcuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crearcuenta = new Intent(MainActivity.this, Registro_usuario.class);
                startActivity(crearcuenta);
            }
        });


    }
}