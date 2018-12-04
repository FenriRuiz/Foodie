package persistencia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
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

		    workers.add(trab);
		}
		datos.close();
		return workers;	
	}
	public int addWorker(Trabajador trabajador) {
		BufferedWriter out;
		try {
			out = new BufferedWriter(new FileWriter("Trabajadores.txt"));

			for (int i = 0; i < trabajador.length; i++) {
				out.write(trabajador.getName() + ",");
				out.write(trabajador.getPassword() + ",");
				out.write(trabajador.getRealName() + ",");
			    out.write(trabajador.getLastConnect());
			    out.newLine();
			}
		    out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	return 1; 
}
}
