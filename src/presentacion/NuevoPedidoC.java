package presentacion;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.JScrollPane;

import dominio.Comida;

import java.awt.BorderLayout;
import javax.swing.ScrollPaneConstants;
import java.awt.Color;

public class NuevoPedidoC extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JPanel panel;

	/**
	 * Create the panel.
	 * @param panel2 
	 * @param antecesor 
	 * @param listaComidas 
	 * @param mostrar 
	 * @param mMenu 
	 */

	public NuevoPedidoC(String eleccion, JPanel panel2) {
		
		setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		add(scrollPane);
		
		panel = new JPanel();
		panel.setBackground(Color.BLUE);
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));


		try {
			Comida comida = new Comida();
			ArrayList<Comida> listaComidas = comida.leerComidas();
			int i;
			for(i=0 ; i < listaComidas.size() ; i++) {
				if(eleccion=="") {
					NuevoPedidoCLP platillo = new NuevoPedidoCLP(listaComidas.get(i), panel2, listaComidas);
					panel.add(platillo);
					panel.repaint();
					panel.revalidate();
				}
				else if(listaComidas.get(i).getPestana().equals(eleccion)) {
					NuevoPedidoCLP platillo = new NuevoPedidoCLP(listaComidas.get(i), panel2, listaComidas);
					panel.add(platillo);
					panel.repaint();
					panel.revalidate();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}