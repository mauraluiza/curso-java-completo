/*
 * EXERCÍCIO 2: Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
   - Imprimir todos os elementos do vetor
   - Mostrar na tela a soma e a média dos elementos do vetor 
 */

package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		double soma = 0.0;
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			
			soma += vect[i];
		}
		
		System.out.print("VALORES = ");
		for (int i=0; i<vect.length; i++) {
			System.out.printf("%.2f  ", vect[i]);
		}		
		System.out.println();
		
		System.out.printf("SOMA = %.2f%n", soma);
		
		System.out.printf("MEDIA = %.2f%n", soma / n);
		
		sc.close();	
	}
}
