package ComercioElectronico.ejercicio2.domain;

import java.util.ArrayList;
import java.util.List;

import ComercioElectronico.ejercicio2.basededatos.BdProductos;
import ComercioElectronico.ejercicio2.entrada.InputConsoleService;
import ComercioElectronico.ejercicio2.enums.EstadoPedido;
import ComercioElectronico.ejercicio2.servicio.carrito.CarritoServicio;
import ComercioElectronico.ejercicio2.servicio.carrito.CarritoServicioImpl;

public class Cliente {

    private String name;
    private String adress;
    private String email;
    private String phone;
    private Carrito cart;
    private List<Pedido> orders;
    private CarritoServicio carritoServicio;

    public Cliente(String name, String adress, String email, String phone) {
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.phone = phone;
        this.cart = new Carrito(this);
        this.orders = new ArrayList<>();
        this.carritoServicio = new CarritoServicioImpl(cart);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Carrito getCart() {
        return this.cart;
    }

    public void setCart(Carrito cart) {
        this.cart = cart;
    }

    public List<Pedido> getOrders() {
        return this.orders;
    }

    public void setOrders(List<Pedido> orders) {
        this.orders = orders;
    }

    public void confirmarCarrito() {
        if (carritoServicio.isEmpty()){
            System.out.println("El carrito debe tener al menos un producto");
        } else {
            Pedido pedido = new Pedido(cart, this);
            orders.add(pedido);
            cart = new Carrito(this);
            carritoServicio = new CarritoServicioImpl(cart);
            System.out.println("Gracias por su compra. Puede consultar el estado en 'Mis Pedidos'");
        }
    }

    public void vaciarCarrito() {
        carritoServicio.clear();
        System.out.println("El carrito fue vaciado");
    }

    public void addProduct(){
        System.out.println("Ingrese ID de producto");
        Long id = InputConsoleService.getScanner().nextLong();
        Producto prod = BdProductos.getProductById(id);
        if (prod != null){
            System.out.println("Ingrese la cantidad de " + prod.getNombre() + ":");
            int qty = InputConsoleService.getScanner().nextInt();
            carritoServicio.addProduct(prod, qty);
        } else {
            System.out.println("Producto inexistente, intente nuevamente");
        }
    }

    public void removeProduct(){
        System.out.println("Ingrese ID de producto");
        Long id = InputConsoleService.getScanner().nextLong();
        Producto prod = BdProductos.getProductById(id);
        if (prod != null) {
            if (this.cart.getProductos().containsKey(prod)) {
                System.out.println("Ingrese la cantidad de " + prod.getNombre() + " que desea remover:");
                int qtyToRemove = InputConsoleService.getScanner().nextInt();
                carritoServicio.removeProduct(prod, qtyToRemove);
            } else {
                System.out.println("El producto no se encuentra en el carrito");
            }
        } else {
            System.out.println("Producto inexistente");
        }
    }
}