package estruturacondicional;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 03 (URI 1044): Leia 2 valores inteiros (A e B). Após, o programa deve
		 * mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores
		 * lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
		 * crescente ou decrescente.
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