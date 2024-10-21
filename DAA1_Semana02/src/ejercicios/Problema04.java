package ejercicios;

public class Problema04 {

	public static void main(String[] args) {
		int producto, cantidad;
		double precio=0, ic, id, ip;
		producto = 0;
		cantidad= 10;
		switch(producto) {
			case 0: precio=17.50; break;
			case 1: precio= 25; break;
			case 2: precio= 15.50; break;
		}
		// Hallar el importe de compra
		ic= precio*cantidad;
		// Hallar el importe de descuento
		if (cantidad<=10){
			id = ic*0.05;
		}else if(cantidad <=20) {
			id = ic*0.075;
		}else {
			id = ic*0.1;
		}
		// Hallar el importe a pagar
		ip= ic- id;
		System.out.println("Importe de Compra : " + ic);
		System.out.println("Importe de Descue : " + id);
		System.out.println("Importe a Pagar : " + ip);
		
		
		
		

	}

}
