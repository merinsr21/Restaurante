package gestorAplicacion.users;
import java.util.ArrayList;
import gestorAplicacion.logic.Pedido;

public class Chef extends Usuario {
	private boolean estado;
	private ArrayList<Pedido> pedidoCF = new ArrayList<Pedido>();
	
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public ArrayList<Pedido> getPedidoCF() {
		return pedidoCF;
	}
	public void setPedidoCF(ArrayList<Pedido> pedidoCF) {
		this.pedidoCF = pedidoCF;
	}

	
	
}
