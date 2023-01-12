package exercises;
import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {
		int table1[] = new int[10];
		int table2[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < table1.length ; i++) {
			System.out.print("Introduce a number: ");
			table1[i] = sc.nextInt();
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t Array 1: " + Arrays.toString(table1));
		}
		for(int i = 0; i < table2.length ; i++) {
			System.out.print("Introduce a number: ");
			table2[i] = sc.nextInt();
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t Array 2: " + Arrays.toString(table2));
		}
		if (Arrays.equals(table1, table2)) {
			System.out.println("Both arrays are equal.");
		} else {
			System.out.println("The two arrays are different.");
		}
		sc.close();
	}
}
/*Crea un programa que pida al usuario 20 valores enteros
 *e introduzca los 10 primeros en un array y los 10 últimos en otro array.
 *Por último, comparará ambos arrays y le dirá al usuario si son iguales o no.
 */