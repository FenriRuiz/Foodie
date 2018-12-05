package presentacion;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import java.awt.BorderLayout;

import dominio.Trabajador;

public class Principal {

	private JFrame frame;

	/**
	 * Create the application.
	 * @param trabajador 
	 */
	public Principal(Trabajador trabajador) {
		initialize(trabajador);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param trabajador 
	 */
	private void initialize(Trabajador trabajador) {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(0, 0, 1940, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setVisible(true);	
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		Menu menu = new Menu(trabajador);
		menu.addMouseListener(new MenuMouseListener());
		frame.getContentPane().add(menu, BorderLayout.CENTER);

	}
	private class MenuMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			frame.dispose();
		}
	}
}
