package org.informatorio.ConexionDB;

import org.informatorio.ClienteDAO.ClienteDAO;
import org.informatorio.CuentaBancariaDAO.CuentaBancariaDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/ProyectoSistemaBancario";
    private static final String USER = "root";
    private static final String PASSWORD = "root12345";

    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

