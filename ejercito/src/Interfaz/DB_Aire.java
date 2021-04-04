package Interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ejercito.Aire;
import ejercito.TropasAire;
import ejercito.VehiculosAire;

@SuppressWarnings("serial")
public class DB_Aire extends JFrame{
	private JPanel panel;
	private JLabel etiqueta, fondo, imagen;
	private JButton bt1, bt2,bt3;
	private JTextField tb1, tb2;
	Toolkit monitor = Toolkit.getDefaultToolkit();
	Dimension tamanio=monitor.getScreenSize();
	int alturaM = tamanio.width;
	int anchuraM= tamanio.height;
	public DB_Aire() {
		
		
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
	private String AnnadirDatosAireBase() {
		//Objetos Creados
		Aire air1=new Aire("Cuartel General del Ejército del Aire", "Madrid", 20900, 412, 28,2, 1913);
		return air1.toString();
		
	}
	private String AnnadirDatosTropas() {
		TropasAire tair1= new TropasAire(9500, "Oficiales", "Base Aerea de Moron");
		return tair1.toString();
	}
	private String AnnadirVehiculos() {
		VehiculosAire va1=new VehiculosAire(73, "Eurofighter Typhoon","El Eurofighter Typhoon es un caza polivalente, bimotor y de gran maniobrabilidad, diseñado y construido por el consorcio de empresas europeas Eurofighter GmbH creado en 1983 y compuesto por las compañías Airbus, BAE Systems y Alenia Aeronautica.​");
		return va1.toString();
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
		etiqueta = new JLabel("Datos del Ejercito de Aire");
		etiqueta.setBounds((int) ((anchuraM/2)+ anchuraM/6),10,300,40);
		etiqueta.setFont(new Font("Arial", 1, 20));
		etiqueta.setForeground(Color.WHITE);
		panel.add(etiqueta);
		
	}
private void colocarElementos() {
	//Objetos Creados del cuartel
			Aire air1=new Aire("Cuartel General del Ejército del Aire", "Madrid", 20900, 412, 28,2, 1913);
			air1.getFechaFundacion();
			air1.getNombreBase();
			air1.getNumTropas();
			air1.getNumNaves();
			air1.getPresupuesto();
			air1.getSede();
	//Objetos creados de la Tropa
			
	//Objetos creados de los vehiculos
		
		
		etiqueta= new JLabel("Informacion de los cuarteles:");
		etiqueta.setBounds((int) (anchuraM/30),(int) (alturaM/3.5),300,40);
		etiqueta.setFont(new Font("Arial", 1, 20));
		etiqueta.setForeground(Color.WHITE);
		panel.add(etiqueta);
		//Los datos de Los Cuarteles
		etiqueta= new JLabel(AnnadirDatosAireBase());
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
		ImageIcon imgTierra = new ImageIcon(getClass().getResource("/Imagenes/Aire.png"));
		imagen.setIcon(new ImageIcon(imgTierra.getImage().getScaledInstance(anchuraM/3,alturaM/9,Image.SCALE_SMOOTH)));
		panel.add(imagen);
		imagen.setBounds((int) ((anchuraM/2)+ anchuraM/7.3),alturaM/9,anchuraM/3,alturaM/9);
		
		bt2 = new JButton("ATRAS");
		panel.add(bt2);
		bt2.setBounds((int) ((anchuraM/2)+ anchuraM/4.45),alturaM/2, 140, 40);
		
		ActionListener eventoClic = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				mAire m1 = new mAire();		
				m1.setVisible(true);
				m1.setTitle("Ejercito de Espa�a");
				m1.setResizable(false);
				m1.setExtendedState(Frame.MAXIMIZED_BOTH);
					
			}
		};
		bt2.addActionListener(eventoClic);
		
	}
	
}

