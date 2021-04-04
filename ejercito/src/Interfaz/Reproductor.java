package Interfaz;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Reproductor extends Thread {


    private boolean off = false;
 
    public boolean isOff() {
		return off;
	}

	public void setOff(boolean off) {
	this.off = off;
	}

     void btnReproducirActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException, JavaLayerException {    
   
    File fichero = new File("HSP.mp3");
        //txtReproductor.setText(fichero.getAbsolutePath());
 
        //Creamos el FileInputStream con la ruta del fichero de audio
        FileInputStream fis=new FileInputStream(fichero);
            //Creamos el objeto Player
        Player player=new Player(fis);
            //Reproducimos el fichero, una vez lo haga no podremos hacer nada hasta que termine
        player.play();
       
       /* if(off) {
       
        player.close();
        }*/
       
       

     }
     
     
   //aaa
     
     
}