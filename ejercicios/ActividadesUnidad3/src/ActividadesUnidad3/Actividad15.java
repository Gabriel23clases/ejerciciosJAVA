package ActividadesUnidad3;
import java.util.Scanner;
public class Actividad15 {

	public static void main(String[] args) {
		/*Realizar un programa que nos pida un número n, y nos diga cuántos números hay entre 2 y n que sean primos. 
		 * Un número primo es aquél que solo es divisible por 1 y por él mismo.*/
        Scanner sc = new Scanner(System.in);
        			System.out.println("dime un numero");
        			int n= sc.nextInt();
        		}
        			public static boolean esPrimo(int numero) {
        				boolean dev = true;
        				for (int i=2; i<numero-1; i++) {
        					
        					if (numero%i==0) {
        						return false;
        					}
        				}
        				return dev;
        			}
        			}
        		
	