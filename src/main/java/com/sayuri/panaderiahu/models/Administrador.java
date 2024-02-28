package com.sayuri.panaderiahu.models;

import java.util.ArrayList;

public class Administrador {
    private ArrayList<Alimento>ListAlimentos = new ArrayList<>();
    private ArrayList<Empleado>ListEmpleados = new ArrayList<>();
    private ArrayList<Arqueo>ListArqueo = new ArrayList<>();
    public boolean addAlimentos(Alimento alimento){
        return ListAlimentos.add(alimento);
    }
    public boolean addEmpleados(Empleado empleado){
        return ListEmpleados.add(empleado);
    }
    public boolean addArqueo(Arqueo arqueo){
        return ListArqueo.add(arqueo);
    }
    public ArrayList<Alimento> getListAlimentos() {
        return ListAlimentos;
    }

    public void setListAlimentos(ArrayList<Alimento> listAlimentos) {
        ListAlimentos = listAlimentos;
    }

    public ArrayList<Empleado> getListEmpleados() {
        return ListEmpleados;
    }

    public void setListEmpleados(ArrayList<Empleado> listEmpleados) {
        ListEmpleados = listEmpleados;
    }

    public ArrayList<Arqueo> getListArqueo() {
        return ListArqueo;
    }

    public void setListArqueo(ArrayList<Arqueo> listArqueo) {
        ListArqueo = listArqueo;
    }
}
