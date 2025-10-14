package ActividadesUnidad3;
import java.util.Scanner;
public class Actividad11 {

	public static void main(String[] args) {
		// declaramos las variables
		int num1, num2, resultado;
		num1=1;
		num2=2;
		
		while (num2 <=10) {
			resultado = num1 * num2;
			System.out.println(num1 + "x" + num2 + "=" + resultado);
			if (num1< 10) {
				num1++;
				
			} else {
				num1=1;
				num2++;
			}
		}

	}

}
