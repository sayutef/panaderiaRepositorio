package com.sayuri.panaderiahu.models;

public class Pastel extends Alimento {
    private String sabor;

    public Pastel(){
        super();
    }
    public Pastel(String nombre, int costo, String sabor) {
        super(nombre, costo);
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return "Pastel {" +
                "sabor = '" + sabor + '\'' +
                ", nombre = '" + nombre + '\'' +
                ", costo = " + costo +
                '}';
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
