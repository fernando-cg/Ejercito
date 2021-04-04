package ejercito;

import java.util.Calendar;
import java.util.Date;

public abstract class Ejercito {
private String NombreBase;
private  Date fechaFundacion;
private String sede;
private int presupuesto;
private int NumTropas;
private int NumNaves;

//Constructor
public Ejercito(String NombreBase,String sede, int numTropas, int numNaves,int dia,int mes,int annio) {
	super();
	this.NombreBase=NombreBase;
	this.sede = sede;
	this.NumTropas = numTropas;
	this.NumNaves = numNaves;
	Calendar Fecha1=Calendar.getInstance();
	Fecha1.set(annio, (mes-1),dia);
	this.fechaFundacion=Fecha1.getTime();
	
}
//Getters y Setters
public Date getFechaFundacion() {
	return fechaFundacion;
}
public void setFechaFundacion(Date fechaFundacion) {
	this.fechaFundacion = fechaFundacion;
}
public String getSede() {
	return sede;
}
public void setSede(String sede) {
	this.sede = sede;
}
public int getPresupuesto() {
	return presupuesto;
}
public void setPresupuesto(int presupuesto) {
	this.presupuesto = presupuesto;
}
public int getNumTropas() {
	return NumTropas;
}
public void setNumTropas(int numTropas) {
	this.NumTropas = numTropas;
}
public int getNumNaves() {
	return NumNaves;
}
public void setNumNaves(int numNaves) {
	this.NumNaves = numNaves;
}


public String getNombreBase() {
	return NombreBase;
}
public void setNombreBase(String nombreBase) {
	NombreBase = nombreBase;
}
@Override
public String toString() {
	return "Ejercito [NombreBase=" + NombreBase + ", fechaFundacion=" + fechaFundacion + ", sede=" + sede
			+ ", presupuesto=" + presupuesto + ", NumTropas=" + NumTropas + ", NumNaves=" + NumNaves + "]";
}



}
