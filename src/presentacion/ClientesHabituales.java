package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JProgressBar;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Font;
import javax.swing.JScrollPane;

import dominio.Pedido;
import dominio.Trabajador;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ClientesHabituales extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JProgressBar progressBar;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnAnadir;
	private JButton btnEliminar;
	private JScrollPane scrollPane;
	private JPanel panel_1;
	private JButton btnAtrs;
	private JFrame principal;
	private Pedido pedido;
	private ArrayList<Pedido> listaPedido;
	private Trabajador trabajador;
	/**
	 * Create the panel.
	 */
	public ClientesHabituales(Pedido ped, Trabajador trab, ArrayList<Pedido> listaPed, JFrame prin) {
		pedido = ped;
		listaPedido = listaPed;
		trabajador = trab;
		principal = prin;
		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.SOUTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 26, 24, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		progressBar = new JProgressBar();
		GridBagConstraints gbc_progressBar = new GridBagConstraints();
		gbc_progressBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_progressBar.gridwidth = 4;
		gbc_progressBar.insets = new Insets(0, 0, 5, 5);
		gbc_progressBar.gridx = 1;
		gbc_progressBar.gridy = 0;
		panel.add(progressBar, gbc_progressBar);
		
		lblNewLabel = new JLabel("Lvl.");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 5;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		lblNewLabel_1 = new JLabel("7");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 6;
		gbc_lblNewLabel_1.gridy = 0;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		btnAtrs = new JButton("Atrás");
		btnAtrs.addActionListener(new BtnAtrsActionListener());
		btnAtrs.setBorderPainted(false);
		btnAtrs.setBackground(Color.WHITE);
		btnAtrs.setIcon(new ImageIcon(ClientesHabituales.class.getResource("/recursos/icons8-atrás-64.png")));
		btnAtrs.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_btnAtrs = new GridBagConstraints();
		gbc_btnAtrs.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAtrs.insets = new Insets(0, 0, 0, 5);
		gbc_btnAtrs.gridx = 0;
		gbc_btnAtrs.gridy = 1;
		panel.add(btnAtrs, gbc_btnAtrs);
		
		btnAnadir = new JButton("Añadir");
		btnAnadir.setBackground(new Color(255, 239, 213));
		btnAnadir.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_btnAnadir = new GridBagConstraints();
		gbc_btnAnadir.fill = GridBagConstraints.BOTH;
		gbc_btnAnadir.insets = new Insets(0, 0, 0, 5);
		gbc_btnAnadir.gridx = 2;
		gbc_btnAnadir.gridy = 1;
		panel.add(btnAnadir, gbc_btnAnadir);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(new Color(255, 235, 205));
		btnEliminar.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.fill = GridBagConstraints.BOTH;
		gbc_btnEliminar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEliminar.gridx = 3;
		gbc_btnEliminar.gridy = 1;
		panel.add(btnEliminar, gbc_btnEliminar);
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(panel_1);

	}

	private class BtnAtrsActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Menu menu = new Menu(trabajador, principal, listaPedido, pedido);
			principal.getContentPane().remove(0);
			principal.getContentPane().add(menu, BorderLayout.CENTER);
			principal.revalidate();
		}
	}
}
