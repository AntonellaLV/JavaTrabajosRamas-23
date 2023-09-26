// 3. Conversión de euros a dólares: Escribir un programa en Java que solicite al
// usuario una cantidad en euros y muestre el equivalente en dólares, utilizando una
// tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y
// el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares.


public class ConversionEurosADolares {
    public static void main(String[] args) {
        // Definimos la cantidad en euros
        double euros = 100.0; // Cambiar este valor según sea necesario

        // Definimos la tasa de cambio (por ejemplo, 1 euro = 1.07 dólares) 24/09/2023
        double tasaCambio = 1.07;

        // Realizamos la conversión a dólares
        double dolares = euros * tasaCambio;

        // Mostramos el resultado por pantalla
        System.out.println("Cantidad en euros: EUR " + euros);
        System.out.println("Equivalente en dolares: $" + dolares);
    }
}
