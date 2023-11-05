package PadawanJavaJedi2.appdeestudiantes;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PrincipalEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Agregar estudiante y calificaciones");
            System.out.println("2. Mostrar estudiantes y promedio");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine();  // Consumir el newline
                    System.out.print("Ingrese nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese número de identificación: ");
                    String id = scanner.nextLine();

                    Estudiante estudiante = new Estudiante(nombre, id);

                    System.out.print("Ingrese número de calificaciones: ");
                    int numCalificaciones = scanner.nextInt();
                    for (int i = 0; i < numCalificaciones; i++) {
                        System.out.print("Ingrese calificación " + (i + 1) + ": ");
                        int valor = scanner.nextInt();
                        estudiante.agregarCalificacion(new Calificacion(valor, new Date()));  // Usamos la fecha actual
                    }

                    estudiantes.add(estudiante);
                    break;

                case 2:
                    for (Estudiante e : estudiantes) {
                        System.out.println("ID: " + e.getId() + ", Nombre: " + e.getNombre() + ", Promedio: " + e.calcularPromedio());
                    }
                    break;

                case 3:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 3.");
                    break;
            }
        }

        scanner.close();
    }
}