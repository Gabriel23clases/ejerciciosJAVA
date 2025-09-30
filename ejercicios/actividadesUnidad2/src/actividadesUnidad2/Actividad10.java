package actividadesUnidad2;
import java.util.Scanner;
public class Actividad10 {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);

final String capicua, negacion;
int num, unit = 0, dec = 0, cent = 0, mill = 0;

capicua = " su número es capicua";
negacion = "no es capicua";

System.out.println("Dime un número entrev el 0 y el 9999");
	num = sc.nextInt();
	
	if (num < 10) {
		System.out.println(negacion);
	}
	else
		
	if (num >= 10) {
		
		if (num < 100) {
		unit = (num % 10);
		dec = (num / 10);
		
		if (unit == dec) {
			System.out.println(capicua);
		}
		if (unit != dec) {
			System.out.println(negacion);
		}
			}
		
		if (num >= 100) {
			if (num < 1000) {
				
			unit = (num % 10);
			cent = (num/100);
			if (unit == cent) {
				System.out.println(capicua);
			}
			if (unit != cent) {
				System.out.println(negacion);
			}
	}
			if (num >= 1000) {
				
				if (num <= 9999) {
					
			unit = (num % 10);
			dec = (num / 10) % 10;
			cent = (num/100) % 10;
			mill = (num / 1000);
			
			if ((unit == mill) && (dec == cent)) {
				System.out.println(capicua);
				}
			if ((unit == mill) != (dec == cent)) {
				System.out.println(negacion);
			}
				}
				
			}
		}
	}
			else
				System.out.println(negacion);
			}
		}

			
		

