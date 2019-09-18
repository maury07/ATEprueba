package com.example.ateprueba.Models;

public class ComunidadModelo {
    private String titulo, ultimoMje, admin;
    private int imgGrupo;

    public ComunidadModelo() {
    }

    public ComunidadModelo(String titulo, String ultimoMje, int imgGrupo) {
        this.titulo = titulo;
        this.ultimoMje = ultimoMje;
        this.imgGrupo = imgGrupo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUltimoMje() {
        return ultimoMje;
    }

    public void setUltimoMje(String ultimoMje) {
        this.ultimoMje = ultimoMje;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public int getImgGrupo() {
        return imgGrupo;
    }

    public void setImgGrupo(int imgGrupo) {
        this.imgGrupo = imgGrupo;
    }
}
