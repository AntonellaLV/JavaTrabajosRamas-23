// 5. Conversión de pesos a euros: Escribir un programa en Java que solicite al usuario
// una cantidad en pesos y muestre el equivalente en euros, utilizando una tasa de
// cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 20 pesos, y el usuario
// ingresa 5000 pesos, el programa deberá mostrar 250 euros.


public class ConversionPesosAEuros {
    public static void main(String[] args) {
        // Definimos la cantidad en pesos
        double pesos = 5000.0; // Cambiar este valor según sea necesario

        // Definimos la tasa de cambio (por ejemplo, 1 euro = 372.39 pesos) 24/09/2023
        double tasaCambio = 372.39;

        // Realizamos la conversión a euros
        double euros = pesos / tasaCambio;

        // Mostramos el resultado por pantalla
        System.out.println("Cantidad en pesos: $" + pesos);
        System.out.println("Equivalente en euros: EUR " + euros);
    }
}
