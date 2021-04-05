package Interfaz;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import escritura.Editor;

import ejercito.* ;
import escritura.Editor; 
@SuppressWarnings({ "serial", "deprecation" })
public class Marco extends JFrame {
	
	private JPanel panel;
	private JLabel etiqueta, fondo;
	private JButton img1, img2, img3, bt2,bt3,bt4;
	Toolkit monitor = Toolkit.getDefaultToolkit();
	Dimension tamanio=monitor.getScreenSize();
	int alturaM = tamanio.width;
	int anchuraM= tamanio.height;
	
	
	public Marco() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200,200);
		
		setSize(anchuraM/2, alturaM/2);
		setLocation(anchuraM/4, alturaM/4);
		
		iniciarComponentes();
	}
	private void iniciarComponentes() {
		colocarPanel();
		
		
		colocarEtiqueta();
		colocarElementos();
		colocarFondo();
		
		
	}
	private void colocarPanel() {
		
		panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);
		
	}
	
	private void colocarFondo() {
		fondo = new JLabel ();
		ImageIcon img1 = new ImageIcon(getClass().getResource("/Imagenes/fondo.png"));
		fondo.setIcon(new ImageIcon(img1.getImage().getScaledInstance(anchuraM*2,alturaM,Image.SCALE_SMOOTH)));
		fondo.setBounds(0,0,anchuraM*2,alturaM);
		panel.add(fondo);
	}
	private void colocarEtiqueta() {
		etiqueta = new JLabel("Escoja el ejercito que quiere ver");
		etiqueta.setBounds((anchuraM/2)+ anchuraM/8, alturaM/50, 400, 100);
		
		etiqueta.setFont(new Font("Arial", 1, 20));
		etiqueta.setForeground(Color.WHITE);
		panel.add(etiqueta);
		
		etiqueta = new JLabel("Tierra");
		etiqueta.setBounds(((anchuraM/8)+ anchuraM/7)+ anchuraM/14,230, 300, 100);
		
		etiqueta.setFont(new Font("Arial", 2, 20));
		etiqueta.setForeground(Color.WHITE);
		panel.add(etiqueta);
		
		etiqueta = new JLabel("Aire");
		etiqueta.setBounds((int) (((anchuraM/2)+ anchuraM/7)+ anchuraM/6.8),alturaM/5, 300, 100);
		
		etiqueta.setFont(new Font("Arial", 2, 20));
		etiqueta.setForeground(Color.WHITE);
		panel.add(etiqueta);
		
		etiqueta = new JLabel("Armada");
		etiqueta.setBounds(((anchuraM)+ anchuraM/7)+ anchuraM/23,230, 300, 100);
		
		etiqueta.setFont(new Font("Arial", 0, 20));
		etiqueta.setForeground(Color.WHITE);
		panel.add(etiqueta);
		
	}
	private void colocarElementos(){
		img1 = new JButton();
		ImageIcon imgTierra = new ImageIcon(getClass().getResource("/Imagenes/Tierra.png"));
		img1.setIcon(new ImageIcon(imgTierra.getImage().getScaledInstance(anchuraM/5,alturaM/5,Image.SCALE_SMOOTH)));
		img1.setOpaque(false);
		img1.setContentAreaFilled(false);
		img1.setBorderPainted(false);
		panel.add(img1);
		img1.setBounds((anchuraM/8)+ anchuraM/7,alturaM/5,anchuraM/5,alturaM/5);
		
		
		
		
		
		img2 = new JButton ();
		ImageIcon imgAire = new ImageIcon(getClass().getResource("/Imagenes/Aire.png"));
		img2.setIcon(new ImageIcon(imgAire.getImage().getScaledInstance(anchuraM/3,alturaM/9,Image.SCALE_SMOOTH)));
		img2.setBounds((anchuraM/2)+ anchuraM/7,alturaM/4,anchuraM/3,alturaM/9);
		img2.setOpaque(false);
		img2.setContentAreaFilled(false);
		img2.setBorderPainted(false);
		panel.add(img2);
		
		img3 = new JButton();
		ImageIcon imgArmada = new ImageIcon(getClass().getResource("/Imagenes/Armada.png"));
		img3.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(anchuraM/6,alturaM/5,Image.SCALE_SMOOTH)));
		img3.setBounds((anchuraM)+ anchuraM/7,alturaM/5,anchuraM/6,alturaM/5);
		img3.setOpaque(false);
		img3.setContentAreaFilled(false);
		img3.setBorderPainted(false);
		panel.add(img3);
		//Boton creado
		bt3 = new JButton("TEST");
		panel.add(bt3);
		bt3.setBounds((int) ((anchuraM/0.85)+ anchuraM/4.45),alturaM/2, 140, 40);
		//Fin del boton creado
		
		ActionListener eventoClic = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				mTierra t1 = new mTierra();		
				t1.setVisible(true);
				t1.setTitle("Ejercito de Tierra");
				t1.setResizable(false);
				t1.setExtendedState(Frame.MAXIMIZED_BOTH);
					
			}
				
				
		};
		img1.addActionListener(eventoClic);
		
		ActionListener eventoClic2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				mAire a1 = new mAire();		
				a1.setVisible(true);
				a1.setTitle("Ejercito de Aire");
				a1.setResizable(false);
				a1.setExtendedState(Frame.MAXIMIZED_BOTH);
				
					
					
			}
				
				
		};
		img2.addActionListener(eventoClic2);
		
		ActionListener eventoClic3 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			
				mArmada ar1 = new mArmada();		
				ar1.setVisible(true);
				ar1.setTitle("Armada");
				ar1.setResizable(false);
				ar1.setExtendedState(Frame.MAXIMIZED_BOTH);
					
					
			}
				
				
		};
		img3.addActionListener(eventoClic3);
		bt2 = new JButton("Salir");
		panel.add(bt2);
		bt2.setBounds((int) ((anchuraM/2)+ anchuraM/4.45),alturaM/2, 140, 40);
		
		bt4 = new JButton("Administracion");
		panel.add(bt4);
		bt4.setBounds((int) (anchuraM/4),alturaM/2, 140, 40);
		
		ActionListener eventoClic4 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
					 
					
			}
			
				
				
		};
		
		bt2.addActionListener(eventoClic4);
		

	
	
		//Cambio realizado para el boton del test	
		
		ActionListener eventoClic5 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Test test =new Test();
				test.Pregunta1();
				test.Pregunta2();
				test.Pregunta3();
				test.Pregunta4();
				test.Pregunta5();
				test.Pregunta6();
				test.Pregunta7();
				test.Pregunta8();
				test.Pregunta9();
				test.Pregunta10();
				test.getContador();

				
					
			}
				
				
		};
		
		bt3.addActionListener(eventoClic5);
		
		ActionListener eventoClic6 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<Armada>armadas=new ArrayList<Armada>();
				ArrayList<Aire>aires=new ArrayList<Aire>();
				ArrayList<Tierra>tierras=new ArrayList<Tierra>();
				ArrayList<TropasArmada>tropasarmada=new ArrayList<TropasArmada>();
				ArrayList<VehiculosArmada>vehiculosarmada=new ArrayList<VehiculosArmada>();
				ArrayList<TropasAire>tropasaire=new ArrayList<TropasAire>();
				ArrayList<VehiculosAire>vehiculosaire=new ArrayList<VehiculosAire>();
				ArrayList<TropasTierra>Tropastierra=new ArrayList<TropasTierra>();
				ArrayList<VehiculosTierra>vehiculostierra=new ArrayList<VehiculosTierra>();
				
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
				
				UIManager UI=new UIManager();
			    UI.put("OptionPane.background", new Color(0, 62, 0));
			    UI.put("Panel.background", new Color(0, 62, 0));
			    UI.put("Menu.Foreground",Color.red);
			    UI.put("OptionPane.messageFont", new Font("Arial",Font.CENTER_BASELINE,15));
			    UI.put("OptionPane.messageForeground", Color.white);
			    
				String user=(String)JOptionPane.showInputDialog(
						null,"Introduzca el usuario","Usuario", JOptionPane.INFORMATION_MESSAGE,
				        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
				String pass=(String)JOptionPane.showInputDialog(
						null,"Introduzca el password","Password", JOptionPane.INFORMATION_MESSAGE,
				        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
				Editor e1 = new Editor("datos\\Usuarios.txt") ;
				
				if(e1.usuario(user)&&e1.pass(pass)) {
					
					int seleccion= 3 ;
					
					do {
						String opciones[] = {"Ejercito de tierra" , "Ejercito de aire" , "Armada", "Salir"} ;
						seleccion =JOptionPane.showOptionDialog(null, "Seleccione una opción", "Administración", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,  new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), opciones, opciones[3]);
						String opciones1[] = {"Bases" , "Tropas" , "Vehiculos", "Salir"} ;
						String opciones2[] = {"Add" , "Eliminar" , "Salir"} ;
						int seleccion1 ;
						switch (seleccion) {
						case 0:
							do {
								seleccion1 =JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Ejercito de tierra", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,  new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), opciones1, opciones1[3]);
								int seleccion2 ;
								switch (seleccion1) {
								//tierra
									case 0:
										
										do {
											seleccion2 =JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Bases", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,  new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), opciones2, opciones2[2]);
											
											switch (seleccion2) {
											
												case 0:
													
													String nombrebase=(String)JOptionPane.showInputDialog(
															null,"Introduzca el nombre de la base","Bases", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
													
													String sede=(String)JOptionPane.showInputDialog(
															null,"Introduzca la sede","sede", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
													
													int numeroTropas=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca el numero de tropas","Bases", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													int numNaves=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca el numero de Naves","Bases", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													int dia=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca el dia de fundacion","Bases", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													int mes=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca el mes de fundacion","Bases", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													int annio=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca el annio de fundacion","Bases", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													tierras.add(new Tierra(nombrebase,sede,numeroTropas, numNaves , dia,mes,annio)) ;
													break;
					
												case 1:
													
													String[] bases = new String[tierras.size()];
														for(int x = 0 ; x < tierras.size() ; x++) {
															
															
															
															String salida = (x+1)+ "->" + tierras.get(x).getNombreBase() ;
															
															bases[x] = salida ;
													}
														
														JPanel panel2 = new JPanel(new GridBagLayout());
														
														JComboBox box2 = new JComboBox(bases);
														
														JOptionPane.showMessageDialog(null, box2, "Seleccione una base para eliminar" ,JOptionPane.QUESTION_MESSAGE);
														
														int resp2 = box2.getSelectedIndex() ;
														tierras.remove(resp2) ;
														tierrae.eliminarFila(resp2) ;
													break;
													
												case 2:
													
													break;

													
											}
										}while(seleccion2!=2) ;
										break;
		
									case 1:
										do {
											seleccion2 =JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Tropas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,  new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), opciones2, opciones2[2]);
											
											switch (seleccion2) {
											
												case 0:
													
													String base=(String)JOptionPane.showInputDialog(
															null,"Introduzca el nombre de la base a la que pertenece","Tropas", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
													
													String rango=(String)JOptionPane.showInputDialog(
															null,"Introduzca el rango","Tropas", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
													
													int numeroTropas=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca la cantidad de esta tropa","Tropas", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													Tropastierra.add(new TropasTierra(numeroTropas,rango,base)) ;
													
													break;
					
												case 1:
													
													String[] bases = new String[Tropastierra.size()];
														for(int x = 0 ; x < Tropastierra.size() ; x++) {
															
															
															
															String salida = (x+1)+ "->" + Tropastierra.get(x).getRango() ;
															
															bases[x] = salida ;
													}
														
														JPanel panel2 = new JPanel(new GridBagLayout());
														
														JComboBox box2 = new JComboBox(bases);
														
														JOptionPane.showMessageDialog(null, box2, "Seleccione un rango para eliminar" ,JOptionPane.QUESTION_MESSAGE);
														
														int resp2 = box2.getSelectedIndex() ;
														Tropastierra.remove(resp2) ;
														tropasTierrae.eliminarFila(resp2) ;
													break;
													
												case 2:
													
													break;

													
											}
										}while(seleccion2!=2) ;
										
										break;
										
									case 2:
										
										do {
											seleccion2 =JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Vehiculos", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,  new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), opciones2, opciones2[2]);
											
											switch (seleccion2) {
											
												case 0:
													
													String base=(String)JOptionPane.showInputDialog(
															null,"Introduzca el nombre y modelo del vehículo","Vehículo", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
													
													String rango=(String)JOptionPane.showInputDialog(
															null,"Introduzca una descripcion del vehiculo","Vehiculo", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
													
													int numeroTropas=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca la cantidad de vehiculos","Vehiculo", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													vehiculostierra.add(new VehiculosTierra(numeroTropas,base,rango)) ;
													
													break;
					
												case 1:
													
													String[] bases = new String[vehiculostierra.size()];
														for(int x = 0 ; x < vehiculostierra.size() ; x++) {
															
															
															
															String salida = (x+1)+ "->" + vehiculostierra.get(x).getTipo() ;
															
															bases[x] = salida ;
													}
														
														JPanel panel2 = new JPanel(new GridBagLayout());
														
														JComboBox box2 = new JComboBox(bases);
														
														JOptionPane.showMessageDialog(null, box2, "Seleccione un vehiculo" ,JOptionPane.QUESTION_MESSAGE);
														
														int resp2 = box2.getSelectedIndex() ;
														vehiculostierra.remove(resp2) ;
														vehiculosTierrae.eliminarFila(resp2) ;
													break;
													
												case 2:
													
													break;

													
											}
										}while(seleccion2!=2) ;
										
										break;
										
									case 3:
										
										break;
										
								}
							}while(seleccion1 != 3) ;
							break;
						case 1:
							do {
								seleccion1 =JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Ejercito de aire", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,  new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), opciones1, opciones1[3]);
								int seleccion2 ;
								switch (seleccion1) {
								//Aire
									case 0:
										
										do {
											seleccion2 =JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Bases", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,  new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), opciones2, opciones2[2]);
											
											switch (seleccion2) {
											
												case 0:
													
													String nombrebase=(String)JOptionPane.showInputDialog(
															null,"Introduzca el nombre de la base","Bases", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
													
													String sede=(String)JOptionPane.showInputDialog(
															null,"Introduzca la sede","sede", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
													
													int numeroTropas=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca el numero de tropas","Bases", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													int numNaves=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca el numero de Naves","Bases", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													int dia=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca el dia de fundacion","Bases", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													int mes=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca el mes de fundacion","Bases", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													int annio=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca el annio de fundacion","Bases", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													aires.add(new Aire(nombrebase,sede,numeroTropas, numNaves , dia,mes,annio)) ;
													break;
					
												case 1:
													
													String[] bases = new String[aires.size()];
														for(int x = 0 ; x < aires.size() ; x++) {
															
															
															
															String salida = (x+1)+ "->" + aires.get(x).getNombreBase() ;
															
															bases[x] = salida ;
													}
														
														JPanel panel2 = new JPanel(new GridBagLayout());
														
														JComboBox box2 = new JComboBox(bases);
														
														JOptionPane.showMessageDialog(null, box2, "Seleccione una base para eliminar" ,JOptionPane.QUESTION_MESSAGE);
														
														int resp2 = box2.getSelectedIndex() ;
														aires.remove(resp2) ;
														airee.eliminarFila(resp2) ;
													break;
													
												case 2:
													
													break;

													
											}
										}while(seleccion2!=2) ;
										break;
		
									case 1:
										do {
											seleccion2 =JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Tropas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,  new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), opciones2, opciones2[2]);
											
											switch (seleccion2) {
											
												case 0:
													
													String base=(String)JOptionPane.showInputDialog(
															null,"Introduzca el nombre de la base a la que pertenece","Tropas", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
													
													String rango=(String)JOptionPane.showInputDialog(
															null,"Introduzca el rango","Tropas", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
													
													int numeroTropas=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca la cantidad de esta tropa","Tropas", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													tropasaire.add(new TropasAire(numeroTropas,rango,base)) ;
													
													break;
					
												case 1:
													
													String[] bases = new String[tropasaire.size()];
														for(int x = 0 ; x < tropasaire.size() ; x++) {
															
															
															
															String salida = (x+1)+ "->" + tropasaire.get(x).getRango() ;
															
															bases[x] = salida ;
													}
														
														JPanel panel2 = new JPanel(new GridBagLayout());
														
														JComboBox box2 = new JComboBox(bases);
														
														JOptionPane.showMessageDialog(null, box2, "Seleccione un rango para eliminar" ,JOptionPane.QUESTION_MESSAGE);
														
														int resp2 = box2.getSelectedIndex() ;
														tropasaire.remove(resp2) ;
														tropasAiree.eliminarFila(resp2) ;
													break;
													
												case 2:
													
													break;

													
											}
										}while(seleccion2!=2) ;
										
										break;
										
									case 2:
										
										do {
											seleccion2 =JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Vehiculos", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,  new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), opciones2, opciones2[2]);
											
											switch (seleccion2) {
											
												case 0:
													
													String base=(String)JOptionPane.showInputDialog(
															null,"Introduzca el nombre y modelo del vehículo","Vehículo", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
													
													String rango=(String)JOptionPane.showInputDialog(
															null,"Introduzca una descripcion del vehiculo","Vehiculo", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
													
													int numeroTropas=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca la cantidad de vehiculos","Vehiculo", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													vehiculosaire.add(new VehiculosAire(numeroTropas,base,rango)) ;
													
													break;
					
												case 1:
													
													String[] bases = new String[vehiculosaire.size()];
														for(int x = 0 ; x < vehiculosaire.size() ; x++) {
															
															
															
															String salida = (x+1)+ "->" + vehiculosaire.get(x).getTipo() ;
															
															bases[x] = salida ;
													}
														
														JPanel panel2 = new JPanel(new GridBagLayout());
														
														JComboBox box2 = new JComboBox(bases);
														
														JOptionPane.showMessageDialog(null, box2, "Seleccione un vehiculo" ,JOptionPane.QUESTION_MESSAGE);
														
														int resp2 = box2.getSelectedIndex() ;
														vehiculosaire.remove(resp2) ;
														vehiculosAiree.eliminarFila(resp2) ;
													break;
													
												case 2:
													
													break;

													
											}
										}while(seleccion2!=2) ;
										
										break;
										
									case 3:
										
										break;
										
								}
							}while(seleccion1 != 3) ;
							
							break;
						case 2:
							do {
								seleccion1 =JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Armada", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,  new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), opciones1, opciones1[3]);
								int seleccion2 ;
								switch (seleccion1) {
								//Armada
									case 0:
										
										do {
											seleccion2 =JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Bases", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,  new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), opciones2, opciones2[2]);
											
											switch (seleccion2) {
											
												case 0:
													
													String nombrebase=(String)JOptionPane.showInputDialog(
															null,"Introduzca el nombre de la base","Bases", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
													
													String sede=(String)JOptionPane.showInputDialog(
															null,"Introduzca la sede","sede", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
													
													int numeroTropas=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca el numero de tropas","Bases", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													int numNaves=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca el numero de Naves","Bases", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													int dia=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca el dia de fundacion","Bases", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													int mes=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca el mes de fundacion","Bases", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													int annio=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca el annio de fundacion","Bases", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													armadas.add(new Armada(nombrebase,sede,numeroTropas, numNaves , dia,mes,annio)) ;
													break;
					
												case 1:
													
													String[] bases = new String[armadas.size()];
														for(int x = 0 ; x < armadas.size() ; x++) {
															
															
															
															String salida = (x+1)+ "->" + armadas.get(x).getNombreBase() ;
															
															bases[x] = salida ;
													}
														
														JPanel panel2 = new JPanel(new GridBagLayout());
														
														JComboBox box2 = new JComboBox(bases);
														
														JOptionPane.showMessageDialog(null, box2, "Seleccione una base para eliminar" ,JOptionPane.QUESTION_MESSAGE);
														
														int resp2 = box2.getSelectedIndex() ;
														armadas.remove(resp2) ;
														armadae.eliminarFila(resp2) ;
													break;
													
												case 2:
													
													break;

													
											}
										}while(seleccion2!=2) ;
										break;
		
									case 1:
										do {
											seleccion2 =JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Tropas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,  new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), opciones2, opciones2[2]);
											
											switch (seleccion2) {
											
												case 0:
													
													String base=(String)JOptionPane.showInputDialog(
															null,"Introduzca el nombre de la base a la que pertenece","Tropas", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
													
													String rango=(String)JOptionPane.showInputDialog(
															null,"Introduzca el rango","Tropas", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
													
													int numeroTropas=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca la cantidad de esta tropa","Tropas", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													tropasarmada.add(new TropasArmada(numeroTropas,rango,base)) ;
													
													break;
					
												case 1:
													
													String[] bases = new String[tropasarmada.size()];
														for(int x = 0 ; x < tropasarmada.size() ; x++) {
															
															
															
															String salida = (x+1)+ "->" + tropasarmada.get(x).getRango() ;
															
															bases[x] = salida ;
													}
														
														JPanel panel2 = new JPanel(new GridBagLayout());
														
														JComboBox box2 = new JComboBox(bases);
														
														JOptionPane.showMessageDialog(null, box2, "Seleccione un rango para eliminar" ,JOptionPane.QUESTION_MESSAGE);
														
														int resp2 = box2.getSelectedIndex() ;
														tropasarmada.remove(resp2) ;
														tropasArmadae.eliminarFila(resp2) ;
													break;
													
												case 2:
													
													break;

													
											}
										}while(seleccion2!=2) ;
										
										break;
										
									case 2:
										
										do {
											seleccion2 =JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Vehiculos", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,  new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), opciones2, opciones2[2]);
											
											switch (seleccion2) {
											
												case 0:
													
													String base=(String)JOptionPane.showInputDialog(
															null,"Introduzca el nombre y modelo del vehículo","Vehículo", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
													
													String rango=(String)JOptionPane.showInputDialog(
															null,"Introduzca una descripcion del vehiculo","Vehiculo", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
													
													int numeroTropas=Integer.parseInt((String)JOptionPane.showInputDialog(
															null,"Introduzca la cantidad de vehiculos","Vehiculo", JOptionPane.INFORMATION_MESSAGE,
													        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null));
													
													vehiculosarmada.add(new VehiculosArmada(numeroTropas,base,rango)) ;
													
													break;
					
												case 1:
													
													String[] bases = new String[vehiculosarmada.size()];
														for(int x = 0 ; x < vehiculosarmada.size() ; x++) {
															
															
															
															String salida = (x+1)+ "->" + vehiculosarmada.get(x).getTipo() ;
															
															bases[x] = salida ;
													}
														
														JPanel panel2 = new JPanel(new GridBagLayout());
														
														JComboBox box2 = new JComboBox(bases);
														
														JOptionPane.showMessageDialog(null, box2, "Seleccione un vehiculo" ,JOptionPane.QUESTION_MESSAGE);
														
														int resp2 = box2.getSelectedIndex() ;
														vehiculosarmada.remove(resp2) ;
														vehiculosArmadae.eliminarFila(resp2) ;
													break;
													
												case 2:
													
													break;

													
											}
										}while(seleccion2!=2) ;
										
										break;
										
									case 3:
										
										break;
										
								}
							}while(seleccion1 != 3) ;
							

							break;
	
						}
					}while(seleccion != 3) ;
					
				}
				else {
					JOptionPane.showMessageDialog(null, "El usuario o password introducidos son invalidos invalida");
				}
			}
				
				
		};
		
		bt4.addActionListener(eventoClic6);
	}
	//Fin de mi cambio

}
