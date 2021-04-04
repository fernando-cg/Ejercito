package Interfaz;

import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;

public class mReproductor extends Thread {

	public mReproductor() {
	
	}
	
	public void run() {
		Reproductor r1 = new Reproductor();
		try {
			r1.btnReproducirActionPerformed(null);
		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JavaLayerException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	//asdad
	//aaa
}
}