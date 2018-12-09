package presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;

import dominio.Comida;
import dominio.Trabajador;

import java.awt.BorderLayout;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class GestionPlatos extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 * @param frameAncestor 
	 */
	public GestionPlatos(Trabajador trabajador, JFrame frameAncestor) {

		
		setLayout(new BorderLayout(0, 0));
		
		try {
			Comida comida = new Comida();
			ArrayList<Comida> listaComidas = comida.leerComidas();
			
			ConfPlato pl = new ConfPlato(listaComidas.get(0));
			add(pl, BorderLayout.EAST);
			
			ListaPlatos mPlatos = new ListaPlatos(listaComidas);
			add(mPlatos, BorderLayout.CENTER);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		InfoUsuario infUser = new InfoUsuario(trabajador, frameAncestor);
		add(infUser, BorderLayout.NORTH);
		
		botonesIzq btnIzq = new botonesIzq(trabajador, frameAncestor);
		add(btnIzq, BorderLayout.WEST);
		
	}

}
