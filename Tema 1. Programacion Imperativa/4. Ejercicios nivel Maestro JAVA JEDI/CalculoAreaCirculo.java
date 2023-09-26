// 1. Cálculo del área de un círculo: Escribir un programa en Java que calcule el área
// de un círculo con un radio de 5 unidades. Buscar la fórmula con la que se resuelve. (Fórmula: Area = π.r2) π = 3.14

public class CalculoAreaCirculo {
    public static void main(String[] args) {
        // Definimos el radio del círculo
        double radio = 5.0; // Cambiar este valor si deseas otro radio

        // Calculamos el área del círculo usando la fórmula
        double area = 3.14 * radio * (radio * radio);

        // Mostramos el resultado en la consola
        System.out.println("El area del circulo es: " + area);
    }
}

