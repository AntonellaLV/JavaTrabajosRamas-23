package org.informatorio.Menu;
import org.informatorio.Cliente.Cliente;
import org.informatorio.ConexionDB.ConexionDB;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuPrincipal {
    private final Map<Integer, IOpcionMenu> opciones;
    private final Scanner scanner;

    public MenuPrincipal() {
        this.opciones = new HashMap<>();
        this.scanner = new Scanner(System.in);
        inicializarOpciones();
    }

    private void inicializarOpciones() {
        opciones.put(1, this::registrarCliente);
        opciones.put(2, this::agregarCuenta);
        opciones.put(3, this::eliminarCuenta);
        opciones.put(4, this::depositarEnCuenta);
        opciones.put(5, this::retirarDeCuenta);
        opciones.put(6, this::mostrarSaldoTotal);
        opciones.put(7, this::agregarIntereses);
        opciones.put(8, this::exportarDatosACSV);

    }

    public void mostrar() {
        int seleccion;
        do {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Agregar Cuenta Bancaria");
            System.out.println("3. Eliminar Cuenta Bancaria");
            System.out.println("4. Depositar en Cuenta");
            System.out.println("5. Retirar de Cuenta");
            System.out.println("6. Mostrar Saldo Total de un Cliente");
            System.out.println("7. Agregar Intereses a Cuenta de Ahorro");
            System.out.println("8. Exportar Datos de Cuentas a CSV");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            seleccion = scanner.nextInt();
            scanner.nextLine(); // Limpia el buffer del scanner

            IOpcionMenu opcionSeleccionada = opciones.get(seleccion);
            if (opcionSeleccionada != null) {
                opcionSeleccionada.ejecutar();
            } else if (seleccion != 0) {
                System.out.println("Opción no válida, por favor intenta de nuevo.");
            }
        } while (seleccion != 0);
    }

    private void registrarCliente() {
        System.out.println("Registrar Nuevo Cliente");
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la dirección: ");
        String direccion = scanner.nextLine();

        Cliente nuevoCliente = new Cliente(nombre, direccion);

        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String sql = "INSERT INTO Clientes (Nombre, Direccion) VALUES (?, ?)";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setString(1, nuevoCliente.getNombre());
                statement.setString(2, nuevoCliente.getDireccion());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Cliente registrado con éxito.");
    }


    private void agregarCuenta() {
        System.out.println("Agregar Cuenta Bancaria");
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Ingrese el ID del cliente: ");
        int clienteId = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer del scanner
        System.out.print("Ingrese el tipo de cuenta (Ahorro/Corriente): ");
        String tipo = scanner.nextLine();

        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String sql = "INSERT INTO CuentasBancarias (NumeroCuenta, ClienteID, Saldo, Tipo) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setString(1, numeroCuenta);
                statement.setInt(2, clienteId);
                statement.setDouble(3, 0.0);
                statement.setString(4, tipo);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Cuenta agregada con éxito.");
    }


    private void eliminarCuenta() {
        System.out.println("Eliminar Cuenta Bancaria");
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();

        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String sql = "DELETE FROM CuentasBancarias WHERE NumeroCuenta = ?";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setString(1, numeroCuenta);
                int filasAfectadas = statement.executeUpdate();
                if (filasAfectadas > 0) {
                    System.out.println("Cuenta eliminada con éxito.");
                } else {
                    System.out.println("No se encontró la cuenta.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void depositarEnCuenta() {
        System.out.println("Depositar en Cuenta");
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Ingrese el monto a depositar: ");
        double monto = scanner.nextDouble();
        scanner.nextLine(); // Limpia el buffer del scanner

        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String sql = "UPDATE CuentasBancarias SET Saldo = Saldo + ? WHERE NumeroCuenta = ?";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setDouble(1, monto);
                statement.setString(2, numeroCuenta);
                int filasAfectadas = statement.executeUpdate();
                if (filasAfectadas > 0) {
                    System.out.println("Depósito realizado con éxito.");
                } else {
                    System.out.println("No se encontró la cuenta.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void retirarDeCuenta() {
        System.out.println("Retirar de Cuenta");
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Ingrese el monto a retirar: ");
        double monto = scanner.nextDouble();
        scanner.nextLine(); // Limpia el buffer del scanner

        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String sql = "UPDATE CuentasBancarias SET Saldo = Saldo - ? WHERE NumeroCuenta = ? AND Saldo >= ?";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setDouble(1, monto);
                statement.setString(2, numeroCuenta);
                statement.setDouble(3, monto);
                int filasAfectadas = statement.executeUpdate();
                if (filasAfectadas > 0) {
                    System.out.println("Retiro realizado con éxito.");
                } else {
                    System.out.println("Fondos insuficientes o cuenta no encontrada.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void mostrarSaldoTotal() {
        System.out.println("Mostrar Saldo Total del Cliente");
        System.out.print("Ingrese el ID del cliente: ");
        int clienteId = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer del scanner

        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String sql = "SELECT SUM(Saldo) AS SaldoTotal FROM CuentasBancarias WHERE ClienteID = ?";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setInt(1, clienteId);
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    double saldoTotal = resultSet.getDouble("SaldoTotal");
                    System.out.println("El saldo total del cliente es: " + saldoTotal);
                } else {
                    System.out.println("Cliente no encontrado.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    private void agregarIntereses() {
        System.out.println("Agregar Intereses a Cuenta de Ahorro");
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();

        // Necesitas conocer la tasa de interés para la cuenta de ahorro en este caso
        double tasaInteres = 0.05; // Ejemplo de tasa de interés del 5%

        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String sql = "UPDATE CuentasBancarias SET Saldo = Saldo * (1 + ?) WHERE NumeroCuenta = ? AND Tipo = 'Ahorro'";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setDouble(1, tasaInteres);
                statement.setString(2, numeroCuenta);
                int filasAfectadas = statement.executeUpdate();
                if (filasAfectadas > 0) {
                    System.out.println("Intereses agregados con éxito.");
                } else {
                    System.out.println("Cuenta no encontrada o no es de ahorro.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    private void exportarDatosACSV() {
        System.out.println("Exportar Datos de Cuentas a CSV");
        System.out.print("Ingrese el nombre del archivo CSV: ");
        String nombreArchivo = scanner.nextLine();


        try (Connection conexion = ConexionDB.obtenerConexion();
             FileWriter fileWriter = new FileWriter(nombreArchivo);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            String sql = "SELECT * FROM CuentasBancarias";
            try (PreparedStatement statement = conexion.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {
                printWriter.println("NumeroCuenta,ClienteID,Saldo,Tipo"); // Encabezado del CSV
                while (resultSet.next()) {
                    String numeroCuenta = resultSet.getString("NumeroCuenta");
                    int clienteId = resultSet.getInt("ClienteID");
                    double saldo = resultSet.getDouble("Saldo");
                    String tipo = resultSet.getString("Tipo");
                    printWriter.printf("%s,%d,%f,%s%n", numeroCuenta, clienteId, saldo, tipo);
                }
            }
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Datos exportados con éxito a " + nombreArchivo);
    }


}
