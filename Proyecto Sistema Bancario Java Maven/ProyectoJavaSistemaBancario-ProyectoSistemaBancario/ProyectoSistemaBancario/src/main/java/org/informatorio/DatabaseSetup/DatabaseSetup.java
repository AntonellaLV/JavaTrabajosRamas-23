package org.informatorio.DatabaseSetup;

import java.sql.Connection;
import java.sql.Statement;


public class DatabaseSetup {

    public static void ejecutarScript(Connection conexion) {
        String scriptClientes =
                "CREATE TABLE IF NOT EXISTS Clientes ("
                        + "ID INT AUTO_INCREMENT PRIMARY KEY, "
                        + "Nombre VARCHAR(255) NOT NULL, "
                        + "Direccion VARCHAR(255));";

        String scriptCuentas =
                "CREATE TABLE IF NOT EXISTS CuentasBancarias ("
                        + "NumeroCuenta VARCHAR(255) PRIMARY KEY, "
                        + "ClienteID INT, "
                        + "Saldo DECIMAL(10, 2) NOT NULL, "
                        + "Tipo VARCHAR(50) NOT NULL, "
                        + "TasaInteres DECIMAL(5, 2), "
                        + "LimiteSobregiro DECIMAL(10, 2), "
                        + "FOREIGN KEY (ClienteID) REFERENCES Clientes(ID));";

        try (Statement statement = conexion.createStatement()) {
            statement.execute(scriptClientes);
            statement.execute(scriptCuentas);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

