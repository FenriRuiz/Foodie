package presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;

import dominio.Pedido;
import dominio.Trabajador;

import java.awt.BorderLayout;
import java.util.ArrayList;

public class UltimosPedidos extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public UltimosPedidos(Trabajador trabajador, JFrame antecesor, ArrayList<Pedido> listaPedidos, Pedido pedido) {
		

		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();

		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		InfoUsuario iuser = new InfoUsuario(trabajador, antecesor, listaPedidos, pedido);
		panel.add(iuser, BorderLayout.NORTH);
		
		NuevoPedidoR npr = new NuevoPedidoR(pedido, trabajador, panel, listaPedidos, antecesor);
		panel.add(npr, BorderLayout.EAST);
		
		UltimosPedidosC upc = new UltimosPedidosC(listaPedidos, antecesor, trabajador, panel, pedido);
		panel.add(upc, BorderLayout.CENTER);
		

	}


}
