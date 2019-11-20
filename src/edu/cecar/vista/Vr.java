package edu.cecar.vista;

import edu.cecar.componentes.Utilidades;
import edu.cecar.controlador.Cliente;
import edu.cecar.modelo.Archivo;
import edu.cecar.modelo.Red;
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
    ArrayList<Red> arrayRedes = null;
    ArrayList cuentas = null;
    
    public Vr() {
        initComponents();
        this.getRootPane().getContentPane().setBackground(Color.WHITE);
        
        jLabel15.setText("Ninguna imagen");
        fechanacimineto.setDate(new Date());
        
        areaTelefonos.setLineWrap(true);
        areaTelefonos.setWrapStyleWord(true);
      
        areaCelulares.setLineWrap(true);
        areaCelulares.setWrapStyleWord(true);
        
        areaDescripcion.setLineWrap(true);
        areaDescripcion.setWrapStyleWord(true);
       
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
        areaDescripcion = new javax.swing.JTextArea();
        fechanacimineto = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cargarImagen = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        redes = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaTelefonos = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaCelulares = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Usuario");
        setResizable(false);
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
        jLabel8.setBounds(490, 170, 100, 30);

        repitacontrasena.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        getContentPane().add(repitacontrasena);
        repitacontrasena.setBounds(760, 370, 230, 30);

        contrasena.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        getContentPane().add(contrasena);
        contrasena.setBounds(760, 330, 230, 30);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Contraseña:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(650, 330, 90, 30);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("Repita Contraseña:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(600, 370, 150, 30);

        botonCancelar.setBackground(new java.awt.Color(200, 200, 200));
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar);
        botonCancelar.setBounds(760, 420, 100, 30);

        botonAgregar.setBackground(new java.awt.Color(200, 200, 200));
        botonAgregar.setText("Registrar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregar);
        botonAgregar.setBounds(870, 420, 120, 30);

        cedula.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        getContentPane().add(cedula);
        cedula.setBounds(130, 30, 220, 30);

        nombres.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        getContentPane().add(nombres);
        nombres.setBounds(130, 70, 220, 30);

        apellidos.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        getContentPane().add(apellidos);
        apellidos.setBounds(130, 110, 220, 30);

        direccion.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        getContentPane().add(direccion);
        direccion.setBounds(150, 210, 170, 30);

        telefono.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        getContentPane().add(telefono);
        telefono.setBounds(150, 250, 170, 30);

        celular.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        getContentPane().add(celular);
        celular.setBounds(150, 290, 170, 30);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("Departamento:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 330, 100, 30);

        departamentos.setBackground(new java.awt.Color(200, 200, 200));
        departamentos.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        departamentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ventas", "Accesoria" }));
        getContentPane().add(departamentos);
        departamentos.setBounds(150, 330, 170, 30);

        jButton3.setBackground(new java.awt.Color(200, 200, 200));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton3.setText("Agregar Otro");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(330, 250, 100, 30);

        areaDescripcion.setColumns(20);
        areaDescripcion.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        areaDescripcion.setRows(5);
        jScrollPane1.setViewportView(areaDescripcion);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(590, 30, 410, 110);
        getContentPane().add(fechanacimineto);
        fechanacimineto.setBounds(150, 170, 170, 30);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Descripcion:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(480, 20, 100, 40);

        jButton1.setBackground(new java.awt.Color(200, 200, 200));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setText("Agregar Otro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 290, 100, 30);

        cargarImagen.setBackground(new java.awt.Color(200, 200, 200));
        cargarImagen.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cargarImagen.setText("Agregar Imagen");
        cargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarImagenActionPerformed(evt);
            }
        });
        getContentPane().add(cargarImagen);
        cargarImagen.setBounds(670, 240, 120, 30);

        jComboBox1.setBackground(new java.awt.Color(200, 200, 200));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WhatsApp", "Facebook", "Instagram", "Twiter" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(590, 170, 140, 30);

        redes.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        getContentPane().add(redes);
        redes.setBounds(740, 170, 150, 30);

        jButton4.setBackground(new java.awt.Color(200, 200, 200));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton4.setText("Agregar Otra");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(900, 170, 100, 30);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("Nombre cuenta");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(760, 150, 120, 20);

        areaTelefonos.setEditable(false);
        areaTelefonos.setColumns(20);
        areaTelefonos.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        areaTelefonos.setRows(5);
        areaTelefonos.setTabSize(0);
        jScrollPane2.setViewportView(areaTelefonos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 400, 220, 50);

        areaCelulares.setEditable(false);
        areaCelulares.setColumns(20);
        areaCelulares.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        areaCelulares.setRows(5);
        jScrollPane3.setViewportView(areaCelulares);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(260, 400, 220, 50);

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setText("Telefonos Agregados");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 380, 160, 16);

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setText("Celulares Agregados");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(280, 380, 170, 16);

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(610, 270, 380, 30);

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel16.setText("Nombre Imgen:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(490, 270, 120, 30);

        jButton2.setBackground(new java.awt.Color(200, 200, 200));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton2.setText("Ver Imagen");
        getContentPane().add(jButton2);
        jButton2.setBounds(810, 240, 130, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(490, 230, 500, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(490, 310, 500, 10);

        setSize(new java.awt.Dimension(1042, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        if(verficarContrasena() && verificarNulidadCampos()){
            cargarCampos();
            enviarServidor(usuario);
            limpiarCampos();
            usuario = null;
            JOptionPane.showMessageDialog(this, "En Hora Buena! Se Registro Exitosamente, Binvenido", "Registro Usuario",JOptionPane.INFORMATION_MESSAGE);
        }else{
            if(!verificarNulidadCampos()){
                JOptionPane.showMessageDialog(this,"Uppss!! Dejo Campos Necesarios Vacios", "Error",JOptionPane.ERROR_MESSAGE);
            }else if(!verficarContrasena()){
                JOptionPane.showMessageDialog(this,"Uppss!! Las Contraseña No Coinciden", "Error",JOptionPane.ERROR_MESSAGE);
            }
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
        String showInputDialog = JOptionPane.showInputDialog(this, "Digite el Numero de Telefono", 
                                                "Nuevo Telefono", JOptionPane.INFORMATION_MESSAGE);
        long valorTelefono = 0;
        if(esNumero(showInputDialog)){
            valorTelefono = Long.parseLong(showInputDialog);
            if(arrayTelefonos==null){
                arrayTelefonos = new ArrayList();
            }
            arrayTelefonos.add(valorTelefono);
            for(int i=0; i<arrayTelefonos.size(); i++){
                System.out.println(" "+arrayTelefonos.get(i));
            }
            areaTelefonos.append(valorTelefono+"\n");
        }else{
            JOptionPane.showMessageDialog(this,"Upssss! A Ingresado Un Valor No Numerico.\nVerifique Que No Halla Espacio Ni Letras",
                                                    "Campo",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String showInputDialog = JOptionPane.showInputDialog(this, "Digite el Numero de Celular", 
                                                "Nuevo Celular", JOptionPane.INFORMATION_MESSAGE);
        long valorCelular = 0;
        if(esNumero(showInputDialog)){
            valorCelular = Long.parseLong(showInputDialog);
            if(arrayCelulares==null){
                arrayCelulares = new ArrayList();
            }
            arrayCelulares.add(valorCelular);
            for(int i=0; i<arrayCelulares.size(); i++){
                System.out.println(" "+arrayCelulares.get(i));
            }
            areaCelulares.append(valorCelular+"\n");
        }else{
            JOptionPane.showMessageDialog(this,"Upssss! A Ingresado Un Valor No Numerico.\nVerifique Que No Halla Espacio Ni Letras",
                                                    "Campo",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(arrayRedes==null){ arrayRedes= new ArrayList<>(); }
        Red nuevaRed = new Red((String)jComboBox1.getSelectedItem(),redes.getText());
        arrayRedes.add(nuevaRed);
        
        redes.setText("Nueva cuenta");
        jComboBox1.setSelectedIndex(0);
        for(int i=0; i<arrayRedes.size(); i++){
            System.out.println("->"+arrayRedes.get(i).getNombre()+" - "+arrayRedes.get(i).getCuenta());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private boolean verficarContrasena(){
       return (contrasena.getText().equals(repitacontrasena.getText()) && !contrasena.getText().equals(""));
    }
    
    private boolean verificarNulidadCampos(){
        return (!cedula.getText().equals("") && !nombres.getText().equals("") && !apellidos.getText().equals("")
                && !(""+fechanacimineto.getDate()).equals("") && !direccion.getText().equals(""));
    }
    private void cargarCampos(){
        java.sql.Date fechaNacimiento = new java.sql.Date(fechanacimineto.getDate().getTime());
        Calendar fechaSistema = new GregorianCalendar();
        java.sql.Date fechaHoy = new java.sql.Date(fechaSistema.getTimeInMillis());
        
        if(arrayTelefonos==null){ arrayTelefonos = new ArrayList(); }
        if(arrayCelulares==null){ arrayCelulares = new ArrayList(); }
        if(arrayRedes==null){     arrayRedes     = new ArrayList(); }
        
        arrayTelefonos.add(Long.parseLong(telefono.getText()));
        arrayCelulares.add(Long.parseLong(celular.getText()));
        
        Red nuevaRed = new Red((String)jComboBox1.getSelectedItem(),redes.getText());
        
        arrayRedes.add(nuevaRed);
        
        usuario = new Usuario(Integer.parseInt(cedula.getText()),nombres.getText(),apellidos.getText(),fechaNacimiento,
                              archivoFoto,direccion.getText(),arrayCelulares,arrayTelefonos,arrayRedes,
                              fechaHoy,true,(String)departamentos.getSelectedItem(),
                              areaDescripcion.getText(),contrasena.getText());
        
    }
    
    private void limpiarCampos(){
        cedula.setText("");
        nombres.setText("");
        apellidos.setText("");
        direccion.setText("");
        telefono.setText("");
        celular.setText("");
        departamentos.setSelectedIndex(0);
        areaDescripcion.setText("");
        areaCelulares.setText("");
        areaTelefonos.setText("");
        contrasena.setText("");
        repitacontrasena.setText("");
        jComboBox1.setSelectedIndex(0);
        redes.setText("");
        jLabel15.setText("No Hay Imagen");
        
    }
    
    private void enviarServidor(Object objecto){
        Archivo archivoEnvio = new Archivo("Subida",1,objecto);
        Cliente cliente = new Cliente("0.0.0.0",17000);
        cliente.enviar(archivoEnvio);
        
    }
    
    public boolean esNumero(String cadena){
        boolean resultado;
        try {
            Long.parseLong(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
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
    private javax.swing.JTextArea areaCelulares;
    private javax.swing.JTextArea areaDescripcion;
    private javax.swing.JTextArea areaTelefonos;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton cargarImagen;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField celular;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JComboBox<String> departamentos;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nombres;
    private javax.swing.JTextField redes;
    private javax.swing.JPasswordField repitacontrasena;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
