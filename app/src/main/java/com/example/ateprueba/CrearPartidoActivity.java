package com.example.ateprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CrearPartidoActivity extends AppCompatActivity {
    TextView tituloPartido_txt, cancha_txt, fecha_txt, hora_txt, nroJug_txt, vacantes_txt, tipoCancha_txt, cambios_txt, genero_txt, disciplina_txt, rangoEdad_txt, dificultad_txt;
    EditText titulo, cancha, fecha, hora, nroJug, vacantes, tipoCancha, cambios, genero, disciplina, rangoEdad, dificultad;
    Button crearPartido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_partido);

        crearPartido = (Button)findViewById(R.id.btnCrearPartido);
        crearPartido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Se ha creado un nuevo partido", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(CrearPartidoActivity.this, TabbedActivity.class);
                startActivity(i);
            }
        });
    }
}
