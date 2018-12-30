package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;

import dominio.Pedido;

import java.awt.Color;

public class UltimosPedidosCLP extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JLabel lblNpedido;
	private JLabel lblTrabajador;
	private JCheckBox chPagado;
	private JLabel lblDireccion;
	private JLabel lblUbicacion;
	private JProgressBar progressBar;
	private JLabel lblEstado;

	/**
	 * Create the panel.
	 */
	public UltimosPedidosCLP() {
		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setBackground(Color.GRAY);
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{27, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 17, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblNpedido = new JLabel("1");
		lblNpedido.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		GridBagConstraints gbc_lblNpedido = new GridBagConstraints();
		gbc_lblNpedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblNpedido.gridx = 0;
		gbc_lblNpedido.gridy = 1;
		panel.add(lblNpedido, gbc_lblNpedido);
		
		lblTrabajador = new JLabel("Nombre Trabajador");
		lblTrabajador.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		GridBagConstraints gbc_lblTrabajador = new GridBagConstraints();
		gbc_lblTrabajador.gridwidth = 2;
		gbc_lblTrabajador.insets = new Insets(0, 0, 5, 5);
		gbc_lblTrabajador.gridx = 1;
		gbc_lblTrabajador.gridy = 1;
		panel.add(lblTrabajador, gbc_lblTrabajador);
		
		chPagado = new JCheckBox("Pagado");
		chPagado.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		GridBagConstraints gbc_chPagado = new GridBagConstraints();
		gbc_chPagado.anchor = GridBagConstraints.EAST;
		gbc_chPagado.insets = new Insets(0, 0, 5, 5);
		gbc_chPagado.gridx = 3;
		gbc_chPagado.gridy = 1;
		panel.add(chPagado, gbc_chPagado);
		
		lblDireccion = new JLabel("Dirección:");
		lblDireccion.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.anchor = GridBagConstraints.EAST;
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 1;
		gbc_lblDireccion.gridy = 2;
		panel.add(lblDireccion, gbc_lblDireccion);
		
		lblUbicacion = new JLabel("");
		lblUbicacion.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblUbicacion = new GridBagConstraints();
		gbc_lblUbicacion.gridwidth = 4;
		gbc_lblUbicacion.insets = new Insets(0, 0, 5, 0);
		gbc_lblUbicacion.gridx = 2;
		gbc_lblUbicacion.gridy = 2;
		panel.add(lblUbicacion, gbc_lblUbicacion);
		
		progressBar = new JProgressBar();
		GridBagConstraints gbc_progressBar = new GridBagConstraints();
		gbc_progressBar.insets = new Insets(0, 0, 5, 5);
		gbc_progressBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_progressBar.gridwidth = 4;
		gbc_progressBar.gridx = 1;
		gbc_progressBar.gridy = 3;
		panel.add(progressBar, gbc_progressBar);
		
		lblEstado = new JLabel("Estado del pedido");
		lblEstado.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.gridwidth = 3;
		gbc_lblEstado.insets = new Insets(0, 0, 0, 5);
		gbc_lblEstado.gridx = 1;
		gbc_lblEstado.gridy = 4;
		panel.add(lblEstado, gbc_lblEstado);

	}

}
