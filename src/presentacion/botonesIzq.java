package presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class botonesIzq extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnCarne;
	private JButton btnPescado;
	private JButton btnPasta;
	private JButton btnPostres;
	private JButton btnBebidas;
	private JButton btnVegie;
	private JButton btnNewButton;

	/**
	 * Create the panel.
	 */
	public botonesIzq() {
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		btnCarne = new JButton("");
		btnCarne.setBackground(Color.WHITE);
		btnCarne.setIcon(new ImageIcon(botonesIzq.class.getResource("/recursos/carne.png")));
		GridBagConstraints gbc_btnCarne = new GridBagConstraints();
		gbc_btnCarne.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCarne.insets = new Insets(0, 0, 5, 0);
		gbc_btnCarne.gridx = 0;
		gbc_btnCarne.gridy = 0;
		add(btnCarne, gbc_btnCarne);
		
		btnPescado = new JButton("");
		btnPescado.setBackground(new Color(255, 255, 255));
		btnPescado.setIcon(new ImageIcon(botonesIzq.class.getResource("/recursos/pescado.png")));
		GridBagConstraints gbc_btnPescado = new GridBagConstraints();
		gbc_btnPescado.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPescado.insets = new Insets(0, 0, 5, 0);
		gbc_btnPescado.gridx = 0;
		gbc_btnPescado.gridy = 1;
		add(btnPescado, gbc_btnPescado);
		
		btnPasta = new JButton("");
		btnPasta.setBackground(Color.WHITE);
		btnPasta.setIcon(new ImageIcon(botonesIzq.class.getResource("/recursos/pasta.png")));
		GridBagConstraints gbc_btnPasta = new GridBagConstraints();
		gbc_btnPasta.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPasta.insets = new Insets(0, 0, 5, 0);
		gbc_btnPasta.gridx = 0;
		gbc_btnPasta.gridy = 2;
		add(btnPasta, gbc_btnPasta);
		
		btnVegie = new JButton("");
		btnVegie.setBackground(Color.WHITE);
		btnVegie.setIcon(new ImageIcon(botonesIzq.class.getResource("/recursos/vegie.png")));
		GridBagConstraints gbc_btnVegie = new GridBagConstraints();
		gbc_btnVegie.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnVegie.insets = new Insets(0, 0, 5, 0);
		gbc_btnVegie.gridx = 0;
		gbc_btnVegie.gridy = 3;
		add(btnVegie, gbc_btnVegie);
		
		btnBebidas = new JButton("");
		btnBebidas.setIcon(new ImageIcon(botonesIzq.class.getResource("/recursos/bebida.png")));
		GridBagConstraints gbc_btnBebidas = new GridBagConstraints();
		gbc_btnBebidas.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBebidas.insets = new Insets(0, 0, 5, 0);
		gbc_btnBebidas.gridx = 0;
		gbc_btnBebidas.gridy = 4;
		add(btnBebidas, gbc_btnBebidas);
		
		btnPostres = new JButton("");
		btnPostres.setBackground(Color.WHITE);
		btnPostres.setIcon(new ImageIcon(botonesIzq.class.getResource("/recursos/postre.png")));
		GridBagConstraints gbc_btnPostres = new GridBagConstraints();
		gbc_btnPostres.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPostres.insets = new Insets(0, 0, 5, 0);
		gbc_btnPostres.gridx = 0;
		gbc_btnPostres.gridy = 5;
		add(btnPostres, gbc_btnPostres);
		
		btnNewButton = new JButton("Atrás");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		btnNewButton.setIcon(new ImageIcon(botonesIzq.class.getResource("/recursos/icons8-atrás-64.png")));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 7;
		add(btnNewButton, gbc_btnNewButton);

	}

}
