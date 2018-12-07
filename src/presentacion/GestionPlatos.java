package presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;

import dominio.Trabajador;

import java.awt.BorderLayout;

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
		setLayout(new BorderLayout(0, 0));
		setLayout(new BorderLayout(0, 0));
		setLayout(new BorderLayout(0, 0));
		InfoUsuario infUser = new InfoUsuario(trabajador);
		add(infUser, BorderLayout.NORTH);
		botonesIzq btnIzq = new botonesIzq();
		add(btnIzq, BorderLayout.WEST);

	}

}
