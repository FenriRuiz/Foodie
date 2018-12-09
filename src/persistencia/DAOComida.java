package persistencia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import dominio.Comida;

public class DAOComida {
	
	public ArrayList<Comida> getAllDish() throws FileNotFoundException {
		File file = new File("Comidas.txt");
		Scanner datos = new Scanner(file);
		datos.useDelimiter(";");
		ArrayList<Comida> dishes = new ArrayList<Comida>();
		String linea = "";
		
		while (datos.hasNext()) {
			linea = datos.nextLine();
			
			Comida com = new Comida();
			StringTokenizer separador = new StringTokenizer(linea, ";");
			
			com.setIdentificador(Integer.parseInt(separador.nextToken()));
			com.setPestana(separador.nextToken());
			com.setName(separador.nextToken());
			com.setIngrediente(separador.nextToken());
			com.setBwrLact(Boolean.parseBoolean(separador.nextToken()));
			com.setBwrMar(Boolean.parseBoolean(separador.nextToken()));
			com.setBwrFSec(Boolean.parseBoolean(separador.nextToken()));
			com.setBwrGlut(Boolean.parseBoolean(separador.nextToken()));
			com.setPrecio(Double.parseDouble(separador.nextToken()));
			com.setRutaImagen(separador.nextToken());
			
		    dishes.add(com);
		}
		datos.close();
		return dishes;	
	}
	public int addDish(Comida com) throws IOException {
		BufferedWriter file;
		file = new BufferedWriter(new FileWriter("Comidas.txt",true));

		file.write(String.valueOf(com.getIdentificador()) + ";");
		file.write(com.getPestana() + ";");
		file.write(com.getName() + ";");
		file.write(com.getIngrediente() + ";");
		file.write(String.valueOf(com.isBwrLact()) + ";");
		file.write(String.valueOf(com.isBwrMar()) + ";");
		file.write(String.valueOf(com.isBwrFSec()) + ";");
		file.write(String.valueOf(com.isBwrGlut()) + ";");
		file.write(String.valueOf(com.getPrecio()) + ";");
		file.write(com.getRutaImagen() + ";");

		
		file.newLine();
		
		file.close();

	return 1; 
	}

}
