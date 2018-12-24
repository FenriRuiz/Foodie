package dominio;

public class Cliente {
	String nombre;
	Integer lvlVIP;
	
	public Cliente(String nombre, Integer lvlVIP) {
		super();
		this.nombre = nombre;
		this.lvlVIP = lvlVIP;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getLvlVIP() {
		return lvlVIP;
	}
	public void setLvlVIP(Integer lvlVIP) {
		this.lvlVIP = lvlVIP;
	}

}
