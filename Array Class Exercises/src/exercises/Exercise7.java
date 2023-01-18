package exercises;
import java.util.*;

public class Exercise7 {
	public static void main(String[] args) {
		int table1[] = new int[6];
		int table2[] = new int[6];
		int a, b;
		int guesses = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < table1.length ; i++) {
			table1[i] = (int) (Math.random() * 50) + 1;
		}
		System.out.println(Arrays.toString(table1));
		for(int i = 0; i < table2.length ; i++) {
			table2[i] = (int) (Math.random() * 50) + 1;
		}
		Arrays.sort(table2);
		System.out.println(Arrays.toString(table2));
		for(int query1: table1) {
			a = query1;
			for(int query2: table2) {
				b = query2;
				if(a == b) {
					guesses++;
				}
			}
		}
		System.out.println("Guesses: " + guesses);
		sc.close();
	}
}
/*Realiza un programa que cree dos tablas,
 * la primera con los 6 números de una apuesta de la primitiva generados aleatoriamente entre 1 y 49 y,
 * la segunda (ordenada) con los 6 números de la combinación ganadora.
 * La función devolverá el número de aciertos.*/