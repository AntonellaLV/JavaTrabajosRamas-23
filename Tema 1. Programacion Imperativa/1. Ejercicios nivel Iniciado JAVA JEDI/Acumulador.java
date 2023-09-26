// 10. Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación
// de quince multiplicaciones entre dos números enteros divididos por el número de la
// multiplicación. Por ejemplo:
// Numero1*Numero2/1 + Numero1*Numero2/2 + … + Numero1*Numero2/15
// El resultado mostrarlo por pantalla.


public class Acumulador {
    public static void main(String[] args) {
        // Definir los dos números enteros
        int numero1 = 5; // Cambiar al primer número deseado
        int numero2 = 3; // Cambiar al segundo número deseado

        // Calcular la acumulación directamente usando la fórmula
        double acumulacion = (double)(numero1 * numero2) * (1.0 / 1 + 1.0 / 2 + 1.0 / 3 + 1.0 / 4 + 1.0 / 5 + 1.0 / 6 + 1.0 / 7 + 1.0 / 8 + 1.0 / 9 + 1.0 / 10 + 1.0 / 11 + 1.0 / 12 + 1.0 / 13 + 1.0 / 14 + 1.0 / 15);

        // Mostrar por pantalla el resultado de la acumulación
        System.out.println("El resultado de la acumulacion es: " + acumulacion);
    }
}
