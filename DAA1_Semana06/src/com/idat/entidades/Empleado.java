package com.idat.entidades;

public class Empleado {
	private int cod;
	private String nombre;
	private double horas;
	
	private static double tarifa;
	private static double porcentajeDescuento;
	private static double contadorEmpleados;// contador 1++
	private static double sueldoNetoEmpleados;//acumulador
	
	static {
		tarifa = 40;
		porcentajeDescuento= 0.11;
		contadorEmpleados=0;
		sueldoNetoEmpleados=0;
	}
	
	// Constructor Vacio
 	public Empleado() {	
	}
	// Constructor con todos los parametros
	public Empleado(int cod, String nombre, double horas) {
		super();
		this.cod = cod;
		this.nombre = nombre;
		this.horas = horas;
		contadorEmpleados++;
	}

	public int getCod(int cod) {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	
	
	public double getSueldoBruto() {
		return horas*tarifa;
	}
	
	public double getDescuento() {
		return getSueldoBruto()*porcentajeDescuento;
	}
	
	public double getSueldoNeto() {
		return getSueldoBruto()-getDescuento();
	}
	public static double getTarifa() {
		return tarifa;
	}
	public static void setTarifa(double tarifa) {
		Empleado.tarifa = tarifa;
	}
	public static double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}
	public static void setPorcentajeDescuento(double porcentajeDescuento) {
		Empleado.porcentajeDescuento = porcentajeDescuento;
	}
	public static double getContadorEmpleados() {
		return contadorEmpleados;
	}
	public static void setContadorEmpleados(double contadorEmpleados) {
		Empleado.contadorEmpleados = contadorEmpleados;
	}
	public static double getSueldoNetoEmpleados() {
		return sueldoNetoEmpleados;
	}
	public static void setSueldoNetoEmpleados(double sueldoNetoEmpleados) {
		Empleado.sueldoNetoEmpleados = sueldoNetoEmpleados;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
