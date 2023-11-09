package ComercioElectronico.comercio;


import ComercioElectronico.comercio.basededatos.BdProductos;
import ComercioElectronico.comercio.domain.Carrito;
import ComercioElectronico.comercio.domain.Cliente;
import ComercioElectronico.comercio.entrada.InputConsoleService;
import ComercioElectronico.comercio.servicio.carrito.CarritoServicio;
import ComercioElectronico.comercio.servicio.carrito.CarritoServicioImpl;
import ComercioElectronico.comercio.servicio.menu.compra.MenuCompra;
import ComercioElectronico.comercio.servicio.menu.compra.MenuCompraImpl;
import ComercioElectronico.comercio.servicio.menu.pedido.MenuPedidoImpl;
import ComercioElectronico.comercio.servicio.menu.pedido.MenuPedidos;
import ComercioElectronico.comercio.servicio.menu.principal.MenuPrincipal;
import ComercioElectronico.comercio.servicio.menu.principal.MenuPrincipalImpl;
import ComercioElectronico.comercio.servicio.menu.producto.MenuProducto;
import ComercioElectronico.comercio.servicio.menu.producto.MenuProductoImpl;
import ComercioElectronico.comercio.servicio.pedido.PedidoServicioImpl;
import ComercioElectronico.comercio.servicio.producto.ProductoServicioImpl;
import ComercioElectronico.comercio.servicio.stock.StockServicioImpl;

import java.util.HashMap;

public class Main {

    private static Carrito carritoEnCurso;

    public static void main(String[] args) {
        BdProductos.initProducts();
        //Creacion del cliente
        createClient();
        //Creacion de scanner
        InputConsoleService.createScanner();

        CarritoServicio carritoServicio = new CarritoServicioImpl(new StockServicioImpl(), new PedidoServicioImpl());
        MenuCompra menuCompra = new MenuCompraImpl(new ProductoServicioImpl());
        MenuPedidos menuPedidos = new MenuPedidoImpl(new PedidoServicioImpl());
        MenuProducto menuProducto = new MenuProductoImpl();

        MenuPrincipal menuPrincipal = new MenuPrincipalImpl(carritoServicio,menuCompra,menuPedidos,menuProducto);
        menuPrincipal.iniciar();

        //Cerrar el scanner
        InputConsoleService.closeScanner();
    }

    public static Carrito getCarritoEnCurso() {
        return carritoEnCurso;
    }

    public static void setCarritoEnCurso(Carrito carritoEnCurso) {

        carritoEnCurso.setId(1L);
        carritoEnCurso.setPedido(null);
        carritoEnCurso.setProducts(new HashMap<>());

        Main.carritoEnCurso = carritoEnCurso;
    }

    private static void createClient(){
        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNombre("Antonella");
        cliente.setDireccion("Avenida Siempre Viva");
        cliente.setEmail("CorreoFalso@gmail.com");
        cliente.setCarrito(new Carrito());
        setCarritoEnCurso(cliente.getCarrito());
        getCarritoEnCurso().setCliente(cliente);
    }

}
