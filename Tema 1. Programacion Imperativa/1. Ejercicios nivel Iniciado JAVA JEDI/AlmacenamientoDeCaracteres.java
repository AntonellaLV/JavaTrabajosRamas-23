// 3. Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre y luego imprimirlos por pantalla.
// ¿Por qué no puede usar "" en el char?

public class AlmacenamientoDeCaracteres {
    public static void main(String[] args) {
        char primerCaracter = 'A';
        char segundoCaracter = 'n';
        char tercerCaracter = 't';
        char cuartoCaracter = 'o';
        char quintoCaracter = 'n';
        char sextoCaracter = 'e';
        char septimoCaracter = 'l';
        char octavoCaracter = 'l';
        char novenoCaracter = 'a';

        System.out.println("Caracter 1: " + primerCaracter);
        System.out.println("Caracter 2: " + segundoCaracter);
        System.out.println("Caracter 3: " + tercerCaracter);
        System.out.println("Caracter 4: " + cuartoCaracter);
        System.out.println("Caracter 5: " + quintoCaracter);
        System.out.println("Caracter 6: " + sextoCaracter);
        System.out.println("Caracter 7: " + septimoCaracter);
        System.out.println("Caracter 8: " + octavoCaracter);
        System.out.println("Caracter 9: " + novenoCaracter);
    }
}
// No se puede utilizar comillas dobles ("") al declarar un char porque las mismas se utilizan para representar cadenas.
// Mientras que las comillas simples se utilizan para caracteres individuales en Java (en este caso).
