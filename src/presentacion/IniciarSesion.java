package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;

import dominio.Trabajador;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Dimension;


public class IniciarSesion {

	private JFrame frame;
	private JPanel panel;
	private JPanel panelLogo;
	private JLabel label;
	private JLabel lblNombre;
	private JLabel lblContrasea;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnRegistrar;
	private JButton btnIniciarSesion;
	private JLabel lblFoodie;
	private JLabel lblidioma;
	private JLabel lblError;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IniciarSesion window = new IniciarSesion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}

	/**
	 * Create the application.
	 */
	public IniciarSesion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setMinimumSize(new Dimension(1270, 720));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(IniciarSesion.class.getResource("/recursos/camarera.png")));
		frame.setBounds(130, 75, 1240, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{224, 224, 162, 256, 256, 176, 124, 177, 0};
		gbl_panel.rowHeights = new int[]{45, 256, 45, 42, 42, 61, 57, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		panelLogo = new JPanel();
		GridBagConstraints gbc_panelLogo = new GridBagConstraints();
		gbc_panelLogo.gridwidth = 2;
		gbc_panelLogo.insets = new Insets(0, 0, 5, 5);
		gbc_panelLogo.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelLogo.gridx = 3;
		gbc_panelLogo.gridy = 1;
		panel.add(panelLogo, gbc_panelLogo);
		panelLogo.setLayout(new BorderLayout(0, 0));
		
		label = new JLabel("");
		label.setHorizontalTextPosition(SwingConstants.LEADING);
		label.setOpaque(true);
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setBackground(Color.WHITE);
		label.setForeground(Color.WHITE);
		label.setFocusable(false);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(IniciarSesion.class.getResource("/recursos/images.png")));
		panelLogo.add(label, BorderLayout.CENTER);
		
		lblFoodie = new JLabel("Foodie");
		lblFoodie.setHorizontalAlignment(SwingConstants.CENTER);
		lblFoodie.setHorizontalTextPosition(SwingConstants.LEFT);
		lblFoodie.setFont(new Font("Kristen ITC", Font.BOLD, 35));
		GridBagConstraints gbc_lblFoodie = new GridBagConstraints();
		gbc_lblFoodie.gridwidth = 2;
		gbc_lblFoodie.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoodie.gridx = 3;
		gbc_lblFoodie.gridy = 2;
		panel.add(lblFoodie, gbc_lblFoodie);
		
		lblNombre = new JLabel("Nombre  ");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNombre.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 3;
		panel.add(lblNombre, gbc_lblNombre);
		
		textField = new JTextField();
		textField.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 3;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblContrasea = new JLabel("Contraseña  ");
		lblContrasea.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContrasea.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 2;
		gbc_lblContrasea.gridy = 4;
		panel.add(lblContrasea, gbc_lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new PasswordFieldActionListener());
		passwordField.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.gridwidth = 2;
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.gridx = 3;
		gbc_passwordField.gridy = 4;
		panel.add(passwordField, gbc_passwordField);
		
		lblError = new JLabel("Error en el nombre o contraseña");
		lblError.setForeground(new Color(128, 0, 0));
		lblError.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		lblError.setIcon(new ImageIcon(IniciarSesion.class.getResource("/recursos/icons8-error-48.png")));
		lblError.setVisible(false);
		GridBagConstraints gbc_lblError = new GridBagConstraints();
		gbc_lblError.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblError.gridwidth = 2;
		gbc_lblError.gridheight = 2;
		gbc_lblError.insets = new Insets(0, 0, 5, 5);
		gbc_lblError.gridx = 5;
		gbc_lblError.gridy = 3;
		panel.add(lblError, gbc_lblError);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new BtnRegistrarActionListener());
		btnRegistrar.setOpaque(false);
		btnRegistrar.setContentAreaFilled(false);
		btnRegistrar.setBackground(new Color(255, 255, 255));
		btnRegistrar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRegistrar.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		GridBagConstraints gbc_btnRegistrar = new GridBagConstraints();
		gbc_btnRegistrar.fill = GridBagConstraints.BOTH;
		gbc_btnRegistrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnRegistrar.gridx = 3;
		gbc_btnRegistrar.gridy = 5;
		panel.add(btnRegistrar, gbc_btnRegistrar);
		
		btnIniciarSesion = new JButton("Iniciar Sesión");
		btnIniciarSesion.addActionListener(new BtnIniciarSesionActionListener());
		btnIniciarSesion.setContentAreaFilled(false);
		btnIniciarSesion.setBackground(new Color(255, 255, 255));
		btnIniciarSesion.setHorizontalTextPosition(SwingConstants.CENTER);
		btnIniciarSesion.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		GridBagConstraints gbc_btnIniciarSesion = new GridBagConstraints();
		gbc_btnIniciarSesion.fill = GridBagConstraints.BOTH;
		gbc_btnIniciarSesion.insets = new Insets(0, 0, 5, 5);
		gbc_btnIniciarSesion.gridx = 4;
		gbc_btnIniciarSesion.gridy = 5;
		panel.add(btnIniciarSesion, gbc_btnIniciarSesion);
		
		lblidioma = new JLabel("");
		lblidioma.setIcon(new ImageIcon(IniciarSesion.class.getResource("/recursos/icons8-idioma-96.png")));
		GridBagConstraints gbc_lblidioma = new GridBagConstraints();
		gbc_lblidioma.gridwidth = 2;
		gbc_lblidioma.insets = new Insets(0, 0, 0, 5);
		gbc_lblidioma.gridx = 3;
		gbc_lblidioma.gridy = 6;
		panel.add(lblidioma, gbc_lblidioma);

	}
	
	private void iniSesion() {
		try {
			int i;
			Trabajador trab = new Trabajador();
			ArrayList<Trabajador> listrab = trab.leerTrabajadores();
			for(i=0;i<listrab.size();i++) {
				if(listrab.get(i).getName().equals(textField.getText()) && listrab.get(i).getPassword().equals(String.valueOf(passwordField.getPassword()))) {
					@SuppressWarnings("unused")
					Principal vntPrin = new Principal(listrab.get(i));
					frame.dispose();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		textField.setBorder(BorderFactory.createLineBorder(new Color(236,112,99)));
		passwordField.setBorder(BorderFactory.createLineBorder(new Color(236,112,99)));
		lblError.setVisible(true);
	}
	private class BtnIniciarSesionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			iniSesion();
		}
	}
	private class PasswordFieldActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			iniSesion();
		}
	}
	private class BtnRegistrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Registrar reg = new Registrar();
			reg.setVisible(true);
		}
	}

}
