/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.persistencia;

import java.sql.*;

/**
 *
 * @author SimonValera
 */
public abstract class DAO {

    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;

    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";

    protected void conectarBase() throws ClassNotFoundException, SQLException {

        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?urlSSL-false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);

        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }

    }

    protected void desconectarBase() throws Exception {

        try {
            if (resultado != null) {
                resultado.close();

            }
            if (conexion != null) {
                conexion.close();

            }
            if (sentencia!= null) {
                sentencia.close();
            }

        } catch (SQLException e) {
            throw e;
        }

    }

    protected void insertarModificarEliminar(String sql) throws Exception {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);

        } catch (SQLException | ClassNotFoundException e) {
            throw e;
        } finally {
            desconectarBase();
        }

    }
    
    protected void consultarBase(String sql) throws Exception{
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            
            
            
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }

}
