package PadawanJavaJedi2.listadetareas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalTareas {
    private static List<Tarea> tareas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = obtenerEntero(scanner);
            switch (opcion) {
                case 1:
                    agregarTarea();
                    break;
                case 2:
                    eliminarTarea();
                    break;
                case 3:
                    listarTareas();
                    break;
                case 4:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú de Tareas:");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Eliminar tarea");
        System.out.println("3. Listar tareas");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void agregarTarea() {
        System.out.print("Ingrese el título de la tarea: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese la descripción de la tarea: ");
        String descripcion = scanner.nextLine();
        System.out.print("Ingrese la fecha de vencimiento de la tarea (ejemplo: 01/01/2023): ");
        String fechaVencimiento = scanner.nextLine();

        Tarea tarea = new Tarea(titulo, descripcion, fechaVencimiento);
        tareas.add(tarea);
        System.out.println("Tarea añadida con éxito.");
    }

    private static void eliminarTarea() {
        System.out.println("Ingrese el título de la tarea que desea eliminar:");
        String titulo = scanner.nextLine();
        Tarea tareaAEliminar = null;
        for (Tarea tarea : tareas) {
            if (tarea.getTitulo().equalsIgnoreCase(titulo)) {
                tareaAEliminar = tarea;
                break;
            }
        }
        if (tareaAEliminar != null) {
            tareas.remove(tareaAEliminar);
            System.out.println("Tarea eliminada con éxito.");
        } else {
            System.out.println("Tarea no encontrada.");
        }
    }

    private static void listarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }
        System.out.println("\nLista de Tareas:");
        for (Tarea tarea : tareas) {
            System.out.println("---------------------");
            System.out.println(tarea);
        }
    }

    private static int obtenerEntero(Scanner scanner) {
        int numero = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                numero = Integer.parseInt(scanner.nextLine());
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un número válido: ");
            }
        }
        return numero;
    }
}

