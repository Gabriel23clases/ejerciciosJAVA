package ActividadesUnidad5;
import java.util.Arrays;
import java.util.Scanner;
public class Actividad6 {

	public static void main(String[] args) {
		/*Diseñar una aplicación que lea las puntuaciones (enteros) de 5 programadores y las muestre ordenadas.
		 *  Después pueden añadirse hasta n programadores de exhibición; su puntuación se introduce igual, 
		 *  usando -1 para indicar que no hay más. Mostrar finalmente todos los puntos ordenados.
		 */
		Scanner sc = new Scanner(System.in);
		int [] puntos = new int [5];
		//posicion nueva puntuacion
		int tempPuntuacion = 0,posicionextra;
		
			
			for  (int s = 0; s<=puntos.length-1; s++) {
				
			System.out.println("Dime las notas de los programadores");
			puntos[s] = sc.nextInt();
			}
			Arrays.sort(puntos);
		System.out.println(Arrays.toString(puntos));
	
		//Arrays.binarySearch(puntos, 5) posicion del 5
		
		int contador =0;
		do {
			
			System.out.println("Dime las notas de los programadores de exhibición");
			tempPuntuacion = sc.nextInt();
			if (tempPuntuacion== -1) {
				break;
				}
			//ampliamos tabla
				puntos=Arrays.copyOf(puntos,  puntos.length +1);
				posicionextra= puntos.length -1;
				
				puntos [posicionextra] = tempPuntuacion;
				contador++;
			
		}
		
		while (contador<3 );
		//ordenamos
		Arrays.sort(puntos);
		System.out.println(Arrays.toString(puntos));
	}

}
