package com.example.ateprueba.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ateprueba.Models.PartidoModelo;
import com.example.ateprueba.R;

import java.util.List;

public class RecyclerViewAdaptadorPartido extends RecyclerView.Adapter<RecyclerViewAdaptadorPartido.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tituloPartido, nombrePerfil, tipoPartido, ubicacion, hora, disciplina;
        ImageView imgPerfilPartido, imgDiaCalendario, imgUbicacion, imgHora, imgDisciplina, imgFaltan;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tituloPartido = (TextView)itemView.findViewById(R.id.tvTituloPartido);
            nombrePerfil = (TextView)itemView.findViewById(R.id.tvPerfil);
            tipoPartido = (TextView)itemView.findViewById(R.id.tvTipoPartido);
            imgPerfilPartido = (ImageView)itemView.findViewById(R.id.ivPerfilPartido);
            imgDiaCalendario = (ImageView)itemView.findViewById(R.id.ivCalendario);
            imgUbicacion = (ImageView)itemView.findViewById(R.id.iv_ubicacion);
            imgHora = (ImageView)itemView.findViewById(R.id.iv_hora);
            imgDisciplina = (ImageView)itemView.findViewById(R.id.iv_disciplina);
            imgFaltan = (ImageView)itemView.findViewById(R.id.iv_faltan);
            ubicacion = (TextView)itemView.findViewById(R.id.tv_ubicacion);
            hora = (TextView)itemView.findViewById(R.id.tv_hora);
            disciplina = (TextView)itemView.findViewById(R.id.tv_disciplina);

        }
    }

    public List<PartidoModelo> listaPartido;

    public RecyclerViewAdaptadorPartido(List<PartidoModelo> listaPartido) {
        this.listaPartido = listaPartido;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_partido,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tituloPartido.setText(listaPartido.get(position).getTituloPartido());
        holder.nombrePerfil.setText(listaPartido.get(position).getNombrePerfil());
        holder.tipoPartido.setText(listaPartido.get(position).getTipoPartido());
        holder.imgPerfilPartido.setImageResource(listaPartido.get(position).getImgPerfil());
        holder.imgDiaCalendario.setImageResource(listaPartido.get(position).getImgCalendario());
        holder.imgUbicacion.setImageResource(listaPartido.get(position).getImgUbicacion());
        holder.imgHora.setImageResource(listaPartido.get(position).getImgHora());
        holder.imgDisciplina.setImageResource(listaPartido.get(position).getImgDisciplina());
        holder.imgFaltan.setImageResource(listaPartido.get(position).getImgFaltan());
        holder.ubicacion.setText(listaPartido.get(position).getUbicacion());
        holder.hora.setText(listaPartido.get(position).getHora());
        holder.disciplina.setText(listaPartido.get(position).getDisciplina());
    }



    @Override
    public int getItemCount() {
        return listaPartido.size();
    }
}
