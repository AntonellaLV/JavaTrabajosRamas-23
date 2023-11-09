package ComercioElectronico.comercio.servicio.stock;

import ComercioElectronico.comercio.basededatos.BdProductos;
import ComercioElectronico.comercio.domain.Producto;

public class StockServicioImpl implements StockServicio{
    @Override
    public void modificarCantidad(Long idProducto, int qty) {
        int cantidadActual = BdProductos.getProductById(idProducto).getStock();

        BdProductos.getProductById(idProducto).setStock(cantidadActual - qty);
    }
}
