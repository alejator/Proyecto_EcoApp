package com.example.ecoappresponsive;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editContrasena,editUsuario;
    private Button btnIngresar;

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

                if (usuario.equals("PT333") && contrasena.equals("123456")){
                Intent vistaprincipal = new Intent(com.example.ecoappresponsive.MainActivity.this,vista2.class);
                startActivity(vistaprincipal);
            }
            else {
                    Toast.makeText(MainActivity.this, "Acceso denegado", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}