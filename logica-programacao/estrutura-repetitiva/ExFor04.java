package estruturarepetitiva;

import java.util.Scanner;
import java.util.Locale;

public class ExFor04 {
	public static void main(String[] args) {

		/*
		 * Exercício 04 (URI 1116): Fazer um programa para ler um número N. Depois leia
		 * N pares de números e mostre a divisão do primeiro pelo segundo. Se o
		 * denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double x, y, div;

		for (int i = 0; i < N; i++) {

			x = sc.nextDouble();
			y = sc.nextDouble();

			if (y == 0) {
				System.out.println("Divisão impossivel");
			} else {
				div = x / y;
				System.out.printf("%.1f%n", div);
			}
		}
		sc.close();
	}
}