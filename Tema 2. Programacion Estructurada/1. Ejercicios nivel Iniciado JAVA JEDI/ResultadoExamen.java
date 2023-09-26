// 7. Espero aprobar: Escribe un programa que imprima un título para el programa,
// luego un listado (Seguido, NO con saltos de línea) de las N notas de mis exámenes,
// donde los N números son guardados en variables o constantes según corresponda.
// Luego obtenga el promedio de esas calificaciones y me diga si aprobé o no y con cuanto.

public class ResultadoExamen {
    public static void main(String[] args) {
        // Título del programa
        System.out.print("Programa de Resultados de Examenes\nNotas: ");

        // Definimos y guardamos las notas en variables individuales
        double nota1 = 85.5;
        double nota2 = 100.0;
        double nota3 = 78.5;
        double nota4 = 60.0;

        // Imprimimos las notas seguidas
        System.out.print(nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4 + " ");

        // Calculamos el promedio
        double promedio = (nota1 + nota2 + nota3 + nota4) / 4;

        // Decidimos si aprobamos o no
        if (promedio >= 70.0) {
            System.out.println("\nAprobaste con un promedio de: " + promedio);
        } else {
            System.out.println("\nNo aprobaste. Tu promedio es: " + promedio);
        }
    }
}
