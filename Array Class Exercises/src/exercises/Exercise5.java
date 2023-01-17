package exercises;
import java.util.*;

public class Exercise5 {
	public static void main(String[] args) {
		int table1[] = new int[8];
		int table2[] = new int[8];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < table1.length ; i++) {
			System.out.print("Please type in a score: ");
			table1[i] = sc.nextInt();
			if(table1[i] < 1000 || table1[i] > 2800) {
				table1[i] = 0;
				i--;
			}
		}
		Arrays.sort(table1);
		System.out.println(Arrays.toString(table1));
		for(int i = 0; i < table1.length ; i++) {
			table2[table2.length-1-i] = table1[i];
		}
		System.out.println(Arrays.toString(table2));
		sc.close();
	}
}
/*Necesitamos crear un programa para mostrar el ranking de puntuaciones
 * de un torneo de ajedrez con 8 jugadores.A
 * Se le pedirá al usuario que introduzca las puntuaciones de todos los jugadores
 * (habitualmente valores entre 1000 y 2800, de tipo entero) y luego muestre las
 * puntuaciones en orden descendente (de la más alta a la más baja).
 */