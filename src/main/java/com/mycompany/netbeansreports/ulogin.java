/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.netbeansreports;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author mdav3
 */
public class ulogin {
    public void validaU(JTextField usuario, JPasswordField contraseña){
    
        try {
            ResultSet rs=null;           
            PreparedStatement ps= null;
            
            conexion objetoConexion = new conexion();
            
            String consulta="select * from usuario where nombre =? and passW=?;";
            ps=objetoConexion.establecerConexion().prepareStatement(consulta);
            
            String contra = String.valueOf(contraseña.getPassword());
            
            ps.setString(1, usuario.getText());
            ps.setString(2,contra);
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
                
                JOptionPane.showMessageDialog(null,"El Usuario es Correcto");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"El Usuario es INCORRECTO, VUELVA A INTENTAR");
            }
            
      
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR: "+e.toString());
        }
    }
}
