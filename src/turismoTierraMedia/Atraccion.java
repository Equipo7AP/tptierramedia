package turismoTierraMedia;

public class Atraccion {

	private int costo;
	private int tiempo;
	private int cupo;
	public Atraccion(int costo, int tiempo, int cupo) {
		super();
		this.costo = costo;
		this.tiempo = tiempo;
		this.cupo = cupo;
	}

	protected int getCosto() {
		return costo;
	}

	protected int getTiempo() {
		return tiempo;
	}

	protected int getCupo() {
		return cupo;
	}
}
