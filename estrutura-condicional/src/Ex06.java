import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 06: Programa que lê um número e informa em qual intervalo ele se
		 * encontra (intervalos de 25 em 25 números até 100).
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		sc.close();
		
		if (x >= 0 && x <= 25) {
			System.out.println("Intervalo 0-25");
		}
		else if (x > 25 && x <= 50) {
			System.out.println("Intervalo 26-50");
		}
		else if (x > 50 && x <= 75) {
			System.out.println("Intervalo 51-75");
		}
		else if (x > 75 && x <= 100) {
			System.out.println("Intervalo 76-100");
		}
		else {
			System.out.println("Fora de intervalo.");
		}	
	}
}