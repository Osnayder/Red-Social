package edu.cecar.controlador;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

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

public class ControlTabla extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        
        if(o instanceof JLabel){
            JLabel jlabel = (JLabel)o;
            return jlabel;
        }else if(o instanceof JPanel){
            JPanel jpanel = (JPanel)o;
            return jpanel;
        }
       
        return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1); 
    }
    
}
