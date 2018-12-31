package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;

import dominio.Pedido;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PagosCN extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTabbedPane tabbedPane;
	private JPanel pLocal;
	private JPanel pDomicilio;
	private JLabel lblGoddies;
	private JLabel lblEscribeElNombre;
	private JTextField txtCalleNBloque;
	private JLabel lblNewLabel;
	private Pedido pedido;
	private JButton btnConfCalle;

	/**
	 * Create the panel.
	 */
	public PagosCN(Pedido ped) {
		pedido = ped;

		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel.add(tabbedPane, BorderLayout.CENTER);
		
		pLocal = new JPanel();
		pLocal.setBackground(Color.WHITE);
		tabbedPane.addTab("En Local", null, pLocal, null);
		GridBagLayout gbl_pLocal = new GridBagLayout();
		gbl_pLocal.columnWidths = new int[]{0, 0};
		gbl_pLocal.rowHeights = new int[]{0, 0};
		gbl_pLocal.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_pLocal.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pLocal.setLayout(gbl_pLocal);
		
		lblGoddies = new JLabel("");
		lblGoddies.setIcon(new ImageIcon(PagosCN.class.getResource("/recursos/images.png")));
		GridBagConstraints gbc_lblGoddies = new GridBagConstraints();
		gbc_lblGoddies.gridx = 0;
		gbc_lblGoddies.gridy = 0;
		pLocal.add(lblGoddies, gbc_lblGoddies);
		
		pDomicilio = new JPanel();
		pDomicilio.setBackground(Color.WHITE);
		tabbedPane.addTab("Domicilio", null, pDomicilio, null);
		GridBagLayout gbl_pDomicilio = new GridBagLayout();
		gbl_pDomicilio.columnWidths = new int[]{0, 170, 164, 0, 0};
		gbl_pDomicilio.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_pDomicilio.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pDomicilio.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		pDomicilio.setLayout(gbl_pDomicilio);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PagosCN.class.getResource("/recursos/scooter.png")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		pDomicilio.add(lblNewLabel, gbc_lblNewLabel);
		
		lblEscribeElNombre = new JLabel("Escribe el nombre de tu calle:");
		lblEscribeElNombre.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblEscribeElNombre = new GridBagConstraints();
		gbc_lblEscribeElNombre.gridwidth = 2;
		gbc_lblEscribeElNombre.anchor = GridBagConstraints.WEST;
		gbc_lblEscribeElNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscribeElNombre.gridx = 1;
		gbc_lblEscribeElNombre.gridy = 2;
		pDomicilio.add(lblEscribeElNombre, gbc_lblEscribeElNombre);
		
		txtCalleNBloque = new JTextField();
		txtCalleNBloque.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 13));
		txtCalleNBloque.setText("Calle, Nº, Bloque, Piso, Puerta");
		GridBagConstraints gbc_txtCalleNBloque = new GridBagConstraints();
		gbc_txtCalleNBloque.gridwidth = 2;
		gbc_txtCalleNBloque.insets = new Insets(0, 0, 5, 5);
		gbc_txtCalleNBloque.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCalleNBloque.gridx = 1;
		gbc_txtCalleNBloque.gridy = 3;
		pDomicilio.add(txtCalleNBloque, gbc_txtCalleNBloque);
		txtCalleNBloque.setColumns(10);
		
		btnConfCalle = new JButton("Confirmar Calle");
		btnConfCalle.addActionListener(new BtnConfCalleActionListener());
		btnConfCalle.setBackground(new Color(240, 255, 240));
		btnConfCalle.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_btnConfCalle = new GridBagConstraints();
		gbc_btnConfCalle.gridwidth = 2;
		gbc_btnConfCalle.fill = GridBagConstraints.BOTH;
		gbc_btnConfCalle.insets = new Insets(0, 0, 5, 5);
		gbc_btnConfCalle.gridx = 1;
		gbc_btnConfCalle.gridy = 4;
		pDomicilio.add(btnConfCalle, gbc_btnConfCalle);

	}

	private class BtnConfCalleActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			pedido.setUbicacion(txtCalleNBloque.getText());
		}
	}
}
