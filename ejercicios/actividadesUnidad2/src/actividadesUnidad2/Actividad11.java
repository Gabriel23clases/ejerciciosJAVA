package actividadesUnidad2;
import java.util.Scanner;
public class Actividad11 {

	public static void main(String[] args) {
		/* Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente (0–4), Suficiente (5), Bien (6), Notable (7–8) y 
		Sobresaliente (9–10).*/
		Scanner sc = new Scanner(System.in);
		//variables
		int nota;
		
		System.out.println("Dime tu nota");
		nota = sc.nextInt();
		if ((nota >= 0) && (nota <= 4))
			System.out.println("insuficiente");
		else
			if (nota == 5)
					
				System.out.println("suficiente");
			else
				if (nota == 6 )
					System.out.println("bien");
				else
					if ((nota >= 7) && (nota <= 8))
						System.out.println("notable");
					else
						if ((nota >= 9) && (nota <= 10))
							System.out.println("sobresaliente");
	}

}
