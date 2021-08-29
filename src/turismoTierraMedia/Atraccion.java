package turismoTierraMedia;

public class Atraccion {

	private int costo;
	private double tiempo;
	private int cupo;
	private TipoDeAtraccion tipo;
	public Atraccion(int costo, int tiempo, int cupo, TipoDeAtraccion tipo) {
		this.costo = costo;
		this.tiempo = tiempo;
		this.cupo = cupo;
		this.tipo = tipo;
	}

	protected int getCosto() {
		return costo;
	}

	protected double getTiempo() {
		return tiempo;
	}

	protected int getCupo() {
		return cupo;
	}

	protected TipoDeAtraccion getTipo() {
		return tipo;
	}
	
	
}
