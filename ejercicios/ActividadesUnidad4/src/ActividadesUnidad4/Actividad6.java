package ActividadesUnidad4;

public class Actividad6 {

	public static void main(String[] args) {
		// Crear una función que, mediante un booleano, indique si el carácter pasado como parámetro corresponde a una vocal.
		System.out.println(letravocal ('a'));
	}
	
	public static boolean letravocal(char caracter) {
		
		if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
		return true;
		
		}
		return false;
	}
	}

