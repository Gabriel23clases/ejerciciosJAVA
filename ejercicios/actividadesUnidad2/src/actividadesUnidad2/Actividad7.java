package actividadesUnidad2;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		// Pedir tres números y mostrarlos ordenados de mayor a menor.

		Scanner sc = new Scanner(System.in);

		// creamos las variables
		Double num1, num2, num3, mayor, mid, menor;

		// Pedimos al usuario los dos números a mostrar de forma decreciente

		System.out.println("Introduzca el primer número");
		num1 = sc.nextDouble();
		System.out.println("Introduzca el segundo número");
		num2 = sc.nextDouble();
		System.out.println("Introduzca el tercer número");
		num3 = sc.nextDouble();
		// Averiguamos cual es el mayor y el menor

		if (((num1 > num2) && (num2 > num3)) && (num1 > num3)) {
			mayor = num1;
			menor = num3;
			mid = num2;
			System.out.println("Sus números ordenados serian " + mayor + ">" + mid + ">" + menor);
		}
		else if (((num2 > num1) && (num2 > num3) && (num3 > num1))) {
			mayor = num2;
			menor = num1;
			mid = num3;
			System.out.println("Sus números ordenados serian " + mayor + ">" + mid + ">" + menor);
		 }
		else if (((num3 > num1) && (num3 > num2) && (num2 > num1))) {
			mayor = num3;
			menor = num1;
			mid = num2;
			System.out.println("Sus números ordenados serian " + mayor + ">" + mid + ">" + menor);
		 }
		else if (((num3 > num1) && (num3 > num2) && (num1 > num2))) {
			mayor = num3;
			menor = num2;
			mid = num1;
			System.out.println("Sus números ordenados serian " + mayor + ">" + mid + ">" + menor);
		 }
		else if (((num1 > num3) && (num1 > num2) && (num3 > num2))) {
			mayor = num1;
			menor = num2;
			mid = num3;
			System.out.println("Sus números ordenados serian " + mayor + ">" + mid + ">" + menor);
		 }
		else if (((num2 > num1) && (num2 > num3) && (num1 > num3))) {
		
		mayor = num2;
		menor = num3;
		mid = num1;
		System.out.println("Sus números ordenados serian " + mayor + ">" + mid + ">" + menor);
		}
		
		}
	}