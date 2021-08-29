package turismoTierraMedia;

public class Usuario {

	private int presupuesto;
	private double tiempoDisponible;
	private TipoDeAtraccion atraccionPreferida;
	public Usuario(int presupuesto, double tiempoDisponible, TipoDeAtraccion atraccionPreferida) {
		this.presupuesto = presupuesto;
		this.tiempoDisponible = tiempoDisponible;
		this.atraccionPreferida = atraccionPreferida;
	}
	protected int getPresupuesto() {
		return presupuesto;
	}
	protected double getTiempoDisponible() {
		return tiempoDisponible;
	}
	protected TipoDeAtraccion getAtraccionPreferida() {
		return atraccionPreferida;
	}
	
	
}
