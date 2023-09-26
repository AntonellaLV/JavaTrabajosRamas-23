// 5. Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en
// otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice
// una constante de los valores que no van a cambiar en esta conversión. Muestre el resultado por pantalla.

public class ConversionKilogramos {
    public static void main(String[] args) {
        // Definimos el valor en libras
        double libras = 187.0; // Cambiar este valor según sea necesario

        // Realizamos la conversión a kilogramos
        double kilogramos = libras * 0.45359237;

        // Mostramos el resultado por pantalla
        System.out.println("Valor en libras: " + libras);
        System.out.println("Valor en kilogramos: " + kilogramos);
    }
}
