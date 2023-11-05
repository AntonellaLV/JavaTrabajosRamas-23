package MaestroJavaJedi4.tiendaelectronica;

import java.util.ArrayList;

public class ProductoElectronico {
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadEnStock;

    public ProductoElectronico(String nombre, String descripcion, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    @Override
    public String toString() {
        return nombre + " - " + descripcion + " - $" + precio + " - Stock: " + cantidadEnStock;
    }
}
