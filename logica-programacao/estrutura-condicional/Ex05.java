package estruturacondicional;
import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 05 (URI 1038): Com base na tabela abaixo, escreva um programa que leia
		 * o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor
		 * da conta a pagar.
		 * 
		 *   1  -----  Cachorro quente  -----  R$ 4.00
		 *   2  -----      X-Salada     -----  R$ 4.50
		 *   3  -----      X-Bacon      -----  R$ 5.00
		 *   4  -----  Torrada simples  -----  R$ 2.00
		 *   5  -----    Refrigerante   -----  R$ 1.00
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int qtd = sc.nextInt();	
		sc.close();
		
		double total = 0;
		
		switch (cod) {
		case 1:
			total = 4 * qtd;
			break;
		case 2:
			total = 4.50 * qtd;
			break;
		case 3:
			total = 5 * qtd;
			break;
		case 4:
			total = 2 * qtd;
			break;
		case 5:
			total = 1.50 * qtd;
			break;
		default:
			System.out.println("O código digitado não é válido.");
		}
		
		System.out.printf("Total: R$ %.2f", total);
	}
}