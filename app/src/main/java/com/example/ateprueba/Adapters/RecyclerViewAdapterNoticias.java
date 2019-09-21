package com.example.ateprueba.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ateprueba.Models.EstadoModelo;
import com.example.ateprueba.R;
import com.example.ateprueba.fragments.NoticiasFragment;

import java.util.List;

public class RecyclerViewAdapterNoticias extends RecyclerView.Adapter<RecyclerViewAdapterNoticias.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView perfilEstado, horaEstado, textoEstado;
        ImageView imgPerfilEstado;
        ImageButton menuEstado;
        Button btnComentar;
        Context context;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            perfilEstado = (TextView)itemView.findViewById(R.id.txtNombreEstado);
            horaEstado = (TextView)itemView.findViewById(R.id.txtHoraEstado);
            textoEstado = (TextView)itemView.findViewById(R.id.txtTextoEstado);
            imgPerfilEstado = (ImageView)itemView.findViewById(R.id.imgPerfilEstado);
            menuEstado = (ImageButton) itemView.findViewById(R.id.imgBotonMas);
            btnComentar = (Button)itemView.findViewById(R.id.btnComentar);
        }
    }

    public RecyclerViewAdapterNoticias(List<EstadoModelo> listaEstados) {
        this.listaEstados = listaEstados;
    }

    public List<EstadoModelo> listaEstados;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_estado,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.perfilEstado.setText(listaEstados.get(position).getPerfilEstado());
        holder.horaEstado.setText(listaEstados.get(position).getHoraEstado());
        holder.textoEstado.setText(listaEstados.get(position).getTextoEstado());
        holder.imgPerfilEstado.setImageResource(listaEstados.get(position).getImgPerfilEstado());
    }

    @Override
    public int getItemCount() {
        return listaEstados.size();
    }
}
