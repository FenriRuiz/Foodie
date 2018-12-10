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
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

import dominio.Comida;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class ConfPlato extends JPanel {
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
	private JLabel lblNewLabel;
	private JLabel lblIngredientes;
	private JLabel lblAlergias;
	private JLabel lblAdd;
	private JLabel lblNewLabel_1;
	private Comida com;
	private JLabel lblPestana;
	private JComboBox<String> comboBox;
	private JLabel lblPrecio;
	private JSpinner spinner;
	/**
	 * Create the panel.
	 */
	public ConfPlato(Comida comida) {
		com = comida;
		setBackground(new Color(255, 148, 62));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{40, 50, 50, 40, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblNewLabel = new JLabel("Nombre Comida");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		txtpnNombreComida = new JTextPane();
		txtpnNombreComida.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtpnNombreComida.setBackground(new Color(255, 195, 148));
		txtpnNombreComida.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		txtpnNombreComida.setText(comida.getName());
		GridBagConstraints gbc_txtpnNombreComida = new GridBagConstraints();
		gbc_txtpnNombreComida.anchor = GridBagConstraints.SOUTH;
		gbc_txtpnNombreComida.gridwidth = 4;
		gbc_txtpnNombreComida.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnNombreComida.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtpnNombreComida.gridx = 0;
		gbc_txtpnNombreComida.gridy = 2;
		add(txtpnNombreComida, gbc_txtpnNombreComida);
		
		lblimagenComida = new JButton("");
		lblimagenComida.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblimagenComida.setBackground(new Color(255, 148, 62));
		lblimagenComida.setBorderPainted(false);
		lblimagenComida.setIcon(new ImageIcon(ConfPlato.class.getResource(comida.getRutaImagen())));
		GridBagConstraints gbc_lblimagenComida = new GridBagConstraints();
		gbc_lblimagenComida.gridwidth = 4;
		gbc_lblimagenComida.insets = new Insets(0, 0, 5, 0);
		gbc_lblimagenComida.gridx = 0;
		gbc_lblimagenComida.gridy = 3;
		add(lblimagenComida, gbc_lblimagenComida);
		
		lblIngredientes = new JLabel("Ingredientes");
		lblIngredientes.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblIngredientes = new GridBagConstraints();
		gbc_lblIngredientes.gridwidth = 4;
		gbc_lblIngredientes.insets = new Insets(0, 0, 5, 0);
		gbc_lblIngredientes.gridx = 0;
		gbc_lblIngredientes.gridy = 4;
		add(lblIngredientes, gbc_lblIngredientes);
		
		dtrpnIngredientes = new JEditorPane();
		dtrpnIngredientes.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		dtrpnIngredientes.setBackground(new Color(255, 195, 148));
		dtrpnIngredientes.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		dtrpnIngredientes.setText(comida.getIngrediente());
		GridBagConstraints gbc_dtrpnIngredientes = new GridBagConstraints();
		gbc_dtrpnIngredientes.gridheight = 3;
		gbc_dtrpnIngredientes.gridwidth = 4;
		gbc_dtrpnIngredientes.insets = new Insets(0, 0, 5, 0);
		gbc_dtrpnIngredientes.fill = GridBagConstraints.BOTH;
		gbc_dtrpnIngredientes.gridx = 0;
		gbc_dtrpnIngredientes.gridy = 5;
		add(dtrpnIngredientes, gbc_dtrpnIngredientes);
		
		lblPestana = new JLabel("Pestaña");
		lblPestana.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblPestana = new GridBagConstraints();
		gbc_lblPestana.gridwidth = 2;
		gbc_lblPestana.insets = new Insets(0, 0, 5, 5);
		gbc_lblPestana.gridx = 1;
		gbc_lblPestana.gridy = 8;
		add(lblPestana, gbc_lblPestana);
		
		comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Carne", "Pescado", "Pasta", "Vegie", "Cuchara", "Bebida", "Postre"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 9;
		add(comboBox, gbc_comboBox);
		
		lblAlergias = new JLabel("Alergias");
		lblAlergias.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblAlergias = new GridBagConstraints();
		gbc_lblAlergias.gridwidth = 2;
		gbc_lblAlergias.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlergias.gridx = 1;
		gbc_lblAlergias.gridy = 10;
		add(lblAlergias, gbc_lblAlergias);
		
		btnLact = new JButton("");
		btnLact.addActionListener(new BtnLactActionListener());
		btnLact.setOpaque(false);
		btnLact.setBorderPainted(false);
		btnLact.setBackground(new Color(255, 148, 62));
		if(comida.isBwrLact()) {
			btnLact.setIcon(new ImageIcon(ConfPlato.class.getResource("/recursos/leche64.png")));
		}else {
			btnLact.setIcon(new ImageIcon(ConfPlato.class.getResource("/recursos/noleche64.png")));
		}
		GridBagConstraints gbc_btnLact = new GridBagConstraints();
		gbc_btnLact.insets = new Insets(0, 0, 5, 5);
		gbc_btnLact.gridx = 1;
		gbc_btnLact.gridy = 11;
		add(btnLact, gbc_btnLact);
		
		btnMar = new JButton("");
		btnMar.addActionListener(new BtnMarActionListener());
		btnMar.setOpaque(false);
		btnMar.setBorderPainted(false);
		btnMar.setBackground(new Color(255, 148, 62));
		if(comida.isBwrMar()) {
			btnMar.setIcon(new ImageIcon(ConfPlato.class.getResource("/recursos/camaron64.png")));
		}else {
			btnMar.setIcon(new ImageIcon(ConfPlato.class.getResource("/recursos/nocamaron64.png")));
		}
		GridBagConstraints gbc_btnMar = new GridBagConstraints();
		gbc_btnMar.insets = new Insets(0, 0, 5, 5);
		gbc_btnMar.gridx = 2;
		gbc_btnMar.gridy = 11;
		add(btnMar, gbc_btnMar);
		
		btnFSec = new JButton("");
		btnFSec.addActionListener(new BtnFSecActionListener());
		btnFSec.setOpaque(false);
		btnFSec.setBorderPainted(false);
		btnFSec.setBackground(new Color(255, 148, 62));
		if(comida.isBwrFSec()) {
			btnFSec.setIcon(new ImageIcon(ConfPlato.class.getResource("/recursos/peanut64.png")));
		}else {
			btnFSec.setIcon(new ImageIcon(ConfPlato.class.getResource("/recursos/nopeanut64.png")));
		}
		GridBagConstraints gbc_btnFSec = new GridBagConstraints();
		gbc_btnFSec.insets = new Insets(0, 0, 5, 5);
		gbc_btnFSec.gridx = 1;
		gbc_btnFSec.gridy = 12;
		add(btnFSec, gbc_btnFSec);
		
		btnGlut = new JButton("");
		btnGlut.addActionListener(new BtnGlutActionListener());
		btnGlut.setOpaque(false);
		btnGlut.setBorderPainted(false);
		btnGlut.setBackground(new Color(255, 148, 62));
		if(comida.isBwrGlut()) {
			btnGlut.setIcon(new ImageIcon(ConfPlato.class.getResource("/recursos/gluten64.png")));
		}else {
			btnGlut.setIcon(new ImageIcon(ConfPlato.class.getResource("/recursos/nogluten64.png")));
		}
		GridBagConstraints gbc_btnGlut = new GridBagConstraints();
		gbc_btnGlut.insets = new Insets(0, 0, 5, 5);
		gbc_btnGlut.gridx = 2;
		gbc_btnGlut.gridy = 12;
		add(btnGlut, gbc_btnGlut);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.gridwidth = 2;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 1;
		gbc_lblPrecio.gridy = 13;
		add(lblPrecio, gbc_lblPrecio);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0.0, 0.0, 10.0, 0.1));
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.gridwidth = 2;
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 1;
		gbc_spinner.gridy = 14;
		add(spinner, gbc_spinner);
		
		lblAdd = new JLabel("Añadir ");
		lblAdd.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblAdd = new GridBagConstraints();
		gbc_lblAdd.anchor = GridBagConstraints.SOUTH;
		gbc_lblAdd.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdd.gridx = 1;
		gbc_lblAdd.gridy = 15;
		add(lblAdd, gbc_lblAdd);
		
		lblNewLabel_1 = new JLabel("Eliminar");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.SOUTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 15;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		btnAddComida = new JButton("");
		btnAddComida.addActionListener(new BtnAddComidaActionListener());
		btnAddComida.setOpaque(false);
		btnAddComida.setBorderPainted(false);
		btnAddComida.setBackground(new Color(255, 148, 62));
		btnAddComida.setIcon(new ImageIcon(ConfPlato.class.getResource("/recursos/icons8-comida-48.png")));
		GridBagConstraints gbc_btnAddComida = new GridBagConstraints();
		gbc_btnAddComida.fill = GridBagConstraints.VERTICAL;
		gbc_btnAddComida.insets = new Insets(0, 0, 5, 5);
		gbc_btnAddComida.gridx = 1;
		gbc_btnAddComida.gridy = 16;
		add(btnAddComida, gbc_btnAddComida);
		
		button = new JButton("");
		button.setOpaque(false);
		button.setBorderPainted(false);
		button.setBackground(new Color(255, 148, 62));
		button.setIcon(new ImageIcon(ConfPlato.class.getResource("/recursos/icons8-eliminar-comida-48.png")));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 2;
		gbc_button.gridy = 16;
		add(button, gbc_button);

	}

	private class BtnLactActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(com.isBwrLact()) {
				com.setBwrLact(false);
				btnLact.setIcon(new ImageIcon(ConfPlato.class.getResource("/recursos/noleche64.png")));
			}else {
				com.setBwrLact(true);
				btnLact.setIcon(new ImageIcon(ConfPlato.class.getResource("/recursos/leche64.png")));
			}
		}
	}
	private class BtnMarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(com.isBwrMar()) {
				com.setBwrMar(false);
				btnMar.setIcon(new ImageIcon(ConfPlato.class.getResource("/recursos/nocamaron64.png")));
			}else {
				com.setBwrMar(true);
				btnMar.setIcon(new ImageIcon(ConfPlato.class.getResource("/recursos/camaron64.png")));
			}
		}
	}
	private class BtnFSecActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(com.isBwrFSec()) {
				com.setBwrFSec(false);
				btnFSec.setIcon(new ImageIcon(ConfPlato.class.getResource("/recursos/nopeanut64.png")));
			}else {
				com.setBwrFSec(true);
				btnFSec.setIcon(new ImageIcon(ConfPlato.class.getResource("/recursos/peanut64.png")));
			}
		}
	}
	private class BtnGlutActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(com.isBwrGlut()) {
				com.setBwrGlut(false);
				btnGlut.setIcon(new ImageIcon(ConfPlato.class.getResource("/recursos/nogluten64.png")));
			}else {
				com.setBwrGlut(true);
				btnGlut.setIcon(new ImageIcon(ConfPlato.class.getResource("/recursos/gluten64.png")));
			}
		}
	}
	private class BtnAddComidaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			try {
				Comida comida = new Comida();
				comida.setIdentificador(1);
				comida.setName(txtpnNombreComida.getText());
				comida.setIngrediente(dtrpnIngredientes.getText());
				comida.setBwrFSec(com.isBwrFSec());
				comida.setBwrGlut(com.isBwrGlut());
				comida.setBwrLact(com.isBwrLact());
				comida.setBwrMar(com.isBwrMar());
				comida.setPestana(comboBox.getSelectedItem().toString());
				comida.setPrecio((double) spinner.getValue());
				comida.setRutaImagen(com.getRutaImagen());
				com.guardarComida(comida);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
