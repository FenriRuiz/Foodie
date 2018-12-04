package dominio;


public class Comida {
	private String name;
	private String pestana;
	private String ingrediente;
	private boolean bwrLact;
	private boolean bwrMar;
	private boolean bwrFSec;
	private boolean bwrGlut;
	
	public Comida(String name, String ingrediente, boolean bwrLact, boolean bwrMar, boolean bwrFSec, boolean bwrGlut) {
		this.name = name;
		this.ingrediente = ingrediente;
		this.bwrLact = bwrLact;
		this.bwrMar = bwrMar;
		this.bwrFSec = bwrFSec;
		this.bwrGlut = bwrGlut;
	}
	public Comida() {
		//Constructor vacio
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPestana() {
		return pestana;
	}
	public void setPestana(String pestana) {
		this.pestana = pestana;
	}
	public String getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}
	public boolean isBwrLact() {
		return bwrLact;
	}
	public void setBwrLact(boolean bwrLact) {
		this.bwrLact = bwrLact;
	}
	public boolean isBwrMar() {
		return bwrMar;
	}
	public void setBwrMar(boolean bwrMar) {
		this.bwrMar = bwrMar;
	}
	public boolean isBwrFSec() {
		return bwrFSec;
	}
	public void setBwrFSec(boolean bwrFSec) {
		this.bwrFSec = bwrFSec;
	}
	public boolean isBwrGlut() {
		return bwrGlut;
	}
	public void setBwrGlut(boolean bwrGlut) {
		this.bwrGlut = bwrGlut;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	private double precio;

}
