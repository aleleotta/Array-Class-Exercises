package exercises;
import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		int n, m; //n = amount of positions. m = number to fill in array.
		Scanner sc = new Scanner(System.in); //Scanner declared.
		System.out.print("Introduce the amount of positions in the array: "); //Program asks for input.
		n = sc.nextInt(); //User input
		System.out.print("Introduce a number to fill in every array position: "); //Program asks for input.
		m = sc.nextInt(); //User input
		int table[] = new int[n]; //Declaration of array and assignment of n.
		Arrays.fill(table, m); //Assignment of m to all array positions.
		System.out.println(Arrays.toString(table)); //Printing array with toString.
		sc.close(); //Scanner closed.
	}
}
/*Crea un programa que pida al usuario dos valores N y M y
 *luego cree un array de tamaño N que contenga M en todas sus posiciones.
 *Luego muestra el array por pantalla.
 */