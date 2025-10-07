package ActividadesUnidad3;
import java.util.Scanner;
public class Prueba2 {

	public static void main(String[] args) {
		// Pide al usuario un numero y saca su tabla de multiplicar usando for
		Scanner sc = new Scanner(System.in);
		int num, res;
		
		System.out.println("Dame un número");
		num = sc.nextInt();
		
		for (int ini = 0; ini <=10; ini++) {
			
			res= (num * ini);
			System.out.println(res + "=" + num + "*" + ini);
		}
		
	}

}

