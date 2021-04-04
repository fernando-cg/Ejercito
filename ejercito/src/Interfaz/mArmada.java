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

@SuppressWarnings("serial")
public class mArmada extends JFrame{
	private JPanel panel;
	private JLabel etiqueta, fondo, imagen;
	private JButton bt1, bt2, egg,bt3;
	private JTextField tb1, tb2;
	Toolkit monitor = Toolkit.getDefaultToolkit();
	Dimension tamanio=monitor.getScreenSize();
	int alturaM = tamanio.width;
	int anchuraM= tamanio.height;
	
	
	public mArmada() {
	
	
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		setSize(anchuraM/2,alturaM/2);
		setLocation(anchuraM/4,alturaM/4);
		
		Image iconoAPP=monitor.getImage("icona.png");
		setIconImage(iconoAPP);
		
		iniciarComponentes();	
	
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
		etiqueta = new JLabel("Armada");
		etiqueta.setBounds((int) ((anchuraM/2)+ anchuraM/3.8),10,300,40);
		etiqueta.setFont(new Font("Arial", 1, 20));
		etiqueta.setForeground(Color.WHITE);
		panel.add(etiqueta);
		
	}
	
	private void colocarElementos() {
		
		etiqueta = new JLabel("Login");
		etiqueta.setBounds((int) ((anchuraM/2)+ anchuraM/3.7),(int) (alturaM/3.2),300,40);
		etiqueta.setFont(new Font("Arial", 1, 20));
		etiqueta.setForeground(Color.WHITE);
		panel.add(etiqueta);
		
		imagen = new JLabel();
		ImageIcon imgTierra = new ImageIcon(getClass().getResource("/Imagenes/Armada.png"));
		imagen.setIcon(new ImageIcon(imgTierra.getImage().getScaledInstance(anchuraM/6,alturaM/5,Image.SCALE_SMOOTH)));
		panel.add(imagen);
		imagen.setBounds((int) ((anchuraM/2)+ anchuraM/4.55),alturaM/12,anchuraM/6,alturaM/5);
		
		tb1 = new JTextField("Usuario");
		panel.add(tb1);
		tb1.setBounds((int) ((anchuraM/2)+ anchuraM/4.7),alturaM/3, 160, 40);
		
		tb2 = new JTextField("Password");
		panel.add(tb2);
		tb2.setBounds((int) ((anchuraM/2)+ anchuraM/4.7),(int) (alturaM/2.8), 160, 40);
		
		bt1 = new JButton("IR");
		panel.add(bt1);
		bt1.setBounds((int) ((anchuraM/2)+ anchuraM/4.45),(int) (alturaM/2.6), 140, 40);
		
		bt2 = new JButton("ATRAS");
		panel.add(bt2);
		bt2.setBounds((int) ((anchuraM/2)+ anchuraM/4.45),alturaM/2, 140, 40);
		
		egg = new JButton("EasterEgg");
		panel.add(egg);
		egg.setBounds((int) ((anchuraM)+ anchuraM/1.7),(int) (alturaM/2), 140, 40);
		//Añadir boton jfg
		bt3 = new JButton("Ver Informacion Basica");
		panel.add(bt3);
		bt3.setBounds((int) ((anchuraM/2)+ anchuraM/4.45),(int) (alturaM/2.15), 140, 40);
		
		
		ActionListener eventoClic1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Accion boton ir
					
			}
				
				
		};
		bt1.addActionListener(eventoClic1);
		
		ActionListener eventoClic = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//Accion boton atras
				Marco m1 = new Marco();		
				m1.setVisible(true);
				m1.setTitle("Ejército de España");
				m1.setResizable(false);
				m1.setExtendedState(Frame.MAXIMIZED_BOTH);
					
			}
				
				
		};
		bt2.addActionListener(eventoClic);
		
		ActionListener eventoClic2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Accion boton easter egg
				
				Juego j1 = new Juego();		
				j1.setVisible(true);
				j1.setTitle("Hundir la Flota");
				j1.setResizable(false);
				j1.setExtendedState(Frame.MAXIMIZED_BOTH);
					
			}
				
				
		};
		egg.addActionListener(eventoClic2);
		
		ActionListener eventoClic3 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//Accion boton armada datos
				DB_Armada m1 = new DB_Armada();		
				m1.setVisible(true);
				m1.setTitle("Datos basicos de la Armada");
				m1.setResizable(false);
				m1.setExtendedState(Frame.MAXIMIZED_BOTH);
					
			}
				
				
		};
		bt3.addActionListener(eventoClic3);
		

		
	}
	


	
	
}

