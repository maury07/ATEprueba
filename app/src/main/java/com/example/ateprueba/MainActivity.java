package com.example.ateprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnFace, btnGoogle, btnInvitado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFace = (Button)findViewById(R.id.btnFace_sing_in);
        btnGoogle = (Button)findViewById(R.id.btnGoogle_sign_in);
        btnInvitado = (Button)findViewById(R.id.btnInvitado_sign_in);

        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Inicio sesion por Face", Toast.LENGTH_SHORT).show();
            }
        });

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Inicio sesion por Google", Toast.LENGTH_SHORT).show();
            }
        });

        btnInvitado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PerfilActivity.class);
                startActivity(i);
            }
        });
    }
}
