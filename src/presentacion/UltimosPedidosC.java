package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

import java.util.ArrayList;
import dominio.Pedido;
import dominio.Trabajador;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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
	private JFrame anterior;
	private Trabajador trabajador;
	private ArrayList<Pedido> listaPedidos;
	private Pedido pedido;
	private JButton btnNewButton;

	/**
	 * Create the panel.
	 */
	public UltimosPedidosC(ArrayList<Pedido> listaPed, JFrame antecesor, Trabajador trab, JPanel panelAnte, Pedido ped) {
		setLayout(new BorderLayout(0, 0));
		anterior = antecesor;
		listaPedidos = listaPed;
		trabajador = trab;
		pedido = ped;
		
		panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.SOUTH);
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		btnAtras = new JButton("Atrás");
		btnAtras.addActionListener(new BtnAtrasActionListener());
		btnAtras.setHorizontalAlignment(SwingConstants.LEFT);
		btnAtras.setBorderPainted(false);
		btnAtras.setBackground(Color.WHITE);
		btnAtras.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		btnAtras.setIcon(new ImageIcon(GestionPlatosL.class.getResource("/recursos/icons8-atrás-64.png")));
		
		panel_1.add(btnAtras, BorderLayout.WEST);
		
		btnNewButton = new JButton("Completado");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon(UltimosPedidosC.class.getResource("/recursos/comprobado.png")));
		btnNewButton.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		btnNewButton.addActionListener(new BtnNewButtonActionListener());
		btnNewButton.setBorderPainted(false);
		panel_1.add(btnNewButton, BorderLayout.EAST);
		
		scrollPane = new JScrollPane();
		
		panel.add(scrollPane, BorderLayout.CENTER);
		
		panel_2 = new JPanel();
		scrollPane.setViewportView(panel_2);
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		int i;
		for(i=0; i < listaPedidos.size(); i++) {
			UltimosPedidosCLP upclp = new UltimosPedidosCLP(listaPedidos.get(i), listaPedidos, panelAnte, antecesor);
			panel_2.add(upclp);
		}

	}

	private class BtnAtrasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Menu menu = new Menu(trabajador, anterior, listaPedidos, pedido);
			anterior.getContentPane().remove(0);
			anterior.getContentPane().add(menu, BorderLayout.CENTER);
			anterior.revalidate();
		}
	}
	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			pedido.setEstado("Entregado");
		}
	}
}
