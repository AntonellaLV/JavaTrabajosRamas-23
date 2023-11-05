package CaballeroJavaJedi3.diccionario;

import java.util.HashMap;

public class Diccionario {
    private String nombre;
    private HashMap<String, Palabra> palabras;

    public Diccionario(String nombre) {
        this.nombre = nombre;
        this.palabras = new HashMap<>();
    }

    public void agregarPalabra(Palabra palabra) {
        palabras.put(palabra.getPalabra(), palabra);
    }

    public Palabra buscarDefinicion(String palabra) {
        return palabras.get(palabra);
    }

    public void mostrarTodasLasPalabras() {
        for (Palabra palabra : palabras.values()) {
            System.out.println(palabra);
        }
    }
}
