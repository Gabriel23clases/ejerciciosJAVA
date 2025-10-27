package ActividadesUnidad5;
import java.util.Scanner;
public class Actividad1 {

	public static void main(String[] args) {
		/* Diseñar un programa que solicite al usuario que introduzca 5 números decimales por teclado y, 
		a continuación, muestre los números en el mismo orden en que se introdujeron.*/
		Scanner sc = new Scanner(System.in);
		double numeros [] = new double [5];
		
		for (int i=0;i<5; i++ ) {
			
		System.out.println("Introduce un número");
		 numeros[i] = sc.nextInt();
		
		
	} //1º Forma de hacerlo
		for (int i=0; i<numeros.length; i++) {
			
			System.out.println(numeros[i]);
		
		}
		//2º forma de hacerlo
		for (double num : numeros) {
			System.out.println(num);
		}
		
		
		
		
		}
		
	}
