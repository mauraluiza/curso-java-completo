package estruturarepetitiva;

import java.util.Scanner;

public class ExFor07 {
	public static void main(String[] args) {

		/*
		 * Exercício 07 (URI 1143): Fazer um programa para ler um número inteiro
		 * positivo N. O programa deve então mostrar na tela N linhas, começando de 1
		 * até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo
		 * do valor.
		 */

		Scanner sc = new Scanner(System.in);

		double N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			
			//Também é possível fazer utilizando a classe Math:
			//System.out.print(i + " ");
			//System.out.print(Math.pow(i, 2) + " ");
			//System.out.println(Math.pow(i, 3));
			
			System.out.print(i + " ");
			System.out.print((i * i) + " ");
			System.out.println(i * i * i);
		}
		sc.close();
	}
}