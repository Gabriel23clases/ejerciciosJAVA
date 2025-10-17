package ActividadesUnidad4;

public class Actividad2 {

	public static void main(String[] args) {
		// Escribir una función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.
		
		intervalo (2,8);
	}
	
	public static void intervalo (int menor, int mayor) {
		
		for (int cont=menor+1; cont<mayor; cont++ ) {
			
			System.out.println(cont);
		}
		}
		
	}
	

