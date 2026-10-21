package org.example;

import org.example.model.Cliente;
import org.example.model.Efectivo;
import org.example.model.Pago;
import org.example.model.Producto;
import org.example.model.Tarjeta;
import org.example.model.Transferencia;

public class Main {
    public static void main(String[] args) {
        // Cliente 1: paga un teclado en efectivo.
        Cliente clienteEfectivo = new Cliente("Ana");
        Pago pagoEfectivo = new Pago(clienteEfectivo);
        pagoEfectivo.getListProducto().add(new Producto("Teclado", 120000));
        clienteEfectivo.getListPagos().add(pagoEfectivo);
        pagoEfectivo.setMetodoPago(new Efectivo());
        System.out.println("Cliente: " + clienteEfectivo.getNombre());
        System.out.println("Producto: Teclado | Total: $" + pagoEfectivo.calcularMonto());
        pagoEfectivo.pagar(pagoEfectivo.calcularMonto());

        // Cliente 2: paga unos audifonos con tarjeta.
        Cliente clienteTarjeta = new Cliente("Luis");
        Pago pagoTarjeta = new Pago(clienteTarjeta);
        pagoTarjeta.getListProducto().add(new Producto("Audifonos", 85000));
        clienteTarjeta.getListPagos().add(pagoTarjeta);
        pagoTarjeta.setMetodoPago(new Tarjeta("**** 1234"));
        System.out.println("\nCliente: " + clienteTarjeta.getNombre());
        System.out.println("Producto: Audifonos | Total: $" + pagoTarjeta.calcularMonto());
        pagoTarjeta.pagar(pagoTarjeta.calcularMonto());

        // Cliente 3: paga una mochila por transferencia.
        Cliente clienteTransferencia = new Cliente("Marta");
        Pago pagoTransferencia = new Pago(clienteTransferencia);
        pagoTransferencia.getListProducto().add(new Producto("Cable", 65000));
        clienteTransferencia.getListPagos().add(pagoTransferencia);
        pagoTransferencia.setMetodoPago(new Transferencia("**** 5678"));
        System.out.println("\nCliente: " + clienteTransferencia.getNombre());
        System.out.println("Producto: Mochila | Total: $" + pagoTransferencia.calcularMonto());
        pagoTransferencia.pagar(pagoTransferencia.calcularMonto());

        // Cliente 4: divide los $100.000 entre tres estrategias.
        Cliente clienteMixto = new Cliente("Carlos");
        Pago pagoMixto = new Pago(clienteMixto);
        pagoMixto.getListProducto().add(new Producto("Computador", 100000));
        clienteMixto.getListPagos().add(pagoMixto);
        System.out.println("\nCliente: " + clienteMixto.getNombre());
        System.out.println("Producto: Computador | Total: $" + pagoMixto.calcularMonto());

        pagoMixto.setMetodoPago(new Efectivo());
        pagoMixto.pagar(50000);
        pagoMixto.setMetodoPago(new Transferencia("**** 9012"));
        pagoMixto.pagar(30000);
        pagoMixto.setMetodoPago(new Tarjeta("**** 3456"));
        pagoMixto.pagar(20000);
    }
}
