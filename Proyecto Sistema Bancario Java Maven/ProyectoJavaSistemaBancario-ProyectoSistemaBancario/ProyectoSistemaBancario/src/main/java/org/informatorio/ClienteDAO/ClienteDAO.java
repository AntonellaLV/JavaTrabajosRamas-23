package org.informatorio.ClienteDAO;

import org.informatorio.Cliente.Cliente;
import org.informatorio.ConexionDB.ConexionDB;

import java.sql.*;

public class ClienteDAO {

    public Cliente insertarCliente(Cliente cliente) {
        String sql = "INSERT INTO Clientes (Nombre, Direccion) VALUES (?, ?)";
        ResultSet generatedKeys = null;
        try (Connection conn = ConexionDB.obtenerConexion();
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            conn.setAutoCommit(false);

            pstmt.setString(1, cliente.getNombre());
            pstmt.setString(2, cliente.getDireccion());
            pstmt.executeUpdate();

            generatedKeys = pstmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                int id = generatedKeys.getInt(1);
                cliente.setId(id);
            }

            conn.commit();
            return cliente;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (generatedKeys != null) try { generatedKeys.close(); } catch (SQLException e) { e.printStackTrace(); }
        }

        return cliente;
    }

    public Cliente consultarCliente(int idCliente) {
        String sql = "SELECT * FROM Clientes WHERE ID = ?";
        try (Connection conn = ConexionDB.obtenerConexion();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idCliente);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String nombre = rs.getString("Nombre");
                String direccion = rs.getString("Direccion");
                return new Cliente(nombre, direccion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
