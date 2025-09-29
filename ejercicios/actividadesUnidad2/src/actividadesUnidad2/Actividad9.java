package actividadesUnidad2;
import java.util.Scanner;
public class Actividad9 {

	public static void main(String[] args) {
		/* Escribir una aplicación que indique cuántas cifras tiene un número entero introducido por teclado, 
		que estará comprendido entre 0 y 99.999.*/
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Introduce un número entre el 0 y 99.999");
		num = sc.nextInt();
		
		if ((num > 0) && (num < 10)) {
			System.out.println("su número tiene 1 cifra");
			
		}
		else if ((num > 10) && (num < 100)) {
			System.out.println("su número tiene 2 cifra");
			
		}
		else if ((num > 100) && (num < 1000)) {
			System.out.println("su número tiene 3 cifra");
			
		}
		else if ((num > 1000) && (num < 10000)) {
			System.out.println("su número tiene 4 cifra");
			
		}
		else if ((num > 10000) && (num < 100000)) {
			System.out.println("su número tiene 5 cifra");
			
		}
		else if (num < 0) {
			System.out.println("su número es 0 o menor que cero");
			
		}
		else if ((num > 10000) && (num < 100000)) {
			System.out.println("su número supera el limite de 99.999");
			
		}
	}

}
