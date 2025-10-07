package ActividadesUnidad3;

import java.util.Scanner;

public class prueba3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, ini = 0, res;
		
		System.out.println("Dame un número");
		num = sc.nextInt();
		
		while (ini <=10) {
			res= (num * ini);
			System.out.println(res + "=" + num + "*" + ini);
			ini++;
		}
	}

}
