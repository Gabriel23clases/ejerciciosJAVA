package ActividadesUnidad3;
import java.util.Scanner;
public class Actividad6 {

	public static void main(String[] args) {
		// Escribir todos los múltiplos de 7 menores que 100.
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a escribir todos los numeros multiplos de 7 hasta 100");
		
		for (int n=0; n<100; n ++ ){
		
		if (n%7 == 0){
		
		System.out.println(n);
		
		}
		}
	}

}
/* int n=0;
while (n<100){
n+=7;

}*/