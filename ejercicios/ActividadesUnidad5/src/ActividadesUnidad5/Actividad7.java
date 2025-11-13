package ActividadesUnidad5;

import java.util.Arrays;

public class Actividad7 {

	public static void main(String[] args) {
		
		/*Leer una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar
y mostrar. Leer otra serie de 6 enteros, que también se guardarán en una tabla y se
mostrarán ordenados. A continuación, fusionar las dos tablas en una tercera, de forma
que los 12 números sigan ordenados. Fusionar dos tablas ordenadas significa copiar en
el orden correcto para que los datos resultantes continúen ordenados, sin necesidad de
volver a realizar una ordenación.*/
		
	int [] tabla1 = {1,2,55,4,98,6};
	int [] tabla2 = {9,8,12,6,5,4};
	
	System.out.println(Arrays.toString(tabla1));
	System.out.println(Arrays.toString(tabla2));
	
	System.out.println("Ahora ordenadas");
	
	Arrays.sort(tabla1);
	Arrays.sort(tabla2);
	
	System.out.println(Arrays.toString(tabla1));
	System.out.println(Arrays.toString(tabla2));
	
	//fusionar tablas
	int [] tabla3 = new int [(tabla1.length + tabla2.length)];
	
	int it3=0;
	
	for (int i=0; i<6;i++) {
		
	if(tabla1[i] < tabla2[i]) {
		tabla3[it3] = tabla1[i];
		tabla3 [it3 +1] = tabla2[i];
	
	}else
		if(tabla1[i] > tabla2[i]) {
			tabla3[it3] = tabla2[i];
			tabla3 [it3 +1] = tabla1[i];
		
		} else
			if(tabla1[i] == tabla2[i]) {
				tabla3[it3] = tabla1[i];
				tabla3 [it3 +1] = tabla2[i];
			
			}
	
	it3++;
	it3++;
	}
	Arrays.sort(tabla3);
	System.out.println(Arrays.toString(tabla3));
	
	}
}
