package org.example.model;

public class Producto {
    private String nombre;
    private double costo;
    private Pago thePago;

    /**
     * Metodo constructor de Producto
     * @param nombre
     * @param costo
     */
    public Producto(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Pago getThePago() {
        return thePago;
    }

    public void setThePago(Pago thePago) {
        this.thePago = thePago;
    }
}
