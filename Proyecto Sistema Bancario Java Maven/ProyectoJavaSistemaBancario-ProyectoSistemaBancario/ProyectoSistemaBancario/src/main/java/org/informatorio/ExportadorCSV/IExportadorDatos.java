package org.informatorio.ExportadorCSV;

import org.informatorio.CuentaBancaria.CuentaBancaria;

import java.util.List;

public interface IExportadorDatos {
    void exportarDatos(List<CuentaBancaria> cuentas, String pathArchivo);
}

