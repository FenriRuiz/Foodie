package dominio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import persistencia.DAOTrabajador;

public class Trabajador {
	private String name;
	private String password;
	private String realName;
	private String lastConnect;
	private String rutaIcono;
	
	public Trabajador(String name, String password, String realName, String lastConnect, String rutaIcono){
		this.name = name;
		this.password = password;
		this.realName = realName;
		this.lastConnect = lastConnect;
		this.rutaIcono = rutaIcono;
	}
	public Trabajador(){
		//Constructor Vacio
	}	
	public ArrayList<Trabajador> leerTrabajadores() throws FileNotFoundException{
		DAOTrabajador daoWorker = new DAOTrabajador();
		return daoWorker.getAllWorkers();
	}
	public int guardarTrab(Trabajador trabajador) throws IOException {
		DAOTrabajador daoWorker = new DAOTrabajador();
		return daoWorker.addWorker(trabajador);
	}
	public String toString() {
		return "Trabajador [name=" + name + ", password=" + password + ", realName=" + realName + ", lastConnect="
				+ lastConnect + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getLastConnect() {
		return lastConnect;
	}
	public void setLastConnect(String lastConnect) {
		this.lastConnect = lastConnect;
	}
	public String getRutaIcono() {
		return rutaIcono;
	}
	public void setRutaIcono(String rutaIcono) {
		this.rutaIcono = rutaIcono;
	}
}
