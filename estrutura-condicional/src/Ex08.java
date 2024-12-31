import java.util.Locale;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 08: Programa que calcula taxas de imposto de renda (valores
		 * imaginários, fornecidos no exercício) sobre um salário.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double taxa;
		double salario = sc.nextDouble();
		sc.close();
		
		if (salario <= 2000) {
			System.out.println("Isento");
		}
		else if (salario > 2000 && salario <= 3000) {
			taxa = (salario - 2000) * 0.08;
			System.out.printf("R$ %.2f", taxa);
		}
		else if (salario > 3000 && salario <= 4500) {
			taxa = 80 + (salario - 3000) * 0.18;
			System.out.printf("R$ %.2f", taxa);
		}
		else if (salario > 4500) {
			taxa = 80 + 270 + (salario - 4500) * 0.28;
			System.out.printf("R$ %.2f", taxa);
		}
	}
}