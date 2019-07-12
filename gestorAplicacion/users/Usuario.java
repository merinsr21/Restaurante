package gestorAplicacion.users;
import gestorAplicacion.logic.*;
import java.util.*;

public class Usuario {
	private String nombre;
	private String nombreUsuario;
	private String contraseña;
	private String correo;
	private Mesa mesa;
	private boolean estado;
	private ArrayList<Pedido> pedido = new ArrayList<Pedido>();
	private ArrayList<Calificacion> calificacion = new ArrayList<Calificacion>();;

}
