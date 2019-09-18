package com.example.ateprueba.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ateprueba.Models.ComunidadModelo;
import com.example.ateprueba.R;

import java.util.List;

public class RecyclerViewAdaptadorComunidad extends RecyclerView.Adapter<RecyclerViewAdaptadorComunidad.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView titulo, ultimoMje;
        ImageView imgChat;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = (TextView)itemView.findViewById(R.id.txt_tituloChat);
            ultimoMje = (TextView)itemView.findViewById(R.id.txt_ultimoMje);
            imgChat = (ImageView) itemView.findViewById(R.id.img_chat);
        }
    }

    public List<ComunidadModelo> listaComuni;

    public RecyclerViewAdaptadorComunidad(List<ComunidadModelo> listaComuni) {
        this.listaComuni = listaComuni;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comunidad,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.titulo.setText(listaComuni.get(position).getTitulo());
        holder.ultimoMje.setText(listaComuni.get(position).getUltimoMje());
        holder.imgChat.setImageResource(listaComuni.get(position).getImgGrupo());
    }


    @Override
    public int getItemCount() {
        return listaComuni.size();
    }
}
