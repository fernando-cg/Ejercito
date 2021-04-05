package Interfaz;

import java.awt.Frame;
import java.util.ArrayList;

import ejercito.* ;
import escritura.*;


public class Main {
	
	public static void main(String[] args) {
		
		new Thread (new mMarco()).start();
		//new mReproductor().start();
	}
	

}
