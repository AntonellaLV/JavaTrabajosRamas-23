package ComercioElectronico.ejercicio2.servicio.carrito;

import ComercioElectronico.ejercicio2.domain.Producto;

public interface CarritoServicio {
    void addProduct(Producto prod, int qty);
    boolean isEmpty();
    void clear();
    void removeProduct(Producto prod, int qtyToRemove);
}
