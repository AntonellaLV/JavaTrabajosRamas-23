// 2. Suma de dos números bis: Se les solicita que guarden dos números enteros y los sumen.
// El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que
// indique si se trata de un número par o impar.
// El mensaje debe tener el siguiente formato:
// “El resultado es “ {Resultado} “y es” {paridad}

public class SumaDeDosNumerosBis {
    public static void main(String[] args) {
        int numero1 = 8; // Primer número (Cambiar por el primer n° deseado)
        int numero2 = 3; // Segundo número (Cambiar por el segundo n° deseado)

        int suma = numero1 + numero2;
        String paridad = (suma % 2 == 0) ? "par" : "impar";

        System.out.println("El resultado es \"" + suma + "\" y es \"" + paridad + "\".");
    }
}
