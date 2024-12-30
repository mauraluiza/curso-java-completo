import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 01: Programa que retorna a soma de dois valores inteiros informados
		 * pelo usuário.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, sum;
		
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		sum = a + b;
		
		System.out.println("SOMA = " + sum);

	}

}
