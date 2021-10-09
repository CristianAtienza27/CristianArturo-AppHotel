package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtContrase�a;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblLogin = new JLabel("INICIO DE SESION");
		lblLogin.setBounds(5, 5, 319, 50);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblLogin);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setBounds(60, 100, 92, 20);
		contentPane.add(lblUsuario);
		
		JLabel lblContrase�a = new JLabel("CONTRASE\u00D1A");
		lblContrase�a.setBounds(60, 150, 92, 20);
		contentPane.add(lblContrase�a);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(10, 250, 142, 50);
		contentPane.add(btnCancelar);
		
		JButton btnConfirmar = new JButton("CONFIRMAR");
		btnConfirmar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				quienEntra();
			}
		});
		btnConfirmar.setBounds(180, 250, 144, 50);
		contentPane.add(btnConfirmar);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(159, 100, 115, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrase�a = new JTextField();
		txtContrase�a.setBounds(159, 150, 115, 20);
		contentPane.add(txtContrase�a);
		txtContrase�a.setColumns(10);
		
		JButton btnNuevoCliente = new JButton("REGISTRAR NUEVO CLIENTE");
		btnNuevoCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				registrarCliente nuevoC = new registrarCliente();
				nuevoC.setVisible(true);
				dispose();
			}
		});
		btnNuevoCliente.setBounds(60, 200, 214, 23);
		contentPane.add(btnNuevoCliente);
	}
	
	public void quienEntra() {
		if(txtUsuario.getText() == "admin" && txtContrase�a.getText() == "admin") {
			admin admin = new admin();
			admin.setVisible(true);	
			dispose();
		}
		if(txtUsuario.getText() == "empleado" && txtContrase�a.getText() == "empleado") {
			empleado empleado = new empleado();
			empleado.setVisible(true);	
			dispose();
		}
		if(txtUsuario.getText() == "cliente" && txtContrase�a.getText() == "cliente") {
			cliente cliente = new cliente();
			cliente.setVisible(true);	
			dispose();
		}
		else {
			JOptionPane.showMessageDialog(null, "No puede haber campos vac�os");
		}
		
	}
}
