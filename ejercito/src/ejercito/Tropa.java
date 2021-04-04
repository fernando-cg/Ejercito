package ejercito;

public class Tropa {
	
	private int cantTropas;
	private int cantPresupuesto;
	private String rango;
	private String base;
	
	public Tropa(int cantTropas,  String rango, String base) {
		super();
		this.cantTropas = cantTropas;
		this.rango = rango;
		this.base = base;
	}
	
	public Tropa(int cantTropas,  String rango, String base,int cantPresupuesto) {
		super();
		this.cantTropas = cantTropas;
		this.rango = rango;
		this.base = base;
		this.cantPresupuesto = cantPresupuesto;
	}

	public int getCantTropas() {
		return cantTropas;
	}

	public int getCantPresupuesto() {
		return cantPresupuesto;
	}

	public String getRango() {
		return rango;
	}

	public String getBase() {
		return base;
	}

	public void setCantTropas(int cantTropas) {
		this.cantTropas = cantTropas;
	}

	public void setCantPresupuesto(int cantPresupuesto) {
		this.cantPresupuesto = cantPresupuesto;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public void setBase(String base) {
		this.base = base;
	}
	
	
	
	

}
