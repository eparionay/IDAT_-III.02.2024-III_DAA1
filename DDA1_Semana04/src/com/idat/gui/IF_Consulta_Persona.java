package com.idat.gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class IF_Consulta_Persona extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IF_Consulta_Persona frame = new IF_Consulta_Persona();
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
	public IF_Consulta_Persona() {
		setTitle("Consulta Persona");
		setBounds(100, 100, 450, 300);

	}

}