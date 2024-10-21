package com.idat.formulario;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.idat.entidades.Empleado;

public class JD_Empleado_Valores extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtTarifa;
	private JTextField txtPorcentajeDescuento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JD_Empleado_Valores dialog = new JD_Empleado_Valores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JD_Empleado_Valores() {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setTitle("Formulario de Configuracion");
		setBounds(100, 100, 261, 204);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Tarifa");
			lblNewLabel.setBounds(41, 11, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Porcentaje Descuento");
			lblNewLabel_1.setBounds(41, 63, 188, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txtTarifa = new JTextField();
			txtTarifa.setBounds(39, 32, 104, 20);
			contentPanel.add(txtTarifa);
			txtTarifa.setColumns(10);
		}
		{
			txtPorcentajeDescuento = new JTextField();
			txtPorcentajeDescuento.setBounds(39, 88, 104, 20);
			contentPanel.add(txtPorcentajeDescuento);
			txtPorcentajeDescuento.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnAceptar = new JButton("Aceptar");
				btnAceptar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						aceptar();
					}
				});
				btnAceptar.setActionCommand("OK");
				buttonPane.add(btnAceptar);
				getRootPane().setDefaultButton(btnAceptar);
			}
			{
				JButton btnCerrar = new JButton("Cerrar");
				btnCerrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				btnCerrar.setActionCommand("Cancel");
				buttonPane.add(btnCerrar);
			}
		}
		setLocationRelativeTo(null);
		cargarValores();
	}
	public void aceptar() {
		
		try {
			String tarifa = txtTarifa.getText();
			String porcentaje = txtPorcentajeDescuento.getText();
			
			if(tarifa.length()>0 && porcentaje.length()>0) {
				double dtarifa = Double.parseDouble(tarifa);
				double dporcentaje = Double.parseDouble(porcentaje);
				Empleado.setTarifa(dtarifa);
				Empleado.setPorcentajeDescuento(dporcentaje);
				setVisible(false);
			}else {
				JOptionPane.showMessageDialog(null, "Ingrese valores en las cajas de texto");
			}
			
		}catch(Exception exa) {
			JOptionPane.showMessageDialog(null, "Ocurrio un error, vuelve a intentar");
			System.out.println("aceptar - Error : " + exa.getMessage());
		}
	}
	
	public void cargarValores() {
		txtTarifa.setText(Empleado.getTarifa()+"");
		txtPorcentajeDescuento.setText(Empleado.getPorcentajeDescuento()+"");
	}
	
	

}
