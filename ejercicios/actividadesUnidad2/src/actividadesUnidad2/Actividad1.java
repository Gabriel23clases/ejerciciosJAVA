package actividadesUnidad2;
import java.util.Scanner;
public class Actividad1 {
//Diseñar una aplicación que solicite al usuario un número e indique si es par o impar.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Dime un numero entero");
		num = sc.nextInt();
		//usamos % para resto
		if (num % 2 == 0)
		System.out.println("su número es par");
		else System.out.println("su número es impar");
	}

}
