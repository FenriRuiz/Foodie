package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

import dominio.Pedido;

import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UltimosPedidosCLP extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JLabel lblNpedido;
	private JLabel lblTrabajador;
	private JLabel lblDireccion;
	private JProgressBar progressBar;
	private JLabel lblEstado;
	private Pedido pedido;
	private ArrayList<Pedido> listaPedido;
	private JPanel anterior;
	private JFrame principal;
	private JButton btnEliminar;
	private JButton btnCompletar;
	/**
	 * Create the panel.
	 */
	public UltimosPedidosCLP(Pedido ped, ArrayList<Pedido> listaPed, JPanel antecesor, JFrame prin) {
		addMouseListener(new ThisMouseListener());
		principal = prin;
		pedido = ped;
		listaPedido = listaPed;
		anterior = antecesor;
		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(Color.GRAY);
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{23, 73, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 17, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblNpedido = new JLabel(String.valueOf(ped.getnPedido()));
		lblNpedido.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		GridBagConstraints gbc_lblNpedido = new GridBagConstraints();
		gbc_lblNpedido.gridwidth = 2;
		gbc_lblNpedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblNpedido.gridx = 0;
		gbc_lblNpedido.gridy = 1;
		panel.add(lblNpedido, gbc_lblNpedido);
		
		lblTrabajador = new JLabel(String.valueOf(pedido.getTrabajador().getRealName()));
		lblTrabajador.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		GridBagConstraints gbc_lblTrabajador = new GridBagConstraints();
		gbc_lblTrabajador.anchor = GridBagConstraints.WEST;
		gbc_lblTrabajador.insets = new Insets(0, 0, 5, 5);
		gbc_lblTrabajador.gridx = 2;
		gbc_lblTrabajador.gridy = 1;
		panel.add(lblTrabajador, gbc_lblTrabajador);
		
		btnEliminar = new JButton("");
		btnEliminar.setBackground(new Color(255, 121, 108));
		btnEliminar.setBorderPainted(false);
		btnEliminar.setIcon(new ImageIcon(UltimosPedidosCLP.class.getResource("/recursos/borrar.png")));
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 4;
		gbc_btnEliminar.gridy = 1;
		panel.add(btnEliminar, gbc_btnEliminar);
		
		lblDireccion = new JLabel("Dirección: " + String.valueOf(pedido.getUbicacion()));
		lblDireccion.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.anchor = GridBagConstraints.WEST;
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 2;
		gbc_lblDireccion.gridy = 2;
		panel.add(lblDireccion, gbc_lblDireccion);
		if(pedido.getUbicacion() == null) {
			lblDireccion.setText("Comida en Local");
		}
		
		btnCompletar = new JButton("Entregado");
		btnCompletar.setBorderPainted(false);
		btnCompletar.addActionListener(new BtnCompletarActionListener());
		btnCompletar.setIcon(new ImageIcon(UltimosPedidosCLP.class.getResource("/recursos/comprobado.png")));
		btnCompletar.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		btnCompletar.setVisible(false);
		btnCompletar.setBackground(new Color(255, 217, 74));
		GridBagConstraints gbc_btnCompletar = new GridBagConstraints();
		gbc_btnCompletar.fill = GridBagConstraints.BOTH;
		gbc_btnCompletar.gridheight = 2;
		gbc_btnCompletar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCompletar.gridx = 3;
		gbc_btnCompletar.gridy = 1;
		panel.add(btnCompletar, gbc_btnCompletar);
		
		progressBar = new JProgressBar();
		GridBagConstraints gbc_progressBar = new GridBagConstraints();
		gbc_progressBar.insets = new Insets(0, 0, 5, 5);
		gbc_progressBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_progressBar.gridwidth = 4;
		gbc_progressBar.gridx = 1;
		gbc_progressBar.gridy = 3;
		panel.add(progressBar, gbc_progressBar);
		
		lblEstado = new JLabel("Estado del pedido:  "+String.valueOf(pedido.getEstado()));
		lblEstado.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.gridwidth = 3;
		gbc_lblEstado.insets = new Insets(0, 0, 0, 5);
		gbc_lblEstado.gridx = 1;
		gbc_lblEstado.gridy = 4;
		panel.add(lblEstado, gbc_lblEstado);
		
		switch(pedido.getEstado()) {
		case "SinPagar":
			panel.setBackground(new Color(255, 121, 108));
			btnEliminar.setVisible(true);
			progressBar.setValue(25);
			break;
		case "Pagado":
			panel.setBackground(new Color(235, 150, 69));
			btnEliminar.setVisible(false);
			progressBar.setValue(50 + (int)Math.random()*25);
			break;
		case "Terminado":
			btnCompletar.setVisible(true);
			panel.setBackground(new Color(255, 217, 74));
			btnEliminar.setVisible(false);
			progressBar.setValue(75);

			break;
		case "Entregado":
			panel.setBackground(new Color(194, 232, 70));
			btnEliminar.setVisible(false);
			progressBar.setValue(100);
			panel.setRequestFocusEnabled(false);

		}
	}

	private class ThisMouseListener extends MouseAdapter {
		@Override
		public void mouseReleased(MouseEvent arg0) {
			panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
			NuevoPedidoR npr = new NuevoPedidoR(pedido, pedido.getTrabajador(),anterior, listaPedido, principal);
			BorderLayout layout = (BorderLayout) anterior.getLayout();
			anterior.remove(layout.getLayoutComponent(BorderLayout.EAST));
			anterior.add(npr, BorderLayout.EAST);
			anterior.repaint();
			anterior.revalidate();
			listaPedido.get(Integer.parseInt(lblNpedido.getText())-1).setEstado("Terminado");
		}
		@Override
		public void mousePressed(MouseEvent arg0) {
			panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			
		}
	}

	private class BtnCompletarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			listaPedido.get(Integer.parseInt(lblNpedido.getText())-1).setEstado("Entregado");
		}
	}
}
