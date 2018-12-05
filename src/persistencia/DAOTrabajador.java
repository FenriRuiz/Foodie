package persistencia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import dominio.Trabajador;

public class DAOTrabajador {
		
	public ArrayList<Trabajador> getAllWorkers() throws FileNotFoundException {
		File file = new File("Trabajadores.txt");
		Scanner datos = new Scanner(file);
		datos.useDelimiter(",");
		ArrayList<Trabajador> workers = new ArrayList<Trabajador>();
		String linea = "";
		
		while (datos.hasNext()) {
			linea = datos.nextLine();
			
			Trabajador trab = new Trabajador();
			StringTokenizer separador = new StringTokenizer(linea, ",");
			
			trab.setName(separador.nextToken());
			trab.setPassword(separador.nextToken());
			trab.setRealName(separador.nextToken());
			trab.setLastConnect(separador.nextToken());
			trab.setRutaIcono(separador.nextToken());

		    workers.add(trab);
		}
		datos.close();
		return workers;	
	}
	public int addWorker(Trabajador trabajador) throws IOException {
		BufferedWriter file;
		file = new BufferedWriter(new FileWriter("Trabajadores.txt"));

		for (int i = 0; i < 5; i++) {
			file.write(trabajador.getName() + ",");
			file.write(trabajador.getPassword() + ",");
			file.write(trabajador.getRealName() + ",");
			file.write(trabajador.getLastConnect() + ",");
			file.write(trabajador.getRutaIcono());
			file.newLine();
		}
		file.close();
	//	try {
	//	} catch (IOException e) {
	//		e.printStackTrace();
	//	}
	return 1; 
	}
}
