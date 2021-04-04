package ejercito;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import escritura.*;

public class Armada extends Ejercito {

	private int Id;
	private static int IdSigiente=1;
	
	//Constructor
	public Armada(String NombreBase, String sede, int numTropas, int numNaves, int dia, int mes, int annio) {
		super(NombreBase, sede, numTropas, numNaves, dia, mes, annio);
		Id=IdSigiente;
		IdSigiente++ ;
		
		Editor e = new Editor("datos/Armada.txt") ;
		
		e.escribir(NombreBase + "\t" + sede + "\t" + numTropas + "\t" + numNaves + "\t" + dia + "\t" + mes + "\t" + annio + "\t" + this.Id + "\r\n");
	
	}
	public Armada(String NombreBase, String sede, int numTropas, int numNaves, int dia, int mes, int annio,int id) {
		super(NombreBase, sede, numTropas, numNaves, dia, mes, annio);
		
		Id=id;
		IdSigiente = id+1 ;
		
		
	}

	@Override
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy");
		return "-Id_Armada=" + Id + "\n-Nombre de la base: "+getNombreBase()+"\n-Lugar de la sede: "+getSede()+"\n-Número de tropas: "+getNumTropas()+"\n-Número de naves: "+getNumNaves() +"\n-Fecha de fundación de la Armada:  "+formatter.format(getFechaFundacion());
	}
	
	

}
