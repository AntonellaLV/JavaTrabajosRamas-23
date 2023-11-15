package org.informatorio.CuentaBancaria;

public interface OperacionesBancarias {
    void depositar(double monto);
    void retirar(double monto);
    double consultarSaldo();
}
