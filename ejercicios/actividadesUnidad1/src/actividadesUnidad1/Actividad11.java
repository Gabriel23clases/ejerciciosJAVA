package actividadesUnidad1;
import java.util.Scanner;
public class Actividad11 {
	/*Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras.
	La aplicación debe solicitar las ventas (en kilos) de cada semestre para cada fruta.
	Se mostrará el importe total, sabiendo que:

	El kilo de manzanas = 2,35 €
	El kilo de peras = 1,95 €*/
	public static void main(String[] args) {
		//usamos final para definir constantes
		final double PRECIO_MANZANA = 2.35;
		final double PRECIO_PERA = 1.95;
	Scanner sc = new Scanner(System.in);
	Double peras1, manzanas1, manzanas2, peras2;
	
		System.out.println ("¿Cuantos kilos de manzana vendiste el primer semestre?");
		manzanas1 = sc.nextDouble();
		
		System.out.println ("Y el segundo?");
		manzanas2 = sc.nextDouble();
		
		System.out.println ("¿Cuantos kilos de peras vendiste el primer semestre?");
		peras1 = sc.nextDouble();
		
		System.out.println ("Y el segundo?");
		peras2 = sc.nextDouble();
		double manzanasfinal = (manzanas1 + manzanas2) * PRECIO_MANZANA;
		double perasfinal = (peras1 + peras2) * PRECIO_PERA;
				
		System.out.println("el importe total es " + (perasfinal + manzanasfinal) + " euros");

	}

}

