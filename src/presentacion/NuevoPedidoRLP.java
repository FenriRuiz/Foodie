package presentacion;

import javax.swing.JPanel;

import java.awt.Color;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;

import dominio.Carrito;
import dominio.Pedido;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevoPedidoRLP extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblNombre;
	private JLabel lblx;
	private JLabel lblCantidad;
	private JLabel lblPrecio;
	private JLabel lblNewLabel;
	private JLabel lblValor;
	private JButton btnMenos;
	private JButton btnAdd;
	private Pedido pedido;
	private Carrito carrito;
	@SuppressWarnings("unused")
	private JPanel panel;
	/**
	 * Create the panel.
	 */
	public NuevoPedidoRLP(Pedido ped, Carrito carr, JPanel ancestor) {
		pedido = ped;
		carrito = carr;
		panel = ancestor;
		setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		setBackground(new Color(60, 179, 113));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 3, 28, 36, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblNombre = new JLabel(carr.getComida().getName());
		lblNombre.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.gridwidth = 8;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		add(lblNombre, gbc_lblNombre);
		
		lblx = new JLabel("x");
		lblx.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblx = new GridBagConstraints();
		gbc_lblx.anchor = GridBagConstraints.EAST;
		gbc_lblx.insets = new Insets(0, 0, 5, 5);
		gbc_lblx.gridx = 9;
		gbc_lblx.gridy = 1;
		add(lblx, gbc_lblx);
		
		lblCantidad = new JLabel(String.valueOf(carr.getCantidad()));
		lblCantidad.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		GridBagConstraints gbc_lblCantidad = new GridBagConstraints();
		gbc_lblCantidad.anchor = GridBagConstraints.WEST;
		gbc_lblCantidad.insets = new Insets(0, 0, 5, 0);
		gbc_lblCantidad.gridx = 10;
		gbc_lblCantidad.gridy = 1;
		add(lblCantidad, gbc_lblCantidad);
		
		lblPrecio = new JLabel("Precio Unidad: ");
		lblPrecio.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.gridwidth = 4;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 5;
		gbc_lblPrecio.gridy = 2;
		add(lblPrecio, gbc_lblPrecio);
		
		lblValor = new JLabel(String.valueOf(carr.getComida().getPrecio()));
		lblValor.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		GridBagConstraints gbc_lblValor = new GridBagConstraints();
		gbc_lblValor.anchor = GridBagConstraints.EAST;
		gbc_lblValor.insets = new Insets(0, 0, 5, 5);
		gbc_lblValor.gridx = 9;
		gbc_lblValor.gridy = 2;
		add(lblValor, gbc_lblValor);
		
		lblNewLabel = new JLabel("€");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 10;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);
		
		btnAdd = new JButton("");
		btnAdd.addActionListener(new BtnAddActionListener());
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setIcon(new ImageIcon(NuevoPedidoRLP.class.getResource("/recursos/icons8-plus-math-30.png")));
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.anchor = GridBagConstraints.EAST;
		gbc_btnAdd.insets = new Insets(0, 0, 0, 5);
		gbc_btnAdd.gridx = 8;
		gbc_btnAdd.gridy = 3;
		add(btnAdd, gbc_btnAdd);
		
		btnMenos = new JButton("");
		btnMenos.addActionListener(new BtnMenosActionListener());
		btnMenos.setBackground(Color.WHITE);
		btnMenos.setIcon(new ImageIcon(NuevoPedidoRLP.class.getResource("/recursos/icons8-subtract-30.png")));
		GridBagConstraints gbc_btnMenos = new GridBagConstraints();
		gbc_btnMenos.insets = new Insets(0, 0, 0, 5);
		gbc_btnMenos.gridx = 9;
		gbc_btnMenos.gridy = 3;
		add(btnMenos, gbc_btnMenos);

	}

	private class BtnAddActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			carrito.setCantidad(carrito.getCantidad()+1);
			lblCantidad.setText(String.valueOf(carrito.getCantidad()));
			
			repaint();
			revalidate();
		}
	}
	private class BtnMenosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(carrito.getCantidad()<=1) {
				//remove(pedido.getComidasPedido().indexOf(carrito)+1);
				removeAll();
				pedido.getComidasPedido().remove(carrito);
				//NuevoPedidoR npr = new NuevoPedidoR(pedido, pedido.getTrabajador(), panel);
				//BorderLayout layout = (BorderLayout) panel.getLayout();
				//panel.remove(panel);
				//layout.getLayoutComponent(BorderLayout.EAST)
				//panel.add(npr, BorderLayout.EAST);

			}
			else {
			
				carrito.setCantidad(carrito.getCantidad()-1);
				lblCantidad.setText(String.valueOf(carrito.getCantidad()));
				
			}
			repaint();
			revalidate();
		}
	}
}