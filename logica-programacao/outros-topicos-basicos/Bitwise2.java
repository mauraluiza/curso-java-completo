import java.util.Scanner;

public class Bitwise2 {
	public static void main(String[] args) {
		
		/* Programa para verificar se o sexto bit de um número informado é verdadeiro
		 * ou falso comparado ao número 32.
		 */
		
		Scanner sc = new Scanner(System.in);

		int comparacao = 32; // binário: 0010 0000 (sabe-se que seu sexto bit é falso)
		int n = sc.nextInt();
		
		if ((n & comparacao) != 0) {  // Comparações bitwise devem ficar entre parênteses.
			System.out.println("O sexto bit é verdadeiro.");
		} else {
			System.out.println("O sexto bit é falso.");
		}
		sc.close();
	}
}