package presentacion;

import javax.swing.JPanel;
import java.awt.GridLayout;


import javax.swing.JScrollPane;

import dominio.Pedido;
import dominio.Trabajador;

import java.awt.BorderLayout;
import javax.swing.ScrollPaneConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class NuevoPedidoR extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblPrecioTotal;
	private JButton btnPagar;
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JPanel panel_2;
	private ArrayList<Pedido> listaPedido;
	private Pedido pedido;
	
	/**
	 * Create the panel.
	 * @param panel2 
	 * @param antecesor 
	 * @param listaComidas 
	 * @param mostrar 
	 * @param mMenu 
	 */

	public NuevoPedidoR(Pedido ped, Trabajador trabajador, JPanel panel2, ArrayList<Pedido> listaPed) {
		listaPedido = listaPed;

		pedido = ped;

		setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		add(scrollPane);
		
		panel = new JPanel();
		panel.setBackground(new Color(47, 79, 79));
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_1 = new JPanel();
		add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		btnPagar = new JButton("Pagar Pedido");
		btnPagar.addActionListener(new BtnPagarActionListener());
		btnPagar.setBackground(new Color(0, 250, 154));
		btnPagar.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnPagar.setHorizontalAlignment(SwingConstants.RIGHT);
		btnPagar.setIcon(new ImageIcon(NuevoPedidoR.class.getResource("/recursos/icons8-derecha-en-círculo-2-64.png")));
		btnPagar.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 16));
		panel_1.add(btnPagar, BorderLayout.EAST);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel_1.add(panel_2, BorderLayout.CENTER);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{57, 41, 40, 59, 0};
		gbl_panel_2.rowHeights = new int[]{18, 0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		lblNewLabel_1 = new JLabel("Total:");
		lblNewLabel_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		
		label = new JLabel("€");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.NORTHWEST;
		gbc_label.gridx = 3;
		gbc_label.gridy = 1;
		panel_2.add(label, gbc_label);
		label.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		
		int i;
		double total = 0.0;
		for(i=0 ; i < ped.getComidasPedido().size() ; i++) {
			NuevoPedidoRLP platillo = new NuevoPedidoRLP(ped, ped.getComidasPedido().get(i), panel2);
			panel.add(platillo);
			panel.repaint();
			panel.revalidate();
			total = total + (ped.getComidasPedido().get(i).getComida().getPrecio() * ped.getComidasPedido().get(i).getCantidad());
		}
		
		lblPrecioTotal = new JLabel(String.valueOf(total));
		GridBagConstraints gbc_lblPrecioTotal = new GridBagConstraints();
		gbc_lblPrecioTotal.anchor = GridBagConstraints.NORTH;
		gbc_lblPrecioTotal.insets = new Insets(0, 0, 0, 5);
		gbc_lblPrecioTotal.gridx = 2;
		gbc_lblPrecioTotal.gridy = 1;
		panel_2.add(lblPrecioTotal, gbc_lblPrecioTotal);
		lblPrecioTotal.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));

	}

	private class BtnPagarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			listaPedido.add(pedido);

		}
	}
}