import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 03: Programa para informar se dois números são múltiplos entre si.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		if (x % y == 0 || y % x == 0) {
			System.out.println("São múltiplos");
		}
		else {
			System.out.println("Não são múltiplos");
		}
	}
}