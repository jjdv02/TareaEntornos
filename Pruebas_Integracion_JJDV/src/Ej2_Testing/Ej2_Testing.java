package Ej2_Testing;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ej2_Testing {

	@Test 
	public void testin2() {
		Ej2_ServicioEnvio servicioEnvio = new Ej2_ServicioEnvio();
		Ej2_ServicioPedido servicioPedido = new Ej2_ServicioPedido(servicioEnvio);
		
		servicioPedido.crearYEnviarPedido("Pedido 123");
		assertTrue(servicioPedido.crearYEnviarPedido("Pedido 123"));
	}
	
}
