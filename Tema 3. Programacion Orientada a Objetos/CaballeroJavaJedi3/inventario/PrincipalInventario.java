package CaballeroJavaJedi3.inventario;

import java.util.Scanner;

public class PrincipalInventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar producto");
            System.out.println("3. Consultar producto");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el newline

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el precio: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad en stock: ");
                    int cantidad = scanner.nextInt();
                    Producto nuevoProducto = new Producto(nombre, precio, cantidad);
                    inventario.agregarProducto(nuevoProducto);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del producto a actualizar: ");
                    nombre = scanner.nextLine();
                    Producto productoExistente = inventario.consultarProducto(nombre);
                    if (productoExistente != null) {
                        System.out.print("Ingrese el nuevo precio (actual: " + productoExistente.getPrecio() + "): ");
                        precio = scanner.nextDouble();
                        System.out.print("Ingrese la nueva cantidad en stock (actual: " + productoExistente.getCantidadEnStock() + "): ");
                        cantidad = scanner.nextInt();
                        productoExistente.setPrecio(precio);
                        productoExistente.setCantidadEnStock(cantidad);
                        inventario.actualizarProducto(productoExistente);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del producto a consultar: ");
                    nombre = scanner.nextLine();
                    Producto producto = inventario.consultarProducto(nombre);
                    if (producto != null) {
                        System.out.println(producto);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 4:
                    continuar = false;
                    break;
            }
        }
    }
}
