/*
 * EXERCÍCIO 11: Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
 * Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a média de altura
 * das mulheres, e o número de homens. 
 */

package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
		}
		
		double menor = altura[0];
		for (int i=0; i<n; i++) {
			if (altura[i] < menor) {
				menor = altura[i];
			}
		}
		System.out.println("Menor altura = " + menor);
		
		double maior = altura[0];
		for (int i=0; i<n; i++) {
			if (altura[i] > maior) {
				maior = altura[i];
			}
		}
		System.out.println("Maior altura = " + maior);
		
		double soma = 0.0;
		double qtdMulheres = 0.0;
		for (int i=0; i<n; i++) {
			if (genero[i] == 'F') {
				soma += altura[i];
				qtdMulheres += 1;
			}
		}
		double media = soma / qtdMulheres;
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		
		int qtdHomens = 0;
		for (int i=0; i<n; i++) {
			if (genero[i] == 'M') {
				qtdHomens += 1;
			}
		}
		System.out.println("Numero de homens = " + qtdHomens);
		
		sc.close();	
	}
}
