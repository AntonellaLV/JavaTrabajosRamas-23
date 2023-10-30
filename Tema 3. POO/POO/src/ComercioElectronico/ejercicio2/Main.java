package ComercioElectronico.ejercicio2;

import ComercioElectronico.ejercicio2.basededatos.BdProductos;
import ComercioElectronico.ejercicio2.domain.Cliente;
import ComercioElectronico.ejercicio2.domain.Producto;
import ComercioElectronico.ejercicio2.entrada.InputConsoleService;

public class Main {
    public static void main(String[] args) {
        BdProductos.initProducts(); // Inicializar
        InputConsoleService.getScanner(); // Crear un scanner para entrada

        Cliente client = new Cliente("Antonella", "Avenida Siempre Viva 123", "Anto@email.com", "555-5555");

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
                    System.out.println("Gracias por su visita. ¡Hasta pronto!");
                    return; // salir del programa
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
        System.out.println("7. Ver pedidos confirmados");
        System.out.println("8. Salir");
        System.out.print("Elija una opción: ");
    }

    public static void displayProducts() {
        System.out.println("\n=== Productos Disponibles ===");
        for (Producto producto : BdProductos.productos) {
            System.out.println(producto.getId() + ". " + producto.getNombre() + " - $" + producto.getPrecio());
        }
    }
}