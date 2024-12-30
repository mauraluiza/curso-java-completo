import java.util.Scanner;
import java.util.Locale;

public class Ex02 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 02: Programa que retorna a área de um círculo com 4 casas decimais,
		 * com base no valor do raio informado pelo usuário.
		 */
		
		double area, raio;
		double pi = 3.14159;
		
		Scanner sc = new Scanner(System.in);
		raio = sc.nextDouble();
		sc.close();
		
		area = pi * (raio * raio);
		
		Locale.setDefault(Locale.US);
		System.out.printf("A = %.4f", area);
	}

}
