package ComercioElectronico.ejercicio2.servicio.producto;

import ComercioElectronico.ejercicio2.domain.Producto;

import java.util.Optional;

public interface ProductoServicio {
    Optional<Producto> getProductById(Long id);
}