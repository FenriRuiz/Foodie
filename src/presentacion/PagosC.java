package presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;

import dominio.Pedido;
import dominio.Trabajador;

import java.awt.BorderLayout;
import java.util.ArrayList;

public class PagosC extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;

	/**
	 * Create the panel.
	 */
	public PagosC(Pedido ped, Trabajador trab, ArrayList<Pedido> listaPed, JFrame antecesor) {
		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		PagosCN pcn = new PagosCN(ped);
		panel.add(pcn, BorderLayout.NORTH);
		PagosCS pcs = new PagosCS(ped, trab, listaPed, antecesor);
		panel.add(pcs, BorderLayout.CENTER);

	}

}
