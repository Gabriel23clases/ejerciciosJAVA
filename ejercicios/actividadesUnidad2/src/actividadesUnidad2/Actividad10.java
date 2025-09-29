package actividadesUnidad2;
import java.util.Scanner;
public class Actividad10 {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);

final String capicua, negacion;
int num, unit, dec;

capicua = " su número es capicua";
negacion = "no es capicua";

System.out.println("Dime un número");
	num = sc.nextInt();
	unit = (num % 10);
	dec = (num / 10);
	
	if (num < 10) {
		System.out.println(negacion);
	}
	if (num >= 10) {
		if (num < 100)
		if (unit == dec) {
			System.out.println(capicua);
		}
		if (unit != dec) {
			System.out.println(negacion);
		}
			
		
	}
	if (num > 100) {
		if (unit == dec) {
			System.out.println(capicua);
		}
		if (unit != dec) {
			System.out.println(negacion);
		}
			
		
	}
	
	
	
	}
}
