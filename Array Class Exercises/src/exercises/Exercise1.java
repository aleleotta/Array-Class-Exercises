package exercises;
import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		int n, m;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce the amount of positions in the array: ");
		n = sc.nextInt();
		System.out.print("Introduce a number to fill in every array position: ");
		m = sc.nextInt();
		sc.close();
	}
}
/*Crea un programa que pida al usuario dos valores N y M y
 *luego cree un array de tamaño N que contenga M en todas sus posiciones.
 *Luego muestra el array por pantalla.
 */