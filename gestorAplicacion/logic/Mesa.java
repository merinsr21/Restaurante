package gestorAplicacion.logic;
import java.util.*;
import gestorAplicacion.users.*;

public class Mesa {
	
	private int codigoM;
	private int numeroDeSillas;
	private Boolean ocupada;
    private ArrayList<Usuario> usuariosM = new ArrayList<Usuario>();
	private ArrayList<Pedido> pedidosM = new ArrayList<Pedido>();
	
	public int getCodigoM() {
		return codigoM;
	}
	public void setCodigoM(int codigoM) {
		this.codigoM = codigoM;
	}
	public int getNumeroDeSillas() {
		return numeroDeSillas;
	}
	public void setNumeroDeSillas(int numeroDeSillas) {
		this.numeroDeSillas = numeroDeSillas;
	}
	public Boolean getOcupada() {
		return ocupada;
	}
	public void setOcupada(Boolean ocupada) {
		this.ocupada = ocupada;
	}
	public ArrayList<Usuario> getUsuariosM() {
		return usuariosM;
	}
	public void setUsuariosM(ArrayList<Usuario> usuariosM) {
		this.usuariosM = usuariosM;
	}
	public ArrayList<Pedido> getPedidosM() {
		return pedidosM;
	}
	public void setPedidosM(ArrayList<Pedido> pedidosM) {
		this.pedidosM = pedidosM;
	}
	
	
	
}
