package ActividadesUnidad3;

import java.util.Scanner;

public class actividad8_2 {

	public static void main(String[] args) {
		//Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se denota 5! y es igual a 5 × 4 × 3 × 2 × 1 = 120.

				Scanner sc = new Scanner(System.in);
				int num, factorial = 1;
				System.out.println("Dime un número");
				num= sc.nextInt();
				
				while (num>0) {
					
					factorial*=num;
					num=num-1;
					System.out.println(factorial);
				}
				
				
			}

		}
