package com.idat.prueba;

public class AlumnoProbar {

	public static void main(String[] args) {
	
		//Clase objeto = new Clase();
		Alumno alu01 = new Alumno();
		alu01.setCodigo(100);
		alu01.setNombre("Juan");
		alu01.setApellido("Espinoza");
		alu01.setDocumento("12345678");
		// Obtener el codigo del alumno
		mensaje("Codigo : "+ alu01.getCodigo());
		mensaje("Nombre : " + alu01.getNombre());
		mensaje("Apellido : "+ alu01.getApellido());
		mensaje("Documento : " + alu01.getDocumento());
		mensaje("********************************");
		// Modificar los datos del alumno01 y mostrar de nuevo
		alu01.setCodigo(101);
		alu01.setNombre("Juan Norbert");
		alu01.setApellido("Espinoza Carrazco");
		alu01.setDocumento("78945612");
		mensaje("Documento : "+ alu01.getCodigo());
		mensaje("Nombre : "+ alu01.getNombre());
		mensaje("Apellido : "+ alu01.getApellido());
		mensaje("Documento : "+ alu01.getDocumento());
		mensaje("**************************************");
		Alumno alu02 = new Alumno(200);
		mensaje("Codigo : " + alu02.getCodigo());
		alu02.setCodigo(201);
		alu02.setNombre("Fernanda");
		mensaje("Codigo : " + alu02.getCodigo());
		mensaje("Nombre : " + alu02.getNombre());
		
		
	}
		
    public static void mensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	

}
