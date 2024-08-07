/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.netbeansreports;

import com.itextpdf.text.BaseColor;
import java.awt.BorderLayout;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException  ;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable  ;
import com.itextpdf.text.pdf.PdfWriter  ;
import java.io.FileOutputStream;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import static java.time.Instant.now;

/**
 *
 * @author mdav3
 */
public class reportM extends javax.swing.JFrame {

    /**
     * Creates new form reportM
     */
    public reportM() {
        initComponents();

    }
    
    
    public void reporttodo() {
    try {
        ResultSet rs = null;
        PreparedStatement ps = null;

        conexion objetoConexion = new conexion();

        // Consulta SQL para seleccionar los datos de la tabla "alumnos"
        String consulta = "SELECT id, nombres, apellidos, estado, edad, carrera FROM alumnos";
        ps = objetoConexion.establecerConexion().prepareStatement(consulta);

        rs = ps.executeQuery();

        // Crear un modelo de tabla para almacenar los datos
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Estado");
        modelo.addColumn("Edad");
        modelo.addColumn("Carrera");

        // Iterar sobre los resultados de la consulta y los agrega sobre la tabla
        while (rs.next()) {
            Object[] fila = new Object[6];
            fila[0] = rs.getInt("id");
            fila[1] = rs.getString("nombres");
            fila[2] = rs.getString("apellidos");
            fila[3] = rs.getString("estado");
            fila[4] = rs.getString("edad");
            fila[5] = rs.getString("carrera");
            modelo.addRow(fila);
        }

        // Asignar el modelo de tabla a la tabla `tablatodo`
        tablatodo.setModel(modelo);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
    }
}
    
    public void reporta() {
    try {
        ResultSet rs = null;
        PreparedStatement ps = null;

        conexion aobjetoConexion = new conexion();

        // Consulta SQL para seleccionar los datos de la tabla "alumnos"
        String consulta = "SELECT id, nombres, apellidos FROM alumnos";
        ps = aobjetoConexion.establecerConexion().prepareStatement(consulta);

        rs = ps.executeQuery();

        // Crear un modelo de tabla para almacenar los datos
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");

        // Iterar sobre los resultados de la consulta y los agrega sobre la tabla
        while (rs.next()) {
            Object[] fila = new Object[6];
            fila[0] = rs.getInt("id");
            fila[1] = rs.getString("nombres");
            fila[2] = rs.getString("apellidos");
            modelo.addRow(fila);
        }

        // Asignar el modelo de tabla a la tabla `tablatodo`
        tablaal.setModel(modelo);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
    }
}

