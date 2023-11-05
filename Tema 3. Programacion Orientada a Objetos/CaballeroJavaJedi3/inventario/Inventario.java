package CaballeroJavaJedi3.inventario;

import java.util.HashMap;

public class Inventario {
    private HashMap<String, Producto> productos;

    public Inventario() {
        this.productos = new HashMap<>();
    }

    public void agregarProducto(Producto producto) {
        productos.put(producto.getNombre(), producto);
    }

    public Producto consultarProducto(String nombre) {
        return productos.get(nombre);
    }

    public void actualizarProducto(Producto producto) {
        productos.replace(producto.getNombre(), producto);
    }
}
