/*
 * EXERCÍCIO 8: Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar
 * na tela a média aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum
 * número par for digitado, mostrar a mensagem "NENHUM NUMERO PAR".
 */

package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		double soma = 0.0;
		double qtdPares = 0.0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i] % 2 == 0) {
				soma += vect[i];
				qtdPares += 1;
			}
		}
			
		if (soma == 0.0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			double media = soma / qtdPares;	
			System.out.println("MEDIA DOS PARES = " + media);
		}
		
		sc.close();	
	}
}
