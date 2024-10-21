package com.idat.prueba;

public class Trabajador {
	
	private int codigo;
	private String marca;
	private String configuracionBasica;
	private double precioSoles;
	
	public Trabajador() {
		
	}
	
	public Trabajador(int codigo, String marca, String configuracionBasica, double precioSoles) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.configuracionBasica = configuracionBasica;
		this.precioSoles = precioSoles;
	}





	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getConfiguracionBasica() {
		return configuracionBasica;
	}
	public void setConfiguracionBasica(String configuracionBasica) {
		this.configuracionBasica = configuracionBasica;
	}
	public double getPrecioSoles() {
		return precioSoles;
	}
	public void setPrecioSoles(double precioSoles) {
		this.precioSoles = precioSoles;
	}
	
	
	public double descuento() {
		return precioSoles*0.15;
	}
	
	public double precioVenta() {
		return precioSoles- descuento();
	}
	
	public double precioDolares() {
		return precioVenta()/2.8;
	}
	
	
	
	
	
	
	
	
	

}
