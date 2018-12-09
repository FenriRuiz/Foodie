package presentacion;

import javax.swing.JPanel;

import dominio.Trabajador;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InfoUsuario extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel icnUsuario;
	private JLabel lblUserName;
	private JLabel lblUserLastConn;
	private JButton btnSalir;
	private JButton btnHome;
	private JFrame frameAncestor;
	private Trabajador trab;
	/**
	 * Create the panel.
	 */
	public InfoUsuario(Trabajador trabajador, JFrame frame) {
		frameAncestor=frame;
		trab = trabajador;
		setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 80, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{65, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		icnUsuario = new JLabel("");
		icnUsuario.setIcon(new ImageIcon(InfoUsuario.class.getResource(trabajador.getRutaIcono())));
		GridBagConstraints gbc_icnUsuario = new GridBagConstraints();
		gbc_icnUsuario.anchor = GridBagConstraints.SOUTH;
		gbc_icnUsuario.gridheight = 2;
		gbc_icnUsuario.insets = new Insets(0, 0, 0, 5);
		gbc_icnUsuario.gridx = 0;
		gbc_icnUsuario.gridy = 0;
		add(icnUsuario, gbc_icnUsuario);
		
		lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.SOUTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		lblUserName = new JLabel(trabajador.getRealName());
		lblUserName.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblUserName = new GridBagConstraints();
		gbc_lblUserName.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblUserName.insets = new Insets(0, 0, 5, 5);
		gbc_lblUserName.gridx = 2;
		gbc_lblUserName.gridy = 0;
		add(lblUserName, gbc_lblUserName);
		
		btnHome = new JButton("");
		btnHome.addActionListener(new BtnHomeActionListener());
		btnHome.setBorderPainted(false);
		btnHome.setBackground(Color.WHITE);
		btnHome.setIcon(new ImageIcon(InfoUsuario.class.getResource("/recursos/icons8-home-64.png")));
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		gbc_btnHome.anchor = GridBagConstraints.EAST;
		gbc_btnHome.gridheight = 2;
		gbc_btnHome.insets = new Insets(0, 0, 5, 5);
		gbc_btnHome.gridx = 3;
		gbc_btnHome.gridy = 0;
		add(btnHome, gbc_btnHome);
		
		btnSalir = new JButton("");
		btnSalir.setBorderPainted(false);
		btnSalir.setBackground(Color.WHITE);
		btnSalir.setIcon(new ImageIcon(InfoUsuario.class.getResource("/recursos/icons8-delete-64.png")));
		GridBagConstraints gbc_btnSalir = new GridBagConstraints();
		gbc_btnSalir.anchor = GridBagConstraints.WEST;
		gbc_btnSalir.gridheight = 2;
		gbc_btnSalir.insets = new Insets(0, 0, 5, 0);
		gbc_btnSalir.gridx = 4;
		gbc_btnSalir.gridy = 0;
		add(btnSalir, gbc_btnSalir);
		
		lblNewLabel_1 = new JLabel("Ultima conexión:");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		lblUserLastConn = new JLabel(trabajador.getLastConnect().toString());
		lblUserLastConn.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblUserLastConn = new GridBagConstraints();
		gbc_lblUserLastConn.insets = new Insets(0, 0, 0, 5);
		gbc_lblUserLastConn.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblUserLastConn.gridx = 2;
		gbc_lblUserLastConn.gridy = 1;
		add(lblUserLastConn, gbc_lblUserLastConn);

	}

	private class BtnHomeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Menu menu = new Menu(trab, frameAncestor);
			frameAncestor.getContentPane().remove(0);
			frameAncestor.getContentPane().add(menu, BorderLayout.CENTER);
			frameAncestor.revalidate();
		}
	}
}
