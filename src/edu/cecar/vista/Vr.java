/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.vista;

import edu.cecar.componentes.Utilidades;
import edu.cecar.controlador.Cliente;
import edu.cecar.modelo.Usuario;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author osnayder
 */
public class Vr extends javax.swing.JFrame {

    Usuario usuario = null;
    byte[] archivoFoto;
    ArrayList arrayTelefonos = null;
    ArrayList arrayCelulares = null;
    ArrayList arrayRedes = null;
    
    public Vr() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        f = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        repitacontrasena = new javax.swing.JPasswordField();
        contrasena = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        cedula = new javax.swing.JTextField();
        nombres = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        celular = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        departamentos = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        fechanacimineto = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cargarImagen = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rgistro de Usuario");
        getContentPane().setLayout(null);

        jLabel1.setText("Numero Cedula:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 100, 30);

        jLabel2.setText("Nombres:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 70, 60, 30);

        jLabel3.setText("Apellidos:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 110, 60, 30);

        f.setText("Fecha Nacimiento:");
        getContentPane().add(f);
        f.setBounds(10, 170, 90, 30);

        jLabel5.setText("Dirreccion:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 210, 70, 30);

        jLabel6.setText("Tel:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 250, 30, 30);

        jLabel7.setText("Cel:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 290, 30, 30);

        jLabel8.setText("Otras Redes:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(390, 170, 70, 30);

        repitacontrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repitacontrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(repitacontrasena);
        repitacontrasena.setBounds(670, 380, 150, 30);
        getContentPane().add(contrasena);
        contrasena.setBounds(670, 340, 150, 30);

        jLabel9.setText("Contraseña:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(590, 340, 70, 30);

        jLabel10.setText("Repita Contraseña");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(550, 380, 110, 30);

        botonCancelar.setText("Cancelar");
        getContentPane().add(botonCancelar);
        botonCancelar.setBounds(630, 420, 90, 30);

        botonAgregar.setText("Registrar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregar);
        botonAgregar.setBounds(750, 420, 90, 30);

        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });
        getContentPane().add(cedula);
        cedula.setBounds(110, 30, 220, 30);
        getContentPane().add(nombres);
        nombres.setBounds(110, 70, 220, 30);
        getContentPane().add(apellidos);
        apellidos.setBounds(110, 110, 220, 30);
        getContentPane().add(direccion);
        direccion.setBounds(110, 210, 170, 30);
        getContentPane().add(telefono);
        telefono.setBounds(110, 250, 170, 30);
        getContentPane().add(celular);
        celular.setBounds(110, 290, 170, 30);

        jLabel11.setText("Departamento:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 330, 80, 30);

        departamentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ventas", "Accesoria", " " }));
        getContentPane().add(departamentos);
        departamentos.setBounds(110, 330, 170, 30);

        jButton3.setText("Agregar Otro");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(290, 250, 100, 30);

        descripcion.setColumns(20);
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(460, 30, 370, 110);
        getContentPane().add(fechanacimineto);
        fechanacimineto.setBounds(110, 170, 170, 30);

        jLabel4.setText("Descripcion:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(390, 30, 70, 30);

        jButton1.setText("Agregar Otro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 290, 100, 30);

        cargarImagen.setText("Agregar Imagen");
        cargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarImagenActionPerformed(evt);
            }
        });
        getContentPane().add(cargarImagen);
        cargarImagen.setBounds(460, 230, 110, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WhatsApp", "Facebook", "Instagram", "Twiter" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(460, 170, 100, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(570, 170, 150, 30);

        jButton4.setText("Agregar Otro");
        getContentPane().add(jButton4);
        jButton4.setBounds(730, 170, 100, 30);

        jLabel12.setText("Nombre cuenta");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(600, 150, 90, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 390, 200, 60);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(240, 390, 200, 60);

        jLabel13.setText("Telefonos Agregados");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(30, 370, 130, 14);

        jLabel14.setText("Celulares Agregados");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(250, 370, 120, 14);

        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel15);
        jLabel15.setBounds(630, 230, 190, 30);

        jLabel16.setText("Ruta:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(590, 230, 27, 30);

        jButton2.setText("Ver Imagen");
        getContentPane().add(jButton2);
        jButton2.setBounds(630, 270, 190, 30);

        setSize(new java.awt.Dimension(901, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void repitacontrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repitacontrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repitacontrasenaActionPerformed

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        if(verficarContrasena()){
            cargarCampos();
        }        

        // se envia la infromacion al servidor.
        //Cliente cliente = new Cliente("192.168.0.1",17000);
        //cliente.enviar(usuario);
        
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void cargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarImagenActionPerformed
      
        String nombresFormatos = "Formato de Archivos .jpg, .jpeg, .png";
        int ventana = 0;
        
        FileNameExtensionFilter filto = new FileNameExtensionFilter(nombresFormatos,"jpg","png","jpeg");
        javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
        
        fileChooser.addChoosableFileFilter(filto);
        fileChooser.setDialogTitle("Abrir Archivo");
        fileChooser.setCurrentDirectory(new File("C:\\Users\\Public\\Pictures"));
        ventana = fileChooser.showOpenDialog(null);
      
        if(ventana==JFileChooser.APPROVE_OPTION){
            try {
                jLabel15.setText(String.valueOf(fileChooser.getSelectedFile()));
                archivoFoto = Utilidades.getBytes(String.valueOf(fileChooser.getSelectedFile()));
                Utilidades.escribirAchivo("D:\\jj.png", archivoFoto);
                JOptionPane.showMessageDialog(this,"En hora buena! Se Cargo la Imagen",
                                            "Archivo",JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,"Upssss! no se pudo cargar la imagen",
                                                    "Archivo",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cargarImagenActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       arrayTelefonos = new ArrayList();
       arrayTelefonos.add(telefono.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       arrayCelulares = new ArrayList();
       arrayCelulares.add(celular.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean verficarContrasena(){
       return (contrasena.getText().equals(repitacontrasena.getText()) && !contrasena.getText().equals(""));
    }
    
    private void cargarCampos(){
        java.sql.Date fechaNacimiento = new java.sql.Date(fechanacimineto.getDate().getTime());
        Calendar fechaSistema = new GregorianCalendar();
        java.sql.Date fechaHoy = new java.sql.Date(fechaSistema.getTimeInMillis());
        
        usuario = new Usuario(Integer.parseInt(cedula.getText()),nombres.getText(),apellidos.getText(),fechaNacimiento,
                              archivoFoto,direccion.getText(),arrayCelulares,arrayTelefonos,arrayRedes,
                              fechaHoy,true,(String)departamentos.getSelectedItem(),
                              descripcion.getText(),contrasena.getText());
        
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Vr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton cargarImagen;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField celular;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JComboBox<String> departamentos;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JTextField direccion;
    private javax.swing.JLabel f;
    private com.toedter.calendar.JDateChooser fechanacimineto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nombres;
    private javax.swing.JPasswordField repitacontrasena;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
