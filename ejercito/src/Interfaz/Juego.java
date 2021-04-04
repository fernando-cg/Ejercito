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
public class Juego extends JFrame{
	
	private JPanel panel;
	private JLabel etiqueta, fondo, tabl1, tabl2;
	private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13,bt14, bt15, bt16, bt17, bt18, bt19, bt20, bt21, bt22, bt23, bt24, bt25, bt26, bt27, bt28, bt29, bt30, bt31, bt32, bt33, bt34, bt35, bt36, bt37, bt38, bt39, bt40, bt41, bt42, bt43, bt44, bt45, bt46, bt47, bt48, bt49, bt50, bbt1, bbt2, bbt3, bbt4, bbt5, bbt6, bbt7, bbt8, bbt9, bbt10, bbt11, bbt12, bbt13,bbt14, bbt15, bbt16, bbt17, bbt18, bbt19, bbt20, bbt21, bbt22, bbt23, bbt24, bbt25, bbt26, bbt27, bbt28, bbt29, bbt30, bbt31, bbt32, bbt33, bbt34, bbt35, bbt36, bbt37, bbt38, bbt39, bbt40, bbt41, bbt42,bbt43, bbt44, bbt45, bbt46, bbt47, bbt48, bbt49, bbt50;
	private JTextField tb1, tb2;
	Toolkit monitor = Toolkit.getDefaultToolkit();
	Dimension tamanio=monitor.getScreenSize();
	int alturaM = tamanio.width;
	int anchuraM= tamanio.height;
	
	int alturaT = alturaM/6;
	int anchuraT= anchuraM/6;
	
	double sep = anchuraT*1.25;
	
	
	public Juego() {
	
	
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Hundir la flota");
		
		
		
		
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
		tabl1 = new JLabel ();
		ImageIcon img2 = new ImageIcon(getClass().getResource("/Imagenes/mar.png"));
		tabl1.setIcon(new ImageIcon(img2.getImage().getScaledInstance(anchuraM/2,anchuraM/2,Image.SCALE_SMOOTH)));
		tabl1.setBounds(anchuraM/6,-alturaM/6,anchuraM*2,alturaM);
		panel.add(tabl1);
		
		tabl2 = new JLabel ();
		tabl2.setIcon(new ImageIcon(img2.getImage().getScaledInstance(anchuraM/2,anchuraM/2,Image.SCALE_SMOOTH)));
		tabl2.setBounds((int) (anchuraM/1.1),-alturaM/6,anchuraM*2,alturaM);
		panel.add(tabl2);
		
		
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
		etiqueta = new JLabel("Hundir la flota");
		etiqueta.setBounds((int) ((anchuraM/2)+ anchuraM/4.5),10,300,40);
		etiqueta.setFont(new Font("Arial", 1, 20));
		etiqueta.setForeground(Color.WHITE);
		panel.add(etiqueta);
		
	}
	
