// 2. Conversión de grados Celsius a grados Fahrenheit : Escribir un programa en
// Java que convierta una temperatura en grados Celsius a grados Fahrenheit. Buscar
// la fórmula con la que se resuelve. Formula (F = 9/5.C + 32).

public class ConversionCelsiusToFahrenheit {
    public static void main(String[] args) {
        // Definimos la temperatura en grados Celsius
        double celsius = 25.0; // Cambiar este valor según sea necesario

        // Realizamos la conversión a grados Fahrenheit
        double fahrenheit = (9.0 / 5.0) * celsius + 32.0;

        // Mostramos el resultado por pantalla
        System.out.println("Temperatura en grados Celsius: " + celsius);
        System.out.println("Temperatura en grados Fahrenheit: " + fahrenheit);
    }
}
