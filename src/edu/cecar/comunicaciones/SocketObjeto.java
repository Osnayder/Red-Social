package edu.cecar.comunicaciones;

import java.net.*;
import java.io.*;

final public class SocketObjeto {

	private Socket socket;
	private ObjectInputStream entrada;
	private ObjectOutputStream salida;

	public SocketObjeto(String IPServidor, int puerto) {

            try {

			//** Se instancia un socket hacia el servidor con el puerto
			//** corespondiente
			socket = new Socket(IPServidor,puerto);

			//** Se crea un canal de salida hacia el servidor
			salida = new ObjectOutputStream(socket.getOutputStream()); 

			//**Se crea un canal de entrada hacia el cliente
			entrada = new ObjectInputStream(socket.getInputStream());


            } catch (Exception e)   {
		System.out.println("Error General"+e);

            }

	} 

	public Socket getSocket() {
		return socket;
	}

	public ObjectInputStream getEntrada() {
		return entrada;
	}  

	public ObjectOutputStream getSalida() {
		return salida;
	}

}	