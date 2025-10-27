package ActividadesUnidad4;

public class Actividad13 {
//calcular factorial recursivo
	
	public static void main (String[] args) throws Exception {
		
		System.out.println(factorial(3));
		System.out.println(factorialRecursiva(3));
		
	}
	
	public static int factorial (int n) {
		
		int resul=1;
		
		for (int i=1; i<=n; i++) {
			
		resul = resul * i;
				
		}
		return resul;
		
		
	}
	public static int factorialRecursiva (int n) throws Exception {
		if(n==0) {
			return 1;
		}
		else
			if (n <0) {
			throw new Exception ("no");
			}
		
			else 
				
			return n * factorialRecursiva(n-1);
				
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	

