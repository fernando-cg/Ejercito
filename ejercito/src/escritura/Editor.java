package escritura;

import java.io.* ;
import java.util.ArrayList;
import java.util.StringTokenizer;

import cifrados.aes;
import ejercito.*;
public class Editor {
	
	private String directorio ;

	public Editor(String directorio) {
		super();
		this.directorio = directorio;
	}
	
	
	public String lectura(){
		
		String cadena = null ;
		String cadenaf="" ;
		
		FileReader f = null ;
		
		try {
			
			f = new FileReader(directorio);
			
		} catch (FileNotFoundException e) {
			
			cadenaf = "No se ha encontrado el archivo" ;
			
		}
		
		
	    BufferedReader b = new BufferedReader(f);
	    
	    try {
	    	
			while((cadena = b.readLine())!=null) {
			      
				cadenaf = cadenaf + cadena + "\n" ;
			  }
			
		} catch (IOException i) {
			
			i.printStackTrace();
			
		}

	    
	    try {
			b.close();
			
		} catch (IOException a) {
			
			a.printStackTrace();
		}
	    return cadenaf ;
	}
	
	public void escribir(String cadena) {
		
		FileReader f = null ;
		
		try {
			
			f = new FileReader(directorio);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
		try {
			
			BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(directorio,true), "utf-8"));
		
			escribir.write(cadena);
			
			escribir.close();
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Error");
		}
			
	    
		
	}
	
	public ArrayList<Armada> actualizarar(ArrayList<Armada> array) {
		
		String linea = null;
		
        BufferedReader leerFichero;
        
        try {
        	
        	leerFichero = new BufferedReader (new FileReader(directorio));
			while( (linea = leerFichero.readLine()) != null)
			{
				
			   StringTokenizer token = new StringTokenizer(linea, "\t");
			   String     nombreBase =  token.nextToken().trim() ;
			   String  sede =  token.nextToken().trim();
			   String       numeroTropas =  token.nextToken().trim();
			   String     numeroNaves =  token.nextToken().trim();
			   String     dia =  token.nextToken().trim();
			   String     mes =  token.nextToken().trim();
			   String     annio =  token.nextToken().trim();
			   String     id =  token.nextToken().trim();
			  
			   
			   int    numTropas2=Integer.parseInt(numeroTropas);
			   int    numNaves2=Integer.parseInt(numeroNaves);
			   int    dia2=Integer.parseInt(dia);
			   int    mes2=Integer.parseInt(mes);
			   int    annio2=Integer.parseInt(annio);
			   int    id2=Integer.parseInt(id);
			   array.add(new Armada(nombreBase,sede,numTropas2,numNaves2,dia2,mes2,annio2,id2));
			   
			   
			   }
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		return array ;
	}
	
	public boolean usuario(String user) {
		
		String linea = null;
		
        BufferedReader leerFichero;
        
        try {
        	 String usuario ;
        	leerFichero = new BufferedReader (new FileReader(directorio));
			while( (linea = leerFichero.readLine()) != null)
			{
				
			   StringTokenizer token = new StringTokenizer(linea, "\t");
			   usuario =  token.nextToken().trim() ;
			   String  pass =  token.nextToken().trim();
			   
			   if(aes.encrypt(user, "limon").equals(usuario)) {
				   return true ;
			   }
			   }
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		return false ;
	}
	
public boolean pass(String password) {
		
		String linea = null;
		
        BufferedReader leerFichero;
        
        try {
        	leerFichero = new BufferedReader (new FileReader(directorio));
			while( (linea = leerFichero.readLine()) != null)
			{
				
				   StringTokenizer token = new StringTokenizer(linea, "\t");
				   String usuario =  token.nextToken().trim() ;
				   String  pass =  token.nextToken().trim();
			   
				   if(aes.encrypt(password, "limon").equals(pass)) {
					   return true ;
				   }
			   }
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		return false ;
	}
	
public ArrayList<Aire> actualizarair(ArrayList<Aire> array) {
		
		String linea = null;
		
        BufferedReader leerFichero;
        
        try {
        	
        	leerFichero = new BufferedReader (new FileReader(directorio));
			while( (linea = leerFichero.readLine()) != null)
			{
				
			   StringTokenizer token = new StringTokenizer(linea, "\t");
			   
			   String     nombreBase =  token.nextToken().trim() ;
			   String  sede =  token.nextToken().trim();
			   String       numeroTropas =  token.nextToken().trim();
			   String     numeroNaves =  token.nextToken().trim();
			   String     dia =  token.nextToken().trim();
			   String     mes =  token.nextToken().trim();
			   String     annio =  token.nextToken().trim();
			   String     id =  token.nextToken().trim();
			  
			   
			   int    numTropas2=Integer.parseInt(numeroTropas);
			   int    numNaves2=Integer.parseInt(numeroNaves);
			   int    dia2=Integer.parseInt(dia);
			   int    mes2=Integer.parseInt(mes);
			   int    annio2=Integer.parseInt(annio);
			   int    id2 =Integer.parseInt(id);
			   array.add(new Aire(nombreBase,sede,numTropas2,numNaves2,dia2,mes2,annio2,id2));
			   
			   
			   }
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		return array ;
	}

public ArrayList<Tierra> actualizaratier(ArrayList<Tierra> array) {
	
	String linea = null;
	
    BufferedReader leerFichero;
    
    try {
    	
    	leerFichero = new BufferedReader (new FileReader(directorio));
		while( (linea = leerFichero.readLine()) != null)
		{
			
		   StringTokenizer token = new StringTokenizer(linea, "\t");
		   
		   String     nombreBase =  token.nextToken().trim() ;
		   String  sede =  token.nextToken().trim();
		   String       numeroTropas =  token.nextToken().trim();
		   String     numeroNaves =  token.nextToken().trim();
		   String     dia =  token.nextToken().trim();
		   String     mes =  token.nextToken().trim();
		   String     annio =  token.nextToken().trim();
		   String     id =  token.nextToken().trim();
		  
		   
		   int    numTropas2=Integer.parseInt(numeroTropas);
		   int    numNaves2=Integer.parseInt(numeroNaves);
		   int    dia2=Integer.parseInt(dia);
		   int    mes2=Integer.parseInt(mes);
		   int    annio2=Integer.parseInt(annio);
		   int    id2=Integer.parseInt(id);
		   array.add(new Tierra(nombreBase,sede,numTropas2,numNaves2,dia2,mes2,annio2,id2));
		   
		   
		   }
	} catch (NumberFormatException | IOException e) {
		e.printStackTrace();
	}
	return array ;
}

public ArrayList<TropasArmada> actualizartroparm(ArrayList<TropasArmada> array) {
	
	String linea = null;
	
    BufferedReader leerFichero;
    
    try {
    	
    	leerFichero = new BufferedReader (new FileReader(directorio));
		while( (linea = leerFichero.readLine()) != null)
		{
			
			   StringTokenizer token = new StringTokenizer(linea, "\t");
			   
			   String     cantTropas =  token.nextToken().trim() ;
			   String  rango =  token.nextToken().trim();
			   String       base =  token.nextToken().trim();
			   String       presupuesto =  token.nextToken().trim();
			  
			  
			   
			   int    cantTropas2=Integer.parseInt(cantTropas);
			   int    presupuesto2=Integer.parseInt(presupuesto);
			   
			   array.add(new TropasArmada(cantTropas2,rango,base,presupuesto2));
		   
		   
		   }
	} catch (NumberFormatException | IOException e) {
		e.printStackTrace();
	}
	return array ;
}

public ArrayList<TropasTierra> actualizartropatier(ArrayList<TropasTierra> array) {
	
	String linea = null;
	
    BufferedReader leerFichero;
    
    try {
    	
    	leerFichero = new BufferedReader (new FileReader(directorio));
		while( (linea = leerFichero.readLine()) != null)
		{
			
		StringTokenizer token = new StringTokenizer(linea, "\t");
			   
			   String     cantTropas =  token.nextToken().trim() ;
			   String  rango =  token.nextToken().trim();
			   String       base =  token.nextToken().trim();
			   String       presupuesto =  token.nextToken().trim();
			  
			  
			   
			   int    cantTropas2=Integer.parseInt(cantTropas);
			   int    presupuesto2=Integer.parseInt(presupuesto);
			   
			   array.add(new TropasTierra(cantTropas2,rango,base,presupuesto2));
		   
		   
		   }
	} catch (NumberFormatException | IOException e) {
		e.printStackTrace();
	}
	return array ;
}

public ArrayList<TropasAire> actualizartropaair(ArrayList<TropasAire> array) {
	
	String linea = null;
	
    BufferedReader leerFichero;
    
    try {
    	
    	leerFichero = new BufferedReader (new FileReader(directorio));
		while( (linea = leerFichero.readLine()) != null)
		{
			
		   StringTokenizer token = new StringTokenizer(linea, "\t");
		   
		   String     cantTropas =  token.nextToken().trim() ;
		   String  rango =  token.nextToken().trim();
		   String       base =  token.nextToken().trim();
		   String       presupuesto =  token.nextToken().trim();
		  
		  
		   
		   int    cantTropas2=Integer.parseInt(cantTropas);
		   int    presupuesto2=Integer.parseInt(presupuesto);
		   
		   array.add(new TropasAire(cantTropas2,rango,base,presupuesto2));
		   
		   
		   }
	} catch (NumberFormatException | IOException e) {
		e.printStackTrace();
	}
	return array ;
}




public ArrayList<VehiculosArmada> actualizarvehiarm(ArrayList<VehiculosArmada> array) {
	
	String linea = null;
	
    BufferedReader leerFichero;
    
    try {
    	
    	leerFichero = new BufferedReader (new FileReader(directorio));
		while( (linea = leerFichero.readLine()) != null)
		{
			
			   StringTokenizer token = new StringTokenizer(linea, "\t");
			   
			   String     cantVehiculos =  token.nextToken().trim() ;
			   String  tipo =  token.nextToken().trim();
			   String       descripcion =  token.nextToken().trim();
			   String       tipo1 =  token.nextToken().trim();
			  
			  
			   
			   int    cantVehiculos2=Integer.parseInt(cantVehiculos);
			   boolean    tipo2=Boolean.parseBoolean(tipo1) ;
			   
			   array.add(new VehiculosArmada(cantVehiculos2,tipo,descripcion,tipo2));
		   
		   
		   }
	} catch (NumberFormatException | IOException e) {
		e.printStackTrace();
	}
	return array ;
}

public ArrayList<VehiculosAire> actualizarvehiair(ArrayList<VehiculosAire> array) {
	
	String linea = null;
	
    BufferedReader leerFichero;
    
    try {
    	
    	leerFichero = new BufferedReader (new FileReader(directorio));
		while( (linea = leerFichero.readLine()) != null)
		{
			
		   StringTokenizer token = new StringTokenizer(linea, "\t");
		   
		   String     cantVehiculos =  token.nextToken().trim() ;
		   String  tipo =  token.nextToken().trim();
		   String       descripcion =  token.nextToken().trim();
		   String       tipo1 =  token.nextToken().trim();
		  
		  
		   
		   int    cantVehiculos2=Integer.parseInt(cantVehiculos);
		   boolean    tipo2=Boolean.parseBoolean(tipo1) ;
		   
		   array.add(new VehiculosAire(cantVehiculos2,tipo,descripcion,tipo2));
		   
		   
		   }
	} catch (NumberFormatException | IOException e) {
		e.printStackTrace();
	}
	return array ;
}

public ArrayList<VehiculosTierra> actualizarvehitier(ArrayList<VehiculosTierra> array) {
	
	String linea = null;
	
    BufferedReader leerFichero;
    
    try {
    	
    	leerFichero = new BufferedReader (new FileReader(directorio));
		while( (linea = leerFichero.readLine()) != null)
		{
			
			   StringTokenizer token = new StringTokenizer(linea, "\t");
			   
			   String     cantVehiculos =  token.nextToken().trim() ;
			   String  tipo =  token.nextToken().trim();
			   String       descripcion =  token.nextToken().trim();
			   String       tipo1 =  token.nextToken().trim();
			  
			  
			   
			   int    cantVehiculos2=Integer.parseInt(cantVehiculos);
			   boolean    tipo2=Boolean.parseBoolean(tipo1) ;
			   
			   array.add(new VehiculosTierra(cantVehiculos2,tipo,descripcion,tipo2));
		   
		   
		   }
	} catch (NumberFormatException | IOException e) {
		e.printStackTrace();
	}
	return array ;
}

public void eliminarFila(int fila) {
	
	ArrayList<String> array = new ArrayList<String>() ;
	String linea = null;
	
    BufferedReader leerFichero;
    
    try {
    	
    	leerFichero = new BufferedReader (new FileReader(directorio));
		while( (linea = leerFichero.readLine()) != null)
		{
			
			array.add(linea) ;
		   
		   
		   }
		
		array.remove(fila) ;
		BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(directorio,true), "utf-8"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(directorio));
		bw.write("");
		for(int x = 0 ; x < array.size() ; x++) {
			escribir.write(array.get(x)) ;
		}
	} catch (NumberFormatException | IOException e) {
		e.printStackTrace();
	}
	
}


}
