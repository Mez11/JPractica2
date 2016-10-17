package com.redes.p2.servidor.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class EditarProducto {
	//super("EditarProducto");

	private JFrame frmEditarProducto;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarProducto window = new EditarProducto();
					window.frmEditarProducto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EditarProducto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEditarProducto = new JFrame();
		frmEditarProducto.setTitle("Editar producto");
		frmEditarProducto.setBounds(100, 100, 450, 300);
		frmEditarProducto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEditarProducto.getContentPane().setLayout(null);
		
		JLabel lblImagen = new JLabel("Imagen");
		lblImagen.setBounds(138, 12, 122, 62);
		frmEditarProducto.getContentPane().add(lblImagen);
		
		JButton btnNewButton = new JButton("Eleguir imagen");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(102, 86, 167, 25);
		frmEditarProducto.getContentPane().add(btnNewButton);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(29, 117, 70, 15);
		frmEditarProducto.getContentPane().add(lblId);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(12, 144, 70, 15);
		frmEditarProducto.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Precio");
		lblNewLabel_1.setBounds(22, 175, 70, 15);
		frmEditarProducto.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Existencias");
		lblNewLabel_2.setBounds(12, 202, 103, 15);
		frmEditarProducto.getContentPane().add(lblNewLabel_2);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(250, 123, 92, 15);
		frmEditarProducto.getContentPane().add(lblDescripcion);
		
		JLabel lblNewLabel_3 = new JLabel("Origen");
		lblNewLabel_3.setBounds(257, 144, 70, 15);
		frmEditarProducto.getContentPane().add(lblNewLabel_3);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(165, 234, 117, 25);
		frmEditarProducto.getContentPane().add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(307, 234, 117, 25);
		frmEditarProducto.getContentPane().add(btnAceptar);
		
		textField = new JTextField();
		textField.setBounds(115, 123, 124, 19);
		frmEditarProducto.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(115, 142, 124, 19);
		frmEditarProducto.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(115, 173, 124, 19);
		frmEditarProducto.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(115, 200, 124, 19);
		frmEditarProducto.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(349, 121, 87, 19);
		frmEditarProducto.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(345, 142, 91, 19);
		frmEditarProducto.getContentPane().add(textField_5);
		textField_5.setColumns(10);
	}
}
