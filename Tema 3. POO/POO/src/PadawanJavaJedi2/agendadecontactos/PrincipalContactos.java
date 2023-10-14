package PadawanJavaJedi2.agendadecontactos;

import java.util.Scanner;

public class PrincipalContactos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgendaContactos agenda = new AgendaContactos();

        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Mostrar todos los contactos");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el newline

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el número de teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese el correo electrónico: ");
                    String email = scanner.nextLine();
                    Contacto contacto = new Contacto(nombre, telefono, email);
                    agenda.agregarContacto(contacto);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    agenda.eliminarContacto(nombreEliminar);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    Contacto contactoEncontrado = agenda.buscarContacto(nombreBuscar);
                    if (contactoEncontrado != null) {
                        System.out.println(contactoEncontrado);
                    } else {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Lista de contactos:");
                    for (Contacto c : agenda.mostrarContactos()) {
                        System.out.println(c);
                    }
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 5.");
                    break;
            }
        }
        scanner.close();
    }
}

