package exercises;
import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		int table[] = new int[30];
		for(int i = 0; i < table.length ; i++) {
			table[i] = (int)(Math.random() * 10);
		}
		Arrays.sort(table);
		System.out.println(Arrays.toString(table));
	}
}
/*Crea un programa que cree un array de tamaño 30 y
 *lo rellene con valores aleatorios entre 0 y 9 (utiliza Math.random()*10).
 *Luego ordena los valores del array y los mostrará por pantalla.
 */