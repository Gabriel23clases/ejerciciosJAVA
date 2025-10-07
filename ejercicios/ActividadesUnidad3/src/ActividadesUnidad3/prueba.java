package ActividadesUnidad3;
import java.util.Scanner;
public class prueba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Saludar 1 despedir 2 y salir 0");
				opcion = sc.nextInt();
				
				switch (opcion) {
				case 1 -> System.out.println("hola");
				case 2 -> System.out.println("adios");
				case 0 -> System.out.println("saliendo");
				default -> System.out.println("no bro");
				}
		}
				while (opcion != 0 );
				
				
				
				}
				
		
		
	}
	


