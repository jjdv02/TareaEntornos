package Ej1_Testing_JJDV;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ej1_Testing {

	@Test
	public void testin() {
		Ej1_BaseDeDatos baseDeDatos = new Ej1_BaseDeDatos();
		Ej1_ServicioUsuarios servicioUsuarios = new Ej1_ServicioUsuarios(baseDeDatos);
		
		servicioUsuarios.registrarUsuario("usuario");
		assertTrue(servicioUsuarios.usuarioRegistrado("usuario"));
	}

}
