package org.informatorio.Cliente;

import org.informatorio.CuentaBancaria.CuentaBancaria;

import java.util.List;


public class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private List<CuentaBancaria> cuentas;

    // Constructor
    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Getters y setters
    public int getId() {
        return 0;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<CuentaBancaria> cuentas) {
        this.cuentas = cuentas;
    }


}
