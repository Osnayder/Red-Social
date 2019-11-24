package edu.cecar.vista;

import edu.cecar.controlador.RESOC;
import edu.cecar.modelo.Archivo;
import edu.cecar.modelo.UsuarioConsulta;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vgs extends javax.swing.JFrame {

    private DefaultTableModel tablaResultadoBusqueda = null;
    private boolean control = false;
    
    public Vgs() {
        ComponentesIniciales();
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        campoValorBusqueda = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ventana Gestionar Solicitudes");
        setResizable(false);
        getContentPane().setLayout(null);

        jTable1.setModel(tablaResultadoBusqueda);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 110, 770, 190);
        getContentPane().add(campoValorBusqueda);
        campoValorBusqueda.setBounds(20, 40, 390, 30);

        Buscar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Buscar.setText("Buscar");
        Buscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar);
        Buscar.setBounds(610, 40, 180, 30);

        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 310, 170, 30);

        jButton3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton3.setText("Enviar Solicitud");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(470, 310, 160, 30);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Resultados de Busqueda");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 80, 240, 20);

        jComboBox1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombres", "Departamento", "Edad" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(430, 40, 160, 30);

        jLabel2.setText("Nota: Para Enviar Una Solicitud debe primero buscar un usuario de la red Social  RESOC");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 10, 660, 14);

        setSize(new java.awt.Dimension(827, 396));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        String Valor = "";
        if(!campoValorBusqueda.getText().equals("")){
            RESOC.getConexionServidor().enviar(new Archivo("Subida",6,jComboBox1.getSelectedIndex()+"+"+campoValorBusqueda.getText()));            
            ArrayList<UsuarioConsulta> listaUsuario = (ArrayList<UsuarioConsulta>) RESOC.getConexionServidor().recibir();
            
            tablaResultadoBusqueda.setRowCount(0);
            if(listaUsuario!=null){
                switch(jComboBox1.getSelectedIndex()){
                    case 0:
                        for(int i=0; i<listaUsuario.size(); i++){
                            tablaResultadoBusqueda.addRow(new Object[]{listaUsuario.get(i).getNombres(),listaUsuario.get(i).getApellidos(),
                                                          listaUsuario.get(i).getDepartamento()," "+listaUsuario.get(i).getEdad()});
                        }
                        break;
                    case 1:
                        for(int i=0; i<listaUsuario.size(); i++){
                            tablaResultadoBusqueda.addRow(new Object[]{listaUsuario.get(i).getNombres(),listaUsuario.get(i).getApellidos(),
                                                          listaUsuario.get(i).getDepartamento()," "+listaUsuario.get(i).getEdad()});
                        }
                        break;
                    case 2:
                        break;
                }
                
                
            }else{
                JOptionPane.showMessageDialog(this,"No Se Encontró Coincidencia Con el Valor y El Criterio Especificado",
                                                                "Buqueda de Usuarios", JOptionPane.ERROR_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(this,"No Se Puede Hacer Buqueda Con El Valor De Busqueda Especificado",
                                                                "Buqueda de Usuarios", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(control){
            if(jTable1.getSelectedRow() != -1){
                DefaultTableModel modeloExtraerDatos = (DefaultTableModel)jTable1.getModel();
                String valor = (String)modeloExtraerDatos.getValueAt(jTable1.getSelectedRow(),0);
                System.out.println("Numero de Fila Seleccionada:  "+jTable1.getSelectedRow());
                System.out.println("Valor: "+valor);
            }else{
                JOptionPane.showMessageDialog(this,"Debe Primero Seleccionar Un Usuario En La Tabla",
                                                     "Selección de Campo", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Debe Primero Buscar Un Usuario, Para Enviar Solicitud",
                                                     "Buscar Usuario", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ComponentesIniciales(){
        String cabezaTabla[] = {"    Nombres   ","   Apellidos    ","    Departamento  ","    Edad    "};
        Object[][] datos = {};
        
        tablaResultadoBusqueda = new DefaultTableModel(datos,cabezaTabla);
        
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
            java.util.logging.Logger.getLogger(Vgs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vgs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vgs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vgs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vgs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField campoValorBusqueda;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
