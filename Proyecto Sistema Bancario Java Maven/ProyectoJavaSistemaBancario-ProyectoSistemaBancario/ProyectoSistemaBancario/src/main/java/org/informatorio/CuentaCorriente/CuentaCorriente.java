package org.informatorio.CuentaCorriente;

import org.informatorio.Cliente.Cliente;
import org.informatorio.CuentaBancaria.CuentaBancaria;

public class CuentaCorriente extends CuentaBancaria {
    private double limiteSobregiro;

    public CuentaCorriente(String numeroCuenta, Cliente titular, double saldo, double limiteSobregiro) {
        super(numeroCuenta, titular, saldo);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            throw new IllegalArgumentException("El monto a depositar debe ser positivo.");
        }
    }

    @Override
    public void retirar(double monto) {
        if (monto <= saldo + limiteSobregiro) {
            saldo -= monto;
        } else {
            throw new IllegalArgumentException("Límite de sobregiro excedido.");
        }
    }

    // Getters y setters
    public double getLimiteSobregiro() {
        return limiteSobregiro;
    }

    public void setLimiteSobregiro(double limiteSobregiro) {
        this.limiteSobregiro = limiteSobregiro;
    }
}


