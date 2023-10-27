package ComercioElectronico.ejercicio2.domain;

import ComercioElectronico.ejercicio2.enums.EstadoPedido;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Pedido {

    private Long id;
    private Cliente client;
    private LocalDate date;
    private Carrito cart;
    private EstadoPedido status;

    private static Long autoGeneratedId = 0l;

    public Pedido(Carrito carrito, Cliente cliente) {
        this.id = autoGenerateID();
        this.client = cliente;
        this.date = LocalDate.now();
        this.cart = carrito;
        this.status = EstadoPedido.PENDIENTE;
    }
    public void displayOrder() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("-".repeat(35));
        System.out.println("id " + this.getId() + " - " + this.date.format(fmt) + " - Cliente: " + this.client.getName());
        System.out.println("-".repeat(35));
        this.cart.displayCart();  // Nueva corrección, usamos displayCart() que es el nuevo método
        System.out.println("-".repeat(35));
        System.out.println("Total de compra: " + String.format("%.2f", this.calcularMonto()) + "\nEstado: " + this.status);
        System.out.println("-".repeat(35));
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getClient() {
        return this.client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Carrito getCart() {
        return this.cart;
    }

    public void setCart(Carrito cart) {
        this.cart = cart;
    }

    public EstadoPedido getStatus() {
        return this.status;
    }

    public void setStatus(EstadoPedido status) {
        this.status = status;
    }

    public static Long autoGenerateID() {
        return ++autoGeneratedId;
    }

    public void payed() {
        this.status = EstadoPedido.PAGADO;
    }

    public void sent() {
        this.status = EstadoPedido.ENVIADO;
    }

    public void delivered() {
        this.status = EstadoPedido.ENTREGADO;
    }

    public Double calcularMonto() {
        return cart.getProductos().entrySet().stream().mapToDouble(entry -> entry.getKey().getPrecio() * entry.getValue()).sum();
    }
}
