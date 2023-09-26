// 7. Multiplicación: Se le solicita que guarde dos números reales y los multiplique,
// luego guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de
// memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o real? ¿Por qué?

public class Multiplicacion {
    public static void main(String[] args) {
        // Multiplicación de dos números reales
        double numeroReal1 = 3.5;
        double numeroReal2 = 2.0;
        double resultadoReal = numeroReal1 * numeroReal2;

        // Multiplicación de dos números enteros
        int numeroEntero1 = 5;
        int numeroEntero2 = 2;
        int resultadoEntero = numeroEntero1 * numeroEntero2;

        // Suma de las dos multiplicaciones
        double suma = resultadoReal + resultadoEntero;

        System.out.println("Resultado de la multiplicacion de numeros reales: " + resultadoReal);
        System.out.println("Resultado de la multiplicacion de numeros enteros: " + resultadoEntero);
        System.out.println("Suma de las dos multiplicaciones: " + suma);
    }
}

// ¿Que resultado le da? ¿Entero o real? ¿Por qué?:
// El resultado es un número real (double) debido a la conversión implícita o automática
// de resultadoReal sumado con resultadoEntero.