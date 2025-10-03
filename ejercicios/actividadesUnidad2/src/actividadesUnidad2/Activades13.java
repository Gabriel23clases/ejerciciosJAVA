package actividadesUnidad2;
import java.util.Scanner;
public class Activades13 {

	public static void main(String[] args) {
		// Programa que pida una hora y debemos mostrar un segundo mas tarde
		Scanner sc = new Scanner(System.in);
		int segundo, minuto, hora;
		System.out.println("dime la hora a adelantar");
		System.out.println("¿segundo?");
		segundo = sc.nextInt();
		System.out.println("¿minuto?");
		minuto = sc.nextInt();
		System.out.println("¿hora?");
		hora = sc.nextInt();
		
		if (hora >= 24 || minuto >= 60 || segundo > 60) {
			System.err.println ("la hora no existe");
			
		} else {
			segundo++;
			if (segundo == 60) {
				hora++;
				segundo = 0;
				if (hora == 24) {
					hora = 0;
					segundo= 0;
				}
			}
				
			System.out.printf("la hora es : %02d:%02d:%02d",  + hora + ":"  + ":" + minuto + ":" +  segundo);
		}
	}

}
