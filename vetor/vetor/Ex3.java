/*
 * EXERCÍCIO 3: Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo.
 * Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas
 * com menos de 16 anos, bem como os nomes dessas pessoas caso houver. 
 */

package vetor;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Ex3 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Pessoa[] p = new Pessoa[n];
		
		double alturaTotal = 0.0;
		for (int i=0; i < p.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			p[i] = new Pessoa(nome, idade, altura);
			alturaTotal += p[i].getAltura();
		}
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", alturaTotal / n);
		
		double qtdMenor = 0;
		for (int i=0; i<p.length; i++) {
			if (p[i].getIdade() < 16) {
				qtdMenor +=1;
			}
		}
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", (qtdMenor * 100 / n));
		
		for (int i=0; i<p.length; i++) {
			if (p[i].getIdade() < 16) {
				System.out.println(p[i].getNome());
			}
		}
		
		sc.close();	
	}
}
