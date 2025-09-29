package actividadesUnidad1;

public class Actividad5 {
	//🔄 El tipo short permite almacenar valores comprendidos entre -32768 y 32767.
	//Escribir un programa que compruebe que el rango de valores de un tipo se comporta de forma cíclica, es decir, el valor siguiente al máximo es el valor mínimo.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short numero = 32767; // Declaración de un short
		System.out.println("El numero antes de incrementar es: " + numero);
		numero++; //añadimos ++ para sumer 1
		System.out.println (" Tras sumar una unidad: " + numero);
	}

}
