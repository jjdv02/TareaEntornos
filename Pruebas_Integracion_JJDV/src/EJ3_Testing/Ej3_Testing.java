package EJ3_Testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EJ3_Testing {
    private Ej3_BaseDeDatosProductos baseDeDatos;
    private Ej3_GestorProductos gestor;

    @BeforeEach
    void setUp() {
        baseDeDatos = new Ej3_BaseDeDatosProductos();
        gestor = new Ej3_GestorProductos(baseDeDatos);
    }

    @Test
    void testFlujoCompletoRegistroYVerificacion() {
        // Verificar que la base de datos está vacía al inicio
        assertFalse(gestor.productoRegistrado("Tablet"), "No debería existir el producto al inicio");

        // Registrar un producto
        gestor.registrarProducto("Tablet");

        // Verificar que el producto se haya registrado correctamente
        assertTrue(gestor.productoRegistrado("Tablet"), "El producto debería estar registrado después de agregarlo");
    }
}
