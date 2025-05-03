/*
 * EXERCÍCIO 10: Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas
 * que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um
 * vetor. Depois, imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja
 * média das notas seja maior ou igual a 6.0 (seis). 
 */

package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		double[] s1 = new double[n];
		double[] s2 = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
			sc.nextLine();
			nome[i] = sc.nextLine();
			s1[i] = sc.nextDouble();
			s2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		for (int i=0; i<n; i++) {
			if ((s1[i] + s2[i]) / 2.0 >= 6.0) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();	
	}
}
