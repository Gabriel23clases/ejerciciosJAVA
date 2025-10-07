package ActividadesUnidad3;
import java.util.Scanner;
public class Actividad2 {

	public static void main(String[] args) {
		/*Un centro educativo nos ha pedido que diseñemos una aplicación para calcular 
		 * algunos datos estadísticos de las edades de los alumnos. Se introducirán datos hasta que uno de ellas sea negativo.
		 *  La aplicación mostrará la suma de todas las edades, la media, de cuántos alumnos hemos introducido las edades y cuántos alumnos 
		 *  son mayores de edad. Implementar la aplicación requerida.
		 */
		
		Scanner sc = new Scanner(System.in);
		//momento variables; para suma podemos usar suma += edad
		int edad=1, suma=0, cant=0, media, mayor=0;
		
		do {
		
		//pedimos por teclado la edad
		
		System.out.println("introduce la edad del alumno");
		edad = sc.nextInt();
		
		if (edad>18) {
		mayor++;
		}
		
		suma = (suma + edad);
		
		cant++;
		
		
		
		
		}
		while (edad >= 0);
		
		media = (suma / cant);
		System.out.println("la suma total de las edades es: " + suma);
		System.out.println("El número total de estudiantes son: " + cant);
		System.out.println("La media de edad es: " + media);
		System.out.println("La cantidad de alumnos mayores de edad son: " + mayor);
	}

}
