package presentacion;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.JScrollPane;

import dominio.Comida;

import java.awt.BorderLayout;
import javax.swing.ScrollPaneConstants;

public class ListaPlatos extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JPanel panel;

	/**
	 * Create the panel.
	 * @param listaComidas 
	 * @param mostrar 
	 * @param mMenu 
	 */

	public ListaPlatos(ArrayList<Comida> listaComidas) {
		setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		add(scrollPane);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));


		try {
			Comida comida = new Comida();
			listaComidas = comida.leerComidas();
			int i;
			for(i=0 ; i < listaComidas.size() ; i++) {
				Platos platillo = new Platos(listaComidas.get(i));
				panel.add(platillo);
				panel.repaint();
				panel.revalidate();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}



