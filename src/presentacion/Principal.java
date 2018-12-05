package presentacion;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import dominio.Trabajador;


public class Principal {

	private JFrame frame;

	public Principal(Trabajador trabajador) {
		initialize(trabajador);
	}

	private void initialize(Trabajador trabajador) {
		frame = new JFrame();
		Menu menu = new Menu(trabajador);
		frame.setBounds(130, 75, 1240, 720);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(menu, BorderLayout.CENTER);
	}

}
