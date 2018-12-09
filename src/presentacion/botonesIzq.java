package presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.SoftBevelBorder;

import dominio.Comida;
import dominio.Trabajador;

import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

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
	private JLabel lblNewLabel;
	private JFrame frameAncestor;
	private Trabajador trab;
	private JButton btnCuchara;
	/**
	 * Create the panel.
	 * @param frameAncestor 
	 * @param trabajador 
	 */
	public botonesIzq(Trabajador trabajador, JFrame frame) {
		trab = trabajador;
		frameAncestor = frame;
		setBackground(new Color(255, 148, 62));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblNewLabel = new JLabel("Categorias");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		btnCarne = new JButton("");
		btnCarne.addActionListener(new BtnCarneActionListener());
		btnCarne.setBorderPainted(false);
		btnCarne.setBackground(new Color(255, 148, 62));
		btnCarne.setIcon(new ImageIcon(botonesIzq.class.getResource("/recursos/carne.png")));
		GridBagConstraints gbc_btnCarne = new GridBagConstraints();
		gbc_btnCarne.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCarne.insets = new Insets(0, 0, 5, 0);
		gbc_btnCarne.gridx = 0;
		gbc_btnCarne.gridy = 1;
		add(btnCarne, gbc_btnCarne);
		
		btnPescado = new JButton("");
		btnPescado.addActionListener(new BtnPescadoActionListener());
		btnPescado.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnPescado.setBorderPainted(false);
		btnPescado.setBackground(new Color(255, 148, 62));
		btnPescado.setIcon(new ImageIcon(botonesIzq.class.getResource("/recursos/pescado.png")));
		GridBagConstraints gbc_btnPescado = new GridBagConstraints();
		gbc_btnPescado.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPescado.insets = new Insets(0, 0, 5, 0);
		gbc_btnPescado.gridx = 0;
		gbc_btnPescado.gridy = 2;
		add(btnPescado, gbc_btnPescado);
		
		btnPasta = new JButton("");
		btnPasta.addActionListener(new BtnPastaActionListener());
		btnPasta.setBorderPainted(false);
		btnPasta.setBackground(new Color(255, 148, 62));
		btnPasta.setIcon(new ImageIcon(botonesIzq.class.getResource("/recursos/pasta.png")));
		GridBagConstraints gbc_btnPasta = new GridBagConstraints();
		gbc_btnPasta.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPasta.insets = new Insets(0, 0, 5, 0);
		gbc_btnPasta.gridx = 0;
		gbc_btnPasta.gridy = 3;
		add(btnPasta, gbc_btnPasta);
		
		btnVegie = new JButton("");
		btnVegie.addActionListener(new BtnVegieActionListener());
		btnVegie.setBorderPainted(false);
		btnVegie.setBackground(new Color(255, 148, 62));
		btnVegie.setIcon(new ImageIcon(botonesIzq.class.getResource("/recursos/vegie.png")));
		GridBagConstraints gbc_btnVegie = new GridBagConstraints();
		gbc_btnVegie.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnVegie.insets = new Insets(0, 0, 5, 0);
		gbc_btnVegie.gridx = 0;
		gbc_btnVegie.gridy = 4;
		add(btnVegie, gbc_btnVegie);
		
		btnBebidas = new JButton("");
		btnBebidas.addActionListener(new BtnBebidasActionListener());
		btnBebidas.setBorder(null);
		btnBebidas.setBackground(new Color(255, 148, 62));
		btnBebidas.setIcon(new ImageIcon(botonesIzq.class.getResource("/recursos/bebida.png")));
		GridBagConstraints gbc_btnBebidas = new GridBagConstraints();
		gbc_btnBebidas.anchor = GridBagConstraints.NORTH;
		gbc_btnBebidas.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBebidas.insets = new Insets(0, 0, 5, 0);
		gbc_btnBebidas.gridx = 0;
		gbc_btnBebidas.gridy = 7;
		add(btnBebidas, gbc_btnBebidas);
		
		btnPostres = new JButton("");
		btnPostres.addActionListener(new BtnPostresActionListener());
		btnPostres.setBorderPainted(false);
		btnPostres.setBackground(new Color(255, 148, 62));
		btnPostres.setIcon(new ImageIcon(botonesIzq.class.getResource("/recursos/postre.png")));
		GridBagConstraints gbc_btnPostres = new GridBagConstraints();
		gbc_btnPostres.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPostres.insets = new Insets(0, 0, 5, 0);
		gbc_btnPostres.gridx = 0;
		gbc_btnPostres.gridy = 6;
		add(btnPostres, gbc_btnPostres);
		
		btnNewButton = new JButton("Atrás");
		btnNewButton.addActionListener(new BtnNewButtonActionListener());
		
		btnCuchara = new JButton("");
		btnCuchara.addActionListener(new BtnCucharaActionListener());
		btnCuchara.setBorderPainted(false);
		btnCuchara.setBackground(new Color(255, 148, 62));
		btnCuchara.setIcon(new ImageIcon(botonesIzq.class.getResource("/recursos/estofado.png")));
		GridBagConstraints gbc_btnCuchara = new GridBagConstraints();
		gbc_btnCuchara.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCuchara.insets = new Insets(0, 0, 5, 0);
		gbc_btnCuchara.gridx = 0;
		gbc_btnCuchara.gridy = 5;
		add(btnCuchara, gbc_btnCuchara);
		
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(255, 148, 62));
		btnNewButton.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		btnNewButton.setIcon(new ImageIcon(botonesIzq.class.getResource("/recursos/icons8-atrás-64.png")));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 8;
		add(btnNewButton, gbc_btnNewButton);

	}

	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Menu menu = new Menu(trab, frameAncestor);
			frameAncestor.getContentPane().remove(0);
			frameAncestor.getContentPane().add(menu, BorderLayout.CENTER);
			frameAncestor.revalidate();
		}
	}
	private class BtnCarneActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			btnCarne.setBackground(new Color(255, 79, 50));
			btnPescado.setBackground(new Color(255, 153, 0));
			btnPasta.setBackground(new Color(255, 153, 0));
			btnVegie.setBackground(new Color(255, 153, 0));
			btnCuchara.setBackground(new Color(255, 153, 0));
			btnBebidas.setBackground(new Color(255, 153, 0));
			btnPostres.setBackground(new Color(255, 153, 0));
		}
	}
	private class BtnPescadoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			btnCarne.setBackground(new Color(255, 153, 0));
			btnPescado.setBackground(new Color(255, 79, 50));
			btnPasta.setBackground(new Color(255, 153, 0));
			btnVegie.setBackground(new Color(255, 153, 0));
			btnCuchara.setBackground(new Color(255, 153, 0));
			btnBebidas.setBackground(new Color(255, 153, 0));
			btnPostres.setBackground(new Color(255, 153, 0));
		}
	}
	private class BtnPastaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			btnCarne.setBackground(new Color(255, 153, 0));
			btnPescado.setBackground(new Color(255, 153, 0));
			btnPasta.setBackground(new Color(255, 79, 50));
			btnVegie.setBackground(new Color(255, 153, 0));
			btnCuchara.setBackground(new Color(255, 153, 0));
			btnBebidas.setBackground(new Color(255, 153, 0));
			btnPostres.setBackground(new Color(255, 153, 0));
		}
	}
	private class BtnVegieActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			btnCarne.setBackground(new Color(255, 153, 0));
			btnPescado.setBackground(new Color(255, 153, 0));
			btnPasta.setBackground(new Color(255, 153, 0));
			btnVegie.setBackground(new Color(255, 79, 50));
			btnCuchara.setBackground(new Color(255, 153, 0));
			btnBebidas.setBackground(new Color(255, 153, 0));
			btnPostres.setBackground(new Color(255, 153, 0));
		}
	}
	private class BtnCucharaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			btnCarne.setBackground(new Color(255, 153, 0));
			btnPescado.setBackground(new Color(255, 153, 0));
			btnPasta.setBackground(new Color(255, 153, 0));
			btnVegie.setBackground(new Color(255, 153, 0));
			btnCuchara.setBackground(new Color(255, 79, 50));
			btnBebidas.setBackground(new Color(255, 153, 0));
			btnPostres.setBackground(new Color(255, 153, 0));
		}
	}

	private class BtnBebidasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			btnCarne.setBackground(new Color(255, 153, 0));
			btnPescado.setBackground(new Color(255, 153, 0));
			btnPasta.setBackground(new Color(255, 153, 0));
			btnVegie.setBackground(new Color(255, 153, 0));
			btnCuchara.setBackground(new Color(255, 153, 0));
			btnBebidas.setBackground(new Color(255, 79, 50));
			btnPostres.setBackground(new Color(255, 153, 0));
		}
	}
	private class BtnPostresActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			btnCarne.setBackground(new Color(255, 153, 0));
			btnPescado.setBackground(new Color(255, 153, 0));
			btnPasta.setBackground(new Color(255, 153, 0));
			btnVegie.setBackground(new Color(255, 153, 0));
			btnCuchara.setBackground(new Color(255, 153, 0));
			btnBebidas.setBackground(new Color(255, 153, 0));
			btnPostres.setBackground(new Color(255, 79, 50));
		}
	}
}
