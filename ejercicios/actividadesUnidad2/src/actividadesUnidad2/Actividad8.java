package actividadesUnidad2;

import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		// Pedir los coeficientes de una ecuación de 2º grado, y mostrar sus soluciones reales. Si no existen, debe indicarlo.
		Scanner sc = new Scanner(System.in);
		int a, b, c, z, x; 
		int delta, deltaRaiz;
		
		System.out.println("Introduzca el valor de a");
		a = sc.nextInt();
		System.out.println("Introduzca el valor de b");
		b = sc.nextInt();
		System.out.println("Introduzca el valor de c");
		c = sc.nextInt();
		delta = (b * b) - 4 * a * c;
		deltaRaiz = (int) Math.sqrt(delta);
		
		if (a == 0) {
			if (b!= 0) {
				z = -c / b;
				System.out.println("No es una ecuación de segundo grado") ;
				System.out.println("x vale " + z) ;
			}
				else {
					System.out.println("0 !=" + c + " es inconsistente") ;
				}
		}else {
			if (delta > 0) {
				
				deltaRaiz = (int) Math.sqrt(delta);
				//1
				z = ((-1 * b) + deltaRaiz) / (2 * a);
				
				x = ((-1 * b) + deltaRaiz) / (2 * a);
				System.out.println("Hay dos resultados " + z + " y " + x);}
				
			else if (delta ==0) {
				x = (-1 * b) / (2 * a);
				System.out.println("Hay un resultado" + x ) ;
				}
			
			}
				
		
	}}
	
		





















































































































































	
