package com.example.ateprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
        titulo = (EditText)findViewById(R.id.etNombrePartido);
        cancha = (EditText)findViewById(R.id.etNombreCancha);
        fecha = (EditText)findViewById(R.id.etFechaPartido);
        hora = (EditText)findViewById(R.id.etHoraPartido);

        crearPartido = (Button)findViewById(R.id.btnCrearPartido);
        crearPartido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), titulo.getText().toString(), Toast.LENGTH_SHORT).show();
                SharedPreferences preferences = getSharedPreferences
                        ("partidos", Context.MODE_PRIVATE);

                String nombrePartido = titulo.getText().toString();
                String nombreCancha = cancha.getText().toString();
                String fechaPart = fecha.getText().toString();
                String horaPart = hora.getText().toString();
                SharedPreferences.Editor editor=preferences.edit();
                editor.putString("nombre",nombrePartido);
                editor.putString("cancha",nombreCancha);
                editor.putString("fecha", fechaPart);
                editor.putString("hora",horaPart);
                editor.putInt("visible",1);

                editor.commit();
                Intent i = new Intent(CrearPartidoActivity.this, TabbedActivity.class);
                //crearPartido();
                startActivity(i);
            }
        });
    }

    private void crearPartido() {

    }
}
