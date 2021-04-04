package ejercito;

public abstract class Vehiculo {
private int cantVehiculos;
private String Tipo;
private int Presupuesto;
private String descripcion;
private boolean registro ;

//Constructor

public Vehiculo(int cantVehiculos, String tipo,String descripcion) {
	super();
	this.cantVehiculos = cantVehiculos;
	Tipo = tipo;
	this.descripcion=descripcion;
	registro =false ;
	
}
public Vehiculo(int cantVehiculos, String tipo,String descripcion,boolean registro) {
	super();
	this.cantVehiculos = cantVehiculos;
	Tipo = tipo;
	this.descripcion=descripcion;
	this.registro = registro ;
	
}
//Getters y setters
public int getCantVehiculos() {
	return cantVehiculos;
}
public void setCantVehiculos(int cantVehiculos) {
	this.cantVehiculos = cantVehiculos;
}
public String getTipo() {
	return Tipo;
}
public void setTipo(String tipo) {
	Tipo = tipo;
}
public int getPresupuesto() {
	return Presupuesto;
}
public void setPresupuesto(int presupuesto) {
	Presupuesto = presupuesto;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public boolean getRegistro() {
	return registro;
}
public void setRegistro(boolean registro) {
	this.registro = registro;
}



}
