package ActividadesUnidad4;

public class Actividad7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i=2;i<100;i++)
 System.out.println(i + "->" + primo (i));
	}

	public static boolean primo (int n) {
		
		for (int i= n-1; i>1; i--) {
			if ( n%i==0 )
				return false;
		}
		return true;
			
			
	}
	}
	

