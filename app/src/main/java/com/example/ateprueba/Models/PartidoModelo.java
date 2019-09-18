package com.example.ateprueba.Models;

public class PartidoModelo {


    private String tituloPartido;
    private String nombrePerfil;
    private String tipoPartido;
    private String ubicacion;
    private String hora;
    private String disciplina;
    private int imgPerfil, imgCalendario, imgUbicacion, imgHora, imgDisciplina, imgFaltan;

    public PartidoModelo() {
    }

    public PartidoModelo(String tituloPartido, String nombrePerfil, String tipoPartido, int imgPerfil, int imgCalendario, int imgUbicacion, int imgHora, int imgDisciplina, int imgFaltan, String ubicacion, String hora, String disciplina) {
        this.tituloPartido = tituloPartido;
        this.nombrePerfil = nombrePerfil;
        this.tipoPartido = tipoPartido;
        this.imgPerfil = imgPerfil;
        this.imgCalendario = imgCalendario;
        this.imgUbicacion = imgUbicacion;
        this.imgHora = imgHora;
        this.imgDisciplina = imgDisciplina;
        this.imgFaltan = imgFaltan;
        this.ubicacion = ubicacion;
        this.hora = hora;
        this.disciplina = disciplina;
    }

    public String getTituloPartido() {
        return tituloPartido;
    }

    public void setTituloPartido(String tituloPartido) {
        this.tituloPartido = tituloPartido;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public String getTipoPartido() {
        return tipoPartido;
    }

    public void setTipoPartido(String tipoPartido) {
        this.tipoPartido = tipoPartido;
    }

    public int getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(int imgPerfil) {
        this.imgPerfil = imgPerfil;
    }

    public int getImgCalendario() {
        return imgCalendario;
    }

    public void setImgCalendario(int imgCalendario) {
        this.imgCalendario = imgCalendario;
    }

    public int getImgUbicacion() {
        return imgUbicacion;
    }

    public void setImgUbicacion(int imgUbicacion) {
        this.imgUbicacion = imgUbicacion;
    }

    public int getImgHora() {
        return imgHora;
    }

    public void setImgHora(int imgHora) {
        this.imgHora = imgHora;
    }

    public int getImgDisciplina() {
        return imgDisciplina;
    }

    public void setImgDisciplina(int imgDisciplina) {
        this.imgDisciplina = imgDisciplina;
    }

    public int getImgFaltan() {
        return imgFaltan;
    }

    public void setImgFaltan(int imgFaltan) {
        this.imgFaltan = imgFaltan;
    }

    public String getUbicacion() { return ubicacion; }

    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public String getHora() { return hora; }

    public void setHora(String hora) { this.hora = hora; }

    public String getDisciplina() { return disciplina; }

    public void setDisciplina(String disciplina) { this.disciplina = disciplina; }
}
