package ActividadesUnidad3;
import java.util.Scanner;
public class Actividad12 {

	public static void main(String[] args) {
		// Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso. if (haysuspenso) ----> boolean haysuspenso
		Scanner sc = new Scanner(System.in);
		int nota=0, res=0;
	for (int num=1; num<6;num++) {
		
		System.out.println("Dime una nota");
		nota = sc.nextInt();
		if (nota<5) {
			res++;
	}
	
	}
	if (res > 0)
	System.out.println("hay " + res + " suspensos");
	else 
		System.out.println("Todos aprobaron");
	
	}
}
