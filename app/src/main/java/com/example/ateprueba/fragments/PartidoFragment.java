package com.example.ateprueba.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ateprueba.Models.PartidoModelo;
import com.example.ateprueba.R;
import com.example.ateprueba.Adapters.RecyclerViewAdaptadorPartido;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class PartidoFragment extends Fragment {
    RecyclerView recyclerViewPartido;
    RecyclerViewAdaptadorPartido adaptadorPartido;
    private FloatingActionButton fab;
    Button postularse;
    List<PartidoModelo> lista;
    String nombre, cancha, fecha, hora;
    TextView nohaypartidos;
    int visible;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_partido, container, false);
        nohaypartidos = (TextView)view.findViewById(R.id.tvNoHayPartidos);
        recyclerViewPartido = (RecyclerView)view.findViewById(R.id.recyclerPartido);
        recyclerViewPartido.setLayoutManager(new LinearLayoutManager(getContext()));
        cargarPref();



        lista = obtenerPartidos(nombre, cancha, hora);
        if(visible == 0)
        {
            nohaypartidos.setVisibility(View.VISIBLE);
        }
        else{
            nohaypartidos.setVisibility(View.INVISIBLE);
            recyclerViewPartido.setVisibility(View.VISIBLE);
        }

        adaptadorPartido = new RecyclerViewAdaptadorPartido(lista);
        recyclerViewPartido.setAdapter(adaptadorPartido);

        return view;
    }

    public List<PartidoModelo> obtenerPartidos(String nombre, String cancha, String hora){
        List<PartidoModelo> partido = new ArrayList<>();
        //Partido(String titulo, String nombrePerfil, String tipoPartido, int imgPerfil, int imgCalendario, int imgUbicacion,
        // int imgHora, int imgDisciplina, int imgFaltan, String ubicacion, String hora, String disciplina)
        partido.add(new PartidoModelo(nombre, "Damian Villarreal", "Partido Mixto", R.drawable.pelado1,
                R.drawable.ventiocho, R.drawable.ic_location, R.drawable.hour, R.drawable.futbol2, R.drawable.number5, cancha, hora, "Futbol"));
        /*partido.add(new PartidoModelo("Partido importante", "Mauricio Nuñez", "Futbol Masculino", R.drawable.maury1,
                R.drawable.veintinueve, R.drawable.ic_location, R.drawable.hour, R.drawable.futbol2, R.drawable.number5,  "Futbol City 2", "21:00 hs", "Futbol"));
        partido.add(new PartidoModelo("Partido tranqui", "Matias colorado", "Futbol Masculino", R.drawable.mati1,
                R.drawable.veintinueve, R.drawable.ic_location, R.drawable.hour, R.drawable.futbol2, R.drawable.number5,  "Los Olivos", "23:00 hs", "Futbol"));*/


        return partido;
    }

    public void cargarPref(){
        SharedPreferences preferences = this.getActivity().getSharedPreferences
                ("partidos", Context.MODE_PRIVATE);
        nombre = preferences.getString("nombre", "No hay nombre");
        cancha = preferences.getString("cancha", "No hay cancha");
        fecha = preferences.getString("fecha", "No hay fecha");
        hora = preferences.getString("hora", "no hay hora");
        visible = preferences.getInt("visible",0);

    }



}
