package ActividadesUnidad4;

public class Actividad12_2 {

	public static void main(String[] args) throws Exception {
		// Calculadora
		System.out.println(calculadora(8,0,4));
	}
	public static double calculadora (int operando1, int operando2, int operacion) throws Exception {
		double resul=0;
		switch (operacion) {
		case 1: {
			resul = operando1 + operando2;
		
		}
		
		case 2: {
			 resul = operando1 - operando2;
			
		}
		case 3: {
			 resul = operando1 * operando2;
		}
		case 4: {
			if (operando2==0) {
				throw new Exception ("Operacion no valida");
			}
			else
			 resul = operando1 / operando2;
			 
		}
		//default: throw new IllegalArgumentException("Unexpected value: " + operacion);
	}
		if (operacion > 4 || operacion < 1)
			throw new Exception ("Operacion no valida");
		else
			
		return resul;
		
}
	
}
