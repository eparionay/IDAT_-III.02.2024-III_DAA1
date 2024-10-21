package com.idat.formulario;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.idat.entidades.Empleado;

public class FrmEmpleado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtHoras;
	private JLabel lblCantidad;
	private JTable table;
	
	DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmEmpleado frame = new FrmEmpleado();
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
	public FrmEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 444);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				procesar();
			}
		});
		btnProcesar.setBounds(235, 21, 89, 23);
		contentPane.add(btnProcesar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificar();
			}
		});
		btnModificar.setBounds(235, 55, 89, 23);
		contentPane.add(btnModificar);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(20, 25, 46, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(20, 54, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblHoras = new JLabel("Horas");
		lblHoras.setBounds(20, 79, 46, 14);
		contentPane.add(lblHoras);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(93, 22, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(93, 51, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(93, 76, 86, 20);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);
		
		JLabel lblTotalEmpleados = new JLabel("Total Empleados");
		lblTotalEmpleados.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotalEmpleados.setBounds(249, 316, 175, 41);
		contentPane.add(lblTotalEmpleados);
		
		lblCantidad = new JLabel("-");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCantidad.setBounds(320, 353, 60, 41);
		contentPane.add(lblCantidad);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 122, 391, 187);
		contentPane.add(scrollPane);
		
		table = new JTable();
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Codigo");
		modelo.addColumn("Nombre");
		modelo.addColumn("Horas");
		
		table.setModel(modelo);
	
		scrollPane.setViewportView(table);
		setLocationRelativeTo(null);
		cargarTotalEmpleados();
	}
	
	public void procesar() {
		
		String codigo = txtCodigo.getText();
		String nombre = txtNombre.getText();
		String horas = txtHoras.getText();
		
		int icodigo = Integer.parseInt(codigo);
		double dhoras = Double.parseDouble(horas);
		Empleado objEmpleado = new Empleado(icodigo, nombre, dhoras);
		
		grabarArchivoTexto(objEmpleado);
		Object [] arreglo_objeto = {icodigo, nombre, dhoras};
		
		modelo.addRow(arreglo_objeto);
		cargarTotalEmpleados();
	}
	
	public void modificar() {
		JD_Empleado_Valores dialog= new JD_Empleado_Valores();
		dialog.setVisible(true);
	}
	
	public void cargarTotalEmpleados() {
		lblCantidad.setText(Empleado.getContadorEmpleados()+"");
	}

	public void grabarArchivoTexto(Empleado objEmp) {
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter("C:/archivo/empleado.txt");
			pw = new PrintWriter(fw);
			pw.println("esto es un mensaje de prueba");
		}catch(Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}finally {
			try {
				pw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}// fin grabarArchivoTexto


}







