package estruturasequencial;
import java.util.Scanner;
import java.util.Locale;

public class Ex05 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 05 (URI 1010): Fazer um programa para ler o código de uma peça 1, o número de
		 * peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1 = sc.nextInt();
		int qtd1 = sc.nextInt();
		double v1 = sc.nextDouble();
		
		sc.nextLine();
		
		int cod2 = sc.nextInt();        
		int qtd2 = sc.nextInt();
		double v2 = sc.nextDouble();
		
		sc.close();
		
		double vt = (qtd1 * v1) + (qtd2 * v2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", vt);
	}

}
