package dominio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import persistencia.DAOComida;

public class Comida {
	private int identificador;
	private String name;
	private String pestana;
	private String ingrediente;
	private boolean bwrLact;
	private boolean bwrMar;
	private boolean bwrFSec;
	private boolean bwrGlut;
	private String rutaImagen;
	private double precio;

	public Comida(int identificador, String name, String ingrediente, boolean bwrLact, boolean bwrMar, boolean bwrFSec,
			boolean bwrGlut, String rutaImagen, double precio, String pestana) {
		this.identificador = identificador;
		this.name = name;
		this.ingrediente = ingrediente;
		this.bwrLact = bwrLact;
		this.bwrMar = bwrMar;
		this.bwrFSec = bwrFSec;
		this.bwrGlut = bwrGlut;
		this.rutaImagen = rutaImagen;
		this.precio = precio;
		this.pestana = pestana;
	}

	public Comida() {
		//Constructor vacio
	}
	public ArrayList<Comida> leerComidas() throws FileNotFoundException{
		DAOComida com = new DAOComida();
		return com.getAllDish();
	}
	public int guardarComida(Comida comida) throws IOException {
		DAOComida com = new DAOComida();
		com.addDish(comida);
		return 1;
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
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

	public String getRutaImagen() {
		return rutaImagen;
	}
	public void setRutaImagen(String rutaImagen) {
		this.rutaImagen = rutaImagen;
	}
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
