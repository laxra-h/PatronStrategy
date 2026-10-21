package org.example.model;

public class Tarjeta implements MetodoPago {
    private final String numeroTarjeta;

    public Tarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void pagar(double monto) {
        System.out.printf("Pago con tarjeta ", numeroTarjeta, monto);
    }
}
