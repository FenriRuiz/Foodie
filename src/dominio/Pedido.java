package dominio;

import java.util.ArrayList;

public class Pedido {
	Trabajador trabajador;
	ArrayList<Carrito> comidasPedido;
	
	public Pedido(Trabajador trabajador, ArrayList<Carrito> comidasPedido) {
		super();
		this.trabajador = trabajador;
		this.comidasPedido = comidasPedido;
	}
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Trabajador getTrabajador() {
		return trabajador;
	}
	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}
	public ArrayList<Carrito> getComidasPedido() {
		return comidasPedido;
	}
	public void setComidasPedido(ArrayList<Carrito> comidasPedido) {
		this.comidasPedido = comidasPedido;
	}
	
}
