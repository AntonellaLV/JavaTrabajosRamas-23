package MaestroJavaJedi4.tiendaelectronica;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String direccion;
    private ArrayList<ProductoElectronico> productosComprados = new ArrayList<>();

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void comprarProducto(ProductoElectronico producto) {
        productosComprados.add(producto);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<ProductoElectronico> getProductosComprados() {
        return productosComprados;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombre + " - " + direccion;
    }
}
