package ComercioElectronico.comercio.servicio.menu.pedido;

import ComercioElectronico.comercio.Main;
import ComercioElectronico.comercio.domain.Pedido;
import ComercioElectronico.comercio.entrada.InputConsoleService;
import ComercioElectronico.comercio.enums.EstadoPedido;
import ComercioElectronico.comercio.servicio.pedido.PedidoServicio;

import java.util.List;

public class MenuPedidoImpl implements MenuPedidos{

    public static final String MENSAJE_SELECCIONAR_TIPO_PEDIDO = "Selecciona por favor el tipo de pedido";

    private PedidoServicio pedidoServicio;

    public MenuPedidoImpl(PedidoServicio pedidoServicio) {
        this.pedidoServicio = pedidoServicio;
    }

    @Override
    public void mostrarPedidos() {
        System.out.println(MENSAJE_SELECCIONAR_TIPO_PEDIDO);
        System.out.println("TIPO DE PEDIDOS : " + EstadoPedido.PENDIENTE + " - " + EstadoPedido.PAGADO);
        String tipoPedido = InputConsoleService.getScanner().next();

        EstadoPedido tipoPedidoSeleccionado = getPedidoSeleccionado(tipoPedido.toUpperCase().replace(" ",""));

        List<Pedido> pedidos = pedidoServicio.obtenerPedidos(tipoPedidoSeleccionado,Main.getCarritoEnCurso().getCliente());

        if (!pedidos.isEmpty()){
            for (Pedido pedido : pedidos) {
                System.out.println(pedido.toString());
            }
        }else {
            System.out.println("No existen pedidos para el tipo ingresado");
        }
    }

    private EstadoPedido getPedidoSeleccionado(String tipoPedido){

        return switch (EstadoPedido.valueOf(tipoPedido)){
            case PENDIENTE ->  EstadoPedido.PENDIENTE;
            case PAGADO ->  EstadoPedido.PAGADO;
            default ->  null;
        };

    }

}
