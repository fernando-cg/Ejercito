package Interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Test {
private int contador=0;
//Metodos
//Preguntas
public void Pregunta1(){
	UIManager UI=new UIManager();
    UI.put("OptionPane.background", new Color(0, 62, 0));
    UI.put("Panel.background", new Color(0, 62, 0));
    UI.put("Menu.Foreground",Color.red);
    UI.put("OptionPane.messageFont", new Font("Arial",Font.CENTER_BASELINE,15));
    UI.put("OptionPane.messageForeground", Color.white);
	
	String respuesta;
	
	respuesta=(String)JOptionPane.showInputDialog(
			null,"La primera guerra mundial comenzo el 28 de julio de 1914."+"\n�Verdadero o Falso?","1� Pregunta", JOptionPane.INFORMATION_MESSAGE,
	        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
	if (respuesta.equalsIgnoreCase("Verdadero")) {
		contador++;
		JOptionPane.showMessageDialog(null,"Respuesta Correcta","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
	}else if (respuesta.equalsIgnoreCase("Falso")) {
		contador=contador+0;
		JOptionPane.showMessageDialog(null,"Respuesta Erronea","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
	}else {
		contador=contador+0;
		JOptionPane.showMessageDialog(null,"Te lo cuento como error","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
	}
}
public void Pregunta2(){
	UIManager UI=new UIManager();
    UI.put("OptionPane.background", new Color(0, 62, 0));
    UI.put("Panel.background", new Color(0, 62, 0));
    UI.put("Menu.Foreground",Color.red);
    UI.put("OptionPane.messageFont", new Font("Arial",Font.CENTER_BASELINE,15));
    UI.put("OptionPane.messageForeground", Color.white);

	String respuesta;
	respuesta=(String)JOptionPane.showInputDialog(null,"La segunda guerra mundial termino el 10 de Agosto de 1956."+"\n¿Verdadero o Falso?","2º Pregunta", JOptionPane.INFORMATION_MESSAGE,
	        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
	if (respuesta.equalsIgnoreCase("Verdadero")) {
		contador=contador+0;
		JOptionPane.showMessageDialog(null,"Respuesta Erronea","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));	}else if (respuesta.equalsIgnoreCase("Falso")) {
		contador++;
		JOptionPane.showMessageDialog(null,"Respuesta Correcta","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
	}else {
		contador=contador+0;
		contador=contador+0;
		JOptionPane.showMessageDialog(null,"Te lo cuento como error","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
			}
	}

public void Pregunta3(){
	UIManager UI=new UIManager();
    UI.put("OptionPane.background", new Color(0, 62, 0));
    UI.put("Panel.background", new Color(0, 62, 0));
    UI.put("Menu.Foreground",Color.red);
    UI.put("OptionPane.messageFont", new Font("Arial",Font.CENTER_BASELINE,15));
    UI.put("OptionPane.messageForeground", Color.white);

	String respuesta;
	respuesta=(String) JOptionPane.showInputDialog(null,"El presidente Aleman de la primera guerra mundial se llamaba Paul von Beneckendorff und von Merkel"+"\n¿Verdadero o Falso?","3º Pregunta", JOptionPane.INFORMATION_MESSAGE,
	        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
	if (respuesta.equalsIgnoreCase("Verdadero")) {
		contador=contador+0;
		JOptionPane.showMessageDialog(null,"Respuesta Erronea","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
		}else if (respuesta.equalsIgnoreCase("Falso")) {
		contador++;
		JOptionPane.showMessageDialog(null,"Respuesta Correcta","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));	
		}else {
		contador=contador+0;
		contador=contador+0;
		JOptionPane.showMessageDialog(null,"Te lo cuento como error","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
			}
	}

public void Pregunta4(){
	UIManager UI=new UIManager();
    UI.put("OptionPane.background", new Color(0, 62, 0));
    UI.put("Panel.background", new Color(0, 62, 0));
    UI.put("Menu.Foreground",Color.red);
    UI.put("OptionPane.messageFont", new Font("Arial",Font.CENTER_BASELINE,15));
    UI.put("OptionPane.messageForeground", Color.white);

	String respuesta;
	respuesta=(String) JOptionPane.showInputDialog(null,"En la primera guerra mundial perdio alemania y vencieron los paises Estados Unidos,Gran Betraña,Francia y otros estados aliados."+"\n¿Verdadero o Falso?","4º Pregunta", JOptionPane.INFORMATION_MESSAGE,
	        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
	if (respuesta.equalsIgnoreCase("Verdadero")) {
		contador++;
		JOptionPane.showMessageDialog(null,"Respuesta Correcta","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));	
		}else if (respuesta.equalsIgnoreCase("Falso")) {
		contador=contador+0;
		JOptionPane.showMessageDialog(null,"Respuesta Erronea","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));	
		}else {
		contador=contador+0;
		contador=contador+0;
		JOptionPane.showMessageDialog(null,"Te lo cuento como error","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
			}
	}

public void Pregunta5(){
	UIManager UI=new UIManager();
    UI.put("OptionPane.background", new Color(0, 62, 0));
    UI.put("Panel.background", new Color(0, 62, 0));
    UI.put("Menu.Foreground",Color.red);
    UI.put("OptionPane.messageFont", new Font("Arial",Font.CENTER_BASELINE,15));
    UI.put("OptionPane.messageForeground", Color.white);

	String respuesta;
	respuesta=(String) JOptionPane.showInputDialog(null,"Las guerras Punicas que fueron los enfrentamientos entre Roma y Cartago duraron 70 annios y esta considerada una de las guerras mas largas de la historia"+"\n¿Verdadero o Falso?","5º Pregunta", JOptionPane.INFORMATION_MESSAGE,
	        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
	if (respuesta.equalsIgnoreCase("Verdadero")) {
		contador=contador+0;
		JOptionPane.showMessageDialog(null,"Respuesta Erronea","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
		}else if (respuesta.equalsIgnoreCase("Falso")) {
		contador++;
		JOptionPane.showMessageDialog(null,"Respuesta Correcta","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));	}else {
		contador=contador+0;
		contador=contador+0;
		JOptionPane.showMessageDialog(null,"Te lo cuento como error","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
		}
}

public void Pregunta6(){
	UIManager UI=new UIManager();
    UI.put("OptionPane.background", new Color(0, 62, 0));
    UI.put("Panel.background", new Color(0, 62, 0));
    UI.put("Menu.Foreground",Color.red);
    UI.put("OptionPane.messageFont", new Font("Arial",Font.CENTER_BASELINE,15));
    UI.put("OptionPane.messageForeground", Color.white);

	String respuesta;
	respuesta=(String) JOptionPane.showInputDialog(null,"Cristobal Colón partió desde el Puerto de Palos, en Huelva"+"\n¿Verdadero o Falso?","6º Pregunta", JOptionPane.INFORMATION_MESSAGE,
	        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
	if(respuesta.equalsIgnoreCase("Verdadero")) {
		JOptionPane.showMessageDialog(null,"Respuesta Correcta","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));		contador++;
	}
	else if(respuesta.equalsIgnoreCase("Falso")){
		JOptionPane.showMessageDialog(null,"Respuesta Erronea","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
		}else {
			contador=contador+0;
			JOptionPane.showMessageDialog(null,"Te lo cuento como error","Respuesta",JOptionPane.INFORMATION_MESSAGE,
		            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
			}
}

public void Pregunta7(){
	UIManager UI=new UIManager();
    UI.put("OptionPane.background", new Color(0, 62, 0));
    UI.put("Panel.background", new Color(0, 62, 0));
    UI.put("Menu.Foreground",Color.red);
    UI.put("OptionPane.messageFont", new Font("Arial",Font.CENTER_BASELINE,15));
    UI.put("OptionPane.messageForeground", Color.white);

	String respuesta;
	respuesta=(String) JOptionPane.showInputDialog(null,"Madrid fue la primera capital de España"+"\n¿Verdadero o Falso?","7º Pregunta", JOptionPane.INFORMATION_MESSAGE,
	        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
	if(respuesta.equalsIgnoreCase("Verdadero")) {
		JOptionPane.showMessageDialog(null,"Respuesta Erronea","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
		}
	else if(respuesta.equalsIgnoreCase("Falso")){
		JOptionPane.showMessageDialog(null,"Respuesta Correcta","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));		contador++;
	}else {
		contador=contador+0;
		JOptionPane.showMessageDialog(null,"Te lo cuento como error","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
		}
}

public void Pregunta8(){
	UIManager UI=new UIManager();
    UI.put("OptionPane.background", new Color(0, 62, 0));
    UI.put("Panel.background", new Color(0, 62, 0));
    UI.put("Menu.Foreground",Color.red);
    UI.put("OptionPane.messageFont", new Font("Arial",Font.CENTER_BASELINE,15));
    UI.put("OptionPane.messageForeground", Color.white);

	String respuesta;
	respuesta=(String) JOptionPane.showInputDialog(null,"El 17 de Julio de 1936 comenzó la Guerra Civil Española"+"\n¿Verdadero o Falso?","8º Pregunta", JOptionPane.INFORMATION_MESSAGE,
	        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
	if(respuesta.equalsIgnoreCase("Verdadero")) {
		JOptionPane.showMessageDialog(null,"Respuesta Correcta","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));		contador++;
	}
	else if(respuesta.equalsIgnoreCase("Falso")) {
		JOptionPane.showMessageDialog(null,"Respuesta Erronea","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
		} else {
			contador=contador+0;
			JOptionPane.showMessageDialog(null,"Te lo cuento como error","Respuesta",JOptionPane.INFORMATION_MESSAGE,
		            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
			}
}

public void Pregunta9(){
	UIManager UI=new UIManager();
    UI.put("OptionPane.background", new Color(0, 62, 0));
    UI.put("Panel.background", new Color(0, 62, 0));
    UI.put("Menu.Foreground",Color.red);
    UI.put("OptionPane.messageFont", new Font("Arial",Font.CENTER_BASELINE,15));
    UI.put("OptionPane.messageForeground", Color.white);

	String respuesta;
	respuesta=(String) JOptionPane.showInputDialog(null,"Huelva es la ciudad más antigua de España"+"\n¿Verdadero o Falso?","9º Pregunta", JOptionPane.INFORMATION_MESSAGE,
	        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
	
	if(respuesta.equalsIgnoreCase("Verdadero")) {
		JOptionPane.showMessageDialog(null,"Respuesta Erronea","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
		}
	else if(respuesta.equalsIgnoreCase("Falso")) {
		JOptionPane.showMessageDialog(null,"Respuesta Correcta","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));		contador++;
	}else {
		contador=contador+0;
		JOptionPane.showMessageDialog(null,"Te lo cuento como error","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
		}
}

public void Pregunta10(){
	UIManager UI=new UIManager();
    UI.put("OptionPane.background", new Color(0, 62, 0));
    UI.put("Panel.background", new Color(0, 62, 0));
    UI.put("Menu.Foreground",Color.red);
    UI.put("OptionPane.messageFont", new Font("Arial",Font.CENTER_BASELINE,15));
    UI.put("OptionPane.messageForeground", Color.white);

	String respuesta;
	respuesta=(String) JOptionPane.showInputDialog(null,"La catedral de Sevilla es la catedral	 más grande del mundo"+"\n¿Verdadero o Falso?","10º Pregunta", JOptionPane.INFORMATION_MESSAGE,
	        new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")), null, null);
	if(respuesta.equalsIgnoreCase("Verdadero")) {
		JOptionPane.showMessageDialog(null,"Respuesta Correcta","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));		contador++;
	}
	else if(respuesta.equalsIgnoreCase("Falso")) {
		JOptionPane.showMessageDialog(null,"Respuesta Erronea","Respuesta",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
		}else {
			contador=contador+0;
			JOptionPane.showMessageDialog(null,"Te lo cuento como error","Respuesta",JOptionPane.INFORMATION_MESSAGE,
		            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
			}
}
//Total
public void getContador() {
	UIManager UI=new UIManager();
    UI.put("OptionPane.background", new Color(0, 62, 0));
    UI.put("Panel.background", new Color(0, 62, 0));
    UI.put("Menu.Foreground",Color.red);
    UI.put("OptionPane.messageFont", new Font("Arial",Font.CENTER_BASELINE,15));
    UI.put("OptionPane.messageForeground", Color.white);
    
	if (contador >=5) {
	 JOptionPane.showMessageDialog(null,"Felicidades has aprobado con: "+contador+" Respuestas acertadas","Total",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));

	}else {
		JOptionPane.showMessageDialog(null,"Vaya has Suspendido con: "+contador+" Respuestas acertadas, hay que repasar mas bro","Total",JOptionPane.INFORMATION_MESSAGE,
	            new ImageIcon(Test.class.getResource("/Imagenes/soldado.png")));
	}
	}
}