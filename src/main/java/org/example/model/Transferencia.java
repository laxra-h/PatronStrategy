package org.example.model;

public class Transferencia implements MetodoPago {
    private final String numeroCuenta;

    public Transferencia(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public void pagar(double monto) {
        System.out.printf("Pago por transferencia a la cuenta ", numeroCuenta, monto);
    }
}
