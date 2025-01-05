package estruturarepetitiva;
import java.util.Scanner;

public class ExFor01 {
	public static void main(String[] args) {
		
		/*
		 * Exercício 01 (URI 1067): Leia um valor inteiro X (1 <= X <= 1000). Em seguida
		 * mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
		 */
		
		Scanner sc =  new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i = 1; i <= x && x <= 1000; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}