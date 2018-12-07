package presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.Color;

public class Platos extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton lblimagenComida;
	private JButton btnLact;
	private JButton btnMar;
	private JButton btnFSec;
	private JButton btnGlut;
	private JEditorPane dtrpnIngredientes;
	private JButton btnAddComida;
	private JButton button;
	private JTextPane txtpnNombreComida;

	/**
	 * Create the panel.
	 */
	public Platos() {
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		txtpnNombreComida = new JTextPane();
		txtpnNombreComida.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		txtpnNombreComida.setText("Nombre Comida");
		GridBagConstraints gbc_txtpnNombreComida = new GridBagConstraints();
		gbc_txtpnNombreComida.gridwidth = 3;
		gbc_txtpnNombreComida.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnNombreComida.fill = GridBagConstraints.BOTH;
		gbc_txtpnNombreComida.gridx = 2;
		gbc_txtpnNombreComida.gridy = 1;
		add(txtpnNombreComida, gbc_txtpnNombreComida);
		
		lblimagenComida = new JButton("");
		lblimagenComida.setBorderPainted(false);
		lblimagenComida.setBackground(Color.WHITE);
		lblimagenComida.setIcon(new ImageIcon(Platos.class.getResource("/recursos/images.png")));
		GridBagConstraints gbc_lblimagenComida = new GridBagConstraints();
		gbc_lblimagenComida.gridwidth = 3;
		gbc_lblimagenComida.insets = new Insets(0, 0, 5, 5);
		gbc_lblimagenComida.gridx = 2;
		gbc_lblimagenComida.gridy = 2;
		add(lblimagenComida, gbc_lblimagenComida);
		
		dtrpnIngredientes = new JEditorPane();
		dtrpnIngredientes.setText("Ingredientes: Zanahoria, Huevo, Sandía");
		dtrpnIngredientes.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_dtrpnIngredientes = new GridBagConstraints();
		gbc_dtrpnIngredientes.gridheight = 3;
		gbc_dtrpnIngredientes.gridwidth = 5;
		gbc_dtrpnIngredientes.insets = new Insets(0, 0, 5, 5);
		gbc_dtrpnIngredientes.fill = GridBagConstraints.BOTH;
		gbc_dtrpnIngredientes.gridx = 1;
		gbc_dtrpnIngredientes.gridy = 3;
		add(dtrpnIngredientes, gbc_dtrpnIngredientes);
		
		btnLact = new JButton("");
		btnLact.setBorderPainted(false);
		btnLact.setBackground(Color.WHITE);
		btnLact.setIcon(new ImageIcon(Platos.class.getResource("/recursos/lactosa.png")));
		GridBagConstraints gbc_btnLact = new GridBagConstraints();
		gbc_btnLact.insets = new Insets(0, 0, 5, 5);
		gbc_btnLact.gridx = 2;
		gbc_btnLact.gridy = 6;
		add(btnLact, gbc_btnLact);
		
		btnMar = new JButton("");
		btnMar.setBorderPainted(false);
		btnMar.setBackground(Color.WHITE);
		btnMar.setIcon(new ImageIcon(Platos.class.getResource("/recursos/marisco.png")));
		GridBagConstraints gbc_btnMar = new GridBagConstraints();
		gbc_btnMar.insets = new Insets(0, 0, 5, 5);
		gbc_btnMar.gridx = 3;
		gbc_btnMar.gridy = 6;
		add(btnMar, gbc_btnMar);
		
		btnAddComida = new JButton("");
		btnAddComida.setBorderPainted(false);
		btnAddComida.setBackground(Color.WHITE);
		btnAddComida.setIcon(new ImageIcon(Platos.class.getResource("/recursos/icons8-comida-48.png")));
		GridBagConstraints gbc_btnAddComida = new GridBagConstraints();
		gbc_btnAddComida.fill = GridBagConstraints.VERTICAL;
		gbc_btnAddComida.insets = new Insets(0, 0, 5, 5);
		gbc_btnAddComida.gridx = 4;
		gbc_btnAddComida.gridy = 6;
		add(btnAddComida, gbc_btnAddComida);
		
		btnFSec = new JButton("");
		btnFSec.setBorderPainted(false);
		btnFSec.setBackground(Color.WHITE);
		btnFSec.setIcon(new ImageIcon(Platos.class.getResource("/recursos/frutosSecos.png")));
		GridBagConstraints gbc_btnFSec = new GridBagConstraints();
		gbc_btnFSec.insets = new Insets(0, 0, 0, 5);
		gbc_btnFSec.gridx = 2;
		gbc_btnFSec.gridy = 7;
		add(btnFSec, gbc_btnFSec);
		
		btnGlut = new JButton("");
		btnGlut.setBorderPainted(false);
		btnGlut.setBackground(Color.WHITE);
		btnGlut.setIcon(new ImageIcon(Platos.class.getResource("/recursos/gluten.png")));
		GridBagConstraints gbc_btnGlut = new GridBagConstraints();
		gbc_btnGlut.insets = new Insets(0, 0, 0, 5);
		gbc_btnGlut.gridx = 3;
		gbc_btnGlut.gridy = 7;
		add(btnGlut, gbc_btnGlut);
		
		button = new JButton("");
		button.setBorderPainted(false);
		button.setBackground(Color.WHITE);
		button.setIcon(new ImageIcon(Platos.class.getResource("/recursos/icons8-eliminar-comida-48.png")));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 0, 5);
		gbc_button.gridx = 4;
		gbc_button.gridy = 7;
		add(button, gbc_button);

	}

}
