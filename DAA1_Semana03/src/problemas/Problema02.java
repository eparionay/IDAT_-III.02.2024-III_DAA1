package problemas;

public class Problema02 {

	public static void main(String[] args) {
		probarMientras2();
		imprimir("*****************************");
		probarMientras3();

	}

	// Ini imprimir()
	public static void imprimir(String mensaje) {
		System.out.println(mensaje);
	}
	// Fin imprimir()

	// Ini probarMientras1()
	public static void probarMientras1() {
		boolean ejecucion = true;
		int contador = 1;
		while (ejecucion) {
			imprimir("Hola");
			if (contador == 3) {
				ejecucion = false;
			}
			contador++;
		}
	}
	// Fin probarMientras1()

	// Ini probarMientras2()
	public static void probarMientras2() {
		boolean ejecucion = true;
		int contador = 0;
		while (ejecucion) {
			imprimir("Hola : " + contador);
			if (contador == 3) {
				imprimir("El bucle se detiene");
				break;
			}
			contador++;
		}
		imprimir("Esto es una linea");
	}
	// Fin probarMientras2()

	// Ini probarMientras3()
	public static void probarMientras3() {
		boolean ejecucion = true;
		int contador = 0;
		while (ejecucion) {
			contador++;
			imprimir("Hola : " + contador);
			if (contador == 3) {
				imprimir("Se hace un salto.......");
				continue;
			}
			if (contador == 10) {
				imprimir("Se rompe el bucle.......");
				break;
			}

		}
		imprimir("Esto es una linea");
	}
	// Fin probarMientras3()

}
