/*
 * EXERCÍCIO 9: Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
 * idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor. Depois,
 * mostrar na tela o nome da pessoa mais velha. 
 */

package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
	
		int maiorIdade = 0;
		int posicao = 0;
		for (int i=0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				posicao = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nome[posicao]);
		
		sc.close();	
	}
}
