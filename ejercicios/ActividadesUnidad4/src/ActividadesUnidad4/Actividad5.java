package ActividadesUnidad4;

public class Actividad5 {

	public static void main(String[] args) {
		// Repite el ejercicio anterior con una versión que calcule el máximo de 3 números.
System.out.println(mayor(1,4,3));
	}
	
	public static int mayor (int n1, int n2, int n3) {
		
		if ((n1> n2) && (n1>n3)) {
			
			return n1; }
		
		else if ((n2> n1) && (n2>n3)) { 
				return n2; }
			
			else if ((n3> n1) && (n3>n2)) {
					
			return n3; }
		return 0;
		
	}
}
