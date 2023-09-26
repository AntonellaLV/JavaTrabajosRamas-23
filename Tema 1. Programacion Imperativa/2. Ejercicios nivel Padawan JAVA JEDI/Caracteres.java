// 3. Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
// en unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char? ¿Qué es unicode?
// El código Unicode es un estándar de codificación de caracteres que asigna un número único (un código)
// a cada carácter de casi todos los sistemas de escritura conocidos.
// las comillas dobles se utilizan para representar cadenas de caracteres (strings),
// mientras que las comillas simples ('') se utilizan para representar caracteres individuales.


public class Caracteres {
    public static void main(String[] args) {
        char letraA = '\u0041'; // El código Unicode para 'A' es '\u0041'
        char letraN = '\u004E'; // El código Unicode para 'N' es '\u004E'
        char letraT = '\u0054'; // El código Unicode para 'T' es '\u0054'
        char letraO = '\u004F'; // El código Unicode para 'O' es '\u004F'
        char letraE = '\u0045'; // El código Unicode para 'E' es '\u0045'
        char letraL1 = '\u004C'; // El código Unicode para 'L' es '\u004C'
        char letraL2 = '\u004C'; // El código Unicode para 'L' es '\u004C'
        char letraA2 = '\u0041'; // El código Unicode para 'A' es '\u0041'

        // Imprimimos los caracteres por pantalla
        System.out.println("Nombre: " + letraA + letraN + letraT + letraO + letraN + letraE + letraL1 + letraL2 + letraA2);
    }
}

