package ComercioElectronico.comercio.servicio.menu.compra;

import ComercioElectronico.comercio.domain.Producto;
import ComercioElectronico.comercio.enums.EstadoPedido;

import java.util.Optional;

public interface MenuCompra {
    Optional<Producto> seleccionarProducto();

    int seleccionarCantidad();

    void mostarProductos();

}
