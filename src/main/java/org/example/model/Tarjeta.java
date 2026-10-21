package org.example.model;

public class Tarjeta implements MetodoPago{
    private String numeroTarjeta;
    private Pago thePago;

    @Override
    public void pagar() {
        System.out.println("El producto fue pagado en con tarjeta: " + thePago.calcularMonto() + "Numero de tarjeta: " + numeroTarjeta);
    }
}
