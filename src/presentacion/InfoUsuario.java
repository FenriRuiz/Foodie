package presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

public class InfoUsuario extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel icnUsuario;
	private JLabel lblUserName;
	private JLabel lblUserLastConn;

	/**
	 * Create the panel.
	 */
	public InfoUsuario() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 80, 0};
		gridBagLayout.rowHeights = new int[]{65, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		icnUsuario = new JLabel("");
		icnUsuario.setIcon(new ImageIcon(InfoUsuario.class.getResource("/recursos/camarera.png")));
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
		
		lblUserName = new JLabel("New label");
		lblUserName.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblUserName = new GridBagConstraints();
		gbc_lblUserName.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblUserName.insets = new Insets(0, 0, 5, 0);
		gbc_lblUserName.gridx = 2;
		gbc_lblUserName.gridy = 0;
		add(lblUserName, gbc_lblUserName);
		
		lblNewLabel_1 = new JLabel("Ultima conexión:");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		lblUserLastConn = new JLabel("New label");
		lblUserLastConn.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblUserLastConn = new GridBagConstraints();
		gbc_lblUserLastConn.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblUserLastConn.gridx = 2;
		gbc_lblUserLastConn.gridy = 1;
		add(lblUserLastConn, gbc_lblUserLastConn);

	}

}
