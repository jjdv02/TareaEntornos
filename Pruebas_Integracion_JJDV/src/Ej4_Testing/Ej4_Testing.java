package Ej4_Testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Ej4_Testing {
    private Ej4_ServicioPagos servicioPagos;
    private Ej4_ServicioOrdenes servicioOrdenes;


    @Test
    void testOrdenProcesadaConPagoExitoso() {
        boolean resultado = servicioOrdenes.procesarOrden(500.0);
        assertTrue(resultado, "El pago debería ser exitoso para una orden válida.");
    }

    @Test
    void testOrdenConMontoInvalido() {
        boolean resultado = servicioOrdenes.procesarOrden(-100.0);
        assertFalse(resultado, "No se debe procesar una orden con monto negativo.");
    }

    @Test
    void testOrdenConSaldoInsuficiente() {
        boolean resultado = servicioOrdenes.procesarOrden(1500.0);
        assertFalse(resultado, "No se debe procesar una orden con un monto mayor al saldo.");
    }

    @Test
    void testOrdenesConsecutivasHastaAgotarSaldo() {
        assertTrue(servicioOrdenes.procesarOrden(500.0), "Primera orden debería procesarse.");
        assertTrue(servicioOrdenes.procesarOrden(400.0), "Segunda orden debería procesarse.");
        assertFalse(servicioOrdenes.procesarOrden(200.0), "Saldo insuficiente para la tercera orden.");
    }
}