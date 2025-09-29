package actividadesUnidad1;
import java.util.Scanner;
public class Actividad7 {
/**Diseñar una aplicación que calcule la longitud y el área de una circunferencia.
Para ello, el usuario debe introducir el radio (que puede contener decimales).

 Longitud = 2 x PI x radio
 Área = PI x radio x radio*/
	public static void main(String[] args) {
		//definimos las variables
		float radio, longitud, area;
		double PI = Math.PI;
		Scanner sc = new Scanner (System.in);
		System.out.println ("Introduzca el radio de la circurferencia: ");
		radio = sc.nextFloat();
		
		//calculamos longitud
		longitud = (float) (2 * PI * radio);
		area = (float) (PI * radio * (radio * radio));
		System.out.println ("El area de la circurferencia es: " + area + "cm y la longitud es " + longitud + "cm");
	}

}
	