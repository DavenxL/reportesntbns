/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.netbeansreports;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mdav3
 */
public class conexion {
    Connection conectar=null;
    String user= "root";
    String pw="Mysql3002f";
    String bd="reportsl";
    String ip="localhost";
    String puerto="3306";
    String cadena= "jdbc:mysql://" + ip+ ":"+puerto+ "/"+ bd;
    

    public Connection establecerConexion() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conectar = DriverManager.getConnection(cadena, user, pw);
            System.out.println("Conexión exitosa!");
            return conectar;
        } catch (ClassNotFoundException e) {
            System.err.println("Error cargando el driver: " + e.getMessage());
            return null;
        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
            return null;
        }
    }
}
