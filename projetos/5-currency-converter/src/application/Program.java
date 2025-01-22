package application;
import util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser
		 * comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos
		 * dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em
		 * dólar. Criar uma classe CurrencyConverter para ser responsável pelos cálculos.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollarAmount = sc.nextDouble();
		
		double value = CurrencyConverter.toPay(dollarPrice, dollarAmount); // chama o método estático toPay direto da classe, sem necessidade de instanciar objeto
		System.out.printf("Amount to be paid in reais = %.2f", value);
		
		sc.close();
	}

}
