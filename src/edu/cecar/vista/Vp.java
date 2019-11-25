package edu.cecar.vista;

import edu.cecar.controlador.RESOC;
import edu.cecar.modelo.Archivo;
import edu.cecar.modelo.Sesion;
import edu.cecar.modelo.Usuario;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Vp extends javax.swing.JFrame {
     
    public Vp() {
        initComponents();
        componentesIniciales();
        //usuarioSesion.setText("1003214327");
        //contrasenaSesion.setText("yosoyosnaider");
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
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RESOC");
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
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
        jButton1.setBounds(130, 220, 120, 30);

        botonInicarSesion.setBackground(new java.awt.Color(204, 255, 255));
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
        botonInicarSesion.setBounds(460, 220, 140, 30);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Inicio de Sesión");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 40, 150, 30);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 100, 70, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 150, 90, 30);

        contrasenaSesion.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        contrasenaSesion.setForeground(new java.awt.Color(0, 0, 102));
        contrasenaSesion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contrasenaSesion.setToolTipText("La contraseña que ingreso al registrase");
        contrasenaSesion.setAlignmentX(9.0F);
        contrasenaSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(153, 153, 153)));
        contrasenaSesion.setMargin(new java.awt.Insets(5, 5, 5, 5));
        getContentPane().add(contrasenaSesion);
        contrasenaSesion.setBounds(260, 150, 190, 30);

        usuarioSesion.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        usuarioSesion.setForeground(new java.awt.Color(0, 0, 102));
        usuarioSesion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuarioSesion.setToolTipText("El usuario es tu numero de identificacion");
        usuarioSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(153, 153, 153)));
        getContentPane().add(usuarioSesion);
        usuarioSesion.setBounds(260, 100, 190, 30);

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setText("Cerrar RESOC");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(280, 270, 150, 30);

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton3.setText("Eliminar Mi Cuenta");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(280, 220, 150, 30);

        setSize(new java.awt.Dimension(668, 354));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        usuarioSesion.setText("");
        contrasenaSesion.setText("");
        new Vr().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonInicarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicarSesionActionPerformed
        
        if(!usuarioSesion.getText().equals("") && !contrasenaSesion.getText().equals("")){
            int      id =  Integer.parseInt( usuarioSesion.getText());
            String pass = contrasenaSesion.getText();
            Archivo archivoEnviar = new Archivo("Subida",2,  new Sesion(id, pass,null,false));

            RESOC.getConexionServidor().enviar(archivoEnviar);
            Object recibir = RESOC.getConexionServidor().recibir();

            if(validacionUsuario(recibir)){
                RESOC.getConexionServidor().enviar(new Archivo("Subida",3,new Integer(id)));
                Object recibido = RESOC.getConexionServidor().recibir();
                Vs ventanaSesion = new Vs((Sesion)recibir,(Usuario)recibido);
                ventanaSesion.setVisible(true);
                this.setVisible(false);
                usuarioSesion.setText("");
                contrasenaSesion.setText("");
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        Sesion ssee = new Sesion(Integer.parseInt(usuarioSesion.getText()),contrasenaSesion.getText(),null,false);
        
        RESOC.getConexionServidor().enviar(new Archivo("Subida",2,ssee));
        Object recibir = RESOC.getConexionServidor().recibir();

            if(validacionUsuario(recibir)){
                RESOC.getConexionServidor().enviar(new Archivo("Subida",3,new Integer(Integer.parseInt(usuarioSesion.getText()))));
                Object recibido = RESOC.getConexionServidor().recibir();
                Usuario usuario = (Usuario) recibido;
                int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro De Eliminar Su Cuenta De RESOC Señor "+
                            usuario.getNombres()+" "+usuario.getApellidos()+"?","Alerta!", JOptionPane.YES_NO_OPTION);  
                
                switch(resp){
                    case -1:
                        JOptionPane.showMessageDialog(this, "Canceló La Operación, Usted Aun  Continua Con Nosotros");
                        break;
                    case 0:
                        RESOC.getConexionServidor().enviar(new Archivo("Subida",11, ssee));
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(this, "Canceló La Operación, Usted Aun  Continua Con Nosotros");
                        break;
                }
                
                
                usuarioSesion.setText("");
                contrasenaSesion.setText("");
                JOptionPane.showMessageDialog(this, "Operacion Exitosa, Usted Ya No Hace Parte de RESOC");
            }else{
                JOptionPane.showMessageDialog(this, "Usted No Se Encuentra Resgitrado!", 
                                                            "RESOC", JOptionPane.ERROR_MESSAGE);
            }   
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void componentesIniciales(){
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
    private boolean validacionUsuario(Object objeto){
        Sesion sesionUsuario = (Sesion)objeto; 
        boolean salida = false;
        if(sesionUsuario.getUltimaConexion()!=null){
            salida = true;
        }
        return salida;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInicarSesion;
    private javax.swing.JPasswordField contrasenaSesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField usuarioSesion;
    // End of variables declaration//GEN-END:variables
}
