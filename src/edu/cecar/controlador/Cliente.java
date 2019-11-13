package edu.cecar.controlador;


import edu.cecar.comunicaciones.SocketObjeto;
import edu.cecar.modelo.Archivo;
import java.io.IOException;

public class Cliente {
    
        SocketObjeto socketObjeto;
        
	public Cliente(String IPServidor, int puerto) {			
            try {	
               socketObjeto = new SocketObjeto(IPServidor, puerto);	
               System.out.println("Me conecte");	
            } catch (Exception e) {
               System.out.println("Error: "+e.getMessage());
            }		
	}
        
        public void enviar(Object objecto){
            Archivo archivo = new Archivo("Subida",1,objecto);
            try {
                socketObjeto.getSalida().writeObject(archivo);
            } catch (IOException ex) {
                System.out.println("Error: "+ex.getMessage());
            }
            System.out.println("Archivo subido con exito");
        }

}