	private void colocarElementos() {
		
		
		//FILA 10
		bt1 = new JButton("IR");
		ImageIcon imgArmada = new ImageIcon(getClass().getResource("/Imagenes/marco.png"));
		bt1.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt1.setOpaque(false);
		bt1.setContentAreaFilled(false);
		bt1.setBorderPainted(false);
		panel.add(bt1);
		bt1.setBounds((int) (sep), (int) (alturaT*1.06), 40, 40);
		
		bt2 = new JButton("IR");
		bt2.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt2.setOpaque(false);
		bt2.setContentAreaFilled(false);
		bt2.setBorderPainted(false);
		panel.add(bt2);
		bt2.setBounds((int) (sep)+ 40, (int) (alturaT*1.06), 40, 40);
		
		bt3= new JButton("IR");
		bt3.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt3.setOpaque(false);
		bt3.setContentAreaFilled(false);
		bt3.setBorderPainted(false);
		panel.add(bt3);
		bt3.setBounds((int) (sep)+ (40*2), (int) (alturaT*1.06), 40, 40);
		
		bt4 = new JButton("IR");
		bt4.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt4.setOpaque(false);
		bt4.setContentAreaFilled(false);
		bt4.setBorderPainted(false);
		panel.add(bt4);
		bt4.setBounds((int) (sep)+ (40*3), (int) (alturaT*1.06), 40, 40);
		
		bt5 = new JButton("IR");
		bt5.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt5.setOpaque(false);
		bt5.setContentAreaFilled(false);
		bt5.setBorderPainted(false);
		panel.add(bt5);
		bt5.setBounds((int) (sep)+ (40*4), (int) (alturaT*1.06), 40, 40);
		
		bt6 = new JButton("IR");
		bt6.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt6.setOpaque(false);
		bt6.setContentAreaFilled(false);
		bt6.setBorderPainted(false);
		panel.add(bt6);
		bt6.setBounds((int) (sep)+ (40*5), (int) (alturaT*1.06), 40, 40);
		
		bt7 = new JButton("IR");
		bt7.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt7.setOpaque(false);
		bt7.setContentAreaFilled(false);
		bt7.setBorderPainted(false);
		panel.add(bt7);
		bt7.setBounds((int) (sep)+ (40*6), (int) (alturaT*1.06), 40, 40);
		
		bt8 = new JButton("IR");
		bt8.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(38,40,Image.SCALE_SMOOTH)));
		bt8.setOpaque(false);
		bt8.setContentAreaFilled(false);
		bt8.setBorderPainted(false);
		panel.add(bt8);
		bt8.setBounds((int) (sep)+ (40*7), (int) (alturaT*1.06), 40, 40);
		
		bt9 = new JButton("IR");
		bt9.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt9.setOpaque(false);
		bt9.setContentAreaFilled(false);
		bt9.setBorderPainted(false);
		panel.add(bt9);
		bt9.setBounds((int) (sep)+ (40*8), (int) (alturaT*1.06), 40, 40);
		
		bt10 = new JButton("IR");
		bt10.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt10.setOpaque(false);
		bt10.setContentAreaFilled(false);
		bt10.setBorderPainted(false);
		panel.add(bt10);
		bt10.setBounds((int) (sep)+ (40*9), (int) (alturaT*1.06), 40, 40);
		bt11 = new JButton("IR");
		bt11.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt11.setOpaque(false);
		bt11.setContentAreaFilled(false);
		bt11.setBorderPainted(false);
		panel.add(bt11);
		bt11.setBounds((int) (sep), (int) (alturaT*1.06)+ (40), 40, 40);
		
		bt12 = new JButton("IR");
		bt12.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt12.setOpaque(false);
		bt12.setContentAreaFilled(false);
		bt12.setBorderPainted(false);
		panel.add(bt12);
		bt12.setBounds((int) (sep)+ 40, (int) (alturaT*1.06)+ (40), 40, 40);
		
		bt13= new JButton("IR");
		bt13.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt13.setOpaque(false);
		bt13.setContentAreaFilled(false);
		bt13.setBorderPainted(false);
		panel.add(bt13);
		bt13.setBounds((int) (sep)+ (40*2), (int) (alturaT*1.06)+ (40), 40, 40);
		
		bt14 = new JButton("IR");
		bt14.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt14.setOpaque(false);
		bt14.setContentAreaFilled(false);
		bt14.setBorderPainted(false);
		panel.add(bt14);
		bt14.setBounds((int) (sep)+ (40*3), (int) (alturaT*1.06)+ (40), 40, 40);
		
		bt15 = new JButton("IR");
		bt15.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt15.setOpaque(false);
		bt15.setContentAreaFilled(false);
		bt15.setBorderPainted(false);
		panel.add(bt15);
		bt15.setBounds((int) (sep)+ (40*4), (int) (alturaT*1.06)+ (40), 40, 40);
		
		bt16 = new JButton("IR");
		bt16.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt16.setOpaque(false);
		bt16.setContentAreaFilled(false);
		bt16.setBorderPainted(false);
		panel.add(bt16);
		bt16.setBounds((int) (sep)+ (40*5), (int) (alturaT*1.06)+ (40), 40, 40);
		
		bt17 = new JButton("IR");
		bt17.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt17.setOpaque(false);
		bt17.setContentAreaFilled(false);
		bt17.setBorderPainted(false);
		panel.add(bt17);
		bt17.setBounds((int) (sep)+ (40*6), (int) (alturaT*1.06)+ (40), 40, 40);
		
		bt18 = new JButton("IR");
		bt18.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(38,40,Image.SCALE_SMOOTH)));
		bt18.setOpaque(false);
		bt18.setContentAreaFilled(false);
		bt18.setBorderPainted(false);
		panel.add(bt18);
		bt18.setBounds((int) (sep)+ (40*7), (int) (alturaT*1.06)+ (40), 40, 40);
		
		bt19 = new JButton("IR");
		bt19.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt19.setOpaque(false);
		bt19.setContentAreaFilled(false);
		bt19.setBorderPainted(false);
		panel.add(bt19);
		bt19.setBounds((int) (sep)+ (40*8), (int) (alturaT*1.06)+ (40), 40, 40);
		
		bt20 = new JButton("IR");
		bt20.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt20.setOpaque(false);
		bt20.setContentAreaFilled(false);
		bt20.setBorderPainted(false);
		panel.add(bt20);
		bt20.setBounds((int) (sep)+ (40*9), (int) (alturaT*1.06)+ (40), 40, 40);
		
		bt21 = new JButton("IR");
		bt21.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt21.setOpaque(false);
		bt21.setContentAreaFilled(false);
		bt21.setBorderPainted(false);
		panel.add(bt21);
		bt21.setBounds((int) (sep), (int) (alturaT*1.06)+ (40*2), 40, 40);
		
		bt22 = new JButton("IR");
		bt22.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt22.setOpaque(false);
		bt22.setContentAreaFilled(false);
		bt22.setBorderPainted(false);
		panel.add(bt22);
		bt22.setBounds((int) (sep)+ 40, (int) (alturaT*1.06)+ (40*2), 40, 40);
		
		bt23= new JButton("IR");
		bt23.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt23.setOpaque(false);
		bt23.setContentAreaFilled(false);
		bt23.setBorderPainted(false);
		panel.add(bt23);
		bt23.setBounds((int) (sep)+ (40*2), (int) (alturaT*1.06)+ (40*2), 40, 40);
		
		bt24 = new JButton("IR");
		bt24.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt24.setOpaque(false);
		bt24.setContentAreaFilled(false);
		bt24.setBorderPainted(false);
		panel.add(bt24);
		bt24.setBounds((int) (sep)+ (40*3), (int) (alturaT*1.06)+ (40*2), 40, 40);
		
		bt25 = new JButton("IR");
		bt25.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt25.setOpaque(false);
		bt25.setContentAreaFilled(false);
		bt25.setBorderPainted(false);
		panel.add(bt25);
		bt25.setBounds((int) (sep)+ (40*4), (int) (alturaT*1.06)+ (40*2), 40, 40);
		
		bt26 = new JButton("IR");
		bt26.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt26.setOpaque(false);
		bt26.setContentAreaFilled(false);
		bt26.setBorderPainted(false);
		panel.add(bt26);
		bt26.setBounds((int) (sep)+ (40*5), (int) (alturaT*1.06)+ (40*2), 40, 40);
		
		bt27 = new JButton("IR");
		bt27.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt27.setOpaque(false);
		bt27.setContentAreaFilled(false);
		bt27.setBorderPainted(false);
		panel.add(bt27);
		bt27.setBounds((int) (sep)+ (40*6), (int) (alturaT*1.06)+ (40*2), 40, 40);
		
		bt28 = new JButton("IR");
		bt28.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(38,40,Image.SCALE_SMOOTH)));
		bt28.setOpaque(false);
		bt28.setContentAreaFilled(false);
		bt28.setBorderPainted(false);
		panel.add(bt28);
		bt28.setBounds((int) (sep)+ (40*7), (int) (alturaT*1.06)+ (40*2), 40, 40);
		
		bt29 = new JButton("IR");
		bt29.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt29.setOpaque(false);
		bt29.setContentAreaFilled(false);
		bt29.setBorderPainted(false);
		panel.add(bt29);
		bt29.setBounds((int) (sep)+ (40*8), (int) (alturaT*1.06)+ (40*2), 40, 40);
		
		bt30 = new JButton("IR");
		bt30.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt30.setOpaque(false);
		bt30.setContentAreaFilled(false);
		bt30.setBorderPainted(false);
		panel.add(bt30);
		bt30.setBounds((int) (sep)+ (40*9), (int) (alturaT*1.06)+ (40*2), 40, 40);
		
		bt31 = new JButton("IR");
		bt31.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt31.setOpaque(false);
		bt31.setContentAreaFilled(false);
		bt31.setBorderPainted(false);
		panel.add(bt31);
		bt31.setBounds((int) (sep), (int) (alturaT*1.06)+(40*3), 40, 40);
		
		bt32 = new JButton("IR");
		bt32.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt32.setOpaque(false);
		bt32.setContentAreaFilled(false);
		bt32.setBorderPainted(false);
		panel.add(bt32);
		bt32.setBounds((int) (sep)+ 40, (int) (alturaT*1.06)+(40*3), 40, 40);
		
		bt33= new JButton("IR");
		bt33.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt33.setOpaque(false);
		bt33.setContentAreaFilled(false);
		bt33.setBorderPainted(false);
		panel.add(bt33);
		bt33.setBounds((int) (sep)+ (40*2), (int) (alturaT*1.06)+(40*3), 40, 40);
		
		bt34 = new JButton("IR");
		bt34.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt34.setOpaque(false);
		bt34.setContentAreaFilled(false);
		bt34.setBorderPainted(false);
		panel.add(bt34);
		bt34.setBounds((int) (sep)+ (40*3), (int) (alturaT*1.06)+(40*3), 40, 40);
		
		bt35 = new JButton("IR");
		bt35.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt35.setOpaque(false);
		bt35.setContentAreaFilled(false);
		bt35.setBorderPainted(false);
		panel.add(bt35);
		bt35.setBounds((int) (sep)+ (40*4), (int) (alturaT*1.06)+(40*3), 40, 40);
		
		bt36 = new JButton("IR");
		bt36.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt36.setOpaque(false);
		bt36.setContentAreaFilled(false);
		bt36.setBorderPainted(false);
		panel.add(bt36);
		bt36.setBounds((int) (sep)+ (40*5), (int) (alturaT*1.06)+(40*3), 40, 40);
		
		bt37 = new JButton("IR");
		bt37.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt37.setOpaque(false);
		bt37.setContentAreaFilled(false);
		bt37.setBorderPainted(false);
		panel.add(bt37);
		bt37.setBounds((int) (sep)+ (40*6), (int) (alturaT*1.06)+(40*3), 40, 40);
		
		bt38 = new JButton("IR");
		bt38.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(38,40,Image.SCALE_SMOOTH)));
		bt38.setOpaque(false);
		bt38.setContentAreaFilled(false);
		bt38.setBorderPainted(false);
		panel.add(bt38);
		bt38.setBounds((int) (sep)+ (40*7), (int) (alturaT*1.06)+(40*3), 40, 40);
		
		bt39 = new JButton("IR");
		bt39.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt39.setOpaque(false);
		bt39.setContentAreaFilled(false);
		bt39.setBorderPainted(false);
		panel.add(bt39);
		bt39.setBounds((int) (sep)+ (40*8), (int) (alturaT*1.06)+(40*3), 40, 40);
		
		bt40 = new JButton("IR");
		bt40.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt40.setOpaque(false);
		bt40.setContentAreaFilled(false);
		bt40.setBorderPainted(false);
		panel.add(bt40);
		bt40.setBounds((int) (sep)+ (40*9), (int) (alturaT*1.06)+(40*3), 40, 40);
		
		
		
		
		
		
	}
	


	
	
}
