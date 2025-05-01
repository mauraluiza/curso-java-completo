package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.next();
		System.out.print("Is there an initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		
		double value;
		
		if (resp == 'y') {
			System.out.print("Enter a initial deposit value: ");
			value = sc.nextDouble();
		} else {
			value = 0.0;
		}
		
		System.out.println("");
		
		Account ac = new Account(number, holder, value);
	
		System.out.println("Account data:");
		System.out.println(ac);
		System.out.println("");
		
		System.out.print("Enter a deposit value: ");
		double qtd = sc.nextDouble();
		ac.deposit(qtd);
		System.out.println("Updated account data:");
		System.out.println(ac);
		System.out.println("");
		
		System.out.print("Enter a withdraw value: ");
		qtd = sc.nextDouble();
		ac.withdraw(qtd);
		System.out.println("Updated account data:");
		System.out.println(ac);

		sc.close();
	}

}
