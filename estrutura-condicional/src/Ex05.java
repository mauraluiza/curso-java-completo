import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 05: Programa para ler o código e quantidade de um produto, retornando
		 * o valor total a pagar por esse(s) produto(s).
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