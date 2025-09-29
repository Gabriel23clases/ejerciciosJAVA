package actividadesUnidad1;
import java.util.Scanner;
public class Actividad8 {

	public static void main(String[] args) {
	/*🔞 Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de edad (mediante un literal booleano: true o false).*/
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Introduzca su edad: ");
		age = sc.nextInt();
		boolean adult = (age >= 18);
		System.out.println ("¿Usted es mayor de edad? " + adult);
	}

}
