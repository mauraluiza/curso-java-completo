/* PROJETO 3: Programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (primeiro trimestre vale 30
 * e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS)
 * ou não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve
 * criar uma classe Student para resolver este problema.
 */

package application;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student(); // Instancia novo objeto student

		// Informa atributos do objeto
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f", student.totalGrade()); // Chama o método totalGrade para informar nota total
		System.out.println();

		// if para avaliar se a nota total está abaixo da média
		if (student.totalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missingGrade()); // Chama o método missingGrade para informar nota faltante
		} else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
