package ActividadesUnidad5;
import java.util.Scanner;
public class Actividad2 {

	public static void main(String[] args) {
		/*Escribir una aplicación que solicite al usuario cuántos números desea introducir.
		 *  A continuación, se leerá esa cantidad de números enteros y, por último, se mostrarán en el orden inverso al introducido.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cual será el tamaño de la tabla?");
		int tabla = sc.nextInt();
		
		int [] numeros = new int [tabla];
		
		for (int i=numeros.length -1;i>=0; i-- ) {
			
			System.out.println("Introduce un número");
			 numeros[i] = sc.nextInt();
			
			
	}
		for (int num : numeros) {
			System.out.println(num);
		}
// for (int i = tabla.length-1; i>=0; i--){syso numeros [i]
}
}
