package com.idat.prueba;

public class Alumno {
	private int codigo;
	private String nombre;
	private String apellido;
	private int edad;
	private String documento;
	
	public Alumno() {
		
	}
	
	
	
	
	public Alumno(int codigo, String nombre, String apellido, int edad, String documento) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.documento = documento;
	}




	public Alumno(int cod) {
		this.codigo=cod; 
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	
	
	
	
	
}
