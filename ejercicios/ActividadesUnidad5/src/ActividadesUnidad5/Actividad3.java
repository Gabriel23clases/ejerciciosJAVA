package ActividadesUnidad5;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		/*Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
		 *  Calcular la media de los números positivos, la media de los negativos y contar el número de ceros introducidos.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la cantidad de números a introducir");
		int n = sc.nextInt();
		
		int [] numeros = new int [n];
		for (int i=0; i< n; i++) {
			System.out.println("Dime un numero, ya sea positivo o negativo");
			numeros [i] = sc.nextInt();
			
			}
		System.out.println("El número de ceros es " + cuentaceros(numeros) );
		System.out.println("la media de números positivos es " + mediaPositivos(numeros) );
		System.out.println("La media de números negativos es " + mediaNegativos(numeros) );

	//	System.out.println("Hay " + Cuentaceros (numeros) + "ceros");
		}
	

	public static int cuentaceros(int [] numeros ) {
		int j=0;
		for (int indice=0; indice < numeros.length; indice++) {
			
		if (numeros [indice] == 0) {
			j++;
		}
		}
		
		return j;
		
	}
	
	public static double mediaPositivos(int[] numeros) {
		double resu=0;
		int j=0;
		for (int indice=0; indice < numeros.length; indice++) {
			
		if (numeros [indice] > 0) {
	         resu=resu+ numeros [indice];
	         j++;
		}
		}
		
		return resu/j;
	}
	
	public static double mediaNegativos(int[] numeros) {
		int j=0;
		double resu=0;
		for (int indice=0; indice < numeros.length; indice++) {
			
			if (numeros [indice] < 0) {
		         resu=resu+ numeros [indice];
		         j++;
			}
			}
		
		return resu/j;
		
	}
	}
	
	
	
	
	
	
	
	
	


