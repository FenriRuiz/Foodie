package presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.ArrayList;

import dominio.Pedido;
import dominio.Trabajador;

public class Pagos extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;

	/**
	 * Create the panel.
	 */
	public Pagos(Trabajador trabajador, Pedido pedido, ArrayList<Pedido> listaPedido, JFrame antecesor) {
		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		InfoUsuario iuser = new InfoUsuario(trabajador, antecesor, listaPedido, pedido);
		panel.add(iuser, BorderLayout.NORTH);
		
		PagosL pl = new PagosL(pedido, trabajador, panel, listaPedido, antecesor);
		panel.add(pl, BorderLayout.WEST);

	}

}
