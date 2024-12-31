import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 01: Programa para informar se um número é negativo ou não.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		sc.close();
		
		if (x >= 0) {
			System.out.println("NAO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
	}
}