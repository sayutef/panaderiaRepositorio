package com.sayuri.panaderiahu.models;

public class Producto {
    private String nameProducto;
    private int costo;
    public Producto(){}

    public Producto(String nameProducto, int costo) {
        this.nameProducto = nameProducto;
        this.costo = costo;
    }

    public String getNameProducto() {
        return nameProducto;
    }

    public void setNameProducto(String nameProducto) {
        this.nameProducto = nameProducto;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nameProducto='" + nameProducto + '\'' +
                ", costo=" + costo +
                '}';
    }
}
