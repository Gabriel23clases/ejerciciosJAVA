package ActividadesUnidad5;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		/*Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
		 *  Calcular la media de los números positivos, la media de los negativos y contar el número de ceros introducidos.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la cantidad de números a introducir");
		int cantidad = sc.nextInt();
		
		int [] numeros = new int [cantidad];
		for (int i=0; i<= cantidad; i++) {
			System.out.println("Dime un numero ya sea positivo o negativo");
			numeros [i] = sc.nextInt();
			
			}
	//	System.out.println("Hay " + Cuentaceros (numeros) + "ceros");
		}
	
	
	public static int Cuentaceros(int numeros ) {
		int j=0;
		if (numeros == 0) {
			j++;
		}
		
		
		return j;
		
	}
	
	
	
	
	
	
	
	
	}


