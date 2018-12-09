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
	 * @throws FileNotFoundException 
	 */
	public GestionPlatos(Trabajador trabajador, JFrame frameAncestor) throws FileNotFoundException {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		
		Comida comida = new Comida();
		ArrayList<Comida> listaComidas = comida.leerComidas();
		panel.setLayout(new BorderLayout(0, 0));
		
		ConfPlato pl = new ConfPlato(listaComidas.get(0));
		panel.add(pl, BorderLayout.EAST);
		
		botonesIzq btnIzq = new botonesIzq(trabajador, frameAncestor, panel);
		panel.add(btnIzq, BorderLayout.WEST);
		
		InfoUsuario infUser = new InfoUsuario(trabajador, frameAncestor);
		panel.add(infUser, BorderLayout.NORTH);
		
		ListaPlatos mPlatos = new ListaPlatos("", panel);
		panel.add(mPlatos, BorderLayout.CENTER);
		
	}

}
