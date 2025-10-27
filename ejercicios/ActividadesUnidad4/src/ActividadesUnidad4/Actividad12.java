package ActividadesUnidad4;

public class Actividad12 {

	public static void main(String[] args) {
		// Calculadora
		System.out.println(calculadora(8,4,4));
	}
	public static int calculadora (int operando1, int operando2, int operacion) {
		
		if (operacion==1) {
			int resul = operando1 + operando2;
			return resul;
		}else
		if (operacion==2) {
			int resul = operando1 - operando2;
			return resul;
		
	}else
		if (operacion==3) {
			int resul = operando1 * operando2;
			return resul;
	}else
		if (operacion==4) {
			int resul = operando1 / operando2;
			return resul;
}
		return 1;
	}
}
