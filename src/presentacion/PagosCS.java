package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;

import dominio.Carrito;
import dominio.Pedido;
import dominio.Trabajador;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class PagosCS extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTabbedPane tabbedPane;
	private JPanel pTarjeta;
	private JPanel pMetalico;
	private JLabel lblTarjetaPin;
	private JPasswordField passwordField;
	private JLabel iconoTarjeta;
	private JLabel iconoDinero;
	private JLabel lblRecordatorio;
	private JLabel lblNewLabel;
	private JLabel lblEnCajaPara;
	private JButton btnImprimir;
	private JButton btnPagar;
	private JLabel lblInserteSuTarjeta;
	private Pedido pedido;
	private Trabajador trabajador; 
	private ArrayList<Pedido> listaPedido;
	private JFrame principal;

	/**
	 * Create the panel.
	 */
	public PagosCS(Pedido ped, Trabajador trab, ArrayList<Pedido> listaPed, JFrame antecesor) {
		principal = antecesor;
		pedido = ped;
		trabajador = trab;
		listaPedido = listaPed;
		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel.add(tabbedPane);
		
		pTarjeta = new JPanel();
		pTarjeta.setBackground(Color.WHITE);
		tabbedPane.addTab("Tarjeta", null, pTarjeta, null);
		GridBagLayout gbl_pTarjeta = new GridBagLayout();
		gbl_pTarjeta.columnWidths = new int[]{0, 81, 0, 0, 0};
		gbl_pTarjeta.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pTarjeta.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pTarjeta.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		pTarjeta.setLayout(gbl_pTarjeta);
		
		lblInserteSuTarjeta = new JLabel("Inserte su tarjeta");
		lblInserteSuTarjeta.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblInserteSuTarjeta = new GridBagConstraints();
		gbc_lblInserteSuTarjeta.gridwidth = 2;
		gbc_lblInserteSuTarjeta.insets = new Insets(0, 0, 5, 5);
		gbc_lblInserteSuTarjeta.gridx = 1;
		gbc_lblInserteSuTarjeta.gridy = 1;
		pTarjeta.add(lblInserteSuTarjeta, gbc_lblInserteSuTarjeta);
		
		iconoTarjeta = new JLabel("");
		iconoTarjeta.setIcon(new ImageIcon(PagosCS.class.getResource("/recursos/tarjeta-de-debito.png")));
		GridBagConstraints gbc_iconoTarjeta = new GridBagConstraints();
		gbc_iconoTarjeta.gridwidth = 2;
		gbc_iconoTarjeta.insets = new Insets(0, 0, 5, 5);
		gbc_iconoTarjeta.gridx = 1;
		gbc_iconoTarjeta.gridy = 2;
		pTarjeta.add(iconoTarjeta, gbc_iconoTarjeta);
		
		lblTarjetaPin = new JLabel("Introduzca su PIN");
		lblTarjetaPin.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblTarjetaPin = new GridBagConstraints();
		gbc_lblTarjetaPin.gridwidth = 2;
		gbc_lblTarjetaPin.insets = new Insets(0, 0, 5, 5);
		gbc_lblTarjetaPin.gridx = 1;
		gbc_lblTarjetaPin.gridy = 3;
		pTarjeta.add(lblTarjetaPin, gbc_lblTarjetaPin);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.gridwidth = 2;
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 4;
		pTarjeta.add(passwordField, gbc_passwordField);
		
		btnPagar = new JButton("Pagar Pedido");
		btnPagar.addActionListener(new BtnPagarActionListener());
		btnPagar.setBackground(new Color(245, 255, 250));
		btnPagar.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 18));
		GridBagConstraints gbc_btnPagar = new GridBagConstraints();
		gbc_btnPagar.fill = GridBagConstraints.BOTH;
		gbc_btnPagar.gridwidth = 2;
		gbc_btnPagar.insets = new Insets(0, 0, 5, 5);
		gbc_btnPagar.gridx = 1;
		gbc_btnPagar.gridy = 5;
		pTarjeta.add(btnPagar, gbc_btnPagar);
		
		pMetalico = new JPanel();
		pMetalico.setBackground(Color.WHITE);
		tabbedPane.addTab("Pago en caja", null, pMetalico, null);
		GridBagLayout gbl_pMetalico = new GridBagLayout();
		gbl_pMetalico.columnWidths = new int[]{0, 0, 110, 0, 0};
		gbl_pMetalico.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_pMetalico.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pMetalico.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		pMetalico.setLayout(gbl_pMetalico);
		
		iconoDinero = new JLabel("");
		iconoDinero.setIcon(new ImageIcon(PagosCS.class.getResource("/recursos/dinero.png")));
		GridBagConstraints gbc_iconoDinero = new GridBagConstraints();
		gbc_iconoDinero.gridwidth = 2;
		gbc_iconoDinero.insets = new Insets(0, 0, 5, 5);
		gbc_iconoDinero.gridx = 1;
		gbc_iconoDinero.gridy = 0;
		pMetalico.add(iconoDinero, gbc_iconoDinero);
		
		lblRecordatorio = new JLabel("Recuerde:");
		lblRecordatorio.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		GridBagConstraints gbc_lblRecordatorio = new GridBagConstraints();
		gbc_lblRecordatorio.anchor = GridBagConstraints.EAST;
		gbc_lblRecordatorio.insets = new Insets(0, 0, 5, 5);
		gbc_lblRecordatorio.gridx = 1;
		gbc_lblRecordatorio.gridy = 1;
		pMetalico.add(lblRecordatorio, gbc_lblRecordatorio);
		
		lblNewLabel = new JLabel("Es necesario que pague el pedido");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		pMetalico.add(lblNewLabel, gbc_lblNewLabel);
		
		lblEnCajaPara = new JLabel("en caja, para que se realice su pedido");
		lblEnCajaPara.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblEnCajaPara = new GridBagConstraints();
		gbc_lblEnCajaPara.anchor = GridBagConstraints.WEST;
		gbc_lblEnCajaPara.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnCajaPara.gridx = 2;
		gbc_lblEnCajaPara.gridy = 2;
		pMetalico.add(lblEnCajaPara, gbc_lblEnCajaPara);
		
		btnImprimir = new JButton("Imprimir Ticket del Pedido");
		btnImprimir.addActionListener(new BtnImprimirActionListener());
		btnImprimir.setBackground(new Color(240, 255, 240));
		btnImprimir.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 18));
		GridBagConstraints gbc_btnImprimir = new GridBagConstraints();
		gbc_btnImprimir.fill = GridBagConstraints.BOTH;
		gbc_btnImprimir.gridwidth = 2;
		gbc_btnImprimir.insets = new Insets(0, 0, 5, 5);
		gbc_btnImprimir.gridx = 1;
		gbc_btnImprimir.gridy = 3;
		pMetalico.add(btnImprimir, gbc_btnImprimir);

	}

	private class BtnImprimirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			pedido.setTrabajador(trabajador);
			pedido.setEstado("SinPagar");
			listaPedido.add(pedido);
			ArrayList<Carrito> comidasPedido = new ArrayList<Carrito>();
			Pedido nextPed = new Pedido(trabajador,comidasPedido, "SinPagar");
			Menu men = new Menu(trabajador, principal, listaPedido, nextPed);
			principal.getContentPane().remove(0);
			principal.getContentPane().add(men, BorderLayout.CENTER);
			principal.repaint();
			principal.revalidate();
		}
	}
	private class BtnPagarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			pedido.setTrabajador(trabajador);
			pedido.setEstado("Pagado");
			listaPedido.add(pedido);
			ArrayList<Carrito> comidasPedido = new ArrayList<Carrito>();
			Pedido nextPed = new Pedido(trabajador,comidasPedido, "SinPagar");
			Menu men = new Menu(trabajador, principal, listaPedido, nextPed);
			principal.getContentPane().remove(0);
			principal.getContentPane().add(men, BorderLayout.CENTER);
			principal.repaint();
			principal.revalidate();
		}
	}
}
