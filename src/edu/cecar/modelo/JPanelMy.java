package edu.cecar.modelo;

import edu.cecar.vista.Vs;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/** Clase: 
 * 
 * @version: 1.0
 *  
 * @sincelejo: 21/08/2019
 * 
 * Fecha de Modificación: 
 * 
 * @author: Osnayder Conde Rodriguez
 * 
 * Copyrigth: CECAR
 */

public class JPanelMy {

    public static JPanel getJPanelMy(byte[] cuerpo,String texto,int megustas,int nomegustas,int privacidad,java.sql.Date fecha,java.sql.Time hora) {
        JPanel panel = new JPanel();

        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        
        JLabel jl = new JLabel();
         if(cuerpo!=null){
            try {
                ImageIcon imagenIcono = null;
                BufferedImage imagen = null;
                InputStream in = new ByteArrayInputStream(cuerpo);
                
                imagen = ImageIO.read(in);
                if(imagen!=null){
                    imagenIcono = new ImageIcon(imagen.getScaledInstance(300,300,0));
                }                

                jl.setLocation(5, 5);
                jl.setSize(300, 300);
                jl.setIcon(imagenIcono);
            } catch (IOException ex) {
                Logger.getLogger(Vs.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            jl.setText("NO AGREGÓ IMAGEN");
        }
                
        JTextArea ja = new JTextArea();
        ja.setFont(new java.awt.Font("Monospaced", 1, 14));
        ja.setRows(5);
        ja.setSize(400,500);
        ja.setLocation(350, 20);
        ja.setLineWrap(true);
        ja.setWrapStyleWord(true);
        ja.setText("    Descripcion o Texto de Anexo: \n\n"+texto);
        
        
        JLabel jb = new JLabel();
        jb.setText("Me Gusta");
        jb.setSize(100,30);
        jb.setLocation(770, 20);
        
        JLabel jb2 = new JLabel();
        jb2.setText(": "+megustas);
        jb2.setSize(120,20);
        jb2.setLocation(900, 20);
        
        JLabel jb1 = new JLabel();
        jb1.setText("No Me Gusta");
        jb1.setSize(120,20);
        jb1.setLocation(770, 60);
        
        JLabel jb3 = new JLabel();
        jb3.setText(": "+nomegustas);
        jb3.setSize(120,20);
        jb3.setLocation(900, 60);
       
        JLabel jl4 = new JLabel();
        jl4.setText("Tipo de Privacidad ");
        jl4.setSize(120,20);
        jl4.setLocation(770, 100);
        
        JLabel jl5 = new JLabel();
        jl5.setSize(120,20);
        jl5.setLocation(900, 100);
        
        switch(privacidad){
            case 0: jl5.setText(": Solo Yo"); break;
            case 1: jl5.setText(": Solo Amigos"); break;
            case 2: jl5.setText(": Todos"); break;
        }
        
        JLabel jl6 = new JLabel();
        jl6.setText("Fecha ");
        jl6.setSize(120,20);
        jl6.setLocation(770, 140);
        
        JLabel jl8 = new JLabel();
        jl8.setText(": "+fecha);
        jl8.setSize(120,20);
        jl8.setLocation(900, 140);
        
        JLabel jl7 = new JLabel();
        jl7.setText("Hora ");
        jl7.setSize(120,20);
        jl7.setLocation(770, 180);
        
        JLabel jl9 = new JLabel();
        jl9.setText(": "+hora);
        jl9.setSize(120,20);
        jl9.setLocation(900, 180);
        
        panel.add(jl);
        panel.add(jb);
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);
        panel.add(ja);
        panel.add(jl4);
        panel.add(jl5);
        panel.add(jl6);
        panel.add(jl7);
        panel.add(jl8);
        panel.add(jl9);

        return panel;
    }
    
    
}
