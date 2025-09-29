package actividadesUnidad1;
import java.util.Scanner;
public class Actividad6 {

	public static void main(String[] args) {
		
		int nota1, nota2;
		double notaMedia;
		Scanner sc = new Scanner(System.in);
		System.out.println ("introduzca el dividendo: ");
		nota1 = sc.nextInt();
		System.out.println ("Introduzca el divisor ");
		nota2 = sc.nextInt();
		
		//calculamos la media
		
	notaMedia = (nota1 + nota2) / 2.0;
	System.out.println ( "Su nota media es: " + notaMedia);
	}

}
