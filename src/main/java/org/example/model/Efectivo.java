package org.example.model;

public class Efectivo implements MetodoPago{

private Pago thePago;

    @Override
    public void pagar() {
        System.out.println("El producto fue pagado en efectivo: " + thePago.calcularMonto());
    }
}
