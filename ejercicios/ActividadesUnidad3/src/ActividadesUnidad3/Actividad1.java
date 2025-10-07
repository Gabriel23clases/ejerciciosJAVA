package ActividadesUnidad3;
import java.util.Scanner;
public class Actividad1 {

	public static void main(String[] args) {
		// Actividades bucle: while (condicion) [do-while} (do {acciones} while ) (for {sabemos la vueltas} 
		/*Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivo y su cuadrado. 
		El proceso se repetirá hasta que el número inctroducido por teclado sea 0.*/
		
		Scanner sc = new Scanner(System.in);
		//variables
		int num = 1, cuadrado = 0;
		
		while (num != 0) {
			
		System.out.println("Dime un número");
		num = sc.nextInt();
			
			if (num % 2 ==0) {
				System.out.println("su número es par");
		}
			else
				System.out.println("su número es impar");
			if (num < 0) {
				System.out.println("Su número es negativo");
			}
			else
				System.out.println("Su número es positivo ");
			cuadrado = (num * num);
			System.out.println("Su cuadrado es " + cuadrado);
		}
		
		System.out.println("Su número es 0");
	}

}
