package edu.cecar.controlador;

import edu.cecar.componentes.comunicaciones.SocketObjeto;
import edu.cecar.modelo.Archivo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {
    
        public SocketObjeto socketObjeto;
        
        public Cliente(String IPServidor, int puerto) {
            
            if(socketObjeto==null){
                try {
                    socketObjeto = new SocketObjeto(IPServidor, puerto); 
                    System.out.println("Me conecte");
                } catch (Exception e) { 
                    e.printStackTrace();
                }
            }
        
         }

        public  void enviar(Archivo archivoEnviar){
            try {
                socketObjeto.getSalida().writeObject(archivoEnviar);
                System.out.println("Se Subio El Archivo");
                
                try {
                    Thread.sleep(1000);
                    System.out.println("cerrando conexcion!");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public Object recibir(){
            Object objeto = null;
            
            try {
                objeto =  socketObjeto.getEntrada().readObject();
            } catch (IOException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            return objeto;
        }
}
