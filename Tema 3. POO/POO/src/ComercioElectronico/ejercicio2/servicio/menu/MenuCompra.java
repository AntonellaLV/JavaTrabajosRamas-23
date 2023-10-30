package ComercioElectronico.ejercicio2.servicio.menu;

import ComercioElectronico.ejercicio2.domain.Producto;
import ComercioElectronico.ejercicio2.servicio.menu.MenuCompra;

import java.util.Optional;

public interface MenuCompra {
    Optional<Producto> seleccionarProducto();

    int seleccionarCantidad();

    void mostarProductos();

}
