package ejercicios;

public class Problema07 {

	public static void main(String[] args) {
		
		int cantidad;
		double precio, id, ic, ip;
		cantidad= 10;
		
		if(cantidad<=50) {
			precio= 25.5;
		}else if(cantidad<=100) {
			precio= 22.5;
		}else if(cantidad<150) {
			precio= 20;
		}else {
			precio=18;
		}
		ic= precio*cantidad;
		
		if(cantidad>50) {
			id= ic*0.15;
		}else {
			id= ic*0.05;
		}
		ip= ic- id;
		System.out.println("IC: "+ ic);
		System.out.println("ID: "+ id);
		System.out.println("IP: "+ ip);

	}

}
