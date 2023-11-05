package ComercioElectronico.ejercicio2.servicio.pedido;

import ComercioElectronico.ejercicio2.Main;
import ComercioElectronico.ejercicio2.domain.Carrito;
import ComercioElectronico.ejercicio2.domain.Pedido;
import ComercioElectronico.ejercicio2.enums.EstadoPedido;
import ComercioElectronico.ejercicio2.servicio.carrito.CarritoServicio;
import ComercioElectronico.ejercicio2.servicio.carrito.CarritoServicioImpl;

import java.util.Objects;

public class PedidoServicioImpl implements PedidoServicio {


    @Override
    public void actualizarPedidoAPagado(Carrito carrito) {
        carrito.getPedido().setStatus(EstadoPedido.PAGADO);

        // Refacturizado para usar el nuevo método de CarritoServicioImpl
        CarritoServicio carritoServicio = new CarritoServicioImpl(Main.getCarritoEnCurso());
        carritoServicio.crearYActualizarCarritoEnCurso(carrito.getCliente());
    }


    @Override
    public Pedido crearPedido(Carrito carrito, Long idPedido) {

        Pedido pedido = new Pedido(carrito, carrito.getCliente());

        // No se necesita configurar el ID, la fecha, ni el estado porque ya se hace en el constructor.

        return pedido;
    }
}