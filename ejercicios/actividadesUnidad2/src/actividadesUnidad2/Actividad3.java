package actividadesUnidad2;
import java.util.Scanner;
public class Actividad3 {

	public static void main(String[] args) {
		// Solicitar dos números distintos y mostrar cuál es el mayor.
		double num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número");
		num1 = sc.nextDouble();
		System.out.println("Ahora uno distinto");
		num2 = sc.nextDouble();
		if (num1 > num2) {
			System.out.println("el mayor es " + num1);
		}
		else System.out.println("el mayor es " + num2);
		
	}

}
