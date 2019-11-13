package edu.cecar.componentes;

import java.io.File;
import java.io.FileInputStream;


public class Utilidades {
	
	public static byte[] getBytes(String rutaNombre) throws Exception {
		byte[] resultado = new byte[1024];
                
		File archivo = new File(rutaNombre);
		FileInputStream fileInputStream = new FileInputStream(archivo);
		fileInputStream.read(resultado);
		fileInputStream.close();
                
		return resultado;
	}
	
}
