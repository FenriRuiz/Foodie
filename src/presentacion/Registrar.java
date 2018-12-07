package presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.Trabajador;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class Registrar extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblContrasena;
	private JLabel lblreContrasena;
	private JLabel lblNombreUsu;
	private JLabel lblGenero;
	private JRadioButton rdbtnMujer;
	private JRadioButton rdbtnBarn;
	private JPasswordField repasswordField;
	private JPasswordField passwordField;
	private JTextField textFieldUser;
	private JTextField textFieldApellidos;
	private JButton btnGuardar;
	private JButton btnLimpiar;
	private JLabel lblNewLabel;
	private JTextField textFieldName;

	public Registrar() {
		setResizable(false);
		setMinimumSize(new Dimension(520, 400));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(500, 220, 520, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		lblNombre.setBounds(106, 47, 85, 20);
		contentPane.add(lblNombre);
		
		lblApellidos = new JLabel("Apellidos: ");
		lblApellidos.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		lblApellidos.setBounds(101, 88, 90, 20);
		contentPane.add(lblApellidos);
		
		lblContrasena = new JLabel("Contraseña: ");
		lblContrasena.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		lblContrasena.setBounds(84, 170, 107, 20);
		contentPane.add(lblContrasena);
		
		lblreContrasena = new JLabel("Repetir Contraseña: ");
		lblreContrasena.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		lblreContrasena.setBounds(33, 211, 158, 20);
		contentPane.add(lblreContrasena);
		
		lblNombreUsu = new JLabel("Usuario: ");
		lblNombreUsu.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		lblNombreUsu.setBounds(110, 129, 81, 20);
		contentPane.add(lblNombreUsu);
		
		lblGenero = new JLabel("Genero: ");
		lblGenero.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		lblGenero.setBounds(111, 252, 58, 20);
		contentPane.add(lblGenero);
		
		rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.addActionListener(new RdbtnMujerActionListener());
		rdbtnMujer.setBackground(Color.WHITE);
		rdbtnMujer.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		rdbtnMujer.setBounds(184, 251, 68, 25);
		contentPane.add(rdbtnMujer);
		
		rdbtnBarn = new JRadioButton("Hombre");
		rdbtnBarn.addActionListener(new RdbtnBarnActionListener());
		rdbtnBarn.setBackground(Color.WHITE);
		rdbtnBarn.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		rdbtnBarn.setBounds(256, 251, 85, 25);
		contentPane.add(rdbtnBarn);
		
		repasswordField = new JPasswordField();
		repasswordField.setBounds(206, 211, 211, 20);
		contentPane.add(repasswordField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(206, 171, 211, 20);
		contentPane.add(passwordField);
		
		textFieldUser = new JTextField();
		textFieldUser.setBounds(205, 129, 212, 22);
		contentPane.add(textFieldUser);
		textFieldUser.setColumns(10);
		
		textFieldApellidos = new JTextField();
		textFieldApellidos.setBounds(203, 88, 214, 22);
		contentPane.add(textFieldApellidos);
		textFieldApellidos.setColumns(10);
		
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new BtnGuardarActionListener());
		btnGuardar.setBackground(new Color(50, 205, 50));
		btnGuardar.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		btnGuardar.setBounds(266, 288, 163, 52);
		contentPane.add(btnGuardar);
		
		btnLimpiar = new JButton("Limpiar Campos");
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		btnLimpiar.setBackground(new Color(144, 238, 144));
		btnLimpiar.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		btnLimpiar.setToolTipText("");
		btnLimpiar.setBounds(84, 288, 163, 52);
		contentPane.add(btnLimpiar);
		
		lblNewLabel = new JLabel("Registro");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		lblNewLabel.setBounds(217, 0, 102, 34);
		contentPane.add(lblNewLabel);
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(203, 47, 214, 22);
		contentPane.add(textFieldName);
	}
	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			textFieldUser.setText("");
			textFieldApellidos.setText("");
			textFieldName.setText("");
			repasswordField.setText("");
			passwordField.setText("");
			rdbtnMujer.setSelected(false);
			rdbtnBarn.setSelected(false);
		}
	}

	private class RdbtnMujerActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(rdbtnBarn.isSelected()) {
				rdbtnBarn.setSelected(false);
			}
		}
	}
	
	private class RdbtnBarnActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(rdbtnMujer.isSelected()) {
				rdbtnMujer.setSelected(false);
			}
		}
	}
	
	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(String.valueOf(passwordField.getPassword()).equals(String.valueOf(repasswordField.getPassword()))){
				Date fecha = new Date();
				Trabajador trab = new Trabajador();
				trab.setName(textFieldUser.getText());
				trab.setRealName(textFieldName.getText()+" "+textFieldApellidos.getText());
				trab.setPassword(String.valueOf(passwordField.getPassword()));
				trab.setLastConnect(fecha.toString());
				if(rdbtnMujer.isSelected()) {
					trab.setRutaIcono("/recursos/camarera.png");
				}else {
					trab.setRutaIcono("/recursos/camarero.png");}
				
				try {
					if(trab.guardarTrab(trab)==1) {
						Icon icono = new ImageIcon(getClass().getResource("/recursos/icons8-ok-48.png"));
						JOptionPane.showConfirmDialog(null, "Usuario añadido correctamente", "Usuario añadido", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION,icono);
					}else {
						Icon icono = new ImageIcon(getClass().getResource("/recursos/icons8-close-window-48.png"));
						JOptionPane.showConfirmDialog(null, "Falta usuario y/o contraseña", "Error, al añadir", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION,icono);	
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				Icon icono = new ImageIcon(getClass().getResource("/recursos/icons8-close-window-48.png"));
				JOptionPane.showConfirmDialog(null, "Las contraseñas no coinciden", "Error, al añadir", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION,icono);
			}
		}
	}
	
}
