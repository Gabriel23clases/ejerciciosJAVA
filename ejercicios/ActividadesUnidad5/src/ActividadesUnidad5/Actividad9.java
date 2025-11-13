package ActividadesUnidad5;
import java.util.Arrays;
import java.util.Scanner;
public class Actividad9 {

	public static void main(String[] args) {
		/*Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro
educativo. Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas
(números enteros) del primer, segundo y tercer trimestre de un grupo. Debemos mostrar
al final la nota media del grupo en cada trimestre, y la media del alumno que se
encuentra en la posición pos (que se lee por teclado)*/
		Scanner sc= new Scanner(System.in);
	/*	//ejemplo
	int[][]	notas=new int [5] [3];
	int [] tablaentero = {1,2,3};
	int [] [] tablaEnteroEntero = {{1,2,3}, {3,4,5}};
	System.out.println(tablaEnteroEntero[1][1]);
	*/
	
	//ejercicio
	int[][]	notas=new int [5] [3];
	int alumno=1;
	for (int n=0; n<5; n++) {
	for (int i=0; i<3;i++) {
		
		System.out.println("Dime las notas del " + alumno +"º alumno por trimestre");
		notas [n][i] = sc.nextInt();
	}
	alumno++;
	}
	System.out.println(Arrays.deepToString(notas));
	}
 public static double calcularMediaTrimestre ( int [][] notas, int trimestre) {
	 double media=0;
	 for(int i=0;i <notas.length; i++) {
		 media += notas[1][trimestre];
	 }
	 media= media / notas.length;
	return media;
 }
	public static double calcularMediaAlumno ( int [][] notas, int pos) throws Exception {
		 double media=0;
		 if (pos> notas.length) {
			 throw new Exception ("Se paso del rango");
		 }
		 for(int i=0;i <notas.length; i++) {
			 media += notas[1][pos];
		 }
		 media= media / notas.length;
		return media;
	 
 }
}
