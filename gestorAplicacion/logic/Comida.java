package gestorAplicacion.logic;
import java.util.*;

public class Comida {
	
	private int codigoCM;
	private String nombreCM;
	private int precioCM;
	private ArrayList<DetallePedido> pedidosCM = new ArrayList<DetallePedido>();
	private ArrayList<Calificacion> calificacionesCM = new ArrayList<Calificacion>();
	
	public int getCodigoCM() {
		return codigoCM;
	}
	public void setCodigoCM(int codigoCM) {
		this.codigoCM = codigoCM;
	}
	public String getNombreCM() {
		return nombreCM;
	}
	public void setNombreCM(String nombreCM) {
		this.nombreCM = nombreCM;
	}
	public int getPrecioCM() {
		return precioCM;
	}
	public void setPrecioCM(int precioCM) {
		this.precioCM = precioCM;
	}
	public ArrayList<DetallePedido> getPedidosCM() {
		return pedidosCM;
	}
	public void setPedidosCM(ArrayList<DetallePedido> pedidosCM) {
		this.pedidosCM = pedidosCM;
	}
	public ArrayList<Calificacion> getCalificacionesCM() {
		return calificacionesCM;
	}
	public void setCalificacionesCM(ArrayList<Calificacion> calificacionesCM) {
		this.calificacionesCM = calificacionesCM;
	}
	
	
}
