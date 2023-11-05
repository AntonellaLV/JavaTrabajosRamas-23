package ComercioElectronico.ejercicio2.servicio.carrito;


import ComercioElectronico.ejercicio2.domain.Carrito;
import ComercioElectronico.ejercicio2.domain.Cliente;
import ComercioElectronico.ejercicio2.domain.Pedido;
import ComercioElectronico.ejercicio2.domain.Producto;
import ComercioElectronico.ejercicio2.enums.EstadoPedido;


public interface CarritoServicio {
    void addProduct(Producto prod, int qty);
    boolean isEmpty();
    void clear();
    void removeProduct(Producto prod, int qtyToRemove);

    void crearYActualizarCarritoEnCurso(Cliente cliente);

}