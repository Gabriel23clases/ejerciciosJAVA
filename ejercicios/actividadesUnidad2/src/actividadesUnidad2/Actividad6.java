package actividadesUnidad2;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {

		// Pedir dos números y mostrarlos ordenados de forma decreciente.

		Scanner sc = new Scanner(System.in);
		// creamos las variables
		Double num1, num2, mayor, menor;
		// Pedimos al usuario los dos números a mostrar de forma decreciente

		System.out.println("Introduzca el primer número");
		num1 = sc.nextDouble();
		System.out.println("Introduzca el segundo número");
		num2 = sc.nextDouble();
		// Averiguamos cual es el mayor y el menor

		if (num1 > num2) {
			mayor = num1;
			menor = num2;
		} else {
			menor = num1;
			mayor = num2;
		}
			System.out.println("Sus números ordenados serian " + mayor + ">" + menor );
		

	}

}
