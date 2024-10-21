package problemas;

import java.util.Scanner;

public class Problema01 {
	// VariableGlobal
	
	public static void main(String[] args) {
		// DECLARACION DE VARIABLES
		int num1, num2, resultado;
		Scanner entrada = new Scanner(System.in);
		// ENTRADA DE DATOS
		imprimir("Ingrese el numero 1 : ");
		num1 = entrada.nextInt();
		imprimir("Ingrese el numero 2 : ");
		num2= entrada.nextInt();
		// PROCESO
		resultado= num1+num2;
		// SALIDA
		imprimir("La suma es : "+ resultado);
	}
	
	public static void imprimir(String mensaje) {
		System.out.println(mensaje);
	}

}
