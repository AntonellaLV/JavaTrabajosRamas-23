package ComercioElectronico.ejercicio2.servicio.pedido;

import ComercioElectronico.ejercicio2.domain.Carrito;
import ComercioElectronico.ejercicio2.domain.Pedido;

public interface PedidoServicio {

    void actualizarPedidoAPagado(Carrito carrito);

    Pedido crearPedido(Carrito carrito, Long idPedido);
}