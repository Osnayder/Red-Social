package edu.cecar.vista;

import edu.cecar.controlador.Cliente;
import edu.cecar.modelo.Archivo;
import edu.cecar.modelo.Sesion;
import java.awt.Color;
import javax.swing.JOptionPane;


public class Vp extends javax.swing.JFrame {

    public Vp() {
        initComponents();
        this.getRootPane().getContentPane().setBackground(Color.WHITE);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RESOC");
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setText("Registro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 220, 120, 30);

        botonInicarSesion.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonInicarSesion.setText("Iniciar Sesión");
        botonInicarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(botonInicarSesion);
        botonInicarSesion.setBounds(300, 220, 130, 30);

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
        getContentPane().add(contrasenaSesion);
        contrasenaSesion.setBounds(200, 160, 180, 30);
        getContentPane().add(usuarioSesion);
        usuarioSesion.setBounds(200, 110, 180, 30);

        setSize(new java.awt.Dimension(570, 316));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Vr().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonInicarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicarSesionActionPerformed
        
        int      id =  Integer.parseInt( usuarioSesion.getText());
        String pass = contrasenaSesion.getText();
        Archivo archivoEnviar = new Archivo("Subida",2,  new Sesion(id, pass,null,false));
        
        Cliente cliente = new Cliente("0.0.0.0",17000);
        cliente.enviar(archivoEnviar);
        Object recibir = cliente.recibir();
        
        if(validacionUsuario(recibir)){
            System.out.println("El usuario esta en la BD");
            new Vs().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "No Se Puede Acceder Con Las Credenciales Ingresadas", 
                                                        "RESOC - Acceso", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_botonInicarSesionActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField usuarioSesion;
    // End of variables declaration//GEN-END:variables
}
