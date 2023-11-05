package CaballeroJavaJedi3.diccionario;

public class Palabra {
    private String palabra;
    private String definicion;

    public Palabra(String palabra, String definicion) {
        this.palabra = palabra;
        this.definicion = definicion;
    }

    public String getPalabra() {
        return palabra;
    }

    public String getDefinicion() {
        return definicion;
    }

    @Override
    public String toString() {
        return "Palabra: " + palabra + ", Definición: " + definicion;
    }
}

