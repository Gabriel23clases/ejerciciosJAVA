package ActividadesUnidad4;

public class Actividad7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(primo (5));
	}

	public static boolean primo (int n) {
		
		for (int i= n-1; i>1; i--) {
			if ( n%i==1 )
				return true;
		}
		return false;
			
			
	}
	}
	

