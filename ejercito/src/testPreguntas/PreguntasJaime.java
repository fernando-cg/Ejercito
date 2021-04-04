package testPreguntas;

import javax.swing.JOptionPane;

public class PreguntasJaime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String respuesta;
		int contador=0;
		//Primera pregunta
		respuesta=JOptionPane.showInputDialog("La primera guerra mundial comenzo el 28 de julio de 1914."+"\n¿Verdadero o Falso?");
		if (respuesta.equalsIgnoreCase("Verdadero")) {
			contador++;
			JOptionPane.showMessageDialog(null,"Respuesta Correcta");
		}else if (respuesta.equalsIgnoreCase("Falso")) {
			contador=contador+0;
			JOptionPane.showMessageDialog(null,"Respuesta Erronea");
		}else {
			contador=contador+0;
			JOptionPane.showMessageDialog(null,"Te lo cuento como error");
		}
		//Segunda pregunta;
		respuesta=JOptionPane.showInputDialog("La segunda guerra mundial termino el 10 de Agosto de 1956."+"\n¿Verdadero o Falso?");
		if (respuesta.equalsIgnoreCase("Verdadero")) {
			contador=contador+0;
			JOptionPane.showMessageDialog(null,"Respuesta Erronea");
		}else if (respuesta.equalsIgnoreCase("Falso")) {
			contador++;
			JOptionPane.showMessageDialog(null,"Respuesta Correcta");
		}else {
			contador=contador+0;
			JOptionPane.showMessageDialog(null,"Te lo cuento como error");
		}
		//Tercera Pregunta:
		respuesta=JOptionPane.showInputDialog("El presidente Aleman de la primera guerra mundial se llamaba Paul von Beneckendorff und von Merkel"+"\n¿Verdadero o Falso?");
		if (respuesta.equalsIgnoreCase("Verdadero")) {
			contador=contador+0;
			JOptionPane.showMessageDialog(null,"Respuesta Erronea");
		}else if (respuesta.equalsIgnoreCase("Falso")) {
			contador++;
			JOptionPane.showMessageDialog(null,"Respuesta Correcta");
		}else {
			contador=contador+0;
			JOptionPane.showMessageDialog(null,"Te lo cuento como error");
		}
		//Cuarta pregunta
		respuesta=JOptionPane.showInputDialog("En la primera guerra mundial perdio alemania y vencieron los paises Estados Unidos,Gran Betraña,Francia y otros estados aliados."+"\n¿Verdadero o Falso?");
		if (respuesta.equalsIgnoreCase("Verdadero")) {
			contador++;
			JOptionPane.showMessageDialog(null,"Respuesta Correcta");
		}else if (respuesta.equalsIgnoreCase("Falso")) {
			contador=contador+0;
			JOptionPane.showMessageDialog(null,"Respuesta Erronea");
		}else {
			contador=contador+0;
			JOptionPane.showMessageDialog(null,"Te lo cuento como error");
		}
		//Quinta pregunta
		respuesta=JOptionPane.showInputDialog("Las guerras Punicas que fueron los enfrentamientos entre Roma y Cartago duraron 70 annios y esta considerada una de las guerras mas largas de la historia"+"\n¿Verdadero o Falso?");
		if (respuesta.equalsIgnoreCase("Verdadero")) {
			contador=contador+0;
			JOptionPane.showMessageDialog(null,"Respuesta Erronea");
		}else if (respuesta.equalsIgnoreCase("Falso")) {
			contador++;
			JOptionPane.showMessageDialog(null,"Respuesta Correcta");
		}else {
			contador=contador+0;
			JOptionPane.showMessageDialog(null,"Te lo cuento como error");
		}
		
		
		respuesta=JOptionPane.showInputDialog("Cristobal Colón partió desde el Puerto de Palos, en Huelva"+"\n¿Verdadero o Falso?");
		if(respuesta.equalsIgnoreCase("Verdadero")) {
			JOptionPane.showMessageDialog(null,"Respuesta Correcta");
			contador++;
		}
		else if(respuesta.equalsIgnoreCase("Falso")){
			JOptionPane.showMessageDialog(null,"Respuesta Incorrecta");
		}
		
		
		respuesta=JOptionPane.showInputDialog(null,"Madrid fue la primera capital de España"+"\n¿Verdadero o Falso?");
		if(respuesta.equalsIgnoreCase("Verdadero")) {
			JOptionPane.showMessageDialog(null,"Respuesta Incorrecta");
		}
		else if(respuesta.equalsIgnoreCase("Falso")){
			JOptionPane.showMessageDialog(null,"Respuesta Correcta");
			contador++;
		}
		
		
		respuesta=JOptionPane.showInputDialog(null,"El 17 de Julio de 1936 comenzó la Guerra Civil Española"+"\n¿Verdadero o Falso?");
		if(respuesta.equalsIgnoreCase("Verdadero")) {
			JOptionPane.showMessageDialog(null,"Respuesta Correcta");
			contador++;
		}
		else if(respuesta.equalsIgnoreCase("Falso")) {
			JOptionPane.showMessageDialog(null,"Respuesta Incorrecta");
		}
		
		respuesta=JOptionPane.showInputDialog(null,"Huelva es la ciudad más antigua de España"+"\n¿Verdadero o Falso?");
		
		if(respuesta.equalsIgnoreCase("Verdadero")) {
			JOptionPane.showMessageDialog(null,"Respuesta Incorrecta");
		}
		else if(respuesta.equalsIgnoreCase("Falso")) {
			JOptionPane.showMessageDialog(null,"Respuesta Correcta");
			contador++;
		}
		

		respuesta=JOptionPane.showInputDialog(null,"La catedral de Sevilla es la catedral más grande del mundo"+"\n¿Verdadero o Falso?");
		if(respuesta.equalsIgnoreCase("Verdadero")) {
			JOptionPane.showMessageDialog(null,"Respuesta Correcta");
			contador++;
		}
		else if(respuesta.equalsIgnoreCase("Falso")) {
			JOptionPane.showMessageDialog(null,"Respuesta Incorrecta");
		}
			
		
		if (contador >=3) {
			JOptionPane.showMessageDialog(null,"Felicidades has aprobado con: "+contador+" Respuestas acertadas");

		}else {
			JOptionPane.showMessageDialog(null,"Vaya has Suspendido con: "+contador+" Respuestas acertadas, hay que repasar mas bro");
		}
	}

}