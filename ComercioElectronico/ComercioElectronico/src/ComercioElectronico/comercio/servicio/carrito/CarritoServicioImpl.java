package ComercioElectronico.comercio.servicio.carrito;

import ComercioElectronico.comercio.Main;
import ComercioElectronico.comercio.basededatos.BdProductos;
import ComercioElectronico.comercio.domain.Pedido;
import ComercioElectronico.comercio.domain.Producto;
import ComercioElectronico.comercio.servicio.pedido.PedidoServicio;
import ComercioElectronico.comercio.servicio.stock.StockServicio;

public class CarritoServicioImpl implements CarritoServicio{

    public static final String MENSAJE_CANTIDAD_MINIMA_TEMPLATE =  "Debe ingresar una cantidad mayor que 0";

    public static final int CANTIDAD_MINIMA = 1;

    public static final String MENSAJE_ALERTA_CANTIDAD_DISPONIBLE_TEMPLATE = "Solo quedan %d productos en stock";


    private StockServicio stockServicio;

    private PedidoServicio pedidoServicio;

    public CarritoServicioImpl(StockServicio stockServicio, PedidoServicio pedidoServicio) {
        this.stockServicio = stockServicio;
        this.pedidoServicio = pedidoServicio;
    }

    @Override
    public void addProduct(Producto prod, int qty) {
        if(qty < CANTIDAD_MINIMA){
            System.out.println(MENSAJE_CANTIDAD_MINIMA_TEMPLATE);
        } else {
            if(prod.getStock() < qty){
                System.out.println(String.format(MENSAJE_ALERTA_CANTIDAD_DISPONIBLE_TEMPLATE,prod.getStock()));
            } else if(Main.getCarritoEnCurso().getProducts().containsKey(prod)){
                /*
                    - El producto ya existe en el carrito
                 */
                int nuevaCantidad = Main.getCarritoEnCurso().getProducts().get(prod) + qty;
                if (qty > BdProductos.getProductById(prod.getId()).getStock()){
                    System.out.println(String.format(MENSAJE_ALERTA_CANTIDAD_DISPONIBLE_TEMPLATE,prod.getStock()));
                }else {
                    stockServicio.modificarCantidad(prod.getId(),qty);
                    Main.getCarritoEnCurso().getProducts().put(prod,nuevaCantidad);
                }
            } else {
                 /*
                    - Carrito vacio
                    - Carrito con productos
                 */
                if (Main.getCarritoEnCurso().getProducts().isEmpty()){
                    //Tratamiento -> Crear el pedido en estado pendiente
                    Pedido pedido = pedidoServicio.crearPedido(Main.getCarritoEnCurso(),null);
                    Main.getCarritoEnCurso().getCliente().getPedidos().add(pedido);
                    Main.getCarritoEnCurso().setPedido(pedido);
                }
                stockServicio.modificarCantidad(prod.getId(),qty);
                Main.getCarritoEnCurso().getProducts().put(prod,qty);
            }
        }
    }

    @Override
    public boolean cerrarCarrito() {
        if (Main.getCarritoEnCurso().getProducts().isEmpty()){
            return false;
        }else {
            pedidoServicio.actualizarPedidoAPagado(Main.getCarritoEnCurso());
            return true;
        }
    }
}
