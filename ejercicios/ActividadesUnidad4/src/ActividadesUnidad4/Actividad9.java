package ActividadesUnidad4;

public class Actividad9 {

	public static void main(String[] args) {
		// Implementar la función divisoresPrimos() que muestre por consola todos los divisores primos del número pasado como parámetro.
		divisores (42);
	}
	
	
	public static void divisores (int numero) {
		for (int i=1; i< numero;i++) {
			if (numero %i==0) {
			//	boolean esPrimo = Actividad7.primo(i);
				if (Actividad7.primo(i)) {
					System.out.println(i);
				}
			}
		}
	}
		
	}


