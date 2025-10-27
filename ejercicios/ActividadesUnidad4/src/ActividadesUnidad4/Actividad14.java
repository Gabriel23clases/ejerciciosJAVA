package ActividadesUnidad4;

public class Actividad14 {

	public static void main(String[] args) {
		// Fibonacci
		System.out.println(Fibonacci(9));
	}
	
	public static int Fibonacci (int n) {
		if(n==1) {
			return 1;
		}
		else
			if (n == 0) {
				return 1;
			}
		
			else 
				
			return Fibonacci(n-1) + Fibonacci(n-2);
				
}
}