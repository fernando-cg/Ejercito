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
public class mAire extends JFrame{
	private JPanel panel;
	private JLabel etiqueta, fondo, imagen;
	private JButton bt1, bt2,bt3;
	private JTextField tb1, tb2;
	Toolkit monitor = Toolkit.getDefaultToolkit();
	Dimension tamanio=monitor.getScreenSize();
	int alturaM = tamanio.width;
	int anchuraM= tamanio.height;
	
	
	public mAire() {
	
	
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
		etiqueta = new JLabel("Ejercito de Aire");
		etiqueta.setBounds((int) ((anchuraM/2)+ anchuraM/4.6),10,300,40);
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
		ImageIcon imgTierra = new ImageIcon(getClass().getResource("/Imagenes/Aire.png"));
		imagen.setIcon(new ImageIcon(imgTierra.getImage().getScaledInstance(anchuraM/3,alturaM/9,Image.SCALE_SMOOTH)));
		panel.add(imagen);
		imagen.setBounds((int) ((anchuraM/2)+ anchuraM/7.3),alturaM/9,anchuraM/3,alturaM/9);
		
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
		
		bt3 = new JButton("Ver Informacion Basica");
		panel.add(bt3);
		bt3.setBounds((int) ((anchuraM/2)+ anchuraM/4.45),(int) (alturaM/2.15), 140, 40);
		
		
		ActionListener eventoClic = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Marco m1 = new Marco();		
				m1.setVisible(true);
				m1.setTitle("Ejercito de Espania");
				m1.setResizable(false);
				m1.setExtendedState(Frame.MAXIMIZED_BOTH);
					
			}
			
				
				
		};
		ActionListener eventoClic2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				DB_Aire m2 = new DB_Aire();		
				m2.setVisible(true);
				m2.setTitle("Ejercito de Espania");
				m2.setResizable(false);
				m2.setExtendedState(Frame.MAXIMIZED_BOTH);
					
			}
			
				
				
		};
		bt2.addActionListener(eventoClic);
		bt3.addActionListener(eventoClic2);
		
	}
	


	
	
}


