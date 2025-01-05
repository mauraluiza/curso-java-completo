package estruturarepetitiva;
import java.util.Scanner;

public class ExFor06 {
	public static void main(String[] args) {

		/*
		 * Exercício 06 (URI 1157): Ler um número inteiro N e calcular todos os seus divisores.
		 */

		Scanner sc = new Scanner(System.in);

		double N = sc.nextInt();

		for (int i = 0; i <= N; i++) {
			
			if (N % i == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}