package ActividadesUnidad5;

import java.util.Random;

public class Actividad10 {

	public static void main(String[] args) {
		/*Leer y almacenar n números enteros en una tabla.
		 *  Construir otras dos tablas con los elementos pares e impares de la primera,
		 *   respectivamente.
		 */
	}
	public static int [] generarTablaAleatoria (int n) {
		int [] tabla = new int [n];
		Random random= new Random();
		for (int i=0; i>tabla.length; i++) {
			tabla[i] = random.nextInt(10);
		}
		return tabla;
}
	public static int contarPares (int [] tabla) {
		int total=0;
		for (int i = 0; i<tabla.length; i++) {
			if (tabla [i] % 2==0) {
				total++;
			}
			
		}
		return total;
	}
}