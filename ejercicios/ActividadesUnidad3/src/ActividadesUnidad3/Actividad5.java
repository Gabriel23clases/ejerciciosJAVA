package ActividadesUnidad3;
import java.util.Scanner;
public class Actividad5 {

	public static void main(String[] args) {
		/*Desarrollar un programa que solicite los valores mínimo y máximo de un rango. 
		 * A continuación solicitará por teclado un número que debe estar dentro del rango. 
		 * Si el valor introducido no pertenence al rango, la aplicación volverá a pedir otro valor, 
		 * y así repetidas veces, hasta que el valor se encuentre dentro del rango.*/
		Scanner sc = new Scanner(System.in);
		int min, max, n;
		System.out.println("Dime el mínimo valor");
		min = sc.nextInt();
		System.out.println("Dime el máximo valor");
		max = sc.nextInt();
		
		do {
			
		System.out.println("Dame un valor que este dentro del rango");
		n = sc.nextInt();
		
		if (n> max) {
			System.out.println("Demasiado grande");
		}
			else 
				if (n<min) {
				System.out.println("Demasiado pequeño");
			}
		}
		
		while (n< min || n>max);
		
		System.out.println("Valor correcto");
	}

}
