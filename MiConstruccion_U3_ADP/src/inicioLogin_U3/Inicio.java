package inicioLogin_U3;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

/* import Login_U2.bienvenido; */

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class Inicio {

	private JFrame frame;
	private JTextField txtUsr1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
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
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(250, 250, 885, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTit = new JLabel("Mi Construcci\u00F3n Inicio y Login Unidad III ADP");
		lblTit.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTit.setBounds(192, 30, 475, 69);
		frame.getContentPane().add(lblTit);
		
		JLabel lblUsr = new JLabel("Usuario");
		lblUsr.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsr.setBounds(113, 192, 78, 19);
		frame.getContentPane().add(lblUsr);
		
		JLabel lblClave = new JLabel("Clave");
		lblClave.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblClave.setBounds(113, 241, 78, 19);
		frame.getContentPane().add(lblClave);
		
		txtUsr1 = new JTextField();
		txtUsr1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUsr1.setBounds(203, 191, 247, 22);
		frame.getContentPane().add(txtUsr1);
		txtUsr1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setBounds(203, 240, 247, 22);
		frame.getContentPane().add(passwordField);
		
		/**
		 * Definición del Botón Login. Primera versión con usr y pw en duro.
		 */
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pw  = passwordField.getText();
				String usr = txtUsr1.getText();
				if (usr.equals("bien") && pw.equals("yo")) {
					passwordField.setText(null);
					txtUsr1.setText(null);
					Bienvenido H = new Bienvenido();
					H.setVisible(true);
				}
				else {
					passwordField.setText(null);
					txtUsr1.setText(null);
					JOptionPane.showMessageDialog(null, "Usuario o Clave Errado",
							"Login Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.setBounds(391, 404, 97, 25);
		frame.getContentPane().add(btnLogin);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(78, 97, 654, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(78, 356, 654, 2);
		frame.getContentPane().add(separator_1);
	}
}
