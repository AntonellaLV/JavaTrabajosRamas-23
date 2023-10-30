package ComercioElectronico.ejercicio2.servicio.carrito;

import ComercioElectronico.ejercicio2.domain.Carrito;
import ComercioElectronico.ejercicio2.domain.Producto;

public class CarritoServicioImpl implements CarritoServicio {

    public static final String MENSAJE_CANTIDAD_MINIMA_TEMPLATE = "Debe ingresar una cantidad mayor que 0";
    public static final int CANTIDAD_MINIMA = 0;
    public static final String MENSAJE_ALERTA_CANTIDAD_DISPONIBLE_TEMPLATE = "Solo quedan %d productos en stock";

    private Carrito carritoEnCurso;

    public CarritoServicioImpl(Carrito carritoEnCurso) {
        this.carritoEnCurso = carritoEnCurso;
    }

    @Override
    public void addProduct(Producto prod, int qty) {
        if (qty <= CANTIDAD_MINIMA) {
            System.out.println(MENSAJE_CANTIDAD_MINIMA_TEMPLATE);
        } else {
            if (prod.getStock() < qty) {
                System.out.println(String.format(MENSAJE_ALERTA_CANTIDAD_DISPONIBLE_TEMPLATE, prod.getStock()));
            } else if (carritoEnCurso.getProductos().containsKey(prod)) {
                modifyQty(prod, qty);
                prod.reducirStock(qty);
            } else {
                carritoEnCurso.getProductos().put(prod, qty);
                prod.reducirStock(qty);
            }
        }
    }

    private void modifyQty(Producto prod, int qty) {
        int currentQty = carritoEnCurso.getProductos().get(prod);
        carritoEnCurso.getProductos().put(prod, currentQty + qty);
    }

    public boolean isEmpty() {
        return carritoEnCurso.getProductos().isEmpty();
    }

    public void clear() {
        carritoEnCurso.getProductos().clear();
    }

    public void removeProduct(Producto prod, int qtyToRemove) {
        if (carritoEnCurso.getProductos().containsKey(prod)) {
            int currentQty = carritoEnCurso.getProductos().get(prod);
            if (currentQty > qtyToRemove) {
                modifyQty(prod, -qtyToRemove);  // reduce qty
                prod.aumentarStock(qtyToRemove); // return stock
            } else {
                carritoEnCurso.getProductos().remove(prod);
                prod.aumentarStock(currentQty);  // return full qty stock
            }
        }
    }
}
