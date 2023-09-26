// 6. Conversión de bitcoins a dólares: Escribir un programa en Java que solicite al
// usuario una cantidad en bitcoins y muestre el equivalente en dólares, utilizando una
// tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 bitcoin = 50000
// dólares, y el usuario ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares.

public class ConversionBitcoinsADolares {
    public static void main(String[] args) {
        // Definimos el valor en bitcoins
        double bitcoins = 0.5; // Cambiar este valor según sea necesario

        // Definimos la tasa de cambio fija
        double tasaCambio = 26505.0; // 1 bitcoin = 26,505 dólares (24/09/2023)

        // Realizamos la conversión a dólares
        double dolares = bitcoins * tasaCambio;

        // Mostramos el resultado por pantalla
        System.out.println("Valor en bitcoins: " + bitcoins);
        System.out.println("Valor en dolares: " + dolares);
    }
}
