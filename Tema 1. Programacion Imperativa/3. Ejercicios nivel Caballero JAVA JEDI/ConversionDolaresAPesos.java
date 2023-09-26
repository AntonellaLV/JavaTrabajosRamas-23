// 2. Conversión de dólares a pesos: Escribir un programa en Java que solicite al
// usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una
// tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el
// usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos.


public class ConversionDolaresAPesos {
    public static void main(String[] args) {
        // Definimos la cantidad en dólares
        double dolares = 50.0; // Cambiar este valor según sea necesario

        // Definimos la tasa de cambio (por ejemplo, 1 dólar = 349.38 pesos) 24/09/23
        double tasaCambio = 349.38;

        // Realizamos la conversión a pesos
        double pesos = dolares * tasaCambio;

        // Mostramos el resultado por pantalla
        System.out.println("Cantidad en dolares: $" + dolares);
        System.out.println("Equivalente en pesos: $" + pesos);
    }
}
