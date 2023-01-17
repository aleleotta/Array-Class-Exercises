package exercises;
import java.util.*;

public class Exercise6 {
	public static void main(String[] args) {
		int table[] = new int[1000];
		int N, counter = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < table.length ; i++) {
			table[i] = (int) (Math.random() * 100);
		}
		System.out.println("Array: " + Arrays.toString(table));
		System.out.print("Introduce a number: ");
		N = sc.nextInt();
		for(int query: table) {
			if(query == N) {
				counter++;
			}
		}
		System.out.println("The following number appeared " + counter + " times in the array.");
		sc.close();
	}
}
/*Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros aleatorios
 * entre 0 y 99 (utiliza Math.random()*100).
 * Luego pedirá por teclado un valor N y se mostrará por pantalla si N existe en el array,
 * además de cuantas veces. Usa una búsqueda secuencial (no se hace uso de la clase Arrays).
 */