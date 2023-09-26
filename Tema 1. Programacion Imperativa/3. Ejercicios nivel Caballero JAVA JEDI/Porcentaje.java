// 1. Obtener porcentaje: Dados dos números, uno real y el otro entero. Obtenga el
// porcentaje que indique el segundo número del primer número.

public class Porcentaje {
    public static void main(String[] args) {
        // Definir los dos números, uno real y otro entero
        double numeroReal = 75.0; // Cambiar este valor según sea necesario
        int numeroEntero = 25; // Cambiar este valor según sea necesario

        // Calcular el porcentaje
        double porcentaje = (numeroEntero * 100.0) / numeroReal;

        // Mostrar el resultado por pantalla
        System.out.println(numeroEntero + " es el " + porcentaje + "% de " + numeroReal);
    }
}
