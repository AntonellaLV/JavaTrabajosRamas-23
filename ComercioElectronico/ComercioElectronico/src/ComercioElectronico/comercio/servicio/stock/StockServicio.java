package ComercioElectronico.comercio.servicio.stock;

import ComercioElectronico.comercio.domain.Producto;

public interface StockServicio {
    void modificarCantidad(Long idProducto, int qty);
}
