package presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;

//import dominio.Comida;
import dominio.Trabajador;
import presentacion.NuevoPedidoL;

import java.awt.BorderLayout;
import java.io.FileNotFoundException;
//import java.util.ArrayList;

public class NuevoPedido extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 * @throws FileNotFoundException 
	 */
	public NuevoPedido(Trabajador trabajador, JFrame frameAncestor) throws FileNotFoundException {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		
		//Comida comida = new Comida();
		//ArrayList<Comida> listaComidas = comida.leerComidas();
		panel.setLayout(new BorderLayout(0, 0));
		
		NuevoPedidoL npi = new NuevoPedidoL(trabajador,frameAncestor, panel);
		panel.add(npi, BorderLayout.WEST);
		
		InfoUsuario infUser = new InfoUsuario(trabajador, frameAncestor);
		panel.add(infUser, BorderLayout.NORTH);
		
		NuevoPedidoC platos = new NuevoPedidoC("", panel);
		panel.add(platos, BorderLayout.CENTER);

	}

}
