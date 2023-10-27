package ComercioElectronico.ejercicio2;

import ComercioElectronico.ejercicio2.basededatos.BdProductos;
import ComercioElectronico.ejercicio2.domain.Cliente;
import ComercioElectronico.ejercicio2.entrada.InputConsoleService;

public class Main {
    public static void main(String[] args) {

        Cliente client = new Cliente("Antonella", "Avenida Siempre Viva", "Anto@gmail.com", "555-568794");
        int opt = 0;

        do {
            System.out.println("1. Ver productos");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Sacar producto del carrito");
            System.out.println("4. Ver carrito");
            System.out.println("5. Vaciar carrito");
            System.out.println("6. Comprar carrito");
            System.out.println("7. Ver pedidos");
            System.out.println("0. Salir");

            System.out.println("Ingrese una opcion");
            opt = InputConsoleService.getScanner().nextInt();

            switch (opt){
                case 1:
                    BdProductos.listProducts();
                    break;
                case 2:
                    client.addProduct();
                    break;
                case 3:
                    client.removeProduct();
                    break;
                case 4:
                    System.out.println("-".repeat(35));
                    client.getCart().displayCart();  // Actualizado a displayCart
                    System.out.println("-".repeat(35));
                    break;
                case 5:
                    client.vaciarCarrito();  //clase Cliente
                    break;
                case 6:
                    client.confirmarCarrito();
                    break;
                case 7:
                    client.getOrders().forEach(pedido -> pedido.displayOrder()); // Actualizado a displayOrder
                    break;
                case 0:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Error! Opcion invalida");
            }

        }while (opt != 0);

        InputConsoleService.getScanner().close();
    }
}
