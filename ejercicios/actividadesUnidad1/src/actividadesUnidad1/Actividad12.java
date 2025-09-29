package actividadesUnidad1;
import java.util.Scanner;
public class Actividad12 {

	public static void main(String[] args) {
		// Escribir un programa que pida un número al usuario y muestre su valor absoluto.
		Scanner sc = new Scanner(System.in);
		int numero, valor_absoluto;
		System.out.println( "Dime un numero y te diré su absoluto: ");
		numero = sc.nextInt();
		
		valor_absoluto = Math.abs(numero);
		System.out.println( valor_absoluto );
	}

}
