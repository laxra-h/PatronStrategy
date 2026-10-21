package org.example.model;

public class Efectivo implements MetodoPago {
    @Override
    public void pagar(double monto) {
        System.out.printf("Pago en efectivo: ", monto);
    }
}
