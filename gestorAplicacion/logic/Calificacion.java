package gestorAplicacion.logic;
import gestorAplicacion.users.Usuario;

public class Calificacion {
	private int códigoC;
	private int puntaje;
	private Comida comidaC;
	private Factura facturaC;
	private Usuario usuarioC;
	
	public int getCódigoC() {
		return códigoC;
	}
	public void setCódigoC(int códigoC) {
		this.códigoC = códigoC;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	public Comida getComidaC() {
		return comidaC;
	}
	public void setComidaC(Comida comidaC) {
		this.comidaC = comidaC;
	}
	public Factura getFacturaC() {
		return facturaC;
	}
	public void setFacturaC(Factura facturaC) {
		this.facturaC = facturaC;
	}
	public Usuario getUsuarioC() {
		return usuarioC;
	}
	public void setUsuarioC(Usuario usuarioC) {
		this.usuarioC = usuarioC;
	}

	

}
