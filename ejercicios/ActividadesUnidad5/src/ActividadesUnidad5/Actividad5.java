package ActividadesUnidad5;
import java.util.Random;
import java.util.Scanner;
public class Actividad5 {

	public static void main(String[] args) {
		/* Desarrollar el juego de la cámara secreta. El jugador elige la longitud de la combinación (dígitos del 1 al 5). 
		La aplicación genera aleatoriamente la combinación y, en cada intento del usuario, muestra para cada dígito si es mayor,
		menor o igual que el correspondiente de la combinación secreta.*/
		Scanner scanner = new Scanner(System.in);

        // Paso 1: El jugador elige la longitud de la combinación
        System.out.print("Elige la longitud de la combinación (entre 1 y 10): ");
        int longitud = scanner.nextInt();
        while (longitud < 1 || longitud > 10) {
            System.out.print("Longitud inválida. Elige entre 1 y 10: ");
            longitud = scanner.nextInt();
        }

        // Paso 2: Generar combinación secreta aleatoria
        int[] combinacionSecreta = new int[longitud];
        Random rand = new Random();
        for (int i = 0; i < longitud; i++) {
            combinacionSecreta[i] = rand.nextInt(5) + 1; // dígitos del 1 al 5
        }

        System.out.println("\n¡Comienza el juego! Intenta adivinar la combinación.");

        boolean acertado = false;
        while (!acertado) {
            // Paso 3: Leer intento del usuario
            int[] intento = new int[longitud];
            System.out.print("Introduce tu intento (separado por espacios): ");
            for (int i = 0; i < longitud; i++) {
                intento[i] = scanner.nextInt();
                while (intento[i] < 1 || intento[i] > 5) {
                    System.out.print("Dígito inválido. Introduce un número entre 1 y 5: ");
                    intento[i] = scanner.nextInt();
                }
            }

            // Paso 4: Comparar intento con combinación secreta
            acertado = true;
            System.out.print("Resultado: ");
            for (int i = 0; i < longitud; i++) {
                if (intento[i] < combinacionSecreta[i]) {
                    System.out.print("Menor ");
                    acertado = false;
                } else if (intento[i] > combinacionSecreta[i]) {
                    System.out.print("Mayor ");
                    acertado = false;
                } else {
                    System.out.print("Igual ");
                }
            }
            System.out.println();

            if (acertado) {
                System.out.println("🎉 ¡Has abierto la cámara secreta!");
            }
        }

        scanner.close();
    }
}
	
