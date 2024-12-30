import java.util.Scanner;
import java.util.Locale;

public class Ex05 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 05: Programa que lê o código, valor e quantidade de duas peças
		 * e retorna o total a pagar.		 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//int cod1 = sc.nextInt();
		int qtd1 = sc.nextInt();
		double v1 = sc.nextDouble();
		
		sc.nextLine();
		
		//int cod2 = sc.nextInt();        
		int qtd2 = sc.nextInt();
		double v2 = sc.nextDouble();
		
		sc.close();
		
		double vt = (qtd1 * v1) + (qtd2 * v2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", vt);
	}

}
