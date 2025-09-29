package actividadesUnidad2;
import java.util.Scanner;
public class Actividad5 {

	public static void main(String[] args) {
		/* Implementar un programa que pida por teclado un número decimal e indique si es un número casi-cero, 
		 * que son aquellos, positivos o negativos, que se acercan a 0 por menos de 1 unidad, aunque curiosamente el 0 
		 * no se considera un número casi-cero. Ejemplos: 0.3, –0.99 o 0.123. Y números que no se consideran casi-ceros son: 12.3, 0 o –1.*/
		Scanner sc = new Scanner(System.in);
		double n;
		
		System.out.println("Introduzca un número decimal");
		n = sc.nextDouble();
		
		
		if (n!=0 && n<1 && n>-1) {
			System.out.println("Es casi cero");
			}
		
		else {System.out.println("No es casi cero");}
	}

}
