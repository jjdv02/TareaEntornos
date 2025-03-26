package PruebaCajaNegra_Edad;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class Limite {



	    @Test
	    public void EsMayorDeEdadMenorQue18() {
	        int edad = 17; 
	        boolean resultado = Edad.esMayorDeEdad(edad);
	        assertEquals(false, resultado, "La persona no debe ser mayor de edad si tiene 17 años.");
	    }

	    @Test
	    public void EsMayorDeEdadExactamente18() {
	        int edad = 18;  
	        boolean resultado = Edad.esMayorDeEdad(edad);
	        assertEquals(true, resultado, "La persona de 18 años debe ser mayor de edad.");
	    }
	    @Test
	    public void EsMayorDeEdadJusto100() {
	        int edad = 100;  
	        boolean resultado = Edad.esMayorDeEdad(edad);
	        assertEquals(true, resultado, "La persona de 100 años debe ser mayor de edad.");
	    }

	    @Test
	    public void EsMayorDeEdadMayorQue100() {
	        int edad = 101;  
	        boolean resultado = Edad.esMayorDeEdad(edad);
	        assertEquals(false, resultado, "La persona no debe ser mayor de edad si tiene más de 100 años.");
	    }

	}

