package InicialJavaJedi1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Curso> listaDeCursos = new ArrayList<>();

        while (true) {
            System.out.println("¿Desea ingresar un nuevo curso? (si/no):");
            String respuesta = scanner.nextLine();
            if (!respuesta.trim().equalsIgnoreCase("si")) break;

            System.out.print("Nombre del curso: ");
            String nombreCurso = scanner.nextLine();

            System.out.print("Descripción del curso: ");
            String descripcionCurso = scanner.nextLine();

            System.out.print("¿Está habilitado el curso? (si/no): ");
            boolean estaHabilitado = scanner.nextLine().trim().equalsIgnoreCase("si");

            Curso curso = new Curso(nombreCurso, estaHabilitado, descripcionCurso);
            listaDeCursos.add(curso);

            while (true) {
                System.out.println("¿Desea ingresar un nuevo alumno a este curso? (si/no):");
                respuesta = scanner.nextLine();
                if (!respuesta.trim().equalsIgnoreCase("si")) break;

                System.out.print("Nombre del alumno: ");
                String nombreAlumno = scanner.nextLine();

                System.out.print("Apellido del alumno: ");
                String apellidoAlumno = scanner.nextLine();

                System.out.print("Edad del alumno: ");
                int edadAlumno = obtenerEntero(scanner);

                Alumno alumno = new Alumno(nombreAlumno, apellidoAlumno, edadAlumno);
                curso.agregarAlumno(alumno);
            }
        }

        System.out.println("\nLista de Cursos:");
        for (Curso curso : listaDeCursos) {
            curso.imprimirInformacion();
        }
    }

    public static int obtenerEntero(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número entero válido.");
            }
        }
    }
}
