package application;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Informa os atributos em variáveis locais primeiro antes de instanciar o objeto
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.next();
		System.out.print("Is there an initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		
		double value; // Declara o value antes do if para pertencer ao escopo da main e poder ser utilizado mais vezes
		if (resp == 'y') {
			System.out.print("Enter a initial deposit value: ");
			value = sc.nextDouble();
		} else {
			value = 0.0;
		}
		
		System.out.println("");
		Account ac = new Account(number, holder, value); // Instancia o objeto chamando as variáveis locais como parâmetros
	
		System.out.println("Account data:"); // Imprime informações da conta
		System.out.println(ac);
		System.out.println("");
		
		System.out.print("Enter a deposit value: ");
		double qtd = sc.nextDouble();
		ac.deposit(qtd); // Recebe qtd como parâmetro para o método deposit
		System.out.println("Updated account data:"); // Imprime informações atualizadas da conta
		System.out.println(ac);
		System.out.println("");
		
		System.out.print("Enter a withdraw value: ");
		qtd = sc.nextDouble();
		ac.withdraw(qtd); // Reutiliza qtd agora como parâmetro para o método withdraw
		System.out.println("Updated account data:"); // Imprime informações atualizadas da conta
		System.out.println(ac);

		sc.close();
	}

}
