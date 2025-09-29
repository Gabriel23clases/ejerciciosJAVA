package actividadesUnidad1;
import java.util.Scanner;
public class Actividad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ( "Dime un numero ");
		int num = sc.nextInt();
		boolean par = num % 2 == 0;
		System.out.println ("¿es par? " + par);

	}

}
