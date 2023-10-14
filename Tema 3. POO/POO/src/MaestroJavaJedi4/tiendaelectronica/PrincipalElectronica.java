package MaestroJavaJedi4.tiendaelectronica;

public class PrincipalElectronica {
    public static void main(String[] args) {
        // Crear productos
        ProductoElectronico telefono = new ProductoElectronico("iPhone 13", "Teléfono móvil de Apple", 999.99, 50);
        ProductoElectronico laptop = new ProductoElectronico("MacBook Pro", "Computadora portátil de Apple", 1299.99, 30);

        // Crear tienda y agregar productos
        TiendaElectronica tienda = new TiendaElectronica();
        tienda.agregarProducto(telefono);
        tienda.agregarProducto(laptop);

        // Crear cliente
        Cliente juan = new Cliente("Juan Pérez", "Calle Falsa 123");
        tienda.agregarCliente(juan);

        // Simular una venta
        tienda.realizarVenta(juan, telefono);

        // Mostrar información de la tienda y del cliente
        System.out.println("Productos en la tienda:");
        for (ProductoElectronico producto : tienda.getProductos()) {
            System.out.println(producto);
        }

        System.out.println("\nCliente: " + juan);
        System.out.println("Productos comprados:");
        for (ProductoElectronico productoComprado : juan.getProductosComprados()) {
            System.out.println(productoComprado);
        }
    }
}
