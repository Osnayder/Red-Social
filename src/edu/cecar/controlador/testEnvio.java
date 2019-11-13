/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.cecar.controlador;

import edu.cecar.modelo.Archivo;

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

public class testEnvio {
    
    public static void main(String[] args){
        
        Archivo n = new Archivo("Subida", 24, new String("hola"));
        new Cliente("127.0.0.1",17000, n);
    }
}
