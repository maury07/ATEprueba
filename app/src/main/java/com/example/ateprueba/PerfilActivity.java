package com.example.ateprueba;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PerfilActivity extends AppCompatActivity {
    Button btnGuardar, btnUbicacion;
    EditText etNombre, etApellido, etEdad, etUbicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        btnGuardar = (Button)findViewById(R.id.btnGuardarDatos);
        btnUbicacion = (Button) findViewById(R.id.btnUbicacion);
        etNombre = (EditText)findViewById(R.id.etNombre);
        etApellido = (EditText)findViewById(R.id.etApellido);
        etEdad = (EditText)findViewById(R.id.etEdad);
        etUbicacion = (EditText)findViewById(R.id.etUbicacion);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PerfilActivity.this, "Tus datos han sido guardados correctamente", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), TabbedActivity.class);
                startActivity(i);
            }
        });
    }

}
