package ComercioElectronico.ejercicio2.servicio.stock;

import ComercioElectronico.ejercicio2.domain.Producto;

public interface StockServicio {
    void modificarCantidad(Long idProducto, int qty);
}