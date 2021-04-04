package ejercito;

import escritura.Editor;

public class VehiculosArmada extends Vehiculo {
	
	
	public VehiculosArmada(int cantVehiculos, String tipo,String descripcion) {
		super(cantVehiculos, tipo,descripcion);
		Editor e = new Editor("datos/VehiculosArmada.txt") ;
		
		e.escribir(cantVehiculos + "\t" + tipo + "\t" + descripcion + "\t" + getRegistro() + "\r\n");
	}
	
	public VehiculosArmada(int cantVehiculos, String tipo,String descripcion,boolean registro) {
		super(cantVehiculos, tipo,descripcion,registro);
		
	}

	@Override
	public String toString() {
		return "-Nombre:" + getTipo()+"\n-Cantidad: " + getCantVehiculos() +
				 "\n-Descripción del vehículo: "+getDescripcion();
	}
	
	

}
