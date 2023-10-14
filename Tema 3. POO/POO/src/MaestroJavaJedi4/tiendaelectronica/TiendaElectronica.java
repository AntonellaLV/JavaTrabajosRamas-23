package MaestroJavaJedi4.tiendaelectronica;

import java.util.ArrayList;

public class TiendaElectronica {
    private ArrayList<ProductoElectronico> productos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void agregarProducto(ProductoElectronico producto) {
        productos.add(producto);
    }

    public void eliminarProducto(ProductoElectronico producto) {
        productos.remove(producto);
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void realizarVenta(Cliente cliente, ProductoElectronico producto) {
        if (producto != null && productos.contains(producto) && producto.getCantidadEnStock() > 0) {
            cliente.comprarProducto(producto);
            producto.setCantidadEnStock(producto.getCantidadEnStock() - 1); // Reducir el stock del producto
        }
    }

    // Getters
    public ArrayList<ProductoElectronico> getProductos() {
        return productos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
