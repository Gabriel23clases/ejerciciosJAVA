package ActividadesUnidad5;
import java.util.Arrays;
import java.util.Scanner;
public class Actividad4 {

	public static void main(String[] args) {
		/*Implementar un programa que inicialice una tabla con tus números favoritos. 
		 * Pedir al usuario el índice de un elemento que será eliminado. Continuar eliminando elementos hasta que el 
		 * índice introducido sea negativo o no existan más elementos que borrar. Validar siempre que el índice es válido.
		 */
		int[] numeros = {3,7,9,21,69,77,91};
		int [] numeros2 = new int [10];
		int pos=0;
		int aux;
		Scanner sc= new Scanner(System.in);
		for (int i=0; i<numeros.length; i++) {
			
			System.out.println(numeros[i]);
	}
		
		do {
			System.out.println("Dime la posición del número a borrar");
			pos = sc.nextInt();
			
			if (pos>= numeros.length || pos<0) {
				continue;
			
			}
			
			System.out.println(numeros[pos]);
			aux = numeros [numeros.length-1];
			numeros [pos] = aux;
			numeros = Arrays.copyOf(numeros, numeros.length-1);
			mostrarTabla(numeros);
		}
			while ( numeros.length>0);
		
		if (pos>=numeros.length || pos<0) {
			System.out.println("Error");
		}
		}
	
	public static void mostrarTabla (int [] tabla) {
		System.out.println("[");
	for (int elemento : tabla) {
		System.out.println(elemento);
	}
	System.out.println("]");
		
	}
	
	
	
	
}

