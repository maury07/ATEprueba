package com.example.ateprueba.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.ateprueba.Adapters.RecyclerViewAdapterNoticias;
import com.example.ateprueba.Models.EstadoModelo;
import com.example.ateprueba.R;

import java.util.ArrayList;
import java.util.List;

public class NoticiasFragment extends Fragment {
    EditText estado;
    ImageButton enviar;
    ImageButton fotoEstado;
    EstadoModelo claseEstado;
    RecyclerView recyclerEstados;
    RecyclerViewAdapterNoticias adapterNoticias;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_noticias, container, false);
        recyclerEstados = (RecyclerView)view.findViewById(R.id.recyclerEstados);
        recyclerEstados.setLayoutManager(new LinearLayoutManager(getContext()));

        estado = (EditText)view.findViewById(R.id.etEstado);
        fotoEstado = (ImageButton)view.findViewById(R.id.btnEnviarFotoEstado);
        enviar = (ImageButton)view.findViewById(R.id.btnEnviarEstado);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapterNoticias= new RecyclerViewAdapterNoticias(actualizarEstados(estado.getText().toString()));
                recyclerEstados.setAdapter(adapterNoticias);
            }
        });
        //adapterNoticias = new RecyclerViewAdapterNoticias(actualizarEstados());
        //recyclerEstados.setAdapter(adapterNoticias);

        return view;
    }

    public List<EstadoModelo> actualizarEstados(String texto){
        List<EstadoModelo> lista = new ArrayList<>();
        lista.add(new EstadoModelo("Damian Villarreal", "7:17 PM", texto, R.drawable.user1));
        //lista.add(new EstadoModelo("Mauri nuñez", "7:56 PM", "otro estado de prueba", R.drawable.user1));
        return lista;
    }

}
