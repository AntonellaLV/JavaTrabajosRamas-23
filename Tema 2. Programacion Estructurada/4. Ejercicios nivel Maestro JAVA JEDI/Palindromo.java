// 5. Será Palíndromo?: Dado un arreglo con caracteres (Formando una palabra) indicar
// si es o no palíndromo.

public class Palindromo {
    public static void main(String[] args) {
        char[] palabra = {'a', 'n', 'i', 't', 'a', 'l', 'a', 'v', 'a', 'l', 'a', 't', 'i', 'n', 'a'};

        if (esPalindromo(palabra)) {
            System.out.println("El arreglo forma una palabra palindroma.");
        } else {
            System.out.println("El arreglo no forma una palabra palindroma.");
        }
    }

    public static boolean esPalindromo(char[] palabra) {
        int inicio = 0;
        int fin = palabra.length - 1;

        while (inicio < fin) {
            if (palabra[inicio] != palabra[fin]) {
                return false;
            }
            inicio++;
            fin--;
        }
        return true;
    }
}
