package ejercicios;

public class Problema05 {

	public static void main(String [] args) {
		
		int notaMatematica, notaQuimica, notaFisica;
		int propina=0;
		
		notaMatematica = 14;
		notaQuimica= 15;
		notaFisica= 8;
		
		if (notaMatematica>=13) {
			propina += 10; // propina = propina + 10;
		}
		if(notaQuimica>=13) {
			propina +=10;
		}
		if (notaFisica>=13) {
			propina +=10;
		}
		
		System.out.println("Propina : " + propina);
	}
}
