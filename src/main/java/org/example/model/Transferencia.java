package org.example.model;

public class Transferencia implements MetodoPago{
    private String numeroCuenta;
    private Pago thePago;

    @Override
    public void pagar() {
        System.out.println("El producto fue pagado en con transferencia: " + thePago.calcularMonto());
    }
}
