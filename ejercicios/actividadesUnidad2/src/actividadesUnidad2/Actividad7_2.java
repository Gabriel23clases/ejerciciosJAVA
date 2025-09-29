package actividadesUnidad2;

import java.util.Scanner;

public class Actividad7_2 {

	public static void main(String[] args) {
		// Pedir tres números y mostrarlos ordenados de mayor a menor.

		Scanner sc = new Scanner(System.in);

		// creamos las variables
		Double num1, num2, num3;

		// Pedimos al usuario los dos números a mostrar de forma decreciente

		System.out.println("Introduzca el primer número");
		num1 = sc.nextDouble();
		System.out.println("Introduzca el segundo número");
		num2 = sc.nextDouble();
		System.out.println("Introduzca el segundo número");
		num3 = sc.nextDouble();
		// Averiguamos cual es el mayor y el menor

		if (((num1 > num2) && (num1 > num3)) && (num2 > num3)) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
		}
	}
}
