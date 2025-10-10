package ActividadesUnidad3;
import java.util.Scanner;
public class Actividad4 {

	public static void main(String[] args) {
		// Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará todos los números del 1 a n.
		
	Scanner sc = new Scanner(System.in);
	int n, num = 1;
	System.out.println("Dime un número y te dire todos aquellos necesarios para llegar hasta él desde el 1");
	n = sc.nextInt();
	// for (int n = 1; n<= n; i++)
	do {
		System.out.println(num);
		
		num++;
	}
		while (num <=n); 
		
		
		
	}
	}


