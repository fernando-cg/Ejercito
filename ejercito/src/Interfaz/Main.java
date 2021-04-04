package Interfaz;

import java.awt.Frame;
import java.util.ArrayList;

import ejercito.* ;
import escritura.*;


public class Main {
	
	public static void main(String[] args) {
		
		new Thread (new mMarco()).start();
		new mReproductor().start();
		
		//arraylist
				ArrayList<Armada>armadas=new ArrayList<Armada>();
				ArrayList<Aire>aires=new ArrayList<Aire>();
				ArrayList<Tierra>tierras=new ArrayList<Tierra>();
				ArrayList<TropasArmada>tropasarmada=new ArrayList<TropasArmada>();
				ArrayList<VehiculosArmada>vehiculosarmada=new ArrayList<VehiculosArmada>();
				ArrayList<TropasAire>tropasaire=new ArrayList<TropasAire>();
				ArrayList<VehiculosAire>vehiculosaire=new ArrayList<VehiculosAire>();
				ArrayList<TropasTierra>Tropastierra=new ArrayList<TropasTierra>();
				ArrayList<VehiculosTierra>vehiculostierra=new ArrayList<VehiculosTierra>();
				
				//editor
				Editor airee = new Editor("datos\\Aire.txt") ; 
				Editor armadae = new Editor("datos\\Armada.txt") ;
				Editor tierrae = new Editor("datos\\Tierra.txt") ;
				Editor tropasAiree = new Editor("datos\\TropasAire.txt") ;
				Editor tropasArmadae = new Editor("datos\\TropasArmada.txt") ;
				Editor tropasTierrae = new Editor("datos\\TropasTierra.txt") ;
				Editor vehiculosAiree = new Editor("datos\\VehiculosAire.txt") ;
				Editor vehiculosArmadae = new Editor("datos\\VehiculosArmada.txt") ;
				Editor vehiculosTierrae = new Editor("datos\\VehiculosTierra.txt") ;
				
				armadas = armadae.actualizarar(armadas) ;
				aires= airee.actualizarair(aires);
				tierras= tierrae.actualizaratier(tierras);
				tropasaire=tropasAiree.actualizartropaair(tropasaire);
				tropasarmada=tropasArmadae.actualizartroparm(tropasarmada);
				Tropastierra= tropasTierrae.actualizartropatier(Tropastierra);
				vehiculosarmada= vehiculosArmadae.actualizarvehiarm(vehiculosarmada);
				vehiculosaire= vehiculosAiree.actualizarvehiair(vehiculosaire);
				vehiculostierra=vehiculosTierrae.actualizarvehitier(vehiculostierra);
				
				
				/*armadas.add(new Armada("Comandancia Naval de Sevilla","", 20838, 203, 17, 2, 1915));
				aires.add(new Aire("Cuartel General del Ejército del Aire", "Madrid", 20900, 412, 28,2, 1913));
				tierras.add(new Tierra("Cuartel General de l  Ejército de Tierra","Madrid",80000,132,1,1,1767));
				TropasTierra tt1=new TropasTierra(10000, "Oficiales", "Cuartel General	del Ejercito de Tierra");
				VehiculosTierra vt1=new VehiculosTierra(219, "Leopardo 2E","El Leopardo 2E es una variante del carro de combate alemán Leopard 2A6 adaptado a los requerimientos del Ejército de Tierra de España, que lo adquirió como parte del programa de modernización de armamento llamado Programa Coraza. ");
				TropasArmada ta1=new TropasArmada(8400, "Oficiales", "Comandancia Naval de Sevilla");
				VehiculosArmada a1= new VehiculosArmada(5, "Fragatas","La fragata es un buque de guerra concebido para actuar en misiones de guerra naval y antisubmarina, aunque puede disponer de sistemas para actuar como buque de apoyo en otras misiones. ");
				TropasAire tair1= new TropasAire(9500, "Oficiales", "Base Aerea de Moron");
				VehiculosAire va1=new VehiculosAire(73, "Eurofighter Typhoon","El Eurofighter Typhoon es un caza polivalente, bimotor y de gran maniobrabilidad, diseñado y construido por el consorcio de empresas europeas Eurofighter GmbH creado en 1983 y compuesto por las compañías Airbus, BAE Systems y Alenia Aeronautica.​");*/
	}
	

}
