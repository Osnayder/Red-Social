package edu.cecar.vista;

import edu.cecar.componentes.Utilidades;
import edu.cecar.modelo.Publicacion;
import java.io.File;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Vrp extends javax.swing.JFrame {

    byte[] archivoMultimedia  = null;
    Publicacion miPublicacion = null;
    
    public Vrp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        nivelPrivacidad = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreMultimedia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva Publicación");
        getContentPane().setLayout(null);

        jButton1.setText("Agregar Multimedia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 110, 190, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 30, 240, 190);

        nivelPrivacidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solo Yo", "Solo Amigos", "Todos" }));
        getContentPane().add(nivelPrivacidad);
        nivelPrivacidad.setBounds(280, 60, 190, 30);

        jButton2.setText("Publicar");
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 230, 80, 30);

        jLabel1.setText("Nivel de Privacidad");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 30, 110, 20);

        jLabel2.setText("Frase o texto a publicar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 10, 160, 14);
        getContentPane().add(nombreMultimedia);
        nombreMultimedia.setBounds(280, 160, 230, 30);

        setSize(new java.awt.Dimension(559, 336));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombresFormatos = "Formato de Archivos .jpg, .jpeg, .png";
        int ventana = 0;
        Date fecha = new Date();
        Calendar HoraSistema = new GregorianCalendar();
        java.sql.Time hora = new java.sql.Time(HoraSistema.getTimeInMillis());
        
        FileNameExtensionFilter filto = new FileNameExtensionFilter(nombresFormatos,"jpg","png","jpeg");
        javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
        
        fileChooser.addChoosableFileFilter(filto);
        fileChooser.setDialogTitle("Abrir Archivo");
        fileChooser.setCurrentDirectory(new File("C:\\Users\\Public\\Pictures"));
        ventana = fileChooser.showOpenDialog(null);
      
        if(ventana==JFileChooser.APPROVE_OPTION){
            try {
                nombreMultimedia.setText(fileChooser.getSelectedFile().getName());
                archivoMultimedia = Utilidades.getBytes(String.valueOf(fileChooser.getSelectedFile()));
                JOptionPane.showMessageDialog(this,"En hora buena! Se Cargo la Imagen",
                                            "Archivo",JOptionPane.INFORMATION_MESSAGE);
                miPublicacion = new Publicacion(0, archivoMultimedia, 0,0, fecha, hora,nivelPrivacidad.getSelectedIndex());
                System.out.println("hora: "+hora);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,"Upssss! no se pudo cargar la imagen",
                                                    "Archivo",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Vrp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vrp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vrp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vrp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vrp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> nivelPrivacidad;
    private javax.swing.JLabel nombreMultimedia;
    // End of variables declaration//GEN-END:variables
}
