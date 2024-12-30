import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 03: Programa que retorna a diferença entre o produto de A por B e
		 * de C por D, informados pelo usuário.
		 */

		int a, b, c, d, dif;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		sc.close();
		
		dif = a * b - c * d;
		
		System.out.println("DIFERENCA = " + dif);
	}

}
