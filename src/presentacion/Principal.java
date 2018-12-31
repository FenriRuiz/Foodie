package presentacion;

import javax.swing.JFrame;

import dominio.Pedido;
import dominio.Trabajador;
import java.awt.Dimension;
import java.util.ArrayList;
import java.awt.CardLayout;


public class Principal {

	private JFrame frame;

	public Principal(Trabajador trabajador, ArrayList<Pedido> listaPedidos, Pedido pedido) {

		initialize(trabajador, listaPedidos, pedido);
	}

	private void initialize(Trabajador trabajador, ArrayList<Pedido> listaPedidos, Pedido pedido) {
		frame = new JFrame();
		frame.setMinimumSize(new Dimension(1240, 750));
		frame.setSize(new Dimension(1240, 720));
		Menu menu = new Menu(trabajador, frame, listaPedidos, pedido);
		frame.setBounds(130, 75, 1240, 720);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		frame.getContentPane().add(menu, "MenuTrabajador");
		frame.setVisible(true);
		
	}

}
