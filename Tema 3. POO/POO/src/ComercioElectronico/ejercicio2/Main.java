package ComercioElectronico.ejercicio2;

import ComercioElectronico.ejercicio2.basededatos.BdProductos;
import ComercioElectronico.ejercicio2.domain.Cliente;
import ComercioElectronico.ejercicio2.entrada.InputConsoleService;

public class Main {
    public static void main(String[] args) {
        //BdProductos.initProducts(); // Inicializar
        InputConsoleService.getScanner(); // Crear un scanner para entrada

        Cliente client = new Cliente("Juan", "Calle 123", "juan@email.com", "555-5555");

        while (true) {
            displayMenu();
            int choice = InputConsoleService.getScanner().nextInt();

            switch (choice) {
                case 1:
                    client.addProduct();
                    break;
                case 2:
                    client.removeProduct();
                    break;
                case 3:
                    client.confirmarCarrito();
                    break;
                case 4:
                    client.vaciarCarrito();
                    break;
                case 5:
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
        System.out.println("1. Añadir producto al carrito");
        System.out.println("2. Remover producto del carrito");
        System.out.println("3. Confirmar carrito");
        System.out.println("4. Vaciar carrito");
        System.out.println("5. Salir");
        System.out.print("Elija una opción: ");
    }
}