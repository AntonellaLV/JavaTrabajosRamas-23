package CaballeroJavaJedi3.diccionario;

import CaballeroJavaJedi3.diccionario.Diccionario;
import CaballeroJavaJedi3.diccionario.Palabra;

import java.util.Scanner;

public class PrincipalDiccionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Diccionario diccionario = new Diccionario("Diccionario Español");

        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Agregar palabra");
            System.out.println("2. Buscar definición");
            System.out.println("3. Mostrar todas las palabras");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el newline

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la palabra: ");
                    String palabra = scanner.nextLine();
                    System.out.print("Ingrese la definición: ");
                    String definicion = scanner.nextLine();
                    diccionario.agregarPalabra(new Palabra(palabra, definicion));
                    break;
                case 2:
                    System.out.print("Ingrese la palabra a buscar: ");
                    palabra = scanner.nextLine();
                    Palabra palabraBuscada = diccionario.buscarDefinicion(palabra);
                    if (palabraBuscada != null) {
                        System.out.println(palabraBuscada);
                    } else {
                        System.out.println("Palabra no encontrada.");
                    }
                    break;
                case 3:
                    diccionario.mostrarTodasLasPalabras();
                    break;
                case 4:
                    continuar = false;
                    break;
            }
        }
    }
}
