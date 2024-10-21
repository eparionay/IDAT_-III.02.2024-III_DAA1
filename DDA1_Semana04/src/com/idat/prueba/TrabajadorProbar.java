package com.idat.prueba;

public class TrabajadorProbar {

	public static void main(String[] args) {
		Trabajador tra= new Trabajador(100, "lenovo", "", 2500);
		System.out.println("Precio Anterior :"+tra.getPrecioSoles());
		
		
		tra.setPrecioSoles(
				tra.getPrecioSoles()*1.1
				);
		
		System.out.println("Precio Nuevo :"+tra.getPrecioSoles());
		
		

	}

}
