package com.sayuri.panaderiahu.models;

public class Alimento {
    protected String nombre;
    protected int costo;

    public Alimento(String nombre, int costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    public Alimento() {

    }

    @Override
    public String toString() {
        return "Alimento {" +
                "nombre = '" + nombre + '\'' +
                ", costo = " + costo +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
