package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Pago {


private Cliente theCliente;
private List<Producto> listProducto;

    /**
     * Metodo constructor de Pago
     * @param theCliente
     */
    public Pago(Cliente theCliente) {
        this.theCliente = theCliente;
        this.listProducto = new ArrayList<>();
    }

    public double calcularMonto(){
        double monto = 0;
        for (Producto p : listProducto){
            monto += p.getCosto();
        }
        return monto;
    }



    public Cliente getTheCliente() {
        return theCliente;
    }

    public void setTheCliente(Cliente theCliente) {
        this.theCliente = theCliente;
    }

    public List<Producto> getListProducto() {
        return listProducto;
    }

    public void setListProducto(List<Producto> listProducto) {
        this.listProducto = listProducto;
    }
}
