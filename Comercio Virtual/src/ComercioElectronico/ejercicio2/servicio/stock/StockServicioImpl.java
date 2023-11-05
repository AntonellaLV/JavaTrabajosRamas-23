package ComercioElectronico.ejercicio2.servicio.stock;

import ComercioElectronico.ejercicio2.basededatos.BdProductos;
import ComercioElectronico.ejercicio2.domain.Producto;

public class StockServicioImpl implements StockServicio{
    @Override
    public void modificarCantidad(Long idProducto, int qty) {
        int cantidadActual = BdProductos.getProductById(idProducto).getStock();

        BdProductos.getProductById(idProducto).setStock(cantidadActual - qty);
    }
}