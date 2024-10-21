package ejercicios;

public class Problema06 {

	public static void main(String[] args) {
		
		double multa;
		int velocidad;
		
		velocidad= 150;
		
		if (velocidad <=70) {
			multa=0;
		}else if(velocidad<=90) {
			multa=100;
		}else if(velocidad<=100) {
			multa=140;
		}else {
			multa=200;
		}
		
		System.out.println("Multa : " + multa);
		
		
		
		
		

	}

}
