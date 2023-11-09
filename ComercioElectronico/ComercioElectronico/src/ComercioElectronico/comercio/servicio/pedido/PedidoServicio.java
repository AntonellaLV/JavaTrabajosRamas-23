package ComercioElectronico.comercio.servicio.pedido;

import ComercioElectronico.comercio.domain.Carrito;
import ComercioElectronico.comercio.domain.Cliente;
import ComercioElectronico.comercio.domain.Pedido;
import ComercioElectronico.comercio.enums.EstadoPedido;

import java.util.List;

public interface PedidoServicio {

    void actualizarPedidoAPagado(Carrito carrito);

    Pedido crearPedido(Carrito carrito, Long idPedido);

    List<Pedido> obtenerPedidos(EstadoPedido estadoPedido, Cliente cliente);
}
