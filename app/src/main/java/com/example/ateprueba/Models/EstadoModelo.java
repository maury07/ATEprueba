package com.example.ateprueba.Models;

public class EstadoModelo {
    private String perfilEstado, horaEstado, textoEstado;
    int imgPerfilEstado;

    public EstadoModelo() {
    }

    public EstadoModelo(String perfilEstado, String horaEstado, String textoEstado, int imgPerfilEstado) {
        this.perfilEstado = perfilEstado;
        this.horaEstado = horaEstado;
        this.textoEstado = textoEstado;
        this.imgPerfilEstado = imgPerfilEstado;
    }

    public String getPerfilEstado() {
        return perfilEstado;
    }

    public void setPerfilEstado(String perfilEstado) {
        this.perfilEstado = perfilEstado;
    }

    public String getHoraEstado() {
        return horaEstado;
    }

    public void setHoraEstado(String horaEstado) {
        this.horaEstado = horaEstado;
    }

    public String getTextoEstado() {
        return textoEstado;
    }

    public void setTextoEstado(String textoEstado) {
        this.textoEstado = textoEstado;
    }

    public int getImgPerfilEstado() {
        return imgPerfilEstado;
    }

    public void setImgPerfilEstado(int imgPerfilEstado) {
        this.imgPerfilEstado = imgPerfilEstado;
    }
}
