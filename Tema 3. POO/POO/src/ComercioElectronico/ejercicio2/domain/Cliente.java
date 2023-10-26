package ComercioElectronico.ejercicio2.domain;

import java.time.LocalDate;
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

    public void confirmCarrito (){
        if (this.getCart().getOrder().isEmpty()){
            System.out.println("El carrito debe tener un producto al menos");
        } else {
            Pedido order = new Pedido();
            order.setCart(this.getCart());
            order.setClient(this);
            order.setDate(LocalDate.now());
            order.setId(Pedido.autoGenerateID());
            order.setStatus(EstadoPedido.PENDIENTE);
            this.orders.add(order);
            this.setCart(new Carrito(this));
            System.out.println("Gracias por su compra, puede consultar el estado de su pedido en 'Mis Pedidos'");
        }
    }

    public void emptyCart(){
        this.getCart().getOrder().clear();
        System.out.println("El carrito fue vaciado");
    }

    public void addProduct(){
        InputConsoleService.getScanner();
        System.out.println("Ingrese ID de producto");
        Long id = InputConsoleService.getScanner().nextLong();
        Producto prod = BdProductos.getProductById(id);
        if (prod!=null){
            System.out.println("Ingrese la cantidad de " + prod.getNombre() + ":");
            int qty = InputConsoleService.getScanner().nextInt();
            if (this.cart.getOrder().containsKey(prod)){
                this.cart.modifyQty(prod, qty);
            } else {
                this.cart.addProduct(prod, qty);
            }
        } else {
            System.out.println("Producto inexistente, intente nuevamente");
        }
    }

    public void removeProduct(){
        InputConsoleService.getScanner();
        System.out.println("Ingrese ID de producto");
        Long id = InputConsoleService.getScanner().nextLong();
        Producto prod = BdProductos.getProductById(id);
        System.out.println("Ingrese la cantidad de " + prod.getNombre() + ":");
        int qty = InputConsoleService.getScanner().nextInt();
        if (this.cart.getOrder().containsKey(prod)){
            this.cart.modifyQty(prod, qty);
        } else {
            System.out.println("El producto no se encuentra en el carrito");
        }
    }

    public void getOrdersToString(){
        String sel;
        System.out.println("Filtrar por estado:");
        System.out.println("1 - Pendiente");
        System.out.println("2 - Pagado");
        System.out.println("3 - Enviado");
        System.out.println("4 - Entregado");
        System.out.println("0 - Todos los pedidos");
        sel = String.format("%d", InputConsoleService.getScanner().nextInt());
        while (!List.of("1","2","3","4", "0").contains(sel)){
            System.out.println("Estado incorrecto, intente nuevamente");
            sel = String.format("%d", InputConsoleService.getScanner().nextInt());
        }
        if (sel.equals("0")){
            for(Pedido order : orders){
                order.orderToString();
            }
        } else {
            EstadoPedido status = EstadoPedido.values()[Integer.parseInt(sel)-1];
            for(Pedido order : orders){
                if(order.getStatus() == status){
                    order.orderToString();
                }
            }
        }
    }
}