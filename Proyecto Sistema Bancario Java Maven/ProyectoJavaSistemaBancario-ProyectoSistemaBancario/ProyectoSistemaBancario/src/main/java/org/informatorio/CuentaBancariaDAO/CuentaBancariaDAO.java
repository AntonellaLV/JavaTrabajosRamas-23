package org.informatorio.CuentaBancariaDAO;

import org.informatorio.Cliente.Cliente;
import org.informatorio.ConexionDB.ConexionDB;
import org.informatorio.CuentaBancaria.CuentaBancaria;
import org.informatorio.CuentaAhorro.CuentaAhorro;
import org.informatorio.CuentaCorriente.CuentaCorriente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class CuentaBancariaDAO {

    public void agregarCuenta(CuentaBancaria cuenta) {
        String sql = "INSERT INTO CuentasBancarias (NumeroCuenta, ClienteID, Saldo, Tipo) VALUES (?, ?, ?, ?)";
        try (Connection conexion = ConexionDB.obtenerConexion();
             PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, cuenta.getNumeroCuenta());
            statement.setInt(2, cuenta.getTitular().getId());
            statement.setDouble(3, cuenta.getSaldo());
            statement.setString(4, cuenta.getTipo());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarCuenta(String numeroCuenta) {
        String sql = "DELETE FROM CuentasBancarias WHERE NumeroCuenta = ?";
        try (Connection conexion = ConexionDB.obtenerConexion();
             PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, numeroCuenta);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarSaldo(String numeroCuenta, double nuevoSaldo) {
        String sql = "UPDATE CuentasBancarias SET Saldo = ? WHERE NumeroCuenta = ?";
        try (Connection conexion = ConexionDB.obtenerConexion();
             PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setDouble(1, nuevoSaldo);
            statement.setString(2, numeroCuenta);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public CuentaBancaria buscarCuentaPorNumero(String numeroCuenta) {
        String sql = "SELECT c.*, cl.ID as ClienteID, cl.Nombre, cl.Direccion FROM CuentasBancarias c JOIN Clientes cl ON c.ClienteID = cl.ID WHERE c.NumeroCuenta = ?";
        try (Connection conn = ConexionDB.obtenerConexion();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, numeroCuenta);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String tipo = rs.getString("Tipo");
                //int id= rs.getInt("ClienteID");
                String nombreCliente = rs.getString("Nombre");
                String direccionCliente = rs.getString("Direccion");
                double saldo = rs.getDouble("Saldo");
                double tasaInteres = rs.getDouble("TasaInteres"); // Asumiendo que esto es para cuentas de ahorro
                double limiteSobregiro = rs.getDouble("LimiteSobregiro"); // Para cuentas corrientes

                Cliente titular = new Cliente(nombreCliente, direccionCliente);
                CuentaBancaria cuenta = null;

                if ("Ahorro".equals(tipo)) {
                    cuenta = new CuentaAhorro(numeroCuenta, titular, saldo, tasaInteres);
                } else if ("Corriente".equals(tipo)) {
                    cuenta = new CuentaCorriente(numeroCuenta, titular, saldo, limiteSobregiro);
                }
                return cuenta;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}