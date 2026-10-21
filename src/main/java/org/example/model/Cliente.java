package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private List<Pago> listPagos;

    /**
     * Metodo constructor del Cliente
     * @param nombre
     */
    public Cliente(String nombre) {
        this.nombre = nombre;
        this.listPagos = new ArrayList<>();
    }







    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pago> getListPagos() {
        return listPagos;
    }

    public void setListPagos(List<Pago> listPagos) {
        this.listPagos = listPagos;
    }
}
