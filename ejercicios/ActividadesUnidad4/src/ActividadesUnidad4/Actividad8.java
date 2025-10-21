package ActividadesUnidad4;

public class Actividad8 {

	public static void main(String[] args) {
		// Escribir una función que, dado un entero, devuelva el número de divisores primos que tiene.
		System.out.println(primoDe(8));
	}

	/*public static int primoDe (int n) {
		
		for (int num =0; num >n; n++) {
			
			while (n%num==0) {
				for (int num2= 0; num2>n;num2++) {
					
				num%num2=1;
				int cont;
				cont++;
			}
			}
			
	}
	}*/
	public static int primoDe (int numero) {
		int contador=0;
		for (int i=2;i< numero; i++) {
			if(Actividad7.primo(i) && numero %i==0) {
				contador++;
			}
			
		}
		return contador;
	}
	
	
	
}
