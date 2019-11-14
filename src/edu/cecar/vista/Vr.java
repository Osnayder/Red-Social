package edu.cecar.vista;

import edu.cecar.componentes.Utilidades;
import edu.cecar.controlador.Cliente;
import edu.cecar.modelo.Archivo;
import edu.cecar.modelo.Usuario;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Vr extends javax.swing.JFrame {

    Usuario usuario = null;
    byte[] archivoFoto;
    ArrayList arrayTelefonos = null;
    ArrayList arrayCelulares = null;
    ArrayList arrayRedes = null;
    ArrayList cuentas = null;
    
    public Vr() {
        initComponents();
        this.getRootPane().getContentPane().setBackground(Color.WHITE);
        
        nombres.setToolTipText("Introduce nombre usuario");
        fechanacimineto.setDate(new Date());
       
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
        redes = new javax.swing.JTextField();
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

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Numero Cedula:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 120, 30);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Nombres:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 70, 80, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Apellidos:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 110, 80, 30);

        f.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        f.setText("Fecha Nacimiento:");
        getContentPane().add(f);
        f.setBounds(10, 170, 140, 30);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Dirreccion:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 210, 90, 30);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Tel:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 250, 50, 30);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Cel:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 290, 50, 30);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Otras Redes:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(450, 170, 100, 30);

        repitacontrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repitacontrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(repitacontrasena);
        repitacontrasena.setBounds(730, 370, 230, 30);
        getContentPane().add(contrasena);
        contrasena.setBounds(730, 330, 230, 30);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Contraseña:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(620, 330, 90, 30);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("Repita Contraseña:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(570, 370, 150, 30);

        botonCancelar.setText("Cancelar");
        getContentPane().add(botonCancelar);
        botonCancelar.setBounds(640, 420, 90, 30);

        botonAgregar.setText("Registrar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregar);
        botonAgregar.setBounds(740, 420, 90, 30);
        getContentPane().add(cedula);
        cedula.setBounds(130, 30, 220, 30);
        getContentPane().add(nombres);
        nombres.setBounds(130, 70, 220, 30);
        getContentPane().add(apellidos);
        apellidos.setBounds(130, 110, 220, 30);
        getContentPane().add(direccion);
        direccion.setBounds(150, 210, 170, 30);
        getContentPane().add(telefono);
        telefono.setBounds(150, 250, 170, 30);
        getContentPane().add(celular);
        celular.setBounds(150, 290, 170, 30);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("Departamento:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 330, 100, 30);

        departamentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ventas", "Accesoria", " " }));
        getContentPane().add(departamentos);
        departamentos.setBounds(150, 330, 170, 30);

        jButton3.setText("Agregar Otro");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(330, 250, 100, 30);

        descripcion.setColumns(20);
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(550, 30, 410, 110);
        getContentPane().add(fechanacimineto);
        fechanacimineto.setBounds(150, 170, 170, 30);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Descripcion:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(440, 30, 100, 30);

        jButton1.setText("Agregar Otro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 290, 100, 30);

        cargarImagen.setText("Agregar Imagen");
        cargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarImagenActionPerformed(evt);
            }
        });
        getContentPane().add(cargarImagen);
        cargarImagen.setBounds(550, 230, 120, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WhatsApp", "Facebook", "Instagram", "Twiter" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(550, 170, 140, 30);
        getContentPane().add(redes);
        redes.setBounds(700, 170, 150, 30);

        jButton4.setText("Agregar Otro");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(860, 170, 100, 30);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("Nombre cuenta");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(720, 150, 120, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setTabSize(0);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 400, 220, 50);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(260, 400, 220, 50);

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setText("Telefonos Agregados");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(30, 370, 160, 16);

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setText("Celulares Agregados");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(250, 370, 170, 16);

        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel15);
        jLabel15.setBounds(750, 230, 210, 30);

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel16.setText("Nombre:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(680, 230, 60, 30);

        jButton2.setText("Ver Imagen");
        getContentPane().add(jButton2);
        jButton2.setBounds(750, 270, 210, 30);

        setSize(new java.awt.Dimension(1003, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        
        if(verficarContrasena() && verificarCampos()){
            cargarCampos();
            enviarServidor(usuario);
        }        

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
                jLabel15.setText(fileChooser.getSelectedFile().getName());
                archivoFoto = Utilidades.getBytes(String.valueOf(fileChooser.getSelectedFile()));
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

    private void repitacontrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repitacontrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repitacontrasenaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       arrayRedes.add(jComboBox1.getSelectedItem());
    }//GEN-LAST:event_jButton4ActionPerformed

    private boolean verficarContrasena(){
       return (contrasena.getText().equals(repitacontrasena.getText()) && !contrasena.getText().equals(""));
    }
    
    private boolean verificarCampos(){
        return (!cedula.getText().equals("") && !nombres.getText().equals("") && !apellidos.getText().equals("")
                && !fechanacimineto.getDate().equals("") && !direccion.getText().equals(""));
    }
    private void cargarCampos(){
        java.sql.Date fechaNacimiento = new java.sql.Date(fechanacimineto.getDate().getTime());
        Calendar fechaSistema = new GregorianCalendar();
        java.sql.Date fechaHoy = new java.sql.Date(fechaSistema.getTimeInMillis());
        
        arrayTelefonos = new ArrayList<Long>();
        arrayCelulares = new ArrayList<Long>();
        arrayRedes = new ArrayList<Long>();
        
        arrayTelefonos.add(Long.parseLong(telefono.getText()));
        arrayCelulares.add(Long.parseLong(celular.getText()));
        arrayRedes.add(redes.getText());
        
        usuario = new Usuario(Integer.parseInt(cedula.getText()),nombres.getText(),apellidos.getText(),fechaNacimiento,
                              archivoFoto,direccion.getText(),arrayCelulares,arrayTelefonos,arrayRedes,
                              fechaHoy,true,(String)departamentos.getSelectedItem(),
                              descripcion.getText(),contrasena.getText());
        
    }
    
    private void enviarServidor(Object objecto){
        Archivo archivoEnvio = new Archivo("Subida",1,objecto);
        Cliente cliente = new Cliente("0.0.0.0",17000);
        cliente.enviar(archivoEnvio);
        
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
    private javax.swing.JTextField nombres;
    private javax.swing.JTextField redes;
    private javax.swing.JPasswordField repitacontrasena;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
