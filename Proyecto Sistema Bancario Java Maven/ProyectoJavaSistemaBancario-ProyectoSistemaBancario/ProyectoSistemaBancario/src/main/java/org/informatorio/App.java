package org.informatorio;

import org.informatorio.Cliente.Cliente;
import org.informatorio.ConexionDB.ConexionDB;
import org.informatorio.CuentaAhorro.CuentaAhorro;
import org.informatorio.CuentaBancaria.CuentaBancaria;
import org.informatorio.CuentaBancaria.OperacionesBancarias;
import org.informatorio.ExportadorCSV.IExportadorDatos;
import org.informatorio.ExportadorCSV.ExportadorCSV;
import org.informatorio.CuentaCorriente.CuentaCorriente;
import org.informatorio.Menu.MenuPrincipal;
import org.informatorio.Menu.IOpcionMenu;
import org.informatorio.ClienteDAO.ClienteDAO;
import org.informatorio.CuentaBancariaDAO.CuentaBancariaDAO;
import org.informatorio.Banco.Banco;
import org.informatorio.DatabaseSetup.DatabaseSetup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class App {
    public static void main(String[] args) {
        // Inicializar la base de datos
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            // Ejecutar el script para configurar la base de datos
            DatabaseSetup.ejecutarScript(conexion);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al conectar con la base de datos o al inicializarla.");
            return; // Finalizar la ejecución si no se puede establecer la conexión o inicializar la DB
        }

        // Lanzar el menú principal
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.mostrar();
    }
}
