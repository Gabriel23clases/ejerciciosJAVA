package actividadesUnidad1;

import java.util.Scanner;

public class actividad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("Introduzca su año de nacimiento: ");
		int anno = sc.nextInt();
		System.out.println ("Introduzca el año actual: ");
		int annoActual = sc.nextInt();
		int annoUsuario=annoActual - anno;
		System.out.println ("Usted tiene " + annoUsuario + " años ");
	}

}
