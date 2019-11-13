package edu.cecar.componentes.comunicaciones;

import java.net.*;
import java.io.*;

final public class SocketObjeto {

	private Socket socket;
	private ObjectInputStream entrada;
	private ObjectOutputStream salida;

	public SocketObjeto(String IPServidor, int puerto) {

		try {
			socket = new Socket(IPServidor,puerto);
			salida = new ObjectOutputStream(socket.getOutputStream()); 
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