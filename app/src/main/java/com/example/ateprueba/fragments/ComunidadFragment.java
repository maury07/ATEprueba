package com.example.ateprueba.fragments;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.ateprueba.Adapters.RecyclerViewAdaptadorComunidad;
import com.example.ateprueba.Models.ComunidadModelo;
import com.example.ateprueba.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class ComunidadFragment extends Fragment {
    RecyclerView recyclerComunidad;
    RecyclerViewAdaptadorComunidad adaptadorComunidad;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_comunidad, container, false);

        recyclerComunidad = (RecyclerView)view.findViewById(R.id.recyclerComunidad);
        recyclerComunidad.setLayoutManager(new LinearLayoutManager(getContext()));


        adaptadorComunidad = new RecyclerViewAdaptadorComunidad(obtenerChats());
        recyclerComunidad.setAdapter(adaptadorComunidad);

        return view;
    }

    public List<ComunidadModelo> obtenerChats(){
        List<ComunidadModelo> chats = new ArrayList<>();
        chats.add(new ComunidadModelo("Equipo de la Universidad", "Jugamos este martes, a las 20hs", R.drawable.users));
        //chats.add(new ComunidadModelo("Damian Villarreal", "Queres jugar un partido hoy?",R.drawable.pelado1));

        return chats;
    }

}
