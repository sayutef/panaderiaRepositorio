package com.sayuri.panaderiahu.models;

public class Pan extends Alimento {
    private String tipoPan;

    public Pan(){
        super();
    }
    public Pan(String nombre, int costo, String tipoPan) {
        super(nombre, costo);
        this.tipoPan = tipoPan;
    }

    @Override
    public String toString() {
        return "Pan {" +
                "tipoPan = '" + tipoPan + '\'' +
                ", nombre = '" + nombre + '\'' +
                ", costo = " + costo +
                '}';
    }

    public String getTipoPan() {
        return tipoPan;
    }

    public void setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
    }
}
