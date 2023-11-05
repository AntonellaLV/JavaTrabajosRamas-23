package ComercioElectronico.ejercicio2;

import ComercioElectronico.ejercicio2.basededatos.BdProductos;
import ComercioElectronico.ejercicio2.domain.Carrito;
import ComercioElectronico.ejercicio2.domain.Cliente;
import ComercioElectronico.ejercicio2.domain.Pedido;
import ComercioElectronico.ejercicio2.domain.Producto;
import ComercioElectronico.ejercicio2.entrada.InputConsoleService;
import ComercioElectronico.ejercicio2.enums.EstadoPedido;
import ComercioElectronico.ejercicio2.servicio.carrito.CarritoServicio;
import ComercioElectronico.ejercicio2.servicio.carrito.CarritoServicioImpl;
import ComercioElectronico.ejercicio2.servicio.menu.MenuCompra;
import ComercioElectronico.ejercicio2.servicio.menu.MenuCompraImpl;
import ComercioElectronico.ejercicio2.servicio.pedido.PedidoServicioImpl;
import ComercioElectronico.ejercicio2.servicio.producto.ProductoServicioImpl;
import ComercioElectronico.ejercicio2.servicio.stock.StockServicioImpl;

import java.util.List;
import java.util.Optional;


public class Main {
    private static Carrito carritoEnCurso;

    public static void main(String[] args) {
        BdProductos.initProducts();
        InputConsoleService.createScanner();

        Cliente client = new Cliente();
        client.setId(1L);
        client.setName("Antonella");
        client.setAdress("Avenida Siempre Viva");
        client.setEmail("Anto@gmail.com");
        carritoEnCurso = client.getCart();


        while (true) {
            displayMenu();
            int choice = InputConsoleService.getScanner().nextInt();

            switch (choice) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    client.addProduct();
                    break;
                case 3:
                    client.removeProduct();
                    break;
                case 4:
                    client.getCart().displayCart();
                    break;
                case 5:
                    client.confirmarCarrito();
                    break;
                case 6:
                    client.vaciarCarrito();
                    break;
                case 7:
                    client.displayConfirmedOrders();
                    break;
                case 8:
                    InputConsoleService.closeScanner(); // Asegurarse de cerrar el Scanner al finalizar.
                    System.out.println("Gracias por su visita. ¡Hasta pronto!");
                    return; // Salir del programa
                default:
                    System.out.println("Opción no reconocida. Intente nuevamente.");
                    break;
            }
        }
    }

    public static void displayMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("1. Ver productos disponibles");
        System.out.println("2. Añadir producto al carrito");
        System.out.println("3. Remover producto del carrito");
        System.out.println("4. Ver contenido del carrito");
        System.out.println("5. Confirmar carrito");
        System.out.println("6. Vaciar carrito");
        System.out.println("7. Ver Pedidos confirmados");
        System.out.println("8. Salir");
        System.out.print("Elija una opción: ");
    }

    public static void displayProducts() {
        System.out.println("\n=== Productos Disponibles ===");
        for (Producto producto : BdProductos.productos) {
            System.out.println(producto.getId() + ". " + producto.getNombre() + " - $" + producto.getPrecio());
        }
    }


    // Métodos estáticos getter y setter
    public static Carrito getCarritoEnCurso() {
        return carritoEnCurso;
    }

    public static void setCarritoEnCurso(Carrito carrito) {
        Main.carritoEnCurso = carrito;
    }
}