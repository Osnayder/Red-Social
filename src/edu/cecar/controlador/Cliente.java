package edu.cecar.controlador;



import edu.cecar.componentes.comunicaciones.SocketObjeto;
import edu.cecar.modelo.Archivo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {
    
        public Cliente(String IPServidor, int puerto, Archivo archivo) {
                try {
                    SocketObjeto socketObjeto = new SocketObjeto(IPServidor, puerto); 
                    System.out.println("Me conecte");
                    socketObjeto.getSalida().writeObject(archivo);
                    System.out.println("Se Subio El Archivo");
                    Thread.sleep(1000); 
                    System.out.println("Cerrando conexión");
                } catch (Exception e) {
                      
                    e.printStackTrace();
                }
        
         }

        public static void enviar(Object objectoEnviar){
            
        }
}
