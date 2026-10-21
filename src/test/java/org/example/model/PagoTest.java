package org.example.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PagoTest {

    @Test
    public void testEstrategiasDePago() {
        // 1. Preparar datos (Cliente, Pago y Productos)
        Cliente cliente = new Cliente("Carlos");
        Pago pago = new Pago(cliente);
        pago.getListProducto().add(new Producto("Audifonos", 50.0));
        pago.getListProducto().add(new Producto("Teclado", 100.0));

        // 2. Verificar el monto calculado en el contexto (Pago)
        assertEquals(150.0, pago.calcularMonto());

        // 3. cambia la estrategia de pago
        MetodoPago estrategia;

        estrategia = new Efectivo();
        assertInstanceOf(MetodoPago.class, estrategia);
        assertInstanceOf(Efectivo.class, estrategia);

        estrategia = new Tarjeta();
        assertInstanceOf(MetodoPago.class, estrategia);
        assertInstanceOf(Tarjeta.class, estrategia);

        estrategia = new Transferencia();
        assertInstanceOf(MetodoPago.class, estrategia);
        assertInstanceOf(Transferencia.class, estrategia);
    }
}


