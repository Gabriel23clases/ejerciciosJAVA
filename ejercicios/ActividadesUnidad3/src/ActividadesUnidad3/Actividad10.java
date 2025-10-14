package ActividadesUnidad3;
import java.util.Scanner;
public class Actividad10 {

	public static void main(String[] args) {
		/* Se desea implementar una aplicación que pida al usuario que introduzca un número comprendido entre 1 y 10.
		 *  Debemos mostrar la tabla de multiplicar de dicho número. El código tendrá que asegurarse de que el número
		 *   introducido se encuentra entre el 1 y el 10.*/
		Scanner sc = new Scanner(System.in);
		int num, res=0;
		System.out.println("Dime un número entre el 1 y el 10");
		num = sc.nextInt();
		for (int multi=0; multi<11; multi++) {
			
			res=num*multi;
			System.out.println(num + "*" + multi + "=" + res);
		}
	}

}
