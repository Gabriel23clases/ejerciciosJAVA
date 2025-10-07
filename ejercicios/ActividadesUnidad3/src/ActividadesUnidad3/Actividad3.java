package ActividadesUnidad3;
import java.util.Random;
import java.util.Scanner;
public class Actividad3 {

	public static void main(String[] args) {
		/*Realizar el juego el número secreto, que consiste en acertar un número desconocido
		 *  (generado aleatoriamente entre 1 y 100). Para ello se leen por teclado una serie de números,
		 *   para los que se indica: «mayor» o «menor», según sea mayor o menor con respecto al número secreto.
		 *    El proceso termina cuando el usuario acierta o cuando se rinde (introduciendo un –1).*/
		
		Scanner sc = new Scanner(System.in);
		
		//secreto = (int) (Math.random() * (max - min + 1)) + min;
		Random random = new Random ();
		int numerosecreto = random.nextInt(100) + 1;
		//
		int intento= 0;
		// /n salto de linea
		while (true) {
			
		System.out.println("¿Qué número crees que será? introduce -1 para rendirte");
		intento = sc.nextInt();
		
		if (intento == -1) {
			System.out.println("Te has rendido, era " + numerosecreto);
			break;
		}
		if (intento == numerosecreto) {
			System.out.println("Has acertado");
			break;
		} else if (intento > numerosecreto)
			System.out.println("es menor");
		if (intento < numerosecreto)
			System.out.println("es mayor");
		
		}
		//while ((num != secreto) || (num !=-1 ));
		
	}
	

}
