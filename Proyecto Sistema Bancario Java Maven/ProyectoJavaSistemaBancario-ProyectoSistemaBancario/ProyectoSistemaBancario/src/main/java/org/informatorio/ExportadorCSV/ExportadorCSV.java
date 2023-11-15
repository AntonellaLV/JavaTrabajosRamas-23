package org.informatorio.ExportadorCSV;

import org.informatorio.CuentaAhorro.CuentaAhorro;
import org.informatorio.CuentaBancaria.CuentaBancaria;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExportadorCSV implements IExportadorDatos {

    @Override
    public void exportarDatos(List<CuentaBancaria> cuentas, String pathArchivo) {
        try (FileWriter csvWriter = new FileWriter(pathArchivo)) {
            csvWriter.append("Número de Cuenta,Nombre Titular,Saldo,Tipo\n");

            for (CuentaBancaria cuenta : cuentas) {
                String tipoCuenta = cuenta instanceof CuentaAhorro ? "Ahorro" : "Corriente";
                csvWriter.append(String.join(",",
                        cuenta.getNumeroCuenta(),
                        cuenta.getTitular().getNombre(),
                        String.valueOf(cuenta.getSaldo()),
                        tipoCuenta));
                csvWriter.append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
