package ActividadesUnidad5;

public class Actividad14 {

	static int[] combinacionGanadora = {1,3,2,4,5,6};
	static int[] apuesta = {1,2,3,6,5,41};
	
	public static void main(String [] args) {
		int aciertos = totalAciertos(combinacionGanadora, apuesta);
		if(aciertos == apuesta.length) {
			System.out.println("Has ganado el premio!");
		}
		System.out.println("Total aciertos: " + aciertos);
	}
	
	public static int totalAciertos(int[] tablaCombinacion, int[] tablaApuesta) {
		//Usa variable aciertos = 0.
		int aciertos = 0;
		//Para cada valor en apuesta, búscalo en ganadora; si aparece, aciertos++.
		for(int apuesta : tablaApuesta) {
			if(seEncuentra(apuesta, tablaCombinacion)) {
				aciertos++;
			}
		}

		//Devuelve aciertos
		return aciertos;
	}

	private static boolean seEncuentra(int apuesta, int[] tablaCombinacion) {
		for(int numero : tablaCombinacion) {
			if(numero == apuesta) {
				return true;
			}
		}
		return false;
	}
	
	
 
}