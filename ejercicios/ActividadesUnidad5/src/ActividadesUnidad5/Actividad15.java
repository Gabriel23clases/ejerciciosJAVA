package ActividadesUnidad5;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad15 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args) {
		System.out.println("Dime el tamaño de la tabla");
		int tam = sc.nextInt();
		int[] tabla = new int[tam];
		System.out.println("Impares: " + rellenaPares(tabla));
	}
	
	public static int rellenaPares(int[] t  ) {
		
		int impares = 0;
		
		for(int i=0; i<t.length; i++) {
			System.out.println("Dime un número");
			int valor = sc.nextInt();
			if(valor % 2 == 0) {
				t[i] = valor;
			}else {
				impares++;
				i--;
			}
		}
		System.out.println(Arrays.toString(t));
		return impares;
	}

}