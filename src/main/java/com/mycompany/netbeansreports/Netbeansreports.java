/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.netbeansreports;

import java.sql.SQLException;
import javax.swing.table.JTableHeader;

/**
 *
 * @author mdav3
 */
public class Netbeansreports {

    public static void main(String[] args) throws SQLException {
        inicio logg= new inicio();
        logg.setVisible(true);
        conexion objConexion= new conexion();
        objConexion.establecerConexion();
        

    }
}
