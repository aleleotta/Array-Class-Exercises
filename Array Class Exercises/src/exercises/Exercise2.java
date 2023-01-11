package exercises;
import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		int start = 0;
		int table[] = new int[55];
		for(int i = 1; i <= 10; i++) {
			Arrays.fill(table, start, start+i, i);
			start = start + i;
		}
		System.out.println("Array: " + Arrays.toString(table));
	}
}
/*Crea un programa que cree un array de enteros e
 *introduzca la siguiente secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc...
 *hasta introducir 10 diez veces el 10, y luego la muestre por pantalla.
 *En esta ocasión hay que utilizar Arrays.fill().*/