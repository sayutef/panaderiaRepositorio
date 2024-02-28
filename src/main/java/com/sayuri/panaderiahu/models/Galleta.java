package com.sayuri.panaderiahu.models;

public class Galleta extends Alimento {
    private String tipoGalleta;

    public Galleta(){
        super();
    }
    public Galleta(String nombre, int costo, String tipoGalleta) {
        super(nombre, costo);
        this.tipoGalleta = tipoGalleta;
    }

    @Override
    public String toString() {
        return "Galleta { " +
                "tipoGalleta = '" + tipoGalleta + '\'' +
                ", nombre = '" + nombre + '\'' +
                ", costo = " + costo +
                '}';
    }

    public String getTipoGalleta() {
        return tipoGalleta;
    }

    public void setTipoGalleta(String tipoGalleta) {
        this.tipoGalleta = tipoGalleta;
    }
}
