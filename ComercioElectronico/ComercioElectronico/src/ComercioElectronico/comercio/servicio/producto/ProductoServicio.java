package ComercioElectronico.comercio.servicio.producto;

import ComercioElectronico.comercio.domain.Producto;

import java.util.Optional;

public interface ProductoServicio {
    Optional<Producto> getProductById(Long id);
}
