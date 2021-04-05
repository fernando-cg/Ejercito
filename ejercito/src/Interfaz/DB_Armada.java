package Interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ejercito.Aire;
import ejercito.Armada;
import ejercito.TropasAire;
import ejercito.TropasArmada;
import ejercito.VehiculosAire;
import ejercito.VehiculosArmada;
import escritura.Editor;

@SuppressWarnings("serial")
public class DB_Armada extends JFrame{
	private JPanel panel;
	private JLabel etiqueta, fondo, imagen;
	private JButton bt1, bt2,bt3;
	private JTextField tb1, tb2;
	Toolkit monitor = Toolkit.getDefaultToolkit();
	Dimension tamanio=monitor.getScreenSize();
	int alturaM = tamanio.width;
	int anchuraM= tamanio.height;
	public DB_Armada() {
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Hola soy el titulito");
		
		
		Toolkit monitor = Toolkit.getDefaultToolkit();
		Dimension tamanio=monitor.getScreenSize();
		int alturaM = tamanio.height;
		int anchuraM = tamanio.width;
		
		setSize(anchuraM/2,alturaM/2);
		setLocation(anchuraM/4,alturaM/4);
		
		Image iconoAPP=monitor.getImage("icona.png");
		setIconImage(iconoAPP);
		
		iniciarComponentes();	
	
	}
	private String AnnadirDatosArmadaBase() {
		//Objetos Creados
		ArrayList<Armada>armadas=new ArrayList<Armada>();
		Editor armadae = new Editor("datos\\Armada.txt") ;
		armadas = armadae.actualizarar(armadas) ;
		
		String salida = "" ;
		for(int x = 0 ; x < armadas.size() ; x++) {
			salida = armadas.get(x).toString() ;
		}
		return salida;
		
	}
	private String AnnadirDatosTropas() {
		ArrayList<TropasArmada>tropasarmada=new ArrayList<TropasArmada>();
		Editor tropasArmadae = new Editor("datos\\TropasArmada.txt") ;
		tropasarmada=tropasArmadae.actualizartroparm(tropasarmada);
		
		String salida = "" ;
		for(int x = 0 ; x < tropasarmada.size() ; x++) {
			salida = tropasarmada.get(x).toString() ;
		}
		return salida;
	}
	private String AnnadirVehiculos() {
		ArrayList<VehiculosArmada>vehiculosarmada=new ArrayList<VehiculosArmada>();
		Editor vehiculosArmadae = new Editor("datos\\VehiculosArmada.txt") ;
		vehiculosarmada= vehiculosArmadae.actualizarvehiarm(vehiculosarmada);
		
		String salida = "" ;
		for(int x = 0 ; x < vehiculosarmada.size() ; x++) {
			salida = vehiculosarmada.get(x).toString() ;
		}
		return salida;
	}
	private void iniciarComponentes() {
		colocarPanel();
		colocarEtiqueta();
		colocarElementos();
		colocarFondo();
	}
	private void colocarFondo() {
		fondo = new JLabel ();
		ImageIcon img1 = new ImageIcon(getClass().getResource("/Imagenes/fondo.png"));
		fondo.setIcon(new ImageIcon(img1.getImage().getScaledInstance(anchuraM*2,alturaM,Image.SCALE_SMOOTH)));
		fondo.setBounds(0,0,anchuraM*2,alturaM);
		panel.add(fondo);
	}
	private void colocarPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);
	}
	private void colocarEtiqueta() {
		etiqueta = new JLabel("Datos de la Armada");
		etiqueta.setBounds((int) ((anchuraM/2)+ anchuraM/6),10,300,40);
		etiqueta.setFont(new Font("Arial", 1, 20));
		etiqueta.setForeground(Color.WHITE);
		panel.add(etiqueta);
		
	}
private void colocarElementos() {
	//Objetos Creados del cuartel

	//Objetos creados de la Tropa
			
	//Objetos creados de los vehiculos
		
		
		etiqueta= new JLabel("Informacion de los cuarteles:");
		etiqueta.setBounds((int) (anchuraM/30),(int) (alturaM/3.5),300,40);
		etiqueta.setFont(new Font("Arial", 1, 20));
		etiqueta.setForeground(Color.WHITE);
		panel.add(etiqueta);
		//Los datos de Los Cuarteles
		etiqueta= new JLabel(AnnadirDatosArmadaBase());
		etiqueta.setBounds((int) (anchuraM/30),(int) (alturaM/3.3),10000,40);
		etiqueta.setFont(new Font("Arial", 1, 12));
		etiqueta.setForeground(Color.WHITE);
		panel.add(etiqueta);
		
		etiqueta= new JLabel("Informacion de las Tropas:");
		etiqueta.setBounds((int) (anchuraM/30),(int) (alturaM/3.1),300,40);
		etiqueta.setFont(new Font("Arial", 1, 20));
		etiqueta.setForeground(Color.WHITE);
		panel.add(etiqueta);
		//Los datos de Los Cuarteles
		etiqueta= new JLabel(AnnadirDatosTropas());
		etiqueta.setBounds((int) (anchuraM/30),(int) (alturaM/2.9),10000,40);
		etiqueta.setFont(new Font("Arial", 1, 12));
		etiqueta.setForeground(Color.WHITE);
		panel.add(etiqueta);
		
		etiqueta= new JLabel("Informacion de los Vehiculos:");
		etiqueta.setBounds((int) (anchuraM/30),(int) (alturaM/2.7),300,40);
		etiqueta.setFont(new Font("Arial", 1, 20));
		etiqueta.setForeground(Color.WHITE);
		panel.add(etiqueta);
		//Los datos de Los Cuarteles
		etiqueta= new JLabel(AnnadirVehiculos());
		etiqueta.setBounds((int) (anchuraM/30),(int) (alturaM/2.6),10000,40);
		etiqueta.setFont(new Font("Arial", 1, 12));
		etiqueta.setForeground(Color.WHITE);
		panel.add(etiqueta);
		
		
		imagen = new JLabel();
		ImageIcon imgTierra = new ImageIcon(getClass().getResource("/Imagenes/Armada.png"));
		imagen.setIcon(new ImageIcon(imgTierra.getImage().getScaledInstance(anchuraM/6,alturaM/5,Image.SCALE_SMOOTH)));
		panel.add(imagen);
		imagen.setBounds((int) ((anchuraM/2.1)+ anchuraM/4.55),alturaM/20,anchuraM/6,alturaM/5);		
		bt2 = new JButton("ATRAS");
		panel.add(bt2);
		bt2.setBounds((int) ((anchuraM/3)+ anchuraM/4.45),alturaM/2, 140, 40);
		
		ActionListener eventoClic = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				mArmada m1 = new mArmada();		
				m1.setVisible(true);
				m1.setTitle("Ejercito de Espa�a");
				m1.setResizable(false);
				m1.setExtendedState(Frame.MAXIMIZED_BOTH);
					
			}
		};
		bt2.addActionListener(eventoClic);
		
	}
	
}

