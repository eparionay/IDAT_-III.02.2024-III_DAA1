package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import problemas.Operaciones;

public class Problema01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextArea txtS;
	private JComboBox cboOperaciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema01 frame = new Problema01();
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
	public Problema01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 396, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumero1 = new JLabel("Numero 1");
		lblNumero1.setBounds(25, 29, 46, 14);
		contentPane.add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Numero 2");
		lblNumero2.setBounds(25, 66, 46, 14);
		contentPane.add(lblNumero2);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				procesar();
			}
		});
		btnProcesar.setBounds(76, 136, 89, 23);
		contentPane.add(btnProcesar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			}
		});
		btnLimpiar.setBounds(214, 136, 89, 23);
		contentPane.add(btnLimpiar);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(108, 26, 86, 20);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(108, 63, 86, 20);
		contentPane.add(txtNumero2);
		txtNumero2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Operaciones");
		lblNewLabel.setBounds(25, 102, 71, 14);
		contentPane.add(lblNewLabel);
		
		cboOperaciones = new JComboBox();
		cboOperaciones.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/"}));
		cboOperaciones.setBounds(108, 94, 86, 22);
		contentPane.add(cboOperaciones);
		
		txtS = new JTextArea();
		txtS.setBounds(25, 170, 299, 151);
		contentPane.add(txtS);
	}
	
	public void limpiar() {
		txtNumero1.setText("");
		txtNumero2.setText("");
		txtS.setText("");
		cboOperaciones.setSelectedIndex(0);
		txtNumero1.requestFocus();
		
	}
	
	public void procesar() {
		
		String numero1 = txtNumero1.getText();
		String numero2 = txtNumero2.getText();
		String operador= cboOperaciones.getSelectedItem().toString();
		int resultado=0;
		int n1 = Integer.parseInt(numero1);
		int n2 = Integer.parseInt(numero2);
		
		Operaciones objOperaciones = new Operaciones();
		
		switch(operador) {
			case "+": resultado = objOperaciones.sumar(n1, n2); break;
			case "-": resultado = objOperaciones.restar(n1, n2); break;
			case "*": resultado = objOperaciones.multiplicar(n1, n2); break;
			case "/": resultado = objOperaciones.dividir(n1, n2); break;
		}
		
		txtS.setText("");
		txtS.append("Numero 1 : " + numero1 +"\n");
		txtS.append("Numero 2 : " + numero2+"\n");
		txtS.append("Resultado : " + resultado);
		
	}
	
	
	
	
	
	
}
