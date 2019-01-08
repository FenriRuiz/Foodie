package presentacion;

import javax.swing.JPanel;

import dominio.Carrito;
import dominio.Comida;
import dominio.Pedido;
import dominio.Trabajador;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Font;
import java.awt.BorderLayout;
//import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class NuevoPedidoCLP extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblIconoComida;
	private JLabel lblNombre;
	private JLabel lblIngrediente;
	private JLabel lblIngredientes;
	private JLabel lblAlergias;
	private JLabel lblLact;
	private JLabel lblMarisco;
	private JLabel lblFrutoSeco;
	private JLabel lblGluten;
	private JLabel lblPrecio;
	private JLabel lblPrecios;
	private JPanel panel;
	private Trabajador trabajador;
	private ArrayList<Carrito> comidasPedido;
	private ArrayList<Pedido> listaPedido;
	private Pedido pedido;
	private Comida com;
	private JFrame principal;
	/**
	 * Create the panel.
	 * @param panel2 
	 */
	public NuevoPedidoCLP(Pedido ped, Trabajador trab, Comida comida, JPanel panel2, ArrayList<Comida> listaComidas, ArrayList<Pedido> listaPed, JFrame prin) {
		comidasPedido = ped.getComidasPedido();
		principal = prin;
		pedido = ped;
		com = comida;
		listaPedido = listaPed;
		
		trabajador = trab;
		panel = panel2;
		
		addMouseListener(new ThisMouseListener());
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(118, 242, 153), null, null, null));
		setBackground(new Color(193, 242, 175));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 77, 75, 76, 75, 69, 71, 0, 0};
		gridBagLayout.rowHeights = new int[]{37, 84, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblIconoComida = new JLabel("");
		lblIconoComida.setIcon(new ImageIcon(GestionPlatosCLP.class.getResource(comida.getRutaImagen())));
		GridBagConstraints gbc_lblIconoComida = new GridBagConstraints();
		gbc_lblIconoComida.gridwidth = 3;
		gbc_lblIconoComida.gridheight = 3;
		gbc_lblIconoComida.insets = new Insets(0, 0, 0, 5);
		gbc_lblIconoComida.gridx = 0;
		gbc_lblIconoComida.gridy = 0;
		add(lblIconoComida, gbc_lblIconoComida);
		
		lblNombre = new JLabel(comida.getName());
		lblNombre.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 17));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNombre.gridwidth = 7;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 3;
		gbc_lblNombre.gridy = 0;
		add(lblNombre, gbc_lblNombre);
		
		lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 17));
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 8;
		gbc_lblPrecio.gridy = 1;
		add(lblPrecio, gbc_lblPrecio);
		
		lblPrecios = new JLabel(String.valueOf(comida.getPrecio()) + " €");
		lblPrecios.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 16));
		GridBagConstraints gbc_lblPrecios = new GridBagConstraints();
		gbc_lblPrecios.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecios.gridx = 9;
		gbc_lblPrecios.gridy = 1;
		add(lblPrecios, gbc_lblPrecios);
		
		lblIngrediente = new JLabel("Ingredientes:");
		lblIngrediente.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 17));
		GridBagConstraints gbc_lblIngrediente = new GridBagConstraints();
		gbc_lblIngrediente.insets = new Insets(0, 0, 5, 5);
		gbc_lblIngrediente.gridx = 3;
		gbc_lblIngrediente.gridy = 1;
		add(lblIngrediente, gbc_lblIngrediente);
		
		lblIngredientes = new JLabel(comida.getIngrediente());
		lblIngredientes.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblIngredientes = new GridBagConstraints();
		gbc_lblIngredientes.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblIngredientes.gridwidth = 4;
		gbc_lblIngredientes.insets = new Insets(0, 0, 5, 5);
		gbc_lblIngredientes.gridx = 4;
		gbc_lblIngredientes.gridy = 1;
		add(lblIngredientes, gbc_lblIngredientes);
		
		lblAlergias = new JLabel("Alergias: ");
		lblAlergias.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 17));
		GridBagConstraints gbc_lblAlergias = new GridBagConstraints();
		gbc_lblAlergias.anchor = GridBagConstraints.WEST;
		gbc_lblAlergias.insets = new Insets(0, 0, 0, 5);
		gbc_lblAlergias.gridx = 3;
		gbc_lblAlergias.gridy = 2;
		add(lblAlergias, gbc_lblAlergias);
		
		lblLact = new JLabel("");
		lblLact.setEnabled(false);
		if(comida.isBwrLact()) {
			lblLact.setEnabled(true);
		}
		
		lblLact.setIcon(new ImageIcon(GestionPlatosCLP.class.getResource("/recursos/leche64.png")));
		GridBagConstraints gbc_lblLact = new GridBagConstraints();
		gbc_lblLact.insets = new Insets(0, 0, 0, 5);
		gbc_lblLact.gridx = 4;
		gbc_lblLact.gridy = 2;
		add(lblLact, gbc_lblLact);
		
		lblMarisco = new JLabel("");
		lblMarisco.setEnabled(false);
		if(comida.isBwrMar()) {
			lblMarisco.setEnabled(true);
		}
		
		lblMarisco.setIcon(new ImageIcon(GestionPlatosCLP.class.getResource("/recursos/camaron64.png")));
		GridBagConstraints gbc_lblMarisco = new GridBagConstraints();
		gbc_lblMarisco.anchor = GridBagConstraints.EAST;
		gbc_lblMarisco.insets = new Insets(0, 0, 0, 5);
		gbc_lblMarisco.gridx = 5;
		gbc_lblMarisco.gridy = 2;
		add(lblMarisco, gbc_lblMarisco);
		
		lblFrutoSeco = new JLabel("");
		lblFrutoSeco.setEnabled(false);
		if(comida.isBwrFSec()) {
			lblFrutoSeco.setEnabled(true);
		}
		
		lblFrutoSeco.setIcon(new ImageIcon(GestionPlatosCLP.class.getResource("/recursos/peanut64.png")));
		GridBagConstraints gbc_lblFrutoSeco = new GridBagConstraints();
		gbc_lblFrutoSeco.anchor = GridBagConstraints.EAST;
		gbc_lblFrutoSeco.insets = new Insets(0, 0, 0, 5);
		gbc_lblFrutoSeco.gridx = 6;
		gbc_lblFrutoSeco.gridy = 2;
		add(lblFrutoSeco, gbc_lblFrutoSeco);
		
		lblGluten = new JLabel("");
		lblGluten.setEnabled(false);
		if(comida.isBwrGlut()) {
			lblGluten.setEnabled(true);

		}
		
		lblGluten.setIcon(new ImageIcon(GestionPlatosCLP.class.getResource("/recursos/gluten64.png")));
		GridBagConstraints gbc_lblGluten = new GridBagConstraints();
		gbc_lblGluten.anchor = GridBagConstraints.WEST;
		gbc_lblGluten.insets = new Insets(0, 0, 0, 5);
		gbc_lblGluten.gridx = 7;
		gbc_lblGluten.gridy = 2;
		add(lblGluten, gbc_lblGluten);

	}

	private class ThisMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent arg0) {
			setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(48, 153, 232), null, null, null));
			setBackground(new Color(99, 203, 128));

		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
			setBorder(new BevelBorder(BevelBorder.RAISED, new Color(118, 242, 153), null, null, null));
			setBackground(new Color(193, 242, 175));
			BorderLayout layout = (BorderLayout) panel.getLayout();
			panel.remove(layout.getLayoutComponent(BorderLayout.EAST));

			Carrito carr = new Carrito(com, 1);
			int i;
			int existe = 0;
			for(i=0; i < comidasPedido.size(); i++) {
				if(comidasPedido.get(i).getComida().getName().equals(carr.getComida().getName())) {
					comidasPedido.get(i).setCantidad(comidasPedido.get(i).getCantidad()+1);
					existe = 1;
				}
			}
			if(comidasPedido.size()==0 || existe == 0) {
				comidasPedido.add(carr);
			}
			//pedido.setComidasPedido(comidasPedido);
			
			NuevoPedidoR npr = new NuevoPedidoR(pedido, trabajador, panel, listaPedido, principal);
			panel.add(npr, BorderLayout.EAST);
			panel.repaint();
			panel.revalidate();

		}
	}
}