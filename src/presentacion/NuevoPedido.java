package presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;

import dominio.Pedido;
//import dominio.Comida;
import dominio.Trabajador;
import presentacion.NuevoPedidoL;

import java.awt.BorderLayout;
import java.io.FileNotFoundException;
//import java.util.ArrayList;
import java.util.ArrayList;

public class NuevoPedido extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 * @throws FileNotFoundException 
	 */
	public NuevoPedido(Trabajador trabajador, JFrame frameAncestor, ArrayList<Pedido> listaPedidos, Pedido pedido) throws FileNotFoundException {
		setLayout(new BorderLayout(0, 0));
		//ArrayList<Carrito> comidasPedido = new ArrayList<Carrito>();
		//Pedido pedido = new Pedido(trabajador,comidasPedido,"Sin pagar");
		
		JPanel panel = new JPanel();
		add(panel);
		
		//Comida comida = new Comida();
		//ArrayList<Comida> listaComidas = comida.leerComidas();
		panel.setLayout(new BorderLayout(0, 0));
		
		NuevoPedidoL npi = new NuevoPedidoL(pedido,trabajador,frameAncestor, panel, listaPedidos);
		panel.add(npi, BorderLayout.WEST);
		
		InfoUsuario infUser = new InfoUsuario(trabajador, frameAncestor, listaPedidos, pedido);
		panel.add(infUser, BorderLayout.NORTH);
		
		NuevoPedidoR npr = new NuevoPedidoR(pedido, trabajador, panel, listaPedidos, frameAncestor);
		panel.add(npr, BorderLayout.EAST);
		
		NuevoPedidoC platos = new NuevoPedidoC(pedido,trabajador,"", panel, listaPedidos, frameAncestor);
		panel.add(platos, BorderLayout.CENTER);

	}

}
