package ComercioElectronico.ejercicio2.domain;

import java.util.ArrayList;
import java.util.List;

import ComercioElectronico.ejercicio2.basededatos.BdProductos;
import ComercioElectronico.ejercicio2.entrada.InputConsoleService;
import ComercioElectronico.ejercicio2.enums.EstadoPedido;

public class Cliente {

    private String name;
    private String adress;
    private String email;
    private String phone;
    private Carrito cart;
    private List<Pedido> orders;

    public Cliente(String name, String adress, String email, String phone) {
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.phone = phone;
        this.cart = new Carrito(this);
        this.orders = new ArrayList<>();
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
        if (cart.isEmpty()){
            System.out.println("El carrito debe tener al menos un producto");
        } else {
            Pedido pedido = new Pedido(cart, this);
            orders.add(pedido);
            cart = new Carrito(this);
            System.out.println("Gracias por su compra. Puede consultar el estado en 'Mis Pedidos'");
        }
    }

    public void vaciarCarrito() {
        cart.clear();
        System.out.println("El carrito fue vaciado");
    }

    public void addProduct(){
        System.out.println("Ingrese ID de producto");
        Long id = InputConsoleService.getScanner().nextLong();
        Producto prod = BdProductos.getProductById(id);
        if (prod!=null){
            System.out.println("Ingrese la cantidad de " + prod.getNombre() + ":");
            int qty = InputConsoleService.getScanner().nextInt();
            if (this.cart.getProductos().containsKey(prod)){
                this.cart.modifyQty(prod, qty);
            } else {
                this.cart.addProduct(prod, qty);
            }
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
                int currentQty = this.cart.getProductos().get(prod);
                if (currentQty > qtyToRemove) {
                    this.cart.modifyQty(prod, currentQty - qtyToRemove);
                } else {
                    this.cart.removeProduct(prod);
                }
            } else {
                System.out.println("El producto no se encuentra en el carrito");
            }
        } else {
            System.out.println("Producto inexistente");
        }
    }
}