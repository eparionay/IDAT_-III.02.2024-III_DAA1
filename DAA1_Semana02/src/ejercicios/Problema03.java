package ejercicios;

public class Problema03 {
	public static void main(String [] args) {
		int promedio;
		String categoria;
		promedio = 20;
		
		if (promedio >= 17 && promedio<=20) 
			categoria = "A";
		else if(promedio>=14 && promedio<17) 
			categoria = "B";
		else if(promedio>=12 && promedio<14) 
			categoria= "C";
		else 
			categoria= "D";
		  
		System.out.println("La categoria es : " + categoria);
		
		
		
	}
}
