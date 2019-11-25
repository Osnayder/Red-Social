package edu.cecar.vista;

import edu.cecar.controlador.ControlTabla;
import edu.cecar.controlador.RESOC;
import edu.cecar.modelo.Archivo;
import edu.cecar.modelo.JPanelMy;
import edu.cecar.modelo.Publicacion;
import edu.cecar.modelo.Sesion;
import edu.cecar.modelo.Solicitud;
import edu.cecar.modelo.Usuario;
import edu.cecar.modelo.UsuarioConsulta;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;



public class Vs extends javax.swing.JFrame {

    private boolean control = false;
    private static Sesion sesionVs   = null;
    private static Usuario usuarioVs = null;
    private DefaultTableModel tablaPerfil = null;
    private DefaultTableModel tablaRedes = null;
    private DefaultTableModel tablaPublicaciones = null;
    private DefaultTableModel tablaListaAmigos = null;
    private DefaultTableModel tablaListaSolictudes = null;
    private ArrayList<UsuarioConsulta> listaUsuarioEsperando = null;
    
    
    public Vs(Sesion sesionVs1, Usuario usuarioVs1) {
        Vs.sesionVs = sesionVs1;
        Vs.usuarioVs = usuarioVs1;
        
        initComponents();
        componentesIniciales();
        AdvertenciaCerrar();
        CargarDatosPerfil();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lNombres = new javax.swing.JLabel();
        lApellidos = new javax.swing.JLabel();
        ledad = new javax.swing.JLabel();
        ldireccion = new javax.swing.JLabel();
        lDepartamento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTextoPerfil = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, ".    Menu Navegación   .", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Mi PERFIL");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 120, 170, 37);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 153));
        jButton2.setText("PUBLICACIONES");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(0, 190, 170, 40);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 153));
        jButton3.setText("CHAT");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(0, 330, 170, 40);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 153));
        jButton4.setText("AMIGOS");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(0, 260, 170, 40);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(0, 228, 170, 2);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 170, 600);
        jPanel1.getAccessibleContext().setAccessibleName(" Menu Navegación");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(40, 50, 1100, 10);

        jLabel1.setText("Usuario: ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 10, 60, 40);

        jLabel2.setText("Ultima Sesión:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(370, 10, 100, 40);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton6.setText("Cerrar Sesión");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(950, 10, 130, 30);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jPanel2.add(jLabel6);
        jLabel6.setBounds(100, 10, 210, 40);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(480, 10, 230, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(170, 0, 1140, 60);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);
        jPanel3.add(jLabel3);
        jLabel3.setBounds(40, 20, 310, 310);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Nombres:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(50, 340, 80, 30);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Apellidos:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(50, 370, 80, 30);

        jButton7.setBackground(new java.awt.Color(204, 255, 255));
        jButton7.setText("Editar Perfil");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jButton7);
        jButton7.setBounds(870, 350, 150, 40);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Descripción:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(390, 10, 90, 30);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Edad:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(80, 400, 50, 30);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("Dirección:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(50, 430, 80, 30);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("Departamento:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 460, 110, 30);

        lNombres.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lNombres.setForeground(new java.awt.Color(0, 0, 102));
        jPanel3.add(lNombres);
        lNombres.setBounds(130, 340, 260, 30);

        lApellidos.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lApellidos.setForeground(new java.awt.Color(0, 0, 102));
        jPanel3.add(lApellidos);
        lApellidos.setBounds(130, 370, 260, 30);

        ledad.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        ledad.setForeground(new java.awt.Color(0, 0, 102));
        jPanel3.add(ledad);
        ledad.setBounds(130, 400, 150, 30);

        ldireccion.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        ldireccion.setForeground(new java.awt.Color(0, 0, 102));
        jPanel3.add(ldireccion);
        ldireccion.setBounds(140, 430, 290, 30);

        lDepartamento.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lDepartamento.setForeground(new java.awt.Color(0, 0, 102));
        jPanel3.add(lDepartamento);
        lDepartamento.setBounds(140, 460, 290, 30);

        areaTextoPerfil.setColumns(20);
        areaTextoPerfil.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        areaTextoPerfil.setRows(5);
        jScrollPane1.setViewportView(areaTextoPerfil);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(480, 6, 590, 120);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(480, 330, 320, 120);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jPanel3.add(jScrollPane4);
        jScrollPane4.setBounds(480, 160, 590, 140);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("Foto");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(180, 0, 60, 20);

        jLabel13.setText("Otras Redes Sociales A Las Que Estas Vinculado");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(660, 140, 330, 14);

        jLabel14.setText("Lista De Tus Celulares y Telefonos");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(550, 310, 200, 14);

        jTabbedPane1.addTab("Gestionar Perfil", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jButton8.setBackground(new java.awt.Color(204, 255, 255));
        jButton8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton8.setText("Nueva Publicación");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8);
        jButton8.setBounds(190, 440, 220, 40);

        jButton12.setBackground(new java.awt.Color(204, 255, 255));
        jButton12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton12.setText("Eliminar publicacion");
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(jButton12);
        jButton12.setBounds(780, 440, 200, 40);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane3.setViewportView(jTable2);

        jPanel4.add(jScrollPane3);
        jScrollPane3.setBounds(0, 10, 1120, 400);

        jButton9.setBackground(new java.awt.Color(204, 255, 255));
        jButton9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton9.setText("Actualizar y Mostrar Publicaciones");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9);
        jButton9.setBounds(460, 440, 280, 40);

        jTabbedPane1.addTab("Getionar Publicaciones", jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mis Amigos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        jPanel9.setLayout(null);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTable4);

        jPanel9.add(jScrollPane5);
        jScrollPane5.setBounds(10, 20, 530, 290);

        jPanel6.add(jPanel9);
        jPanel9.setBounds(11, 11, 550, 320);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mis Solicitudes de Amistad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        jPanel10.setLayout(null);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTable5);

        jPanel10.add(jScrollPane6);
        jScrollPane6.setBounds(6, 18, 550, 290);

        jPanel6.add(jPanel10);
        jPanel10.setBounds(570, 10, 560, 320);

        jButton10.setBackground(new java.awt.Color(204, 255, 255));
        jButton10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton10.setText("Enviar Solicitud de Amistad");
        jButton10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10);
        jButton10.setBounds(20, 390, 260, 40);

        jButton11.setBackground(new java.awt.Color(204, 255, 255));
        jButton11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton11.setText("Ver Perfil Amigo");
        jButton11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.add(jButton11);
        jButton11.setBounds(300, 340, 220, 40);

        jButton15.setBackground(new java.awt.Color(204, 255, 255));
        jButton15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton15.setText("Ver Y Actualizar Solicitudes");
        jButton15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton15);
        jButton15.setBounds(620, 340, 240, 40);

        jButton16.setBackground(new java.awt.Color(204, 255, 255));
        jButton16.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton16.setText("Aceptar Solicitud");
        jButton16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton16);
        jButton16.setBounds(880, 340, 190, 40);

        jButton17.setBackground(new java.awt.Color(204, 255, 255));
        jButton17.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton17.setText("Ver y Actualizar Lista Amigos");
        jButton17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton17);
        jButton17.setBounds(20, 340, 260, 40);

        jTabbedPane1.addTab("Gestionar Amigos", jPanel6);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Mis Conversaciones"));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 227, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel7);
        jPanel7.setBounds(10, 11, 710, 250);

        jButton5.setBackground(new java.awt.Color(204, 255, 255));
        jButton5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton5.setText("Enviar Mensaje");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jButton5);
        jButton5.setBounds(10, 270, 170, 40);

        jButton13.setBackground(new java.awt.Color(204, 255, 255));
        jButton13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton13.setText("Buscar Conversacion");
        jButton13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton13);
        jButton13.setBounds(230, 270, 170, 40);

        jButton14.setBackground(new java.awt.Color(204, 255, 255));
        jButton14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton14.setText("Eliminar Conversacion");
        jButton14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jButton14);
        jButton14.setBounds(440, 270, 190, 40);

        jTabbedPane1.addTab("      Chat       ", jPanel5);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(170, 60, 1140, 540);

        setSize(new java.awt.Dimension(1327, 641));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void AdvertenciaCerrar(){
        try{
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {  
                public void windowClosing(WindowEvent e){
                    int valor = JOptionPane.showConfirmDialog(null,"¿Estas Seguro De Cerrar La Aplicacion?\n Al Cerrar "
                                        + "la Aplicacion Tambien Cerraras Sesión","Advertencia",JOptionPane.CLOSED_OPTION);
                    if(valor==JOptionPane.YES_OPTION){
                        System.exit(0);
                    }
                }
            });
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void componentesIniciales(){
        Object[][] datos = {};
        String[] cTelCel = {"    Telefonos     ","   Celulares   "};
        String[] cRedes = {" WhatsApp  ","  Instagram  "," Facebook ","   Twiter  "};
        String[] cPublicaciones = {"Mis Publicaciones"};
        String[] cListaAmigos = {"    Nombres   ","   Apellidos    ","    Departamento  ","    Edad    "};
        
        tablaPerfil = new DefaultTableModel(datos,cTelCel);
        jTable1.setModel(tablaPerfil);
        
        tablaRedes = new DefaultTableModel(datos,cRedes);
        jTable3.setModel(tablaRedes);
        
        tablaListaAmigos = new DefaultTableModel(datos, cListaAmigos);
        jTable4.setModel(tablaListaAmigos);
        
        tablaListaSolictudes = new DefaultTableModel(datos, cListaAmigos);
        jTable5.setModel(tablaListaSolictudes);
        
        jTable2.setDefaultRenderer(Object.class, new ControlTabla());
        tablaPublicaciones = new DefaultTableModel(datos, cPublicaciones){
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if(columnas==1){
                    return true;
                }else{
                    return false;
                }
            }
        };
        jTable2.setModel(tablaPublicaciones);
        
        TableColumnModel columnModel = jTable2.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(1100);
        columnModel.getColumn(0).setResizable(false);
        jTable2.setRowHeight(300);
    }
    
    private void CargarDatosPerfil(){
        this.getRootPane().getContentPane().setBackground(Color.WHITE);
        jLabel6.setText(sesionVs.getIdUsuario()+"");
        jLabel7.setText(sesionVs.getUltimaConexion()+"");
       
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNac = LocalDate.parse(""+usuarioVs.getFechanacimiento(), fmt);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        
        lNombres.setText(usuarioVs.getNombres());
        lApellidos.setText(usuarioVs.getApellidos());
        ldireccion.setText(usuarioVs.getDireccion());
        lDepartamento.setText(usuarioVs.getDepartamento());
        ledad.setText(" "+periodo.getYears());
        areaTextoPerfil.setText(usuarioVs.getDescripcion());
        
        String[] fila = new String[2];
        fila[0] = new String();
        fila[1] = new String();
        int numeroFila1 = usuarioVs.getTelefonos().size();
        int numeroFila2 = usuarioVs.getCelular().size();
        int mayor = 0;
        
        if(numeroFila1<numeroFila2){
            mayor = numeroFila2;
        }else{
            mayor = numeroFila1;
        }
        
        System.out.println(""+usuarioVs.getTelefonos().size()+" "+usuarioVs.getCelular().size());
        
            for(int j=0; j<mayor; j++){
                
                if(j<usuarioVs.getTelefonos().size()){
                    fila[0] = "   "+usuarioVs.getTelefonos().get(j);
                }else{
                    fila[0] = " ";
                }
                 
                if(j<usuarioVs.getCelular().size()){
                    fila[1] = "   "+usuarioVs.getCelular().get(j);
                }else{
                    fila[1] = " ";
                }
                 
                 tablaPerfil.addRow(fila);
            }
        
            if(usuarioVs.getFoto()!=null){
                try {
                    BufferedImage imagen = null;
                    InputStream in = new ByteArrayInputStream(usuarioVs.getFoto());
                    imagen = ImageIO.read(in);
                    ImageIcon imagenIcono = new ImageIcon(imagen.getScaledInstance(300,300,0));
                    jLabel3.setIcon(imagenIcono);
                } catch (IOException ex) {
                    Logger.getLogger(Vs.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                jLabel3.setText("NO AGREGÓ IMAGEN");
            }
            
    }
    
    private void cargarPublicaciones(){
        RESOC.getConexionServidor().enviar(new Archivo("Subida",5,sesionVs));
        ArrayList<Publicacion> publicacionesrecibidas = (ArrayList<Publicacion>)RESOC.getConexionServidor().recibir();

        for(int i=0; i<publicacionesrecibidas.size(); i++){
            JPanel  panel = JPanelMy.getJPanelMy(publicacionesrecibidas.get(i).getCuerpo(),publicacionesrecibidas.get(i).getTetxo(),
                publicacionesrecibidas.get(i).getMegusta(),publicacionesrecibidas.get(i).getNomegusta(),publicacionesrecibidas.get(i).getTipo_privacidad(),
                publicacionesrecibidas.get(i).getFecha(),publicacionesrecibidas.get(i).getHora());
            tablaPublicaciones.addRow(new Object[]{panel});
        }
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Vrp ventanaPublicacion = new Vrp();
        ventanaPublicacion.setVisible(true);
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
        RESOC.getVp().setVisible(true);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        tablaPublicaciones.setRowCount(0);
        cargarPublicaciones();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Vgs ventanaEnviarSolicitud = new Vgs(sesionVs);
            ventanaEnviarSolicitud.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        RESOC.getConexionServidor().enviar(new Archivo("Subida",9, new Integer(usuarioVs.getIdUsuario())));
        listaUsuarioEsperando = (ArrayList<UsuarioConsulta>) RESOC.getConexionServidor().recibir(); 
        if(listaUsuarioEsperando!=null){
            tablaListaSolictudes.setRowCount(0);
            for(int i=0; i<listaUsuarioEsperando.size(); i++){
                tablaListaSolictudes.addRow(new Object[]{listaUsuarioEsperando.get(i).getNombres(),listaUsuarioEsperando.get(i).getApellidos(),
                                 listaUsuarioEsperando.get(i).getDepartamento(),listaUsuarioEsperando.get(i).getEdad()+""});
                control = true;
            }
            
        }else{
            JOptionPane.showMessageDialog(this,"Uppss! Usted Aun No a Recibido Alguna Solicitud!","Lista de Solicitudes de Amistad",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
       Integer identificacion = new Integer(sesionVs.getIdUsuario());
        RESOC.getConexionServidor().enviar(new Archivo("Subida",8, identificacion));
        ArrayList<UsuarioConsulta> listaAmigosRecibida = (ArrayList<UsuarioConsulta>) RESOC.getConexionServidor().recibir();
        
        if(listaAmigosRecibida!=null){
            tablaListaAmigos.setRowCount(0);
            for(int i=0; i<listaAmigosRecibida.size(); i++){
                tablaListaAmigos.addRow(new Object[]{listaAmigosRecibida.get(i).getNombres(),listaAmigosRecibida.get(i).getApellidos(),
                                 listaAmigosRecibida.get(i).getDepartamento(),listaAmigosRecibida.get(i).getEdad()+""});
            }
        }else{
            JOptionPane.showMessageDialog(this,"Uppss! Aun No Tiene Ningun Amigo!","Lista de Amigos",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if(control){
            if(jTable5.getSelectedRow() != -1){
                DefaultTableModel modeloExtraerDatos = (DefaultTableModel)jTable5.getModel();
                String valor = (String)modeloExtraerDatos.getValueAt(jTable5.getSelectedRow(),0);
                
                int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro De  Aceptar La Solicitud de "+valor+"?", 
                                                         "Alerta!", JOptionPane.YES_NO_OPTION);                  
                switch(resp){
                    case -1:
                        JOptionPane.showMessageDialog(this, "La Solicitud No Fue Aceptada");
                        break;
                    case 0:
                        for(int i=0; i<listaUsuarioEsperando.size(); i++){
                            if(listaUsuarioEsperando.get(i).getNombres().equals(valor)){
                                Solicitud solicitud = new Solicitud(sesionVs.getIdUsuario(), listaUsuarioEsperando.get(i).getIdUsuario(), 0, null);
                                RESOC.getConexionServidor().enviar(new Archivo("Subida",10,solicitud));
                            }
                        }
                        JOptionPane.showMessageDialog(this, "Solicitud Aceptada");
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(this, "La Solicitud No Fue Aceptada");
                        break;
                }   
            }else{
                JOptionPane.showMessageDialog(this,"Debe Primero Seleccionar Un Usuario de La Lista de Solicitudes",
                                                     "Selección de Campo", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Debe Primero Actulizar Y Listar Tu Solicitudes De Amistad",
                                                     "Listar Solicitudes", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    public static Usuario getUsuario(){
        return Vs.usuarioVs;
    }
    
    public static Sesion getSesion(){
        return Vs.sesionVs;
    }
  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTextoPerfil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JLabel lApellidos;
    private javax.swing.JLabel lDepartamento;
    private javax.swing.JLabel lNombres;
    private javax.swing.JLabel ldireccion;
    private javax.swing.JLabel ledad;
    // End of variables declaration//GEN-END:variables
}
