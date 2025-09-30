package actividadesUnidad2;
import java.util.Scanner;
public class Actividad12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
 *  Recordamos que existen meses con 28, 30 y 31 días. No consideraremos los años bisiestos.*/
		Scanner sc = new Scanner(System.in);
		int day, month, year;
		System.out.println("indica el dia");
		day = sc.nextInt();
		System.out.println("indica el mes");
		month = sc.nextInt();
		System.out.println("indica el año");
		year = sc.nextInt();
		
		if (((day >=1) && (day <= 31)) && (((month == 1) || (month == 3)) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) && (year==2025)) {
			
			System.out.println("Su fecha es valida " + day +("/") + month + ("/") + year);
		}
		else
			if (((day >=1) && (day <= 30)) && (((month == 4) || (month == 6)) || (month == 9) || (month == 11)) && (year==2025)) {
				
				System.out.println("Su fecha es valida " + day +("/") + month + ("/") + year);
			}
			else
				if (((day >=1) && (day <= 28)) && (month == 2) && (year==2025)) {
					
					System.out.println("Su fecha es valida " + day +("/") + month + ("/") + year);
				}
			
			else
				System.out.println("Formato de fecha incorrecto");
			}
		
		}
		
			


