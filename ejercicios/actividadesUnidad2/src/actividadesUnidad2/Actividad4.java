package actividadesUnidad2;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		// Realizar de nuevo el ejercicio anterior considerando el caso de que los números introducidos sean iguales.
		double num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número");
		num1 = sc.nextDouble();
		System.out.println("Ahora uno distinto");
		num2 = sc.nextDouble();
		if (num1 > num2) 
			System.out.println("el mayor es " + num1);
		else if (num1 == num2)
			
		System.out.println("Pusiste los mismos, intentalo de nuevo");
		
		else System.out.println("el mayor es " + num2);
		
	}

}
