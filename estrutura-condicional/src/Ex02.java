import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 02: Programa para informar se um número é par ou ímpar.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		sc.close();
		
		if (x % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("ÍMPAR");
		}
	}
}