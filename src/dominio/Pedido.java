package dominio;

import java.util.ArrayList;

public class Pedido {
	int nPedido;
	Trabajador trabajador;
	ArrayList<Carrito> comidasPedido;
	String estado;
	String ubicacion;
	
	public Pedido(Trabajador trabajador, ArrayList<Carrito> comidasPedido, String estado) {
		super();
		this.trabajador = trabajador;
		this.comidasPedido = comidasPedido;
		this.estado = estado;
	}
	public Pedido(Trabajador trabajador, ArrayList<Carrito> comidasPedido, String estado, String ubicacion) {
		super();
		this.trabajador = trabajador;
		this.comidasPedido = comidasPedido;
		this.estado = estado;
		this.ubicacion = ubicacion;
	}
	public Pedido(int nPedido, Trabajador trabajador, ArrayList<Carrito> comidasPedido, String estado, String ubicacion) {
		super();
		this.nPedido = nPedido;
		this.trabajador = trabajador;
		this.comidasPedido = comidasPedido;
		this.estado = estado;
		this.ubicacion = ubicacion;
	}
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}
	
	public int getnPedido() {
		return nPedido;
	}
	public void setnPedido(int nPedido) {
		this.nPedido = nPedido;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
