package CaballeroJavaJedi3.biblioteca;

import java.util.Scanner;

public class PrincipalBiblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Buscar libro por título");
            System.out.println("2. Buscar libro por autor");
            System.out.println("3. Registrar libro");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el newline

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro a buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    Libro libroBuscado = biblioteca.buscarPorTitulo(tituloBuscar);
                    System.out.println(libroBuscado != null ? libroBuscado : "Libro no encontrado.");
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del autor: ");
                    String nombreAutor = scanner.nextLine();
                    System.out.print("Ingrese el apellido del autor: ");
                    String apellidoAutor = scanner.nextLine();
                    Autor autorBuscado = new Autor(nombreAutor, apellidoAutor);
                    System.out.println(biblioteca.buscarPorAutor(autorBuscado));
                    break;

                case 3:
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el nombre del autor: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el apellido del autor: ");
                    String apellido = scanner.nextLine();
                    Autor autor = new Autor(nombre, apellido);
                    Libro nuevoLibro = new Libro(titulo, autor);
                    biblioteca.registrarLibro(nuevoLibro);
                    System.out.println("Libro registrado con éxito!");
                    break;

                case 4:
                    continuar = false;
                    break;
            }
        }
    }
}
