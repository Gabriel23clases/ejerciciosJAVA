package ActividadesUnidad3;
import java.util.Scanner;
public class Actividad14 {

	public static void main(String[] args) {
		/*Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para ello asteriscos (*). 
		 * Por ejemplo, para n = 4:
		 							* * * *
		 							* * *
		 							* *
		 							*         */
		Scanner sc = new Scanner(System.in);
		//creamos dos variables contadores n y s
		int num, n, s;
		System.out.println("Dime un número, crearemos un triaungulo usando es enúmero de base");
		num = sc.nextInt();
		
		while (num>0) {
			
			System.out.print("*");
			s=num-1;
			while (s>0) {
				System.out.print("*");
				s--;
			}
			num--;
			System.out.println("");
		}
		
		}

}
