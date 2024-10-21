package com.idat.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmMain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDesktopPane escritorio;
	IF_Consulta_Empleado objConsultaEmpleado= new IF_Consulta_Empleado();
	IF_Consulta_Persona objConsultaPersona= new IF_Consulta_Persona();
	

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMain frame = new FrmMain();
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
	public FrmMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnConsulta = new JMenu("Consulta");
		menuBar.add(mnConsulta);
		
		JMenuItem mniEmpleado = new JMenuItem("Empleado");
		mniEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			
				
			}
		});
		mnConsulta.add(mniEmpleado);
		
		JMenuItem mniPersona = new JMenuItem("Persona");
		mniPersona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				objConsultaPersona.setVisible(true);
			}
		});
		mnConsulta.add(mniPersona);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		JMenuItem mniManEmpleado = new JMenuItem("Empleado");
		mnMantenimiento.add(mniManEmpleado);
		
		JMenuItem mniManPersona = new JMenuItem("Persona");
		mnMantenimiento.add(mniManPersona);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		escritorio = new JDesktopPane();
		contentPane.add(escritorio, BorderLayout.CENTER);
		
		escritorio.add(objConsultaEmpleado);
		escritorio.add(objConsultaPersona);
		
	}
}
