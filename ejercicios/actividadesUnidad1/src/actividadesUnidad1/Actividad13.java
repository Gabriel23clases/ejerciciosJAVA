package actividadesUnidad1;
import java.util.Scanner;
public class Actividad13 {

	public static void main(String[] args) {
		/*Escribir un programa que solicite las notas del primer, segundo y tercer trimestre (enteras).
El programa debe mostrar la nota media del curso de dos formas:

📋 Como en el boletín de calificaciones (solo la parte entera).
📚 Como en el expediente académico (con decimales).*/
Scanner sc = new Scanner(System.in);
int trimestre1, trimestre2, trimestre3, trimestre_final;
float trimestre_academico;

System.out.println("Dime tus notas del primer trimestre: ");
trimestre1 = sc.nextInt();

System.out.println("Dime tus notas del segundo trimestre: ");
trimestre2 = sc.nextInt();

System.out.println("Dime tus notas del tercero trimestre: ");
trimestre3 = sc.nextInt();

trimestre_final = (trimestre1 + trimestre2 + trimestre3) / 3;
//ponemos float para que nos de decimales
trimestre_academico = (float) ((trimestre1 + trimestre2 + trimestre3) / 3.0);

System.out.println("tus notas final y academicas so: " + trimestre_final + " y " + trimestre_academico);
	}

}
