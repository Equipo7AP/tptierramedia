package turismoTierraMedia;

public abstract class Promocion {

	private int descuento;
	
	public Promocion(){
		this.descuento = 0;
	}
	
	public abstract int calcularDescuento();
}
