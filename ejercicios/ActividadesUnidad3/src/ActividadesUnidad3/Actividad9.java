package ActividadesUnidad3;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		/*Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es el árbol más alto.
		 *  Para ello se introducirá por teclado la altura (en centímetros) de cada árbol (terminando cuando se utilice –1 como altura). 
		 *  Los árboles se identifican mediante etiquetas con números únicos correlativos, comenzando en 0. Se pide diseñar una aplicación
		 *   que resuelva el problema planteado.*/
		Scanner sc = new Scanner(System.in);
		int altura, etiqueta=0, maxalt=0, arbolmasalto=0;
		
		do {
			System.out.println("Introduzca la altura del arbol " + etiqueta);
			altura = sc.nextInt();
			if (altura > maxalt) {
				maxalt=altura;
				arbolmasalto=etiqueta;
				
			}
			etiqueta++;
			}
		while (altura!=-1);
		
		System.out.println("el arbol mas altoes " + arbolmasalto);
		System.out.println("con la altura " + maxalt);
			}
		}
	
