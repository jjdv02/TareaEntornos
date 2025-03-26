package PruebaCajaNegra_Edad;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class Equivalencia {

	

	  
	   @Test
	 public void EsMayorDeEdad() {
	     int edad = 17;  
	     boolean resultado = Edad.esMayorDeEdad(edad);
	     assertEquals(false, resultado, "La persona no debe ser mayor de edad.");
	   }

	   
	  @Test
	    public void EsMayorDeEdadExactamente18() {
	        int edad = 18;  
	        boolean resultado = Edad.esMayorDeEdad(edad);
	        assertEquals(true, resultado, "La persona de 18 años debe ser mayor de edad.");
	        
	    }
	  @Test
	  public void EsMayorDeEdadAdulto() {
	    int edad = 19;  
	        boolean resultado = Edad.esMayorDeEdad(edad);
	    assertEquals(true, resultado, "La persona debe ser mayor de edad.");
	   }

	    
	    @Test
	    public void EsMayorDeEdadMayorDe100() {
	        int edad = 101;  
	        boolean resultado = Edad.esMayorDeEdad(edad);
	        assertEquals(false, resultado, "La persona no debe ser considerada mayor de edad si tiene más de 100 años.");
	    }
	}

	
	
	
	

