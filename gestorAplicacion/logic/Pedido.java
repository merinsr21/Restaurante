package gestorAplicacion.logic;
import java.util.*;
import gestorAplicacion.users.*;

public class Pedido {
	
	private int codigoP;
	private Factura facturaP;
	private Usuario usuarioP;
	private Mesa mesaP;
	private Boolean preparado;   //inicializa en false
	private ArrayList<DetallePedido> detallesP = new ArrayList<DetallePedido>();
	private Chef chefP;
	
	public int getCodigoP() {
		return codigoP;
	}
	public void setCodigoP(int codigoP) {
		this.codigoP = codigoP;
	}
	public Factura getFacturaP() {
		return facturaP;
	}
	public void setFacturaP(Factura facturaP) {
		this.facturaP = facturaP;
	}
	public Usuario getUsuarioP() {
		return usuarioP;
	}
	public void setUsuarioP(Usuario usuarioP) {
		this.usuarioP = usuarioP;
	}
	public Mesa getMesaP() {
		return mesaP;
	}
	public void setMesaP(Mesa mesaP) {
		this.mesaP = mesaP;
	}
	public Boolean getPreparado() {
		return preparado;
	}
	public void setPreparado(Boolean preparado) {
		this.preparado = preparado;
	}
	public ArrayList<DetallePedido> getDetallesP() {
		return detallesP;
	}
	public void setDetallesP(ArrayList<DetallePedido> detallesP) {
		this.detallesP = detallesP;
	}
	public Chef getChefP() {
		return chefP;
	}
	public void setChefP(Chef chefP) {
		this.chefP = chefP;
	}
	
	
	
	
	
}
