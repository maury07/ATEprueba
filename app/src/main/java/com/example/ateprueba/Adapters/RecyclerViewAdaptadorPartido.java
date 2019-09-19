package com.example.ateprueba.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ateprueba.Models.PartidoModelo;
import com.example.ateprueba.R;

import java.util.List;

public class RecyclerViewAdaptadorPartido extends RecyclerView.Adapter<RecyclerViewAdaptadorPartido.ViewHolder> {


    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView tituloPartido, nombrePerfil, tipoPartido, ubicacion, hora, disciplina;
        ImageView imgPerfilPartido, imgDiaCalendario, imgUbicacion, imgHora, imgDisciplina, imgFaltan;
        Button postularse, informacion;
        Context context;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
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
            postularse = (Button)itemView.findViewById(R.id.btnPostularme);
            informacion = (Button)itemView.findViewById(R.id.btnInfo);
        }

        public void setOnClickListeners() {
            postularse.setOnClickListener(this);
            informacion.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnPostularme:
                    Toast.makeText(v.getContext(), "Postularme",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnInfo:
                    Toast.makeText(v.getContext(), "Partido en "+ubicacion.getText()+ ", a las "+hora.getText(),Toast.LENGTH_SHORT).show();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + v.getId());
            }
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

        //eventos
        holder.setOnClickListeners();
    }

    @Override
    public int getItemCount() {
        return listaPartido.size();
    }

}
