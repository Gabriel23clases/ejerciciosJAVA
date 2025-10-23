package ActividadesUnidad4;

public class Actividad11 {

	public static void main(String[] args) throws Exception {
		/*Diseñar una función que calcule a^n, donde a es real y n entero no negativo. 
		 * Realiza versión iterativa y versión recursiva.*/
		System.out.println(potenciaRecursiva(2,3));
		System.out.println(elevadobucle(2,3));
	}
	
	public static double potenciaRecursiva (double num, int expo) throws Exception {
		double resul;
		if(expo==0) {
			return 1;
		}
		else
			if (expo <0) {
			throw new Exception ("no");
			}
		
			else 
				
			return num * potenciaRecursiva(num,expo-1);
				
	}
	
	public static double elevadobucle (double num, int expo) throws Exception {
		double resul=1;
		if (expo < 0)
			throw new Exception ("No");
		for (int i=1; i<=expo; i++) {
			
		 resul= resul * num;
		}
		
		return (double) resul;
		
	}
}
