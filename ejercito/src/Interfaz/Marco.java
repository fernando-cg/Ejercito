package Interfaz;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

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
