/*
 * EXERCÍCIO 6: Faça um programa para ler dois vetores A e B, contendo N elementos cada.
 * Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos elementos
 * correspondentes de A e B. Imprima o vetor C gerado. 
 */

package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor b:");
		for (int i=0; i<b.length; i++) {
			b[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		for (int i=0; i<c.length; i++) {
			c[i] = a[i] + b[i];
			System.out.println(c[i]);
		}
		
		sc.close();	
	}
}
