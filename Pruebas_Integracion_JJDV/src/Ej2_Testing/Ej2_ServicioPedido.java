package Ej2_Testing;

public class Ej2_ServicioPedido {
    private Ej2_ServicioEnvio servicioEnvio;

    public Ej2_ServicioPedido(Ej2_ServicioEnvio servicioEnvio) {
        this.servicioEnvio = servicioEnvio;
    }

    public boolean crearYEnviarPedido(String pedido) {
        System.out.println("Pedido creado: " + pedido);
      
        return servicioEnvio.enviarPedido(pedido);
    }
}
