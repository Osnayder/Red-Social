package edu.cecar.vista;

import edu.cecar.controlador.Cliente;
import edu.cecar.modelo.Archivo;
import edu.cecar.modelo.Sesion;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class Vp extends javax.swing.JFrame {

    public Vp() {
        initComponents();
        this.setUndecorated(true);
        this.getRootPane().getContentPane().setBackground(Color.WHITE);
        usuarioSesion.addKeyListener(new KeyAdapter(){
                        public void keyTyped(KeyEvent e){
                           char caracter = e.getKeyChar();
                           if(((caracter < '0') || (caracter > '9')) &&(caracter != '\b')){
                              e.consume();
                           }
                        }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        botonInicarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        contrasenaSesion = new javax.swing.JPasswordField();
        usuarioSesion = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RESOC");
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setText("Registrarse");
        jButton1.setToolTipText("Clic aqui para registrase en RESOC");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 230, 120, 30);

        botonInicarSesion.setBackground(new java.awt.Color(255, 255, 255));
        botonInicarSesion.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonInicarSesion.setText("Iniciar Sesión");
        botonInicarSesion.setToolTipText("Clic aquí para iniciar sesión");
        botonInicarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonInicarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInicarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(botonInicarSesion);
        botonInicarSesion.setBounds(390, 230, 140, 30);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Inicio de Sesión");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 50, 150, 30);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 110, 70, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 160, 90, 30);

        contrasenaSesion.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        contrasenaSesion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contrasenaSesion.setToolTipText("La contraseña que ingreso al registrase");
        contrasenaSesion.setAlignmentX(9.0F);
        contrasenaSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(153, 153, 153)));
        contrasenaSesion.setMargin(new java.awt.Insets(5, 5, 5, 5));
        getContentPane().add(contrasenaSesion);
        contrasenaSesion.setBounds(200, 160, 190, 30);

        usuarioSesion.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        usuarioSesion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuarioSesion.setToolTipText("El usuario es tu numero de identificacion");
        usuarioSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(153, 153, 153)));
        getContentPane().add(usuarioSesion);
        usuarioSesion.setBounds(200, 110, 190, 30);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cerrar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(153, 153, 153)));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(230, 230, 100, 30);

        setSize(new java.awt.Dimension(570, 316));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Vr().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonInicarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicarSesionActionPerformed
        
        if(!usuarioSesion.getText().equals("") && !contrasenaSesion.getText().equals("")){
            int      id =  Integer.parseInt( usuarioSesion.getText());
            String pass = contrasenaSesion.getText();
            Archivo archivoEnviar = new Archivo("Subida",2,  new Sesion(id, pass,null,false));

            Cliente cliente = new Cliente("0.0.0.0",17000);
            cliente.enviar(archivoEnviar);
            Object recibir = cliente.recibir();

            if(validacionUsuario(recibir)){
                Vs ventanaSesion = new Vs((Sesion)recibir);
                ventanaSesion.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "No Se Puede Acceder Con Las Credenciales Ingresadas", 
                                                            "RESOC - Acceso", JOptionPane.ERROR_MESSAGE);
            }            
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese Valor En Los Campos de Acceso", 
                                                            "RESOC - Acceso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonInicarSesionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private boolean validacionUsuario(Object objeto){
        Sesion sesionUsuario = (Sesion)objeto; 
        boolean salida = false;
        
        if(sesionUsuario.getUltimaConexion()!=null){
            salida = true;
        }
        
        return salida;
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vp().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInicarSesion;
    private javax.swing.JPasswordField contrasenaSesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField usuarioSesion;
    // End of variables declaration//GEN-END:variables
}
