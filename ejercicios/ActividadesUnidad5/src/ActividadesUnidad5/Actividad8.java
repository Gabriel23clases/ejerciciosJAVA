package ActividadesUnidad5;

public class Actividad8 {

	public static void main(String[] args) {
		/*Implementar la función sinRepetidos() con el prototipo,
			int [] sinRepetidos ( int t []) que construye y devuelve una tabla del tamaño apropiado, con los elementos de t,
donde se han eliminado los datos repetidos.*/

		

	}
	public static boolean contiene ( int [] tabla, int valor) {
		boolean ret = false;
		for ( int i=0; i< tabla.length; i++) {
			if (tabla [i]== valor) {
				return true;
			}
		}
				return ret;
	}
	
}
