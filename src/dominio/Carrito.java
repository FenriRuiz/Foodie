package dominio;

public class Carrito {
	Comida comida;
	Integer cantidad;
	
	public Carrito(Comida comida, Integer cantidad) {
		super();
		this.comida = comida;
		this.cantidad = cantidad;
	}
	
	public Comida getComida() {
		return comida;
	}
	public void setComida(Comida comida) {
		this.comida = comida;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
}
