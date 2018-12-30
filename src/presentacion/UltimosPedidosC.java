package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.util.ArrayList;
import dominio.Pedido;
import java.awt.GridLayout;


public class UltimosPedidosC extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JButton btnAtras;
	private JPanel panel_2;

	/**
	 * Create the panel.
	 */
	public UltimosPedidosC(ArrayList<Pedido> listaPedidos) {
		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.SOUTH);
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		btnAtras = new JButton("Atrás");
		btnAtras.setHorizontalAlignment(SwingConstants.LEFT);
		btnAtras.setBorderPainted(false);
		btnAtras.setBackground(Color.WHITE);
		btnAtras.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		btnAtras.setIcon(new ImageIcon(GestionPlatosL.class.getResource("/recursos/icons8-atrás-64.png")));
		
		panel_1.add(btnAtras, BorderLayout.WEST);
		
		scrollPane = new JScrollPane();
		
		panel.add(scrollPane, BorderLayout.CENTER);
		
		panel_2 = new JPanel();
		scrollPane.setViewportView(panel_2);
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		int i;
		for(i=0; i < listaPedidos.size(); i++) {
			UltimosPedidosCLP upclp = new UltimosPedidosCLP();
			panel_2.add(upclp);
		}

	}

}
