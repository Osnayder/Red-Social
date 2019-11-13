package edu.cecar.controlador;


import edu.cecar.comunicaciones.SocketObjeto;
import edu.cecar.modelo.Archivo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {
    
        SocketObjeto socketObjeto;
        
	public Cliente(String IPServidor, int puerto, Archivo archivo) {			
            try {	
               socketObjeto = new SocketObjeto(IPServidor, puerto);
               socketObjeto.getSalida().writeObject((Object)archivo);
               System.out.println("Me conecte");	
               Thread.sleep(1000);
                System.out.println("Archivo subido con exito");
            } catch (Exception e) {
               System.out.println("Error: "+e.getMessage());
            }		
	}
        
        public void enviar(Archivo archivo){
            
            try {
                socketObjeto.getSalida().writeObject((Object)archivo);
                Thread.sleep(1000);
                System.out.println("Archivo subido con exito");
                Thread.sleep(1000); //Se bloquea por lo explicado en clase
                System.out.println("Cerrando conexi�n");
            } catch (IOException ex) {
                System.out.println("Error: "+ex.getMessage());
            } catch (InterruptedException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }

}
