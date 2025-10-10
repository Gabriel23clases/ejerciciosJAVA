package ActividadesUnidad3;

public class Actividad7 {

	public static void main(String[] args) {
		// Diseñar un programa que muestre el producto de los 10 primeros números impares.
		int res=1;
		
		for (int n=0;n<20;n++){
			
			if (n % 2 ==1) {
			res*=n;
			}
			
		}
		System.out.println(res);
	}

}
