package estruturarepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExDoWhile01 {

	public static void main(String[] args) {

		/*
		 * Exercício 01: Fazer um programa para ler uma temperatura em Celsius e mostrar
		 * o equivalente em Fahrenheit. Perguntar se o usuário deseja repetir (s/n).
		 * Caso o usuário digite "s", repetir o programa. Fórmula: F = (9C / 5) + 32
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char consulta;

		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			double f = (9 * c) / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.2f %n", f);
			System.out.print("Deseja repetir? (s/n)");
			consulta = sc.next().charAt(0);
		} while (consulta != 'n');

		sc.close();
	}
}