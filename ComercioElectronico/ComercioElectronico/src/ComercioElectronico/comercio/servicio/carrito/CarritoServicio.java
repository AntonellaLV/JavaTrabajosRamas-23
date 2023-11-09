package ComercioElectronico.comercio.servicio.carrito;

import ComercioElectronico.comercio.domain.Carrito;
import ComercioElectronico.comercio.domain.Producto;

public interface CarritoServicio {
    void addProduct(Producto prod, int qty);

    boolean cerrarCarrito();
}
