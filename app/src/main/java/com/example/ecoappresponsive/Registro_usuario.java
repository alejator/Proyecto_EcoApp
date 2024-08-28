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

public class Registro_usuario extends AppCompatActivity {

    private EditText editNombre, editTelefono, editCorreo, editContrasena;

    private Button btn_registrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro_usuario);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton btnAtras = findViewById(R.id.btnatras);
        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresar = new Intent(Registro_usuario.this, MainActivity.class);
                startActivity(regresar);
            }
        });

        editNombre = findViewById(R.id.editNombre);
        editTelefono = findViewById(R.id.editTelefono);
        editCorreo = findViewById(R.id.editCorreo);
        editContrasena = findViewById(R.id.editContrasena);

        btn_registrarse = findViewById(R.id.btn_registrarse);

        btn_registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nombre = editNombre.getText().toString();
                String telefono = editTelefono.getText().toString();
                String correo = editCorreo.getText().toString();
                String contrasena = editContrasena.getText().toString();

                Intent registrarse = new Intent(Registro_usuario.this, vista2.class);

                if (nombre.isEmpty()){
                    Toast.makeText(Registro_usuario.this, "Por favor ingrese su nombre", Toast.LENGTH_SHORT).show();
                } else if (telefono.isEmpty()) {
                    Toast.makeText(Registro_usuario.this, "Por favor ingrese su telefono", Toast.LENGTH_SHORT).show();
                } else if (correo.isEmpty()) {
                    Toast.makeText(Registro_usuario.this, "Por favor ingrese su correo", Toast.LENGTH_SHORT).show();
                } else if (contrasena.isEmpty()) {
                    Toast.makeText(Registro_usuario.this, "Por favor ingrese su contraseña", Toast.LENGTH_SHORT).show();
                } else {
                    startActivity(registrarse);
                }
            }
        });

    }
}