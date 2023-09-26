// 4. Conversión de libras esterlinas a dólares: Escribir un programa en Java que
// solicite al usuario una cantidad en libras esterlinas y muestre el equivalente en
// dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1
// libra esterlina = 1.40 dólares, y el usuario ingresa 50 libras esterlinas, el programa
// deberá mostrar 70 dólares.

public class ConversionLibrasADolares {
    public static void main(String[] args) {
        // Definimos la cantidad en libras esterlinas
        double librasEsterlinas = 50.0; // Cambiar este valor según sea necesario

        // Definimos la tasa de cambio (por ejemplo, 1 libra esterlina = 1.23 dólares) 24/09/2023
        double tasaCambio = 1.23;

        // Realizamos la conversión a dólares
        double dolares = librasEsterlinas * tasaCambio;

        // Mostramos el resultado por pantalla
        System.out.println("Cantidad en libras esterlinas: " + librasEsterlinas);
        System.out.println("Equivalente en dolares: $" + dolares);
    }
}