    public void reporte() {
    try {
        ResultSet rs = null;
        PreparedStatement ps = null;

        conexion eobjetoConexion = new conexion();

        // Consulta SQL para seleccionar los datos de la tabla "alumnos"
        String estadoTexto=txtest.getText();
        String consulta = "SELECT id, nombres, apellidos,estado FROM alumnos WHERE estado = ?";
        ps = eobjetoConexion.establecerConexion().prepareStatement(consulta);
        ps.setString(1, estadoTexto);   
        rs = ps.executeQuery();

        // Crear un modelo de tabla para almacenar los datos
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Estado");


        // Iterar sobre los resultados de la consulta y los agrega sobre la tabla
        while (rs.next()) {
            Object[] fila = new Object[6];
            fila[0] = rs.getInt("id");
            fila[1] = rs.getString("nombres");
            fila[2] = rs.getString("apellidos");
            fila[3] = rs.getString("estado");
            modelo.addRow(fila);
        }

        // Asignar el modelo de tabla a la tabla `tablatodo`
        tablaestado.setModel(modelo);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnestado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaal = new javax.swing.JTable();
        btnalumno = new javax.swing.JButton();
        btntodo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablatodo = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaestado = new javax.swing.JTable();
        txtcarrera = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtestado = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        radio3 = new javax.swing.JRadioButton();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        txtedad = new javax.swing.JTextField();
        txtest = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnCon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnestado.setText("Estados");
        btnestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnestadoActionPerformed(evt);
            }
        });

        tablaal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nombres", "apellidos", "ID"
            }
        ));
        jScrollPane1.setViewportView(tablaal);

        btnalumno.setText("Alumnos");
        btnalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalumnoActionPerformed(evt);
            }
        });

        btntodo.setText("Todos los datos");
        btntodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntodoActionPerformed(evt);
            }
        });

        tablatodo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "estado", "nombres", "apellidos", "edad", "carrera", "id"
            }
        ));
        jScrollPane2.setViewportView(tablatodo);

        tablaestado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nombres", "apellidos", "ID", "estado"
            }
        ));
        jScrollPane3.setViewportView(tablaestado);

        txtcarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcarreraActionPerformed(evt);
            }
        });

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        txtestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestadoActionPerformed(evt);
            }
        });

        txtnombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombresActionPerformed(evt);
            }
        });

        txtapellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidosActionPerformed(evt);
            }
        });

        radio3.setText("Eliminar(por id)");
        radio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio3ActionPerformed(evt);
            }
        });

        radio1.setText("Registrar");
        radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1ActionPerformed(evt);
            }
        });

        radio2.setText("Modificar(por id)");
        radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio2ActionPerformed(evt);
            }
        });

        txtedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadActionPerformed(evt);
            }
        });

        txtest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestActionPerformed(evt);
            }
        });

        btnCon.setText("Confirmar");
        btnCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(txtid)
                .addGap(1, 1, 1)
                .addComponent(txtestado)
                .addGap(6, 6, 6)
                .addComponent(txtnombres)
                .addGap(6, 6, 6)
                .addComponent(txtapellidos)
                .addGap(6, 6, 6)
                .addComponent(txtedad)
                .addGap(16, 16, 16)
                .addComponent(txtcarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(radio1)
                        .addGap(63, 63, 63)
                        .addComponent(radio2)
                        .addGap(42, 42, 42)
                        .addComponent(radio3)
                        .addGap(44, 44, 44)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnestado)
                            .addComponent(txtest, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btntodo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnalumno)
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCon)
                .addGap(211, 211, 211))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radio2)
                        .addComponent(radio1)
                        .addComponent(radio3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCon)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnestado)
                        .addGap(17, 17, 17)
                        .addComponent(txtest, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btntodo)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnalumno))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnestadoActionPerformed
     int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea guardar el reporte por estado?", "Confirmar", JOptionPane.YES_NO_OPTION);
     reporte();

    if (respuesta == JOptionPane.YES_OPTION) {
    
        Document edocumento= new Document();
    try {
    String ruta = System.getProperty("user.home");
    java.util.Date currentDate = new java.util.Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HHmmss"); // format the date as YYYY-MM-DD_HHMMSS
    String filename = "reporteestado_" + sdf.format(currentDate) + ".pdf";
    
    PdfWriter ewriter = PdfWriter.getInstance(edocumento, new FileOutputStream(ruta + "/" + filename));

     edocumento.open();
     PdfPTable eptabla=new PdfPTable(4);
        PdfPCell etitleCell = new PdfPCell(new Phrase("Lista de alumnos por estado", FontFactory.getFont(FontFactory.HELVETICA, 18, Font.BOLD)));
        etitleCell.setColspan(4); // Ocupa las 6 columnas
        etitleCell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        etitleCell.setPadding(4);
        eptabla.addCell(etitleCell);

// Agregar encabezado de la tabla
        eptabla.addCell("ID");
        eptabla.addCell("Nombres");
        eptabla.addCell("Apellidos");
        eptabla.addCell("Estado");

        eptabla.setHeaderRows(1);
      try {
        ResultSet rs = null;
        PreparedStatement ps = null;

        conexion tobjetoConexion = new conexion();

        String estadoTexto = txtest.getText(); // obtiene el texto del JTextField
        String consulta = "SELECT id, nombres, apellidos,estado FROM alumnos WHERE estado = ?";
        ps = tobjetoConexion.establecerConexion().prepareStatement(consulta);
        ps.setString(1, estadoTexto);
        rs = ps.executeQuery();

        // Crear un modelo de tabla para almacenar los datos

        // Iterar sobre los resultados de la consulta y los agrega sobre la tabla
        while (rs.next()) {
            eptabla.addCell(rs.getString(1));
            eptabla.addCell(rs.getString(2));
            eptabla.addCell(rs.getString(3));
            eptabla.addCell(rs.getString(4));

            
        }
        PdfPCell fechaCell = new PdfPCell(new Phrase("Fecha de generación: " + currentDate.toString(), FontFactory.getFont(FontFactory.HELVETICA, 10)));
        fechaCell.setColspan(6); // Ocupa las 6 columnas
        fechaCell.setBorderWidth(0); // No mostrar borde
        fechaCell.setBackgroundColor(BaseColor.WHITE);
        eptabla.addCell(fechaCell);// Fondo blanco
        edocumento.add(eptabla);
        JOptionPane.showMessageDialog(null,"Se ha guardado el reporte en la carpeta del usuario actual");



         } catch (DocumentException | SQLException e) {
        JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
    }
      edocumento.close();
    }catch (Exception e) {
    }
    } else {
        System.out.println("Registro cancelado");
    }
    }//GEN-LAST:event_btnestadoActionPerformed

    private void btnalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalumnoActionPerformed
    reporta();
           int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea descargar el reporte general de alumnos?", "Confirmar", JOptionPane.YES_NO_OPTION);

    if (respuesta == JOptionPane.YES_OPTION) {
    Document tdocumento= new Document();
    try {
    String ruta = System.getProperty("user.home");
    java.util.Date currentDate = new java.util.Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HHmmss"); // format the date as YYYY-MM-DD_HHMMSS
    String filename = "reportealumnos_" + sdf.format(currentDate) + ".pdf";
    
    PdfWriter writer = PdfWriter.getInstance(tdocumento, new FileOutputStream(ruta + "/" + filename));

     tdocumento.open();
     PdfPTable tptabla=new PdfPTable(3);
        PdfPCell titleCell = new PdfPCell(new Phrase("Lista de alumnos", FontFactory.getFont(FontFactory.HELVETICA, 18, Font.BOLD)));
        titleCell.setColspan(3); // Ocupa las 6 columnas
        titleCell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        titleCell.setPadding(3);
        tptabla.addCell(titleCell);

// Agregar encabezado de la tabla
        tptabla.addCell("ID");
        tptabla.addCell("Nombres");
        tptabla.addCell("Apellidos");;
        tptabla.setHeaderRows(1);
      try {
        ResultSet rs = null;
        PreparedStatement ps = null;

        conexion tobjetoConexion = new conexion();

        String consulta = "SELECT id, nombres, apellidos from alumnos";
        ps = tobjetoConexion.establecerConexion().prepareStatement(consulta);

        rs = ps.executeQuery();

        // Crear un modelo de tabla para almacenar los datos

        // Iterar sobre los resultados de la consulta y los agrega sobre la tabla
        while (rs.next()) {
            tptabla.addCell(rs.getString(1));
            tptabla.addCell(rs.getString(2));
            tptabla.addCell(rs.getString(3));
            
        }
        PdfPCell fechaCell = new PdfPCell(new Phrase("Fecha de generación: " + currentDate.toString(), FontFactory.getFont(FontFactory.HELVETICA, 10)));
        fechaCell.setColspan(6); // Ocupa las 6 columnas
        fechaCell.setBorderWidth(0); // No mostrar borde
        fechaCell.setBackgroundColor(BaseColor.WHITE);
        tptabla.addCell(fechaCell);// Fondo blanco
        tdocumento.add(tptabla);
        JOptionPane.showMessageDialog(null,"Se ha guardado el reporte en la carpeta del usuario actual");



         } catch (DocumentException | SQLException e) {
        JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
    }
      tdocumento.close();
    }catch (Exception e) {
    }
    } else {
        System.out.println("Reporte cancelado");
    }
    
    }//GEN-LAST:event_btnalumnoActionPerformed

    private void btntodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntodoActionPerformed
    reporttodo();
    int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea descargar el reporte de todos los datos?", "Confirmar", JOptionPane.YES_NO_OPTION);

    if (respuesta == JOptionPane.YES_OPTION) {
    Document tdocumento= new Document();
    try {
    String ruta = System.getProperty("user.home");
    java.util.Date currentDate = new java.util.Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HHmmss"); // format the date as YYYY-MM-DD_HHMMSS
    String filename = "reportetodo_" + sdf.format(currentDate) + ".pdf";
    
    PdfWriter writer = PdfWriter.getInstance(tdocumento, new FileOutputStream(ruta + "/" + filename));

     tdocumento.open();
     PdfPTable tptabla=new PdfPTable(6);
        PdfPCell titleCell = new PdfPCell(new Phrase("Lista de todos los datos", FontFactory.getFont(FontFactory.HELVETICA, 18, Font.BOLD)));
        titleCell.setColspan(6); // Ocupa las 6 columnas
        titleCell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        titleCell.setPadding(5);
        tptabla.addCell(titleCell);

// Agregar encabezado de la tabla
        tptabla.addCell("ID");
        tptabla.addCell("Estado");
        tptabla.addCell("Nombres");
        tptabla.addCell("Apellidos");
        tptabla.addCell("Edad");
        tptabla.addCell("Carrera");
        tptabla.setHeaderRows(1);
      try {
        ResultSet rs = null;
        PreparedStatement ps = null;

        conexion tobjetoConexion = new conexion();

        String consulta = "SELECT*FROM alumnos";
        ps = tobjetoConexion.establecerConexion().prepareStatement(consulta);

        rs = ps.executeQuery();

        // Crear un modelo de tabla para almacenar los datos

        // Iterar sobre los resultados de la consulta y los agrega sobre la tabla
        while (rs.next()) {
            tptabla.addCell(rs.getString(1));
            tptabla.addCell(rs.getString(2));
            tptabla.addCell(rs.getString(3));
            tptabla.addCell(rs.getString(4));
            tptabla.addCell(rs.getString(5));
            tptabla.addCell(rs.getString(6));
            
        }
        PdfPCell fechaCell = new PdfPCell(new Phrase("Fecha de generación: " + currentDate.toString(), FontFactory.getFont(FontFactory.HELVETICA, 10)));
        fechaCell.setColspan(6); // Ocupa las 6 columnas
        fechaCell.setBorderWidth(0); // No mostrar borde
        fechaCell.setBackgroundColor(BaseColor.WHITE);
        tptabla.addCell(fechaCell);// Fondo blanco
        tdocumento.add(tptabla);
        JOptionPane.showMessageDialog(null,"Se ha guardado el reporte en la carpeta del usuario actual");


         } catch (DocumentException | SQLException e) {
        JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
    }
      tdocumento.close();
    }catch (Exception e) {
    }
      } else {
        System.out.println("Reporte cancelado");
    }  
    }//GEN-LAST:event_btntodoActionPerformed

    private void txtcarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcarreraActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtestadoActionPerformed

    private void txtnombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombresActionPerformed

    private void txtapellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidosActionPerformed

    private void radio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio3ActionPerformed
    txtid.setEnabled(true);
    txtid.setText("");
    txtcarrera.setEnabled(false);
    txtcarrera.setText("");
    txtedad.setEnabled(false);
    txtedad.setText("");
    txtapellidos.setEnabled(false);
    txtapellidos.setText("");
    txtnombres.setEnabled(false);
    txtnombres.setText("");
    txtestado.setEnabled(false);
    txtestado.setText("");
    }//GEN-LAST:event_radio3ActionPerformed

    private void radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1ActionPerformed
        txtid.setEnabled(false);
        txtid.setText("");
        txtcarrera.setEnabled(true);
        txtedad.setEnabled(true);
        txtapellidos.setEnabled(true);
        txtnombres.setEnabled(true);
        txtestado.setEnabled(true);
    }//GEN-LAST:event_radio1ActionPerformed

    private void radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio2ActionPerformed
        txtid.setEnabled(true);
        txtcarrera.setEnabled(true);
        txtedad.setEnabled(true);
        txtapellidos.setEnabled(true);
        txtnombres.setEnabled(true);
        txtestado.setEnabled(true);
    }//GEN-LAST:event_radio2ActionPerformed

    private void txtedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadActionPerformed

    private void txtestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtestActionPerformed

    private void btnConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConActionPerformed
       int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea registrar este registro?", "Confirmar", JOptionPane.YES_NO_OPTION);

    if (respuesta == JOptionPane.YES_OPTION) {
        if (radio1.isSelected()) {
                try {
                conexion eobjetoConexion = new conexion();
                String consulta = "INSERT INTO alumnos (estado, nombres, apellidos,edad,carrera) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement ps = eobjetoConexion.establecerConexion().prepareStatement(consulta);
                ps.setString(1, txtestado.getText());
                ps.setString(2, (String) txtnombres.getText());
                ps.setString(3, txtapellidos.getText());
                ps.setString(4,(String) txtedad.getText());
                ps.setString(5, txtcarrera.getText());
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "alumno registrado con exito");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
            }
    } else if (radio2.isSelected()) {
        try {
    conexion eobjetoConexion = new conexion();
    String consulta = "UPDATE alumnos SET estado = ?, nombres = ?, apellidos = ?, edad = ?, carrera = ? WHERE id = ?";
    PreparedStatement ps = eobjetoConexion.establecerConexion().prepareStatement(consulta);
    ps.setString(1, txtestado.getText());
    ps.setString(2, (String) txtnombres.getText());
    ps.setString(3, txtapellidos.getText());
    ps.setString(4,(String) txtedad.getText());
    ps.setString(5,(String) txtcarrera.getText());
    ps.setInt(6, Integer.parseInt(txtid.getText()));
    ps.executeUpdate();

    JOptionPane.showMessageDialog(null, "Registro actualizado con éxito");
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
}
    } else if (radio3.isSelected()) { 
        try {
        conexion eobjetoConexion = new conexion();
        String consulta = "DELETE FROM alumnos WHERE id = ?";
        PreparedStatement ps = eobjetoConexion.establecerConexion().prepareStatement(consulta);
        ps.setInt(1, Integer.parseInt(txtid.getText()));
        ps.executeUpdate();

        JOptionPane.showMessageDialog(null, "Registro eliminado con éxito");
            }  
        catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
                      }
    } else {
    System.out.println("Ninguno de los radios está seleccionado");
    }
        
    } else {
        System.out.println("Registro cancelado");
    }
        

    }//GEN-LAST:event_btnConActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(reportM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reportM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reportM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reportM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reportM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCon;
    private javax.swing.JButton btnalumno;
    private javax.swing.JButton btnestado;
    private javax.swing.JButton btntodo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JTable tablaal;
    private javax.swing.JTable tablaestado;
    private javax.swing.JTable tablatodo;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcarrera;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtest;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombres;
    // End of variables declaration//GEN-END:variables
}
