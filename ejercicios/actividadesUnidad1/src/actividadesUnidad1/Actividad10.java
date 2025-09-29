package actividadesUnidad1;
import java.util.Scanner;
public class Actividad10 {
/**Diseñar un algoritmo que nos indique si podemos salir a la calle.

Aspectos a considerar:

Si está lloviendo.
Si hemos terminado nuestras tareas.
👉 Solo podemos salir a la calle si no llueve y hemos finalizado las tareas.

Existe otra opción que permite salir: si el usuario necesita ir a la biblioteca.

El algoritmo debe solicitar (mediante booleanos) si llueve, si se han terminado las tareas y si se debe ir a la biblioteca, mostrando finalmente un literal booleano (true o false) que indique si puede salir.*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean lluvia, tarea, biblioteca, salir;
		System.out.println (" Todas las preguntas deben ser respondidas con true or false");
		System.out.println (" ¿Esta llvoviendo?");
		lluvia = sc.nextBoolean();
		System.out.println (" ¿Has terminado la tarea?");
		tarea = sc.nextBoolean();
		System.out.println (" ¿Vas a la biblioteca?");
		biblioteca = sc.nextBoolean();
		salir = (!lluvia && tarea) || (biblioteca);
		System.out.println ("¿Podra salir? " + salir);
		
	}

}
