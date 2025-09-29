package actividadesUnidad1;
import java.util.Scanner;
public class Actividad14 {

	public static void main(String[] args) {
		// Realizar un programa que pida como entrada un número decimal y lo muestre redondeado al entero más próximo.
		Scanner sc = new Scanner(System.in);
		float num;
		System.out.println ( "dame un numero a aproximar ");
		num = sc.nextFloat();
		//Dos formas
		System.out.println( "su numero aproximado es: " + Math.round(num));
		System.out.println( "su numero aproximado es: " + (int)(num + 0.5));
	}

}
