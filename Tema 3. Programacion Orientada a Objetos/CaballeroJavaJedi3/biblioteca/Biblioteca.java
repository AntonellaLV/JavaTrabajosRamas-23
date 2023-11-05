package CaballeroJavaJedi3.biblioteca;

import java.util.HashMap;
import java.util.stream.Collectors;

public class Biblioteca {
    private HashMap<String, Libro> libros;

    public Biblioteca() {
        this.libros = new HashMap<>();
    }

    public void registrarLibro(Libro libro) {
        libros.put(libro.getTitulo(), libro);
    }

    public Libro buscarPorTitulo(String titulo) {
        return libros.get(titulo);
    }

    public HashMap<String, Libro> buscarPorAutor(Autor autor) {
        return libros.entrySet()
                .stream()
                .filter(entry -> entry.getValue().getAutor().equals(autor))
                .collect(Collectors.toMap(HashMap.Entry::getKey, HashMap.Entry::getValue, (e1, e2) -> e1, HashMap::new));
    }
}
