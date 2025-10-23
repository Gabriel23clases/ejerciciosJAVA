package ActividadesUnidad4;
public class Actividad10 {

	public static void main(String[] args) {
		/* Escribir una función que decida si dos enteros positivos son amigos.
		   Dos números son amigos si la suma de sus divisores propios (distintos de ellos mismos) es igual.*/
		
		amigos(284,220);
	}

	
	public static void amigos (int num1, int num2) {
		
		int resul=0;
		int resul2=0;
		
		for (int i=num1-1; i>0;i--) {
			if (num1%i==0) {
		 resul = resul + i;
		}
		}
		
		for (int i2=num2-1; i2>0;i2--) {
			if (num2%i2==0) {
		 resul2 = resul2 + i2;
		}
		}
		
		if (resul == num2 && resul2==num1) {
			System.out.println("son amigos");
		}
		else
			System.out.println("no son amigos");
		
	}
	
}
