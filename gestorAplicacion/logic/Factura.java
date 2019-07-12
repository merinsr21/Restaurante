package gestorAplicacion.logic;
import java.util.*;
import gestorAplicacion.users.*;

public class Factura {
	
	private int codigoF;
	private Usuario usuarioF;
	private ArrayList<Calificacion> calificacionesF = new ArrayList<Calificacion>();
	public int getCodigo() {
		return codigoF;
	}
	public void setCodigo(int codigo) {
		this.codigoF = codigo;
	}
	public Usuario getUsuario() {
		return usuarioF;
	}
	public void setUsuario(Usuario usuario) {
		this.usuarioF = usuario;
	}
	public ArrayList<Calificacion> getCalificaciones() {
		return calificacionesF;
	}
	public void setCalificaciones(ArrayList<Calificacion> calificaciones) {
		this.calificacionesF = calificaciones;
	}
	
	
}
