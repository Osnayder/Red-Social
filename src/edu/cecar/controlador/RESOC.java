package edu.cecar.controlador;

import edu.cecar.vista.Vp;

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

public class RESOC {

    private static Cliente cliente = new Cliente("0.0.0.0", 17000);
    private static Vp ventanaPrincipal = new Vp();
    
    public static void main(String[] args){
        ventanaPrincipal.setVisible(true);
    }
    
    public static Cliente getConexionServidor(){
        return RESOC.cliente;
    }
    
    public static Vp getVp(){
        return RESOC.ventanaPrincipal;
    }
}
