package ActividadesUnidad4;
import java.util.Scanner;
public class Actividad3 {

	public static void main(String[] args) {
		/*Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se especifique.
		Opción 1: área. Opción 2: volumen. Además se pasa el radio de la base y la altura.
		Fórmulas:
		área = 2 · π · r · (h + r)
		volumen = π · r² · h*/
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime que quieres calcular (1) Area (2) Volumen: ");
		int opcion = sc.nextInt();
		double altura;
		double radio;
		System.out.println("Dime el radio");
		radio = sc.nextDouble();
		System.out.println("Dime la altura");
		altura = sc.nextDouble();
		cilindro (radio,altura,opcion);
	}

	
	public static void cilindro (double radio, double altura, int opcion) {
		switch (opcion) {
		case 1:
			double area = 2 * Math.PI * radio * (altura + radio);
			System.out.println("El area es " + area);
			break;
		case 2:
			double vol = Math.PI * Math.pow(radio, 2) * altura;
			System.out.println("El volumen es " + vol);
		break;
		default:
			System.out.println("no se ha seleccionado opcion correcta");
		}
		
	}
}
	

