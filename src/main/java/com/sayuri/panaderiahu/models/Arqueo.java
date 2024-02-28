package com.sayuri.panaderiahu.models;

public class Arqueo {
    private int costoPan;
    private int costoPastel;
    private int costoGalleta;
    private int cantPan;
    private int cantPastel;
    private int cantGalleta;

    public Arqueo(){}

    public Arqueo(int costoPan, int costoPastel, int costoGalleta, int cantPan, int cantPastel, int cantGalleta) {
        this.costoPan = costoPan;
        this.costoPastel = costoPastel;
        this.costoGalleta = costoGalleta;
        this.cantPan = cantPan;
        this.cantPastel = cantPastel;
        this.cantGalleta = cantGalleta;
    }

    public void setCostoPan(int costoPan) {
        this.costoPan = costoPan;
    }

    public int getCostoPan() {
        return costoPan;
    }
    public void setCostoPastel(int costoPastel){
        this.costoPastel = costoPastel;
    }
    public int getCostoPastel(){
        return costoPastel;
    }
    public void setCostoGalleta(int costoGalleta){
        this.costoGalleta = costoGalleta;
    }
    public int getCostoGalleta(){
        return costoGalleta;
    }

    public int getCantPan() {
        return cantPan;
    }

    public void setCantPan(int cantPan) {
        this.cantPan = cantPan;
    }

    public int getCantPastel() {
        return cantPastel;
    }

    public void setCantPastel(int cantPastel) {
        this.cantPastel = cantPastel;
    }

    public int getCantGalleta() {
        return cantGalleta;
    }

    public void setCantGalleta(int cantGalleta) {
        this.cantGalleta = cantGalleta;
    }

    @Override
    public String toString() {
        return "Arqueo{" +
                "costoPan=" + costoPan +
                ", costoPastel=" + costoPastel +
                ", costoGalleta=" + costoGalleta +
                ", cantPan=" + cantPan +
                ", cantPastel=" + cantPastel +
                ", cantGalleta=" + cantGalleta +
                '}';
    }
}
