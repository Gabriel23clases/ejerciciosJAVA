package ActividadesUnidad4;

public class Actividad1 {

	public static void main(String[] args) {
		//Diseñar la función eco() a la que se le pasa como parámetro un número n y muestra por pantalla n veces el mensaje “Eco ...”.
		eco(6);
	}
	//funcion eco
	/**
	 * funcion que imprime eco
	 * @param n numero de veces que se repite
	 */
	public static void eco (int n) {
		for (int y=0; y<n; y++) {
			System.out.println("Eco...");
		}
	}
	}

