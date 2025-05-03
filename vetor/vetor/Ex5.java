/*
 * EXERCÍCIO 5: Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida,
 * mostrar na tela o maior número do vetor (supor não haver empates). Mostrar também a posição
 * do maior elemento, considerando a primeira posição como 0 (zero). 
 */

package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double maior = vect[0];
		int posicao = 0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				posicao = i;
			}
		}
		
		System.out.println();
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println();
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
		
		sc.close();	
	}
}
