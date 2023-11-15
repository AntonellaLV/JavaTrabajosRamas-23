package org.informatorio.CuentaAhorro;

import org.informatorio.Cliente.Cliente;
import org.informatorio.CuentaBancaria.CuentaBancaria;

public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorro(String numeroCuenta, Cliente titular, double saldo, double tasaInteres) {
        super(numeroCuenta, titular, saldo);
        this.tasaInteres = tasaInteres;
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
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            throw new IllegalArgumentException("Fondos insuficientes para retirar.");
        }
    }

    public void agregarIntereses() {
        double interes = saldo * tasaInteres / 100;
        saldo += interes;
    }

    // Getters y setters
    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
}
